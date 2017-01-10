package architect.annotations.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnyAnnotation5 {
	public String name();
	public String gender();
}
