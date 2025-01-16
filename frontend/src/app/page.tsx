import Image from "next/image";
import { Header } from "./components/Header";
import { SectionHero } from "./components/SectionHero";
import { SectionNavegation } from "./components/SectionNavegation";

export default function Home() {
  return (
    <>
    <Header/>
    <SectionHero/>
    <SectionNavegation/>
    </>
  )
}
