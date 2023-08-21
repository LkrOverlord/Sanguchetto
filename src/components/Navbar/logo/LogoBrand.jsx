import { Navbar } from 'react-bootstrap';
import logoImage from '../../../assets/images/logo.png'

const LogoBrand = () => {
    return (
        <Navbar.Brand href="#home" className='logoContainer'>
            <img src={logoImage} alt="" className='logoImage' />
        </Navbar.Brand>
    )
}

export default LogoBrand;