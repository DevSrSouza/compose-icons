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

public val LineAwesomeIcons.CrosshairsSolid: ImageVector
    get() {
        if (_crosshairsSolid != null) {
            return _crosshairsSolid!!
        }
        _crosshairsSolid = Builder(name = "CrosshairsSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 3.0f)
                lineTo(15.0f, 5.0625f)
                curveTo(9.7344f, 5.5391f, 5.5391f, 9.7344f, 5.0625f, 15.0f)
                lineTo(3.0f, 15.0f)
                lineTo(3.0f, 17.0f)
                lineTo(5.0625f, 17.0f)
                curveTo(5.5391f, 22.2656f, 9.7344f, 26.4609f, 15.0f, 26.9375f)
                lineTo(15.0f, 29.0f)
                lineTo(17.0f, 29.0f)
                lineTo(17.0f, 26.9375f)
                curveTo(22.2656f, 26.4609f, 26.4609f, 22.2656f, 26.9375f, 17.0f)
                lineTo(29.0f, 17.0f)
                lineTo(29.0f, 15.0f)
                lineTo(26.9375f, 15.0f)
                curveTo(26.4609f, 9.7344f, 22.2656f, 5.5391f, 17.0f, 5.0625f)
                lineTo(17.0f, 3.0f)
                close()
                moveTo(15.0f, 7.0313f)
                lineTo(15.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                lineTo(17.0f, 7.0313f)
                curveTo(21.1914f, 7.4844f, 24.5156f, 10.8086f, 24.9688f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 17.0f)
                lineTo(24.9688f, 17.0f)
                curveTo(24.5156f, 21.1914f, 21.1914f, 24.5156f, 17.0f, 24.9688f)
                lineTo(17.0f, 23.0f)
                lineTo(15.0f, 23.0f)
                lineTo(15.0f, 24.9688f)
                curveTo(10.8086f, 24.5156f, 7.4844f, 21.1914f, 7.0313f, 17.0f)
                lineTo(9.0f, 17.0f)
                lineTo(9.0f, 15.0f)
                lineTo(7.0313f, 15.0f)
                curveTo(7.4844f, 10.8086f, 10.8086f, 7.4844f, 15.0f, 7.0313f)
                close()
            }
        }
        .build()
        return _crosshairsSolid!!
    }

private var _crosshairsSolid: ImageVector? = null
