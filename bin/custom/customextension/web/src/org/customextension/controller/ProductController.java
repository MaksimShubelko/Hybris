package org.customextension.controller;

import de.hybris.platform.catalog.CatalogService;
import de.hybris.platform.core.model.product.ProductModel;
import de.hybris.platform.product.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.Objects;

@RequestMapping("/product")
@Controller
public class ProductController {

    @Resource
    private ProductService productService;

    @Resource
    private CatalogService catalogService;

    @GetMapping
    public String getProduct(@RequestParam String code, Model model) {
        catalogService.setSessionCatalogVersion("Default", "Online");

        if (Objects.nonNull(code)) {
            ProductModel productModel = productService.getProductForCode(code);
            model.addAttribute("product", productModel);
        }

        return "product";
    }
}
