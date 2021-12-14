package Model;

public class Category
{
    public String name;
    public String value;

    public boolean changeCategory(Category category)
    {
        this.name = category.name;
        this.value = category.value;

        return true;
    }
}
