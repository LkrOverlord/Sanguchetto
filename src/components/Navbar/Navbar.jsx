import Container from 'react-bootstrap/Container';
import Nav from 'react-bootstrap/Nav';
import Navbar from 'react-bootstrap/Navbar';
import './Navbar.css';
import LogoBrand from './logo/LogoBrand';
import { Col, Row } from 'react-bootstrap';
import NavUtilsUser from '../NavUtilsUser/NavUtilsUser';
import ProfileButton from '../Profile/Profile/Profile';

const NavBar = () => {
    return (
        <Navbar expand="lg" className="bg-body-tertiary navBar">
            <Container fluid>
                <Row className="w-100 no-gutters m-0">
                    {/* Logo*/}
                    <Col lg={3} className='d-flex justify-content-center align-items-center'>
                        <LogoBrand />
                    </Col>

                    {/*Botones*/}
                    <Col lg={6} className='d-flex justify-content-center align-items-center'>
                        <Navbar.Toggle aria-controls="basic-navbar-nav" />
                        <Navbar.Collapse id="basic-navbar-nav">
                            <Nav className="buttonsNav mx-auto">
                                <Nav.Link href="#home" className='buttonNav'>HOME</Nav.Link>
                                <Nav.Link href="#link" className='buttonNav'>NOSOTROS</Nav.Link>
                                <Nav.Link href='#link' className='buttonNav'>PRODUCTOS</Nav.Link>
                                <Nav.Link href='#link' className='buttonNav'>PROMOCIONES</Nav.Link>
                                <Nav.Link href='#link' className='buttonNav'>LOCALES</Nav.Link>
                                <Nav.Link href='#link' className='buttonNav'>CONTACTO</Nav.Link>
                            </Nav>
                        </Navbar.Collapse>
                    </Col>

                    {/*Perfil - iniciar sesión*/}
                    <Col lg={3} className="d-flex align-items-center">
                        <NavUtilsUser />
                        <div className='d-flex justify-content-center flex-grow-1'>
                            <ProfileButton />
                        </div>

                    </Col>
                </Row>

            </Container>
        </Navbar>
    );
}

export default NavBar;