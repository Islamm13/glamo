package com.glamo.category.controller;

import com.glamo.category.dto.SalonDTO;
import com.glamo.category.modal.Category;
import com.glamo.category.service.CategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/categories/salon-owner")
public class SalonCategoryController {

    private final CategoryService categoryService;

    @PostMapping("/salon/{id}")
    public ResponseEntity<Category> createCategory(
            @RequestBody Category category
    ) {
        SalonDTO salonDTO=new SalonDTO();
        salonDTO.setId(1L);

        Category savedCategory=categoryService.saveCategory(category,salonDTO);

        return ResponseEntity.ok(savedCategory);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCategory(
            @PathVariable Long id
    ) throws Exception {
        SalonDTO salonDTO=new SalonDTO();
        salonDTO.setId(1L);

        categoryService.deleteCategoryById(id,salonDTO.getId());

        return ResponseEntity.ok("category deleted successfully");
    }
}
