/*
 * Copyright 2016  Christoph Brill <egore911@gmail.com>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package libldt3.model.objekte;

import java.util.List;

import libldt3.annotations.Feld;
import libldt3.annotations.Feldart;
import libldt3.annotations.Objekt;
import libldt3.model.enums.Abrechnungsinfo;
import libldt3.model.enums.Dringlichkeit;
import libldt3.model.enums.KatalogIdAnforderbareLeistungen;
import libldt3.model.enums.StatusDringlichkeit;

/**
 * In diesem Objekt werden alle Informationen zur Untersuchungsanforderung zusammengefasst.
 */
@Objekt("0059")
public class Untersuchungsanforderung {

	@Objekt
	public static class KatalogReferenz {
		@SuppressWarnings("unused")
		private KatalogIdAnforderbareLeistungen value;
		@Feld(value = "7352", feldart = Feldart.bedingt_muss)
		private String katalogUrl;
		@Feld(value = "7251", feldart = Feldart.bedingt_kann)
		private String katalogBezeichnung;
		@Feld(value = "7365", feldart = Feldart.bedingt_muss)
		private String leistungskuerzel;
		@Feld(value = "7366", feldart = Feldart.bedingt_kann)
		private String leistungsbezeichnung;
	}

	@Objekt
	public static class Test {
		@SuppressWarnings("unused")
		private String value;
		@Feld(value = "8411", feldart = Feldart.bedingt_kann)
		private String testbezeichnung;
	}

	@Objekt
	public static class ProbengefäßIdent {
		@SuppressWarnings("unused")
		private String value;
		@Feld(value = "8428", feldart = Feldart.kann)
		private String probenmaterialIdent;
		@Feld(value = "8429", feldart = Feldart.kann)
		private String probenmaterialIndex;
	}

	@Objekt
	public static class Einwilligungserklärung {
		@SuppressWarnings("unused")
		private Boolean value;
		@Feld(value = "8110", feldart = Feldart.bedingt_kann)
		private Anhang anhang;
	}

	@Feld(value = "7260", feldart = Feldart.bedingt_muss)
	private KatalogReferenz anforderbareLeistungenKatalogId;
	@Feld(value = "7276", feldart = Feldart.kann)
	private String nummernpoolId;
	@Feld(value = "8410", feldart = Feldart.bedingt_muss)
	private Test testIdent;
	@Feld(value = "7303", feldart = Feldart.muss)
	private Abrechnungsinfo abrechnungsinfo;
	@Feld(value = "8501", feldart = Feldart.kann)
	private Dringlichkeit dringlichkeit;
	@Feld(value = "7262", feldart = Feldart.bedingt_kann)
	private List<StatusDringlichkeit> statusDringlichkeit;
	@Feld(value = "7364", feldart = Feldart.muss)
	private List<ProbengefäßIdent> probengefäßIdent;
	@Feld(value = "8434", feldart = Feldart.bedingt_muss)
	private String anforderungen;
	@Feld(value = "8134", feldart = Feldart.kann)
	private KrebsfrueherkennungFrauen krebsfrueherkennungFrauen;
	@Feld(value = "8156", feldart = Feldart.kann)
	private Tumor tumor;
	@Feld(value = "8110", feldart = Feldart.kann)
	private List<Anhang> anhang;
	@Feld(value = "8167", name = "Zusaetzliche_Informationen", feldart = Feldart.kann)
	private List<Fliesstext> zusaetzlicheInformationen;
	@Feld(value = "8238", feldart = Feldart.kann)
	private Fliesstext auftragsbezogeneHinweise;
	@Feld(value = "8491", feldart = Feldart.kann)
	private Einwilligungserklärung einwilligungserklärungLiegtVor;
	@Feld(value = "8213", feldart = Feldart.muss)
	private Timestamp timestampErstellungUntersuchungsanforderung;
	@Feld(value = "8141", feldart = Feldart.kann)
	private Namenskennung namenskennung;

}
