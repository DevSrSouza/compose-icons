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

public val LineAwesomeIcons.CoffeeSolid: ImageVector
    get() {
        if (_coffeeSolid != null) {
            return _coffeeSolid!!
        }
        _coffeeSolid = Builder(name = "CoffeeSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 3.0f)
                lineTo(11.0f, 7.0f)
                lineTo(13.0f, 7.0f)
                lineTo(13.0f, 3.0f)
                close()
                moveTo(15.0f, 4.0f)
                lineTo(15.0f, 7.0f)
                lineTo(17.0f, 7.0f)
                lineTo(17.0f, 4.0f)
                close()
                moveTo(4.875f, 8.0f)
                lineTo(5.0f, 9.0938f)
                lineTo(6.8125f, 26.3125f)
                curveTo(6.9727f, 27.832f, 8.2852f, 29.0f, 9.8125f, 29.0f)
                lineTo(19.1875f, 29.0f)
                curveTo(20.7148f, 29.0f, 22.0273f, 27.832f, 22.1875f, 26.3125f)
                lineTo(22.6563f, 22.0f)
                lineTo(25.0f, 22.0f)
                curveTo(26.6445f, 22.0f, 28.0f, 20.6445f, 28.0f, 19.0f)
                lineTo(28.0f, 16.0f)
                curveTo(28.0f, 14.3555f, 26.6445f, 13.0f, 25.0f, 13.0f)
                lineTo(23.5938f, 13.0f)
                lineTo(24.0f, 9.0938f)
                lineTo(24.125f, 8.0f)
                close()
                moveTo(7.125f, 10.0f)
                lineTo(21.875f, 10.0f)
                lineTo(20.1875f, 26.0938f)
                curveTo(20.1328f, 26.6133f, 19.707f, 27.0f, 19.1875f, 27.0f)
                lineTo(9.8125f, 27.0f)
                curveTo(9.293f, 27.0f, 8.8672f, 26.6133f, 8.8125f, 26.0938f)
                close()
                moveTo(23.375f, 15.0f)
                lineTo(25.0f, 15.0f)
                curveTo(25.5664f, 15.0f, 26.0f, 15.4336f, 26.0f, 16.0f)
                lineTo(26.0f, 19.0f)
                curveTo(26.0f, 19.5664f, 25.5664f, 20.0f, 25.0f, 20.0f)
                lineTo(22.8438f, 20.0f)
                close()
            }
        }
        .build()
        return _coffeeSolid!!
    }

private var _coffeeSolid: ImageVector? = null
