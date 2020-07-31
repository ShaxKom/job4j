package ru.job4j.ex;

/**
 * Search user in the list and check whether it has an access
 */
public class UserStore {
    /**
     *  Search user in the list
     * @param users list of users
     * @param login required user
     * @return user
     * @throws UserNotFoundException in case if user doesn't exist
     */
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        User rsl = null;
        for(int index = 0; index < users.length; index++) {
            if (login.equals(users[index].getUsername())) {
                rsl = users[index];
                break;
            }
        }
        if (rsl == null) {
            throw new UserNotFoundException("Couldn't find user "   + "\"" + login + "\"");
        }
        return rsl;
    }

    /**
     * Check whether user has access
     * @param user required user
     * @throws UserInvalidException in case if doesn't have access
     */
    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User isn't valid!");
        }
        return user.isValid();
    }

    public static void main(String[] args) {
        User[] users = {new User("Kamilov S", true)};
        try {
            User user = findUser(users, "Kamilov S");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException en) {
            en.printStackTrace();
        }

    }
}
