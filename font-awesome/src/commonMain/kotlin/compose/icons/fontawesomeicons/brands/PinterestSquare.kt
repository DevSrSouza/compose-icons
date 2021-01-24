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

public val BrandsGroup.PinterestSquare: ImageVector
    get() {
        if (_pinterestSquare != null) {
            return _pinterestSquare!!
        }
        _pinterestSquare = Builder(name = "PinterestSquare", defaultWidth = 448.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(448.0f, 80.0f)
                verticalLineToRelative(352.0f)
                curveToRelative(0.0f, 26.5f, -21.5f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(154.4f)
                curveToRelative(9.8f, -16.4f, 22.4f, -40.0f, 27.4f, -59.3f)
                curveToRelative(3.0f, -11.5f, 15.3f, -58.4f, 15.3f, -58.4f)
                curveToRelative(8.0f, 15.3f, 31.4f, 28.2f, 56.3f, 28.2f)
                curveToRelative(74.1f, 0.0f, 127.4f, -68.1f, 127.4f, -152.7f)
                curveToRelative(0.0f, -81.1f, -66.2f, -141.8f, -151.4f, -141.8f)
                curveToRelative(-106.0f, 0.0f, -162.2f, 71.1f, -162.2f, 148.6f)
                curveToRelative(0.0f, 36.0f, 19.2f, 80.8f, 49.8f, 95.1f)
                curveToRelative(4.7f, 2.2f, 7.1f, 1.2f, 8.2f, -3.3f)
                curveToRelative(0.8f, -3.4f, 5.0f, -20.1f, 6.8f, -27.8f)
                curveToRelative(0.6f, -2.5f, 0.3f, -4.6f, -1.7f, -7.0f)
                curveToRelative(-10.1f, -12.3f, -18.3f, -34.9f, -18.3f, -56.0f)
                curveToRelative(0.0f, -54.2f, 41.0f, -106.6f, 110.9f, -106.6f)
                curveToRelative(60.3f, 0.0f, 102.6f, 41.1f, 102.6f, 99.9f)
                curveToRelative(0.0f, 66.4f, -33.5f, 112.4f, -77.2f, 112.4f)
                curveToRelative(-24.1f, 0.0f, -42.1f, -19.9f, -36.4f, -44.4f)
                curveToRelative(6.9f, -29.2f, 20.3f, -60.7f, 20.3f, -81.8f)
                curveToRelative(0.0f, -53.0f, -75.5f, -45.7f, -75.5f, 25.0f)
                curveToRelative(0.0f, 21.7f, 7.3f, 36.5f, 7.3f, 36.5f)
                curveToRelative(-31.4f, 132.8f, -36.1f, 134.5f, -29.6f, 192.6f)
                lineToRelative(2.2f, 0.8f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.5f, 0.0f, -48.0f, -21.5f, -48.0f, -48.0f)
                verticalLineTo(80.0f)
                curveToRelative(0.0f, -26.5f, 21.5f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(352.0f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _pinterestSquare!!
    }

private var _pinterestSquare: ImageVector? = null
