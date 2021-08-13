package controller;


import model.SanPham;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import service.SanPhamService;


@Controller
public class SanPhamController {
    SanPhamService sanPhamService = new SanPhamService();

    @RequestMapping("/product")
    public ModelAndView index() {
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("list", sanPhamService.list);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView create() {
        ModelAndView modelAndView = new ModelAndView("create", "listLoai", sanPhamService.listLoai);
        modelAndView.addObject("list", new SanPham());
        return modelAndView;
    }

    @PostMapping("/create")
    public String create(@ModelAttribute SanPham sanPham) {
        sanPhamService.save(sanPham);
        return "redirect:/product";
    }
//
//    @GetMapping("/{id}/edit")
//    public ModelAndView edit(@PathVariable int id, Model model) {
//        ModelAndView modelAndView = new ModelAndView("edit", "listLoai", sanPhamService.listLoai);
//        model.addAttribute("list", sanPhamService.list.get(id));
//        return modelAndView;
//    }
//
//    @PostMapping("/edit")
//    public String update(SanPham sanPham) {
//        sanPhamService.edit(sanPham.getId(),sanPham);
//        return "redirect:/product";
//    }


    @GetMapping("/edit{index}")
    public ModelAndView showEdit(ModelMap model, @PathVariable int index){
        ModelAndView modelAndView = new ModelAndView("/edit");
        model.addAttribute("list", sanPhamService.list.get(index));
        model.addAttribute("listLoai", sanPhamService.listLoai);
        return modelAndView;
    }
    @PostMapping("/edit{index}")
    public ModelAndView edit(@PathVariable int index, SanPham sanPham){
        sanPhamService.edit(sanPham,index);
        return new ModelAndView("redirect:/product");
    }

    @GetMapping("/{id}/delete")
    public String delete(@PathVariable int id) {
        sanPhamService.delete(id);
        return "redirect:/product";
    }

}
