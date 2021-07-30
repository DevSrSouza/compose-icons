package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Airplane: ImageVector
    get() {
        if (_airplane != null) {
            return _airplane!!
        }
        _airplane = Builder(name = "Airplane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0097f, 5.1276f)
                horizontalLineTo(11.0097f)
                curveTo(12.1142f, 5.1276f, 13.468f, 5.8968f, 14.0335f, 6.8457f)
                lineTo(16.5089f, 11.0f)
                horizontalLineTo(21.0097f)
                curveTo(21.562f, 11.0f, 22.0097f, 11.4477f, 22.0097f, 12.0f)
                curveTo(22.0097f, 12.5523f, 21.562f, 13.0f, 21.0097f, 13.0f)
                horizontalLineTo(16.4138f)
                lineTo(13.9383f, 17.1543f)
                curveTo(13.3729f, 18.1032f, 12.0191f, 18.8724f, 10.9145f, 18.8724f)
                horizontalLineTo(8.9145f)
                lineTo(12.4138f, 13.0f)
                horizontalLineTo(5.4248f)
                lineTo(3.9904f, 15.4529f)
                horizontalLineTo(1.9904f)
                lineTo(4.0097f, 12.0f)
                lineTo(4.0097f, 11.967f)
                lineTo(2.0097f, 8.5471f)
                horizontalLineTo(4.0097f)
                lineTo(5.4442f, 11.0f)
                horizontalLineTo(12.5089f)
                lineTo(9.0097f, 5.1276f)
                close()
            }
        }
        .build()
        return _airplane!!
    }

private var _airplane: ImageVector? = null
