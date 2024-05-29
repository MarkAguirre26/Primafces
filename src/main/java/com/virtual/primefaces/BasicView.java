package com.virtual.primefaces;

import jakarta.annotation.PostConstruct;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import org.primefaces.component.api.UIColumn;
import org.primefaces.model.Visibility;

import java.io.Serializable;
import java.util.List;

@Named("dtBasicView")
@ViewScoped
public class BasicView implements Serializable {

    private List<Product> products;

    @Inject
    private ProductService service;

    @PostConstruct
    public void init() {
        products = service.getProducts(10);
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setService(ProductService service) {
        this.service = service;
    }

//    public void onToggle(ColumnToggleEvent e) {
//        Integer index = (Integer) e.getData();
//        UIColumn column = e.getColumn();
//        Visibility visibility = e.getVisibility();
//        String header = column.getAriaHeaderText() != null ? column.getAriaHeaderText() : column.getHeaderText();
//        FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Column " + index + " toggled: " + header + " " + visibility, null);
//        FacesContext.getCurrentInstance().addMessage(null, msg);
//    }

}