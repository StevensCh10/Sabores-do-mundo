import Image from "next/image";
import { GridContainer } from "../GridContainer";
import { FiPhone, FiMail, FiMapPin } from "react-icons/fi";
import Link from "next/link";

export function SectionAbout() {
  return (
    <section className="bg-white-100">
      <GridContainer>
        <div className="relative">
          <div className="flex items-center space-x-14 py-20">
            <Image
              src="comida.svg"
              alt="Comida"
              width={599}
              height={566}
              className="rounded-lg"
            />

            <div className="flex flex-col space-y-4">
              <h3 className="flex flex-col items-center text-6xl font-serif">
                Uma Viagem Gastronômica pelos Sabores do Mundo
              </h3>

              <p className="text-gray-600">
                Sabores do Mundo é um restaurante que celebra a diversidade
                gastronômica global. Aqui, cada prato é inspirado nas tradições
                culinárias de diferentes culturas, trazendo uma experiência
                única e envolvente para os amantes da boa mesa. Com ingredientes
                selecionados e uma equipe dedicada, nosso objetivo é levar você
                a uma viagem de sabores inesquecíveis, sem sair do lugar.
              </p>

              <small className="text-gray-500">
                No Sabores do Mundo, acreditamos que jantar não é só sobre
                comer, mas sobre viver uma experiência completa. Nossa equipe,
                conhecida por ser acolhedora e dedicada, trabalha para tornar
                cada visita especial e inesquecível.
              </small>

              <Link href="/about">
                <button className="border-2 border-black font-bold px-6 py-4 rounded-full transform transition duration-300 hover:scale-110 self-start">
                  Sobre nós
                </button>
              </Link>
            </div>
          </div>

          <div className="absolute top-3/4 left-1/4 transform -translate-y-1/2 bg-gray-100 text-white p-10 rounded-lg shadow-md w-80">
            <h5 className="text-xl font-semibold mb-4">Venha nos visitar</h5>

            <div className="flex items-center space-x-2 mb-4 hover:underline cursor-pointer">
              <FiPhone className="text-white" />
              <p>(11) 99992-2224</p>
            </div>

            <div className="flex items-center space-x-2 mb-4 hover:underline cursor-pointer">
              <FiMail className="text-white" />
              <p>saboresdomundo@gmail.com</p>
            </div>

            <div className="flex items-center space-x-2 hover:underline cursor-pointer">
              <FiMapPin className="text-white" />
              <p>Rua do malote. Av Malote Brabo 146</p>
            </div>
          </div>
        </div>
      </GridContainer>
    </section>
  );
}
