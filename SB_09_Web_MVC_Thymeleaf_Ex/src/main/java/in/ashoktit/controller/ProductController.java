package in.ashoktit.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import in.ashoktit.entity.Product;
import in.ashoktit.repo.ProductRepo;

@Controller
public class ProductController {
	
	@Autowired
	private ProductRepo repo;
	
	
//	---------------------- product form loading----------------------
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("product", new Product());
		return "index";
	}
	
	
//	----------------------Saving Product Details----------------------
	@PostMapping("/saveProduct")
	public String saveProduct(@Validated Product p, BindingResult result, Model model) {	
		
		if(result.hasErrors()) {
			return "index";
		}
		
		p=repo.save(p);
		
		model.addAttribute("product", new Product());
		if(p.getPid()!=null) {
			model.addAttribute("msg", "Product Saved");
		}
		return "index";
	}
	
//	----------------------Showing Product Tables----------------------
	@GetMapping("/getProducts")
	public String getProducts(Model model) {
		model.addAttribute("products", repo.findAll());
		return "data";
	}
	
	
//	----------------------Deleting Product items----------------------
	
	@GetMapping("/delete")
	public String deleteProducts(@RequestParam("pid") Integer pid ,Model model) {
		
		repo.deleteById(pid);
		model.addAttribute("msg" ," Product Deleted....");
		model.addAttribute("products", repo.findAll());
		return "data";
	}
	
//	----------------------Edit Product item----------------------
	
	@GetMapping("/edit")
	public String editProducts(@RequestParam("pid") Integer pid,Model model) {
		Optional<Product> findById = repo.findById(pid);
		if(findById.isPresent()) {
			Product product = findById.get();
			model.addAttribute("product", product);
		}
		return "index";
	}
}
