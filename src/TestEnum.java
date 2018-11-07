public enum TestEnum
{
    OPTION1("val1"), OPTION2("val2"), OPTION3("val3"), OPTION4("val3");

    private String myVal;

    TestEnum(String myVal)
    {
        this.myVal = myVal;
    }

    public String getMyVal()
    {
        return myVal;
    }
}
