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

public val LineAwesomeIcons.UniversitySolid: ImageVector
    get() {
        if (_universitySolid != null) {
            return _universitySolid!!
        }
        _universitySolid = Builder(name = "UniversitySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.875f)
                lineTo(15.5625f, 4.0938f)
                lineTo(5.5625f, 9.0f)
                lineTo(5.0f, 9.2813f)
                lineTo(5.0f, 11.0f)
                lineTo(27.0f, 11.0f)
                lineTo(27.0f, 9.2813f)
                lineTo(26.4375f, 9.0f)
                lineTo(16.4375f, 4.0938f)
                close()
                moveTo(16.0f, 6.125f)
                lineTo(21.875f, 9.0f)
                lineTo(10.125f, 9.0f)
                close()
                moveTo(7.0f, 12.0f)
                lineTo(7.0f, 22.0f)
                lineTo(6.0f, 22.0f)
                lineTo(6.0f, 24.0f)
                lineTo(26.0f, 24.0f)
                lineTo(26.0f, 22.0f)
                lineTo(25.0f, 22.0f)
                lineTo(25.0f, 12.0f)
                lineTo(23.0f, 12.0f)
                lineTo(23.0f, 22.0f)
                lineTo(21.0f, 22.0f)
                lineTo(21.0f, 12.0f)
                lineTo(19.0f, 12.0f)
                lineTo(19.0f, 22.0f)
                lineTo(17.0f, 22.0f)
                lineTo(17.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 12.0f)
                lineTo(11.0f, 12.0f)
                lineTo(11.0f, 22.0f)
                lineTo(9.0f, 22.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(4.0f, 25.0f)
                lineTo(4.0f, 27.0f)
                lineTo(28.0f, 27.0f)
                lineTo(28.0f, 25.0f)
                close()
            }
        }
        .build()
        return _universitySolid!!
    }

private var _universitySolid: ImageVector? = null
