package jqademo.annotation;

@HashCodeRequired
public class AnnotatedClassInvalid {

    private Long key;
    private String field;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AnnotatedClassInvalid that = (AnnotatedClassInvalid) o;

        if (key != null ? !key.equals(that.key) : that.key != null) return false;
        return field != null ? field.equals(that.field) : that.field == null;
    }

    /*
    @Override
    public int hashCode() {
        int result = key != null ? key.hashCode() : 0;
        result = 31 * result + (field != null ? field.hashCode() : 0);
        return result;
    }
    */
}
