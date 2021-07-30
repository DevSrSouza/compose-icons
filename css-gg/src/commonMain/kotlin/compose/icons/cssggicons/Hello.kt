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
                curveTo(17.5f, 13.576f, 16.8371f, 14.9972f, 15.7749f, 16.0f)
                curveTo(14.7899f, 16.9299f, 13.4615f, 17.5f, 12.0f, 17.5f)
                curveTo(10.5385f, 17.5f, 9.2101f, 16.9299f, 8.2251f, 16.0f)
                curveTo(7.1629f, 14.9972f, 6.5f, 13.576f, 6.5f, 12.0f)
                horizontalLineTo(17.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(1.0f, 7.0f)
                curveTo(1.0f, 3.6863f, 3.6863f, 1.0f, 7.0f, 1.0f)
                horizontalLineTo(17.0f)
                curveTo(20.3137f, 1.0f, 23.0f, 3.6863f, 23.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(23.0f, 20.3137f, 20.3137f, 23.0f, 17.0f, 23.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(3.75f, 12.0f)
                curveTo(3.75f, 7.4436f, 7.4436f, 3.75f, 12.0f, 3.75f)
                curveTo(16.5563f, 3.75f, 20.25f, 7.4436f, 20.25f, 12.0f)
                curveTo(20.25f, 16.5563f, 16.5563f, 20.25f, 12.0f, 20.25f)
                curveTo(7.4436f, 20.25f, 3.75f, 16.5563f, 3.75f, 12.0f)
                close()
            }
        }
        .build()
        return _hello!!
    }

private var _hello: ImageVector? = null
