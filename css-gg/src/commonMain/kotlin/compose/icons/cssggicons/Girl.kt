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

public val CssGgIcons.Girl: ImageVector
    get() {
        if (_girl != null) {
            return _girl!!
        }
        _girl = Builder(name = "Girl", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 12.0f)
                curveTo(10.0f, 12.552f, 9.552f, 13.0f, 9.0f, 13.0f)
                curveTo(8.448f, 13.0f, 8.0f, 12.552f, 8.0f, 12.0f)
                curveTo(8.0f, 11.448f, 8.448f, 11.0f, 9.0f, 11.0f)
                curveTo(9.552f, 11.0f, 10.0f, 11.448f, 10.0f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 13.0f)
                curveTo(15.552f, 13.0f, 16.0f, 12.552f, 16.0f, 12.0f)
                curveTo(16.0f, 11.448f, 15.552f, 11.0f, 15.0f, 11.0f)
                curveTo(14.448f, 11.0f, 14.0f, 11.448f, 14.0f, 12.0f)
                curveTo(14.0f, 12.552f, 14.448f, 13.0f, 15.0f, 13.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.024f, 2.0f)
                lineTo(12.0f, 2.0f)
                curveTo(6.477f, 2.0f, 2.0f, 6.477f, 2.0f, 12.0f)
                curveTo(2.0f, 17.523f, 6.477f, 22.0f, 12.0f, 22.0f)
                curveTo(17.523f, 22.0f, 22.0f, 17.523f, 22.0f, 12.0f)
                curveTo(22.0f, 6.742f, 17.942f, 2.432f, 12.788f, 2.031f)
                lineTo(12.789f, 2.028f)
                curveTo(12.533f, 2.009f, 12.278f, 2.0f, 12.024f, 2.0f)
                close()
                moveTo(12.0f, 20.0f)
                curveTo(16.418f, 20.0f, 20.0f, 16.418f, 20.0f, 12.0f)
                curveTo(20.0f, 11.301f, 19.91f, 10.624f, 19.742f, 9.978f)
                curveTo(16.16f, 10.231f, 12.736f, 8.525f, 10.76f, 5.602f)
                curveTo(9.313f, 7.079f, 7.298f, 7.997f, 5.069f, 8.003f)
                curveTo(4.389f, 9.179f, 4.0f, 10.544f, 4.0f, 12.0f)
                curveTo(4.0f, 16.418f, 7.582f, 20.0f, 12.0f, 20.0f)
                close()
                moveTo(11.979f, 4.0f)
                lineTo(12.024f, 4.0f)
                lineTo(12.0f, 4.0f)
                lineTo(11.979f, 4.0f)
                close()
            }
        }
        .build()
        return _girl!!
    }

private var _girl: ImageVector? = null
