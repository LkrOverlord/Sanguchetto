import { Button } from "react-bootstrap";
import profileImage from "../../../assets/images/personCicle.svg"

const ProfileButton = () => {
    return ( 
        <Button className="profileImage">
            <img src={profileImage} alt="" className="profileImage"/>
        </Button>
     );
}
 
export default ProfileButton;