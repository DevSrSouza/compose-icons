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

public val LineAwesomeIcons.SpellCheckSolid: ImageVector
    get() {
        if (_spellCheckSolid != null) {
            return _spellCheckSolid!!
        }
        _spellCheckSolid = Builder(name = "SpellCheckSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.332f, 5.0f)
                lineTo(3.0f, 18.0f)
                lineTo(5.1074f, 18.0f)
                lineTo(6.1074f, 15.0f)
                lineTo(10.668f, 15.0f)
                lineTo(11.668f, 18.0f)
                lineTo(13.7754f, 18.0f)
                lineTo(9.4414f, 5.0f)
                lineTo(7.332f, 5.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 10.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 18.0f)
                lineTo(21.0f, 18.0f)
                curveTo(23.206f, 18.0f, 25.0f, 16.206f, 25.0f, 14.0f)
                curveTo(25.0f, 12.3218f, 23.9582f, 10.8878f, 22.4902f, 10.2949f)
                curveTo(22.8077f, 9.7683f, 23.0f, 9.1585f, 23.0f, 8.5f)
                curveTo(23.0f, 6.57f, 21.43f, 5.0f, 19.5f, 5.0f)
                lineTo(15.0f, 5.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(19.5f, 7.0f)
                curveTo(20.327f, 7.0f, 21.0f, 7.673f, 21.0f, 8.5f)
                curveTo(21.0f, 9.327f, 20.327f, 10.0f, 19.5f, 10.0f)
                lineTo(17.0f, 10.0f)
                lineTo(17.0f, 7.0f)
                close()
                moveTo(8.3887f, 8.1621f)
                lineTo(10.002f, 13.0f)
                lineTo(6.7754f, 13.0f)
                lineTo(8.3887f, 8.1621f)
                close()
                moveTo(17.0f, 12.0f)
                lineTo(19.5f, 12.0f)
                lineTo(21.0f, 12.0f)
                curveTo(22.103f, 12.0f, 23.0f, 12.897f, 23.0f, 14.0f)
                curveTo(23.0f, 15.103f, 22.103f, 16.0f, 21.0f, 16.0f)
                lineTo(17.0f, 16.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(27.8086f, 17.7773f)
                lineTo(19.1172f, 26.1133f)
                lineTo(15.1934f, 22.3359f)
                lineTo(13.8066f, 23.7754f)
                lineTo(19.1133f, 28.8867f)
                lineTo(29.1914f, 19.2227f)
                lineTo(27.8086f, 17.7773f)
                close()
            }
        }
        .build()
        return _spellCheckSolid!!
    }

private var _spellCheckSolid: ImageVector? = null
