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

public val CssGgIcons.Search: ImageVector
    get() {
        if (_search != null) {
            return _search!!
        }
        _search = Builder(name = "Search", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.319f, 14.433f)
                curveTo(20.763f, 11.294f, 20.542f, 6.753f, 17.657f, 3.868f)
                curveTo(14.533f, 0.744f, 9.467f, 0.744f, 6.343f, 3.868f)
                curveTo(3.219f, 6.992f, 3.219f, 12.058f, 6.343f, 15.182f)
                curveTo(9.228f, 18.067f, 13.769f, 18.288f, 16.907f, 15.844f)
                curveTo(16.921f, 15.859f, 16.935f, 15.875f, 16.95f, 15.889f)
                lineTo(21.192f, 20.132f)
                curveTo(21.583f, 20.522f, 22.216f, 20.522f, 22.607f, 20.132f)
                curveTo(22.997f, 19.741f, 22.997f, 19.108f, 22.607f, 18.718f)
                lineTo(18.364f, 14.475f)
                curveTo(18.349f, 14.46f, 18.334f, 14.446f, 18.319f, 14.433f)
                close()
                moveTo(16.243f, 5.283f)
                curveTo(18.586f, 7.626f, 18.586f, 11.425f, 16.243f, 13.768f)
                curveTo(13.899f, 16.111f, 10.101f, 16.111f, 7.757f, 13.768f)
                curveTo(5.414f, 11.425f, 5.414f, 7.626f, 7.757f, 5.283f)
                curveTo(10.101f, 2.939f, 13.899f, 2.939f, 16.243f, 5.283f)
                close()
            }
        }
        .build()
        return _search!!
    }

private var _search: ImageVector? = null
