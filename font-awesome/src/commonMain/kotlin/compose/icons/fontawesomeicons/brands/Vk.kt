package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Vk: ImageVector
    get() {
        if (_vk != null) {
            return _vk!!
        }
        _vk = Builder(name = "Vk", defaultWidth = 576.0.dp, defaultHeight = 512.0.dp, viewportWidth
                = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(545.0f, 117.7f)
                curveToRelative(3.7f, -12.5f, 0.0f, -21.7f, -17.8f, -21.7f)
                horizontalLineToRelative(-58.9f)
                curveToRelative(-15.0f, 0.0f, -21.9f, 7.9f, -25.6f, 16.7f)
                curveToRelative(0.0f, 0.0f, -30.0f, 73.1f, -72.4f, 120.5f)
                curveToRelative(-13.7f, 13.7f, -20.0f, 18.1f, -27.5f, 18.1f)
                curveToRelative(-3.7f, 0.0f, -9.4f, -4.4f, -9.4f, -16.9f)
                verticalLineTo(117.7f)
                curveToRelative(0.0f, -15.0f, -4.2f, -21.7f, -16.6f, -21.7f)
                horizontalLineToRelative(-92.6f)
                curveToRelative(-9.4f, 0.0f, -15.0f, 7.0f, -15.0f, 13.5f)
                curveToRelative(0.0f, 14.2f, 21.2f, 17.5f, 23.4f, 57.5f)
                verticalLineToRelative(86.8f)
                curveToRelative(0.0f, 19.0f, -3.4f, 22.5f, -10.9f, 22.5f)
                curveToRelative(-20.0f, 0.0f, -68.6f, -73.4f, -97.4f, -157.4f)
                curveToRelative(-5.8f, -16.3f, -11.5f, -22.9f, -26.6f, -22.9f)
                horizontalLineTo(38.8f)
                curveToRelative(-16.8f, 0.0f, -20.2f, 7.9f, -20.2f, 16.7f)
                curveToRelative(0.0f, 15.6f, 20.0f, 93.1f, 93.1f, 195.5f)
                curveTo(160.4f, 378.1f, 229.0f, 416.0f, 291.4f, 416.0f)
                curveToRelative(37.5f, 0.0f, 42.1f, -8.4f, 42.1f, -22.9f)
                curveToRelative(0.0f, -66.8f, -3.4f, -73.1f, 15.4f, -73.1f)
                curveToRelative(8.7f, 0.0f, 23.7f, 4.4f, 58.7f, 38.1f)
                curveToRelative(40.0f, 40.0f, 46.6f, 57.9f, 69.0f, 57.9f)
                horizontalLineToRelative(58.9f)
                curveToRelative(16.8f, 0.0f, 25.3f, -8.4f, 20.4f, -25.0f)
                curveToRelative(-11.2f, -34.9f, -86.9f, -106.7f, -90.3f, -111.5f)
                curveToRelative(-8.7f, -11.2f, -6.2f, -16.2f, 0.0f, -26.2f)
                curveToRelative(0.1f, -0.1f, 72.0f, -101.3f, 79.4f, -135.6f)
                close()
            }
        }
        .build()
        return _vk!!
    }

private var _vk: ImageVector? = null
