
import { Footer } from "../components/Footer";
import { Header } from "../components/Header";
import { SectionAboutHome } from "../components/SectionAboutHome";
import { SectionAboutUs } from "../components/SectionAboutUs";

export default function page() {
    return (
        <>
        <Header/>
        <SectionAboutHome/>
        <SectionAboutUs/>
        <Footer/>
        </>
    )
}
