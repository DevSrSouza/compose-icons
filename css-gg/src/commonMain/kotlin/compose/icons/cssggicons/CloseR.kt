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

public val CssGgIcons.CloseR: ImageVector
    get() {
        if (_closeR != null) {
            return _closeR!!
        }
        _closeR = Builder(name = "CloseR", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.396f, 7.757f)
                curveTo(16.786f, 8.148f, 16.786f, 8.781f, 16.396f, 9.172f)
                lineTo(13.414f, 12.153f)
                lineTo(16.09f, 14.828f)
                curveTo(16.48f, 15.219f, 16.48f, 15.852f, 16.09f, 16.243f)
                curveTo(15.699f, 16.633f, 15.066f, 16.633f, 14.675f, 16.243f)
                lineTo(12.0f, 13.567f)
                lineTo(9.325f, 16.243f)
                curveTo(8.934f, 16.633f, 8.301f, 16.633f, 7.91f, 16.243f)
                curveTo(7.52f, 15.852f, 7.52f, 15.219f, 7.91f, 14.828f)
                lineTo(10.586f, 12.153f)
                lineTo(7.604f, 9.172f)
                curveTo(7.214f, 8.781f, 7.214f, 8.148f, 7.604f, 7.757f)
                curveTo(7.995f, 7.367f, 8.628f, 7.367f, 9.019f, 7.757f)
                lineTo(12.0f, 10.739f)
                lineTo(14.981f, 7.757f)
                curveTo(15.372f, 7.367f, 16.005f, 7.367f, 16.396f, 7.757f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(4.0f, 1.0f)
                curveTo(2.343f, 1.0f, 1.0f, 2.343f, 1.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(1.0f, 21.657f, 2.343f, 23.0f, 4.0f, 23.0f)
                horizontalLineTo(20.0f)
                curveTo(21.657f, 23.0f, 23.0f, 21.657f, 23.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(23.0f, 2.343f, 21.657f, 1.0f, 20.0f, 1.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(20.0f, 3.0f)
                horizontalLineTo(4.0f)
                curveTo(3.448f, 3.0f, 3.0f, 3.448f, 3.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(3.0f, 20.552f, 3.448f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(20.552f, 21.0f, 21.0f, 20.552f, 21.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(21.0f, 3.448f, 20.552f, 3.0f, 20.0f, 3.0f)
                close()
            }
        }
        .build()
        return _closeR!!
    }

private var _closeR: ImageVector? = null
