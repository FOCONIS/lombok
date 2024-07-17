import java.lang.annotation.*;
@lombok.RequiredArgsConstructor @lombok.Getter @lombok.Setter class NonNullNoJavaxPlain {
  @javax.annotation.Nonnull int i;
  @javax.annotation.Nonnull String s;
  public @java.lang.SuppressWarnings("all") @lombok.Generated NonNullNoJavaxPlain() {
    super();
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
    this.s = s;
  }
}
