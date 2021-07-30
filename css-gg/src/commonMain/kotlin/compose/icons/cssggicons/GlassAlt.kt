package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.GlassAlt: ImageVector
    get() {
        if (_glassAlt != null) {
            return _glassAlt!!
        }
        _glassAlt = Builder(name = "GlassAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.0f, 2.0f)
                horizontalLineTo(19.0f)
                lineTo(17.3602f, 18.398f)
                curveTo(17.1557f, 20.4428f, 15.4351f, 22.0f, 13.38f, 22.0f)
                horizontalLineTo(10.62f)
                curveTo(8.5649f, 22.0f, 6.8443f, 20.4428f, 6.6398f, 18.398f)
                lineTo(5.0f, 2.0f)
                close()
                moveTo(7.51f, 7.0f)
                lineTo(7.21f, 4.0f)
                horizontalLineTo(16.79f)
                lineTo(16.49f, 7.0f)
                horizontalLineTo(7.51f)
                close()
                moveTo(7.71f, 9.0f)
                lineTo(8.6299f, 18.199f)
                curveTo(8.7321f, 19.2214f, 9.5925f, 20.0f, 10.62f, 20.0f)
                horizontalLineTo(13.38f)
                curveTo(14.4076f, 20.0f, 15.2679f, 19.2214f, 15.3701f, 18.199f)
                lineTo(16.29f, 9.0f)
                horizontalLineTo(7.71f)
                close()
            }
        }
        .build()
        return _glassAlt!!
    }

private var _glassAlt: ImageVector? = null
