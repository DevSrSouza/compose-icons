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

public val CssGgIcons.Hello: ImageVector
    get() {
        if (_hello != null) {
            return _hello!!
        }
        _hello = Builder(name = "Hello", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 12.0f)
                curveTo(17.5f, 13.576f, 16.837f, 14.997f, 15.775f, 16.0f)
                curveTo(14.79f, 16.93f, 13.462f, 17.5f, 12.0f, 17.5f)
                curveTo(10.538f, 17.5f, 9.21f, 16.93f, 8.225f, 16.0f)
                curveTo(7.163f, 14.997f, 6.5f, 13.576f, 6.5f, 12.0f)
                horizontalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 7.0f)
                curveTo(1.0f, 3.686f, 3.686f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(20.314f, 1.0f, 23.0f, 3.686f, 23.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(23.0f, 20.314f, 20.314f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(3.75f, 12.0f)
                curveTo(3.75f, 7.444f, 7.444f, 3.75f, 12.0f, 3.75f)
                curveTo(16.556f, 3.75f, 20.25f, 7.444f, 20.25f, 12.0f)
                curveTo(20.25f, 16.556f, 16.556f, 20.25f, 12.0f, 20.25f)
                curveTo(7.444f, 20.25f, 3.75f, 16.556f, 3.75f, 12.0f)
                close()
            }
        }
        .build()
        return _hello!!
    }

private var _hello: ImageVector? = null
