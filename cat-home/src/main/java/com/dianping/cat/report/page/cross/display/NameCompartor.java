package com.dianping.cat.report.page.cross.display;

import java.util.Comparator;

public class NameCompartor implements Comparator<NameDetailInfo> {

	private String m_sorted;

	public NameCompartor(String sort) {
		m_sorted = sort;
	}

	@Override
	public int compare(NameDetailInfo m1, NameDetailInfo m2) {
		if (m_sorted.equals("name")) {
			return m1.getId().compareTo(m2.getId());
		}
		if (m_sorted.equals("total")) {
			return (int) (m2.getTotalCount() - m1.getTotalCount());
		}
		if (m_sorted.equals("failure")) {
			return (int) (m2.getFailureCount() - m1.getFailureCount());
		}
		if (m_sorted.equals("failurePercent")) {
			return (int) (m2.getFailurePercent() * 100 - m1.getFailurePercent() * 100);
		}
		if (m_sorted.equals("avg")) {
			return (int) (m2.getAvg() * 100 - m1.getAvg() * 100);
		}
		return 0;
	}
}