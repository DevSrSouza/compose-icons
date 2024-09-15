package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.TapDouble: ImageVector
    get() {
        if (_tapDouble != null) {
            return _tapDouble!!
        }
        _tapDouble = Builder(name = "TapDouble", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.924f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(14.924f, 12.343f, 13.58f, 11.0f, 11.924f, 11.0f)
                curveTo(10.267f, 11.0f, 8.924f, 12.343f, 8.924f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(8.924f, 19.657f, 10.267f, 21.0f, 11.924f, 21.0f)
                curveTo(13.58f, 21.0f, 14.924f, 19.657f, 14.924f, 18.0f)
                close()
                moveTo(11.924f, 9.0f)
                curveTo(9.162f, 9.0f, 6.924f, 11.239f, 6.924f, 14.0f)
                verticalLineTo(18.0f)
                curveTo(6.924f, 20.761f, 9.162f, 23.0f, 11.924f, 23.0f)
                curveTo(14.685f, 23.0f, 16.924f, 20.761f, 16.924f, 18.0f)
                verticalLineTo(14.0f)
                curveTo(16.924f, 11.239f, 14.685f, 9.0f, 11.924f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.924f, 14.0f)
                curveTo(10.924f, 13.448f, 11.371f, 13.0f, 11.924f, 13.0f)
                curveTo(12.476f, 13.0f, 12.924f, 13.448f, 12.924f, 14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.924f)
                verticalLineTo(14.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.924f, 1.0f)
                curveTo(14.702f, 1.0f, 17.216f, 2.133f, 19.029f, 3.963f)
                lineTo(17.614f, 5.377f)
                curveTo(16.164f, 3.91f, 14.15f, 3.0f, 11.924f, 3.0f)
                curveTo(9.774f, 3.0f, 7.823f, 3.847f, 6.386f, 5.227f)
                lineTo(4.971f, 3.812f)
                curveTo(6.771f, 2.071f, 9.222f, 1.0f, 11.924f, 1.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.923f, 5.0f)
                curveTo(13.581f, 5.0f, 15.104f, 5.576f, 16.303f, 6.539f)
                lineTo(14.877f, 7.965f)
                curveTo(14.049f, 7.358f, 13.028f, 7.0f, 11.923f, 7.0f)
                curveTo(10.848f, 7.0f, 9.852f, 7.339f, 9.037f, 7.917f)
                lineTo(7.608f, 6.488f)
                curveTo(8.797f, 5.556f, 10.295f, 5.0f, 11.923f, 5.0f)
                close()
            }
        }
        .build()
        return _tapDouble!!
    }

private var _tapDouble: ImageVector? = null
