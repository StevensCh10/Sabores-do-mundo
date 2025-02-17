import { Header } from "./components/Header";
import { SectionHero } from "./components/SectionHero";
import { SectionNavegation } from "./components/SectionNavegation";
import { SectionAbout } from "./components/SectionAbout";
import { SectionEvents } from "./components/SectionEvents";
import { SectionFood } from "./components/SectionFood";
import { SectionFeedbacks } from "./components/SectionFeedbacks";
import { Footer } from "./components/Footer";

export default function Home() {
  return (
    <>
    <Header/>
    <SectionHero/>
    <SectionNavegation/>
    <SectionAbout/> 
    <SectionEvents/>
    <SectionFood/>
    <SectionFeedbacks/>
    <Footer/>
    </>
  )
}
