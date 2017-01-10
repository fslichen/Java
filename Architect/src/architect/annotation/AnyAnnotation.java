package architect.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)// Don't make a mistake to miss this tag.
public @interface AnyAnnotation {
	public String name();
	public String gender();
}
