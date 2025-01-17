import Image from "next/image";
import { GridContainer } from "../GridContainer";

export function SectionEvents() {
  return (
    <section>
      <GridContainer>
        <h3 className="text-6xl font-serif pt-20 mb-8">
          Também oferecemos <br /> eventos exclusivos!
        </h3>

        <div className="flex justify-between items-start space-x-6 pb-20">
          <div className="w-72">
            <Image
              src="happyhour.svg"
              alt="Happy Hour"
              width={288}
              height={288}
              className="object-cover rounded-lg h-72 w-full"
            />
            <h4 className="text-xl font-semibold mt-4 text-left">Happy Hour</h4>
            <p className="text-gray-600 text-left">
              Descontração, bebidas e petiscos no nosso Happy Hour.
            </p>
          </div>

          <div className="w-72">
            <Image
              src="birth.svg"
              alt="Aniversários"
              width={288}
              height={288}
              className="object-cover rounded-lg h-72 w-full"
            />
            <h4 className="text-xl font-semibold mt-4 text-left">
              Aniversários
            </h4>
            <p className="text-gray-600 text-left">
              Celebre seu aniversário com sabores inesquecíveis.
            </p>
          </div>

          <div className="w-72">
            <Image
              src="marry.svg"
              alt="Casamentos"
              width={288}
              height={288}
              className="object-cover rounded-lg h-72 w-full"
            />
            <h4 className="text-xl font-semibold mt-4 text-left">Casamentos</h4>
            <p className="text-gray-600 text-left">
              Torne seu casamento ainda mais especial com nossa gastronomia.
            </p>
          </div>

          <div className="w-72">
            <Image
              src="events.svg"
              alt="Eventos"
              width={288}
              height={288}
              className="object-cover rounded-lg h-72 w-full"
            />
            <h4 className="text-xl font-semibold mt-4 text-left">
              Mais eventos
            </h4>
            <p className="text-gray-600 text-left">
              Eventos incríveis para você e toda a família.
            </p>
          </div>
        </div>
      </GridContainer>
    </section>
  );
}
