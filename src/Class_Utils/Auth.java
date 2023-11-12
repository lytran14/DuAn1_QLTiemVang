
package Class_Utils;



public class Auth {

    public static NhanVien_Model user = null;
 
    public static void clear() {
        Auth.user = null;
    }

    public static boolean isLogin() {
        return Auth.user != null;
    }

    public static boolean isManager() {
        return Auth.isLogin() && user.getVaiTro();
    }
}
