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

public val CssGgIcons.ZoomOut: ImageVector
    get() {
        if (_zoomOut != null) {
            return _zoomOut!!
        }
        _zoomOut = Builder(name = "ZoomOut", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(15.343f, 15.243f)
                curveTo(17.686f, 12.899f, 17.686f, 9.101f, 15.343f, 6.757f)
                curveTo(13.0f, 4.414f, 9.201f, 4.414f, 6.858f, 6.757f)
                curveTo(4.515f, 9.101f, 4.515f, 12.899f, 6.858f, 15.243f)
                curveTo(9.201f, 17.586f, 13.0f, 17.586f, 15.343f, 15.243f)
                close()
                moveTo(16.757f, 5.343f)
                curveTo(19.642f, 8.228f, 19.863f, 12.769f, 17.42f, 15.908f)
                curveTo(17.435f, 15.921f, 17.45f, 15.935f, 17.465f, 15.95f)
                lineTo(21.707f, 20.192f)
                curveTo(22.098f, 20.583f, 22.098f, 21.216f, 21.707f, 21.607f)
                curveTo(21.317f, 21.997f, 20.683f, 21.997f, 20.293f, 21.607f)
                lineTo(16.05f, 17.364f)
                curveTo(16.036f, 17.349f, 16.021f, 17.334f, 16.008f, 17.319f)
                curveTo(12.87f, 19.763f, 8.329f, 19.542f, 5.444f, 16.657f)
                curveTo(2.319f, 13.533f, 2.319f, 8.467f, 5.444f, 5.343f)
                curveTo(8.568f, 2.219f, 13.633f, 2.219f, 16.757f, 5.343f)
                close()
                moveTo(7.101f, 10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.101f)
                verticalLineTo(10.0f)
                lineTo(7.101f, 10.0f)
                close()
            }
        }
        .build()
        return _zoomOut!!
    }

private var _zoomOut: ImageVector? = null
