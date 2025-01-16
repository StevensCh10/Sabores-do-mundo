import Image from "next/image";
import { Header } from "./components/Header";
import { SectionHero } from "./components/SectionHero";
import { SectionNavegation } from "./components/SectionNavegation";
import { SectionAbout } from "./components/SectionAbout";

export default function Home() {
  return (
    <>
    <Header/>
    <SectionHero/>
    <SectionNavegation/>
    <SectionAbout/> 
    </>
  )
}
