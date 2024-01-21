package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Pixiv: ImageVector
    get() {
        if (_pixiv != null) {
            return _pixiv!!
        }
        _pixiv = Builder(name = "Pixiv", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(64.0f, 32.0f)
                curveTo(28.7f, 32.0f, 0.0f, 60.7f, 0.0f, 96.0f)
                lineTo(0.0f, 416.0f)
                curveToRelative(0.0f, 35.3f, 28.7f, 64.0f, 64.0f, 64.0f)
                lineTo(384.0f, 480.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, -28.7f, 64.0f, -64.0f)
                lineTo(448.0f, 96.0f)
                curveToRelative(0.0f, -35.3f, -28.7f, -64.0f, -64.0f, -64.0f)
                lineTo(64.0f, 32.0f)
                close()
                moveTo(235.5f, 116.0f)
                curveToRelative(41.0f, 0.0f, 76.3f, 12.9f, 101.4f, 35.2f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(25.2f, 22.2f, 39.8f, 54.1f, 39.8f, 88.8f)
                curveToRelative(0.1f, 35.3f, -16.6f, 66.3f, -42.4f, 87.0f)
                curveToRelative(-25.9f, 20.8f, -60.6f, 32.4f, -98.8f, 32.4f)
                curveToRelative(-43.5f, 0.0f, -83.8f, -16.1f, -83.8f, -16.1f)
                verticalLineToRelative(51.8f)
                curveToRelative(7.4f, 2.2f, 19.7f, 7.0f, 11.9f, 14.8f)
                lineTo(104.8f, 409.9f)
                curveToRelative(-7.7f, -7.8f, 3.6f, -12.4f, 12.1f, -14.8f)
                lineTo(116.9f, 175.5f)
                curveTo(97.1f, 190.9f, 87.0f, 204.3f, 81.8f, 214.2f)
                curveToRelative(6.0f, 19.4f, -5.3f, 18.5f, -5.3f, 18.5f)
                lineTo(56.0f, 199.7f)
                reflectiveCurveToRelative(72.7f, -83.7f, 179.5f, -83.7f)
                close()
                moveTo(231.9f, 338.9f)
                curveToRelative(30.0f, 0.0f, 56.0f, -11.3f, 73.9f, -29.2f)
                curveToRelative(17.9f, -18.1f, 27.9f, -41.6f, 28.0f, -70.2f)
                curveToRelative(-0.1f, -29.3f, -9.5f, -54.6f, -26.7f, -73.6f)
                curveToRelative(-17.2f, -18.9f, -42.7f, -31.3f, -75.2f, -31.4f)
                curveToRelative(-26.7f, -0.1f, -59.8f, 9.0f, -80.2f, 23.7f)
                lineTo(151.7f, 323.1f)
                curveToRelative(18.6f, 9.3f, 46.8f, 15.9f, 80.2f, 15.8f)
                close()
            }
        }
        .build()
        return _pixiv!!
    }

private var _pixiv: ImageVector? = null
