//version 8:
import java.util.List;
public class WithByNullAnnos {
	final List<String> test;
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public WithByNullAnnos(final List<String> test) {
		this.test = test;
	}
	@org.checkerframework.checker.nullness.qual.NonNull
	@java.lang.SuppressWarnings("all")
	@lombok.Generated
	public WithByNullAnnos withTestBy(final java.util.function.@org.checkerframework.checker.nullness.qual.NonNull Function<? super List<String>, ? extends List<String>> transformer) {
		if (transformer == null) {
			throw new java.lang.NullPointerException("transformer is marked non-null but is null");
		}
		return new WithByNullAnnos(transformer.apply(this.test));
	}
}
