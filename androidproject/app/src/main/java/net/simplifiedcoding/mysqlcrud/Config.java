package net.simplifiedcoding.mysqlcrud;


/**
 * Created by NAVA-PC on 6/6/2016.
 */
public class Config {

    //Link ke database
    public static final String URL_ADD="http://10.0.2.2:8080/androcrud/addEmp.php";
    public static final String URL_GET_ALL = "http://10.0.2.2:8080/androcrud/getAllEmp.php";
    public static final String URL_GET_EMP = "http://10.0.2.2:8080/androcrud/getEmp.php?id=";
    public static final String URL_UPDATE_EMP = "http://10.0.2.2:8080/androcrud/updateEmp.php";
    public static final String URL_DELETE_EMP = "http://10.0.2.2:8080/androcrud/deleteEmp.php?id=";
    public static final String URL_SELECT_EMP = "http://10.0.2.2:8080/androcrud/selectEmp.php?id=";

    public static final String URL_ADD_USERS="http://10.0.2.2:8080/androcrud/users/addUsers.php";
    public static final String URL_GET_ALL_USERS = "http://10.0.2.2:8080/androcrud/users/getAllUsers.php";
    public static final String URL_GET_USERS = "http://10.0.2.2:8080/androcrud/users/getUsers.php?id=";
    public static final String URL_UPDATE_USERS = "http://10.0.2.2:8080/androcrud/users/updateUsers.php";
    public static final String URL_DELETE_USERS = "http://10.0.2.2:8080/androcrud/users/deleteUsers.php?id=";

    //Kunci yang akan digunakan untuk mengirim permintaan ke php script
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAME = "name";
    public static final String KEY_EMP_DESG = "desg";
    public static final String KEY_EMP_SAL = "salary";
    public static final String KEY_EMP_USERNAME = "username";
    public static final String KEY_EMP_PASSWORD = "password";

    //Kunci yang akan digunakan untuk mengirim permintaan ke php script
    public static final String KEY_EMP_ID_USERS = "id";
    public static final String KEY_EMP_NAME_USERS = "name";
    public static final String KEY_EMP_USERNAME_USERS = "username";
    public static final String KEY_EMP_PASSWORD_USERS = "password";

    //JSON Tags
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID = "id";
    public static final String TAG_NAME = "name";
    public static final String TAG_DESG = "desg";
    public static final String TAG_SAL = "salary";

    //JSON Tags
    public static final String TAG_JSON_ARRAY_USERS="result";
    public static final String TAG_ID_USERS = "id";
    public static final String TAG_NAME_USERS = "name";
    public static final String TAG_USERNAME_USERS = "username";
    public static final String TAG_PASSWORD_USERS= "password";

    //id karyawan untuk lulus dengan maksud
    public static final String EMP_ID = "emp_id";
    public static final String USERS_ID = "users_id";
}
