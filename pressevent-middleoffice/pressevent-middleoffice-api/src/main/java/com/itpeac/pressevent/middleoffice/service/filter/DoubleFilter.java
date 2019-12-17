package com.itpeac.pressevent.middleoffice.service.filter;

public class DoubleFilter extends RangeFilter<Double>
{

	private static final long serialVersionUID = 1L;

	public DoubleFilter() {
    }

	public DoubleFilter(final DoubleFilter filter) {
        super(filter);
    }

	public DoubleFilter copy() {
        return new DoubleFilter(this);
    }

}