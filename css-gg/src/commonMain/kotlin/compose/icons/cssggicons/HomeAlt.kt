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

public val CssGgIcons.HomeAlt: ImageVector
    get() {
        if (_homeAlt != null) {
            return _homeAlt!!
        }
        _homeAlt = Builder(name = "HomeAlt", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.0f, 22.879f)
                curveTo(4.343f, 22.879f, 3.0f, 21.535f, 3.0f, 19.879f)
                verticalLineTo(9.879f)
                curveTo(3.0f, 9.845f, 3.002f, 9.811f, 3.005f, 9.778f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 9.202f, 3.229f, 8.65f, 3.636f, 8.243f)
                lineTo(9.879f, 2.0f)
                curveTo(11.05f, 0.828f, 12.95f, 0.828f, 14.121f, 2.0f)
                lineTo(20.364f, 8.243f)
                curveTo(20.771f, 8.65f, 21.0f, 9.202f, 21.0f, 9.778f)
                horizontalLineTo(20.995f)
                curveTo(20.998f, 9.811f, 21.0f, 9.845f, 21.0f, 9.879f)
                verticalLineTo(19.879f)
                curveTo(21.0f, 21.535f, 19.657f, 22.879f, 18.0f, 22.879f)
                horizontalLineTo(6.0f)
                close()
                moveTo(12.707f, 3.414f)
                lineTo(19.0f, 9.707f)
                verticalLineTo(19.879f)
                curveTo(19.0f, 20.431f, 18.552f, 20.879f, 18.0f, 20.879f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.879f)
                curveTo(15.0f, 14.222f, 13.657f, 12.879f, 12.0f, 12.879f)
                curveTo(10.343f, 12.879f, 9.0f, 14.222f, 9.0f, 15.879f)
                verticalLineTo(20.879f)
                horizontalLineTo(6.0f)
                curveTo(5.448f, 20.879f, 5.0f, 20.431f, 5.0f, 19.879f)
                verticalLineTo(9.707f)
                lineTo(11.293f, 3.414f)
                curveTo(11.683f, 3.024f, 12.317f, 3.024f, 12.707f, 3.414f)
                close()
            }
        }
        .build()
        return _homeAlt!!
    }

private var _homeAlt: ImageVector? = null
