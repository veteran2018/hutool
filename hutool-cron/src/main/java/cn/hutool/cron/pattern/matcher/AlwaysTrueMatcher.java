package cn.hutool.cron.pattern.matcher;

import cn.hutool.core.text.StrUtil;

/**
 * 所有值匹配，始终返回{@code true}
 *
 * @author Looly
 */
public class AlwaysTrueMatcher implements PartMatcher {

	/**
	 * 单例
	 */
	public static AlwaysTrueMatcher INSTANCE = new AlwaysTrueMatcher();

	@Override
	public boolean test(final Integer t) {
		return true;
	}

	@Override
	public int nextAfter(final int value) {
		return value;
	}

	@Override
	public String toString() {
		return StrUtil.format("[Matcher]: always true.");
	}
}
