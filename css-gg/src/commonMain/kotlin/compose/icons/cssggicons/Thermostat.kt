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
                curveTo(12.552f, 19.0f, 13.0f, 18.552f, 13.0f, 18.0f)
                curveTo(13.0f, 17.448f, 12.552f, 17.0f, 12.0f, 17.0f)
                curveTo(11.448f, 17.0f, 11.0f, 17.448f, 11.0f, 18.0f)
                curveTo(11.0f, 18.552f, 11.448f, 19.0f, 12.0f, 19.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.0f, 14.0f)
                curveTo(16.214f, 14.912f, 17.0f, 16.364f, 17.0f, 18.0f)
                curveTo(17.0f, 20.761f, 14.761f, 23.0f, 12.0f, 23.0f)
                curveTo(9.239f, 23.0f, 7.0f, 20.761f, 7.0f, 18.0f)
                curveTo(7.0f, 16.364f, 7.786f, 14.912f, 9.0f, 14.0f)
                verticalLineTo(4.0f)
                curveTo(9.0f, 2.343f, 10.343f, 1.0f, 12.0f, 1.0f)
                curveTo(13.657f, 1.0f, 15.0f, 2.343f, 15.0f, 4.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(13.0f, 4.0f)
                verticalLineTo(15.171f)
                curveTo(14.165f, 15.583f, 15.0f, 16.694f, 15.0f, 18.0f)
                curveTo(15.0f, 19.657f, 13.657f, 21.0f, 12.0f, 21.0f)
                curveTo(10.343f, 21.0f, 9.0f, 19.657f, 9.0f, 18.0f)
                curveTo(9.0f, 16.694f, 9.835f, 15.583f, 11.0f, 15.171f)
                verticalLineTo(4.0f)
                curveTo(11.0f, 3.448f, 11.448f, 3.0f, 12.0f, 3.0f)
                curveTo(12.552f, 3.0f, 13.0f, 3.448f, 13.0f, 4.0f)
                close()
            }
        }
        .build()
        return _thermostat!!
    }

private var _thermostat: ImageVector? = null
