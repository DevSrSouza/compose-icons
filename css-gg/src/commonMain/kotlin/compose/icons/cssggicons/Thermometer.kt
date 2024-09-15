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

public val CssGgIcons.Thermometer: ImageVector
    get() {
        if (_thermometer != null) {
            return _thermometer!!
        }
        _thermometer = Builder(name = "Thermometer", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.95f, 5.636f)
                curveTo(17.34f, 5.246f, 17.973f, 5.246f, 18.364f, 5.636f)
                curveTo(18.754f, 6.027f, 18.754f, 6.66f, 18.364f, 7.05f)
                lineTo(11.293f, 14.121f)
                curveTo(10.902f, 14.512f, 10.269f, 14.512f, 9.879f, 14.121f)
                curveTo(9.488f, 13.731f, 9.488f, 13.098f, 9.879f, 12.707f)
                lineTo(16.95f, 5.636f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.828f, 17.586f)
                curveTo(9.769f, 18.872f, 12.411f, 18.66f, 14.121f, 16.95f)
                lineTo(21.192f, 9.879f)
                curveTo(23.145f, 7.926f, 23.145f, 4.76f, 21.192f, 2.808f)
                curveTo(19.24f, 0.855f, 16.074f, 0.855f, 14.121f, 2.808f)
                lineTo(7.05f, 9.879f)
                curveTo(5.34f, 11.589f, 5.128f, 14.231f, 6.414f, 16.172f)
                lineTo(2.808f, 19.778f)
                curveTo(2.417f, 20.169f, 2.417f, 20.802f, 2.808f, 21.192f)
                curveTo(3.198f, 21.583f, 3.831f, 21.583f, 4.222f, 21.192f)
                lineTo(7.828f, 17.586f)
                close()
                moveTo(12.707f, 15.536f)
                lineTo(19.778f, 8.465f)
                curveTo(20.95f, 7.293f, 20.95f, 5.394f, 19.778f, 4.222f)
                curveTo(18.607f, 3.05f, 16.707f, 3.05f, 15.536f, 4.222f)
                lineTo(8.465f, 11.293f)
                curveTo(7.293f, 12.465f, 7.293f, 14.364f, 8.465f, 15.536f)
                curveTo(9.636f, 16.707f, 11.536f, 16.707f, 12.707f, 15.536f)
                close()
            }
        }
        .build()
        return _thermometer!!
    }

private var _thermometer: ImageVector? = null
