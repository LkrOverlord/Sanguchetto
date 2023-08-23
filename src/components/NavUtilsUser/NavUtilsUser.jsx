import CartButton from "../CartButton/CartButton";
import Favorite from "../Profile/Favorite/Favorite";
import NotificationButton from "../Profile/Notification/NotificationButton";
import StyledWrapper from "../StyledWrapper/StyledWrapper";


const NavUtilsUser = () => {
    return (
        <div className="styledWrapper">
            <StyledWrapper>
                <Favorite></Favorite>
            </StyledWrapper>
            <StyledWrapper>
                <CartButton></CartButton>
            </StyledWrapper>
            <StyledWrapper>
                <NotificationButton></NotificationButton>
            </StyledWrapper>
        </div>
    );
}

export default NavUtilsUser;