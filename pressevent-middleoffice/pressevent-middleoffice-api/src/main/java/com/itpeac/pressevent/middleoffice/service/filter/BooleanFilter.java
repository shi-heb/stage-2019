package com.itpeac.pressevent.middleoffice.service.filter;

public class BooleanFilter extends Filter<Boolean> {

	private static final long serialVersionUID = 1L;

	public BooleanFilter() {
	}

	public BooleanFilter(final BooleanFilter filter) {
		super(filter);
	}

	public BooleanFilter copy() {
		return new BooleanFilter(this);
	}

}