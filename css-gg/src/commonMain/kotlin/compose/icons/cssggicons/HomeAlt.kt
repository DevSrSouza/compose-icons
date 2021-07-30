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
                moveTo(6.0f, 22.8787f)
                curveTo(4.3432f, 22.8787f, 3.0f, 21.5355f, 3.0f, 19.8787f)
                verticalLineTo(9.8787f)
                curveTo(3.0f, 9.8448f, 3.0017f, 9.8113f, 3.005f, 9.7782f)
                horizontalLineTo(3.0f)
                curveTo(3.0f, 9.2023f, 3.2288f, 8.6499f, 3.6361f, 8.2426f)
                lineTo(9.8787f, 2.0f)
                curveTo(11.0502f, 0.8284f, 12.9497f, 0.8284f, 14.1213f, 2.0f)
                lineTo(20.3639f, 8.2426f)
                curveTo(20.7712f, 8.6499f, 21.0f, 9.2023f, 21.0f, 9.7782f)
                horizontalLineTo(20.995f)
                curveTo(20.9983f, 9.8113f, 21.0f, 9.8448f, 21.0f, 9.8787f)
                verticalLineTo(19.8787f)
                curveTo(21.0f, 21.5355f, 19.6569f, 22.8787f, 18.0f, 22.8787f)
                horizontalLineTo(6.0f)
                close()
                moveTo(12.7071f, 3.4142f)
                lineTo(19.0f, 9.7071f)
                verticalLineTo(19.8787f)
                curveTo(19.0f, 20.4309f, 18.5523f, 20.8787f, 18.0f, 20.8787f)
                horizontalLineTo(15.0f)
                verticalLineTo(15.8787f)
                curveTo(15.0f, 14.2218f, 13.6569f, 12.8787f, 12.0f, 12.8787f)
                curveTo(10.3431f, 12.8787f, 9.0f, 14.2218f, 9.0f, 15.8787f)
                verticalLineTo(20.8787f)
                horizontalLineTo(6.0f)
                curveTo(5.4477f, 20.8787f, 5.0f, 20.4309f, 5.0f, 19.8787f)
                verticalLineTo(9.7072f)
                lineTo(11.2929f, 3.4142f)
                curveTo(11.6834f, 3.0237f, 12.3166f, 3.0237f, 12.7071f, 3.4142f)
                close()
            }
        }
        .build()
        return _homeAlt!!
    }

private var _homeAlt: ImageVector? = null
