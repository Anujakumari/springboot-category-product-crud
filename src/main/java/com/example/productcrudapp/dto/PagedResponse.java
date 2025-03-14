package com.example.productcrudapp.dto;

import java.util.List;

import org.springframework.data.domain.Page;

public class PagedResponse<T> 
{
	private List<T> content;

    public PagedResponse(Page<T> page) 
    {
        this.content = page.getContent();
    }

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}

}
