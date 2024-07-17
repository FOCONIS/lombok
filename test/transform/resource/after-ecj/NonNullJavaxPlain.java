import java.lang.annotation.*;
@lombok.RequiredArgsConstructor @lombok.Getter @lombok.Setter class NonNullJavaxPlain {
  @javax.annotation.Nonnull int i;
  @javax.annotation.Nonnull String s;
  public @java.lang.SuppressWarnings("all") @lombok.Generated NonNullJavaxPlain(final @javax.annotation.Nonnull int i, final @javax.annotation.Nonnull String s) {
    super();
    if ((s == null))
        {
          throw new java.lang.NullPointerException("s is marked non-null but is null");
        }
    this.i = i;
    this.s = s;
  }
  public @javax.annotation.Nonnull @java.lang.SuppressWarnings("all") @lombok.Generated int getI() {
    return this.i;
  }
  public @javax.annotation.Nonnull @java.lang.SuppressWarnings("all") @lombok.Generated String getS() {
    return this.s;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated void setI(final @javax.annotation.Nonnull int i) {
    this.i = i;
  }
  public @java.lang.SuppressWarnings("all") @lombok.Generated void setS(final @javax.annotation.Nonnull String s) {
    if ((s == null))
        {
          throw new java.lang.NullPointerException("s is marked non-null but is null");
        }
    this.s = s;
  }
}
