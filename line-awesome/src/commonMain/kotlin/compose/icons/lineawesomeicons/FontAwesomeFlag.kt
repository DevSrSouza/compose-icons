package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.FontAwesomeFlag: ImageVector
    get() {
        if (_fontAwesomeFlag != null) {
            return _fontAwesomeFlag!!
        }
        _fontAwesomeFlag = Builder(name = "FontAwesomeFlag", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                curveTo(7.346f, 4.0f, 6.0f, 5.346f, 6.0f, 7.0f)
                curveTo(6.0f, 8.3016f, 6.8387f, 9.4021f, 8.0f, 9.8164f)
                lineTo(8.0f, 11.3047f)
                lineTo(8.0f, 23.207f)
                lineTo(8.0f, 27.0234f)
                curveTo(8.0f, 27.5634f, 8.4366f, 28.0f, 8.9766f, 28.0f)
                lineTo(9.0234f, 28.0f)
                curveTo(9.5634f, 28.0f, 10.0f, 27.5634f, 10.0f, 27.0234f)
                lineTo(10.0f, 22.2285f)
                curveTo(10.3347f, 21.8398f, 11.1384f, 21.0469f, 13.4453f, 21.0469f)
                curveTo(14.6693f, 21.0469f, 15.6704f, 21.4738f, 16.7324f, 21.9258f)
                curveTo(17.7694f, 22.3678f, 18.8419f, 22.8242f, 20.0879f, 22.8242f)
                curveTo(22.4469f, 22.8242f, 24.0494f, 21.5847f, 24.7344f, 21.0547f)
                lineTo(24.8867f, 20.9395f)
                curveTo(25.4377f, 20.5405f, 26.0f, 19.996f, 26.0f, 19.0f)
                lineTo(26.0f, 10.6758f)
                curveTo(26.0f, 9.7678f, 25.2218f, 9.0f, 24.2988f, 9.0f)
                curveTo(23.8038f, 9.0f, 23.4404f, 9.2866f, 22.9414f, 9.6836f)
                curveTo(22.2794f, 10.2076f, 21.2809f, 11.0f, 20.0879f, 11.0f)
                curveTo(19.2729f, 11.0f, 18.4777f, 10.6197f, 17.5547f, 10.1777f)
                curveTo(16.4037f, 9.6257f, 15.0984f, 9.0f, 13.4434f, 9.0f)
                curveTo(12.3083f, 9.0f, 11.4217f, 9.1883f, 10.7129f, 9.457f)
                curveTo(11.4891f, 8.9142f, 12.0f, 8.0168f, 12.0f, 7.0f)
                curveTo(12.0f, 5.346f, 10.654f, 4.0f, 9.0f, 4.0f)
                close()
                moveTo(9.0f, 6.0f)
                curveTo(9.552f, 6.0f, 10.0f, 6.449f, 10.0f, 7.0f)
                curveTo(10.0f, 7.551f, 9.552f, 8.0f, 9.0f, 8.0f)
                curveTo(8.448f, 8.0f, 8.0f, 7.551f, 8.0f, 7.0f)
                curveTo(8.0f, 6.449f, 8.448f, 6.0f, 9.0f, 6.0f)
                close()
                moveTo(13.4434f, 11.0f)
                curveTo(14.6454f, 11.0f, 15.6384f, 11.4765f, 16.6914f, 11.9805f)
                curveTo(17.7364f, 12.4825f, 18.8179f, 13.0f, 20.0879f, 13.0f)
                curveTo(21.8429f, 13.0f, 23.158f, 12.0545f, 23.998f, 11.3965f)
                lineTo(23.998f, 19.0664f)
                curveTo(23.997f, 19.0704f, 23.953f, 19.1453f, 23.709f, 19.3223f)
                lineTo(23.5098f, 19.4746f)
                curveTo(22.9428f, 19.9126f, 21.7629f, 20.8242f, 20.0879f, 20.8242f)
                curveTo(19.2499f, 20.8242f, 18.4466f, 20.4829f, 17.5156f, 20.0859f)
                curveTo(16.3726f, 19.5979f, 15.0764f, 19.0449f, 13.4434f, 19.0449f)
                curveTo(11.8914f, 19.0449f, 10.786f, 19.358f, 10.0f, 19.75f)
                lineTo(10.0f, 12.3613f)
                curveTo(10.345f, 11.9053f, 11.1324f, 11.0f, 13.4434f, 11.0f)
                close()
            }
        }
        .build()
        return _fontAwesomeFlag!!
    }

private var _fontAwesomeFlag: ImageVector? = null
