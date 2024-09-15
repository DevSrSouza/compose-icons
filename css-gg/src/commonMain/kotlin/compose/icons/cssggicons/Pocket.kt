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

public val CssGgIcons.Pocket: ImageVector
    get() {
        if (_pocket != null) {
            return _pocket!!
        }
        _pocket = Builder(name = "Pocket", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 4.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                curveTo(21.0f, 15.971f, 16.971f, 20.0f, 12.0f, 20.0f)
                curveTo(7.029f, 20.0f, 3.0f, 15.971f, 3.0f, 11.0f)
                verticalLineTo(4.0f)
                close()
                moveTo(1.0f, 2.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(11.0f)
                curveTo(23.0f, 17.075f, 18.075f, 22.0f, 12.0f, 22.0f)
                curveTo(5.925f, 22.0f, 1.0f, 17.075f, 1.0f, 11.0f)
                verticalLineTo(2.0f)
                close()
                moveTo(11.293f, 14.693f)
                curveTo(11.683f, 15.084f, 12.317f, 15.084f, 12.707f, 14.693f)
                lineTo(16.95f, 10.451f)
                curveTo(17.34f, 10.06f, 17.34f, 9.427f, 16.95f, 9.037f)
                curveTo(16.559f, 8.646f, 15.926f, 8.646f, 15.535f, 9.037f)
                lineTo(12.0f, 12.572f)
                lineTo(8.464f, 9.037f)
                curveTo(8.074f, 8.646f, 7.441f, 8.646f, 7.05f, 9.037f)
                curveTo(6.66f, 9.427f, 6.66f, 10.06f, 7.05f, 10.451f)
                lineTo(11.293f, 14.693f)
                close()
            }
        }
        .build()
        return _pocket!!
    }

private var _pocket: ImageVector? = null
