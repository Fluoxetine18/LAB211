package constant;

public interface IConstant {

    String NAME = "^[A-Za-z ]+$";
    String PHONE = "^[0-9]{10,}$";
    String EMAIL = "^([\\w\\-\\.]+)@([\\w\\-\\.]+)\\.([a-zA-Z]{2,5})$";
    String ADDRESS = "[A-Za-z0-9 ,\\-\\./]+$";
    String TEXT = "^[A-Za-z0-9 ,\\.]+";
    String YES_NO = "[yYnN]";

    String YES = "y";
    int MIN_YEAR = 1900;
    int EXPERIENCE_TYPE = 0;
    int FRESHER_TYPE = 1;
    int INTERN_TYPE = 2;
}
