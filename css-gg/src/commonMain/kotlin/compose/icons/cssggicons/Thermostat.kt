package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Thermostat: ImageVector
    get() {
        if (_thermostat != null) {
            return _thermostat!!
        }
        _thermostat = Builder(name = "Thermostat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 19.0f)
                curveTo(12.5523f, 19.0f, 13.0f, 18.5523f, 13.0f, 18.0f)
                curveTo(13.0f, 17.4477f, 12.5523f, 17.0f, 12.0f, 17.0f)
                curveTo(11.4477f, 17.0f, 11.0f, 17.4477f, 11.0f, 18.0f)
                curveTo(11.0f, 18.5523f, 11.4477f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 13.9997f)
                curveTo(16.2144f, 14.9119f, 17.0f, 16.3642f, 17.0f, 18.0f)
                curveTo(17.0f, 20.7614f, 14.7614f, 23.0f, 12.0f, 23.0f)
                curveTo(9.2386f, 23.0f, 7.0f, 20.7614f, 7.0f, 18.0f)
                curveTo(7.0f, 16.3642f, 7.7856f, 14.9119f, 9.0f, 13.9997f)
                verticalLineTo(4.0f)
                curveTo(9.0f, 2.3431f, 10.3431f, 1.0f, 12.0f, 1.0f)
                curveTo(13.6569f, 1.0f, 15.0f, 2.3431f, 15.0f, 4.0f)
                verticalLineTo(13.9997f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineTo(15.1707f)
                curveTo(14.1652f, 15.5826f, 15.0f, 16.6938f, 15.0f, 18.0f)
                curveTo(15.0f, 19.6569f, 13.6569f, 21.0f, 12.0f, 21.0f)
                curveTo(10.3431f, 21.0f, 9.0f, 19.6569f, 9.0f, 18.0f)
                curveTo(9.0f, 16.6938f, 9.8348f, 15.5826f, 11.0f, 15.1707f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.4477f, 11.4477f, 3.0f, 12.0f, 3.0f)
                curveTo(12.5523f, 3.0f, 13.0f, 3.4477f, 13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _thermostat!!
    }

private var _thermostat: ImageVector? = null
