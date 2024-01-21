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

public val BrandsGroup.Algolia: ImageVector
    get() {
        if (_algolia != null) {
            return _algolia!!
        }
        _algolia = Builder(name = "Algolia", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 0.0f)
                curveTo(116.1f, 0.0f, 2.0f, 112.7f, 0.0f, 252.1f)
                curveTo(-2.0f, 393.6f, 112.9f, 510.8f, 254.5f, 511.6f)
                curveToRelative(43.7f, 0.3f, 85.9f, -10.4f, 123.3f, -30.7f)
                curveToRelative(3.6f, -2.0f, 4.2f, -7.0f, 1.1f, -9.7f)
                lineToRelative(-24.0f, -21.2f)
                curveToRelative(-4.9f, -4.3f, -11.8f, -5.5f, -17.8f, -3.0f)
                curveToRelative(-26.1f, 11.1f, -54.5f, 16.8f, -83.7f, 16.4f)
                curveTo(139.0f, 461.9f, 46.5f, 366.8f, 48.3f, 252.4f)
                curveTo(50.1f, 139.5f, 142.6f, 48.2f, 256.0f, 48.2f)
                horizontalLineTo(463.7f)
                verticalLineTo(417.2f)
                lineTo(345.9f, 312.5f)
                curveToRelative(-3.8f, -3.4f, -9.7f, -2.7f, -12.7f, 1.3f)
                curveToRelative(-18.9f, 25.0f, -49.7f, 40.6f, -83.9f, 38.2f)
                curveToRelative(-47.5f, -3.3f, -85.9f, -41.5f, -89.5f, -88.9f)
                curveToRelative(-4.2f, -56.6f, 40.6f, -103.9f, 96.3f, -103.9f)
                curveToRelative(50.4f, 0.0f, 91.9f, 38.8f, 96.2f, 88.0f)
                curveToRelative(0.4f, 4.4f, 2.4f, 8.5f, 5.7f, 11.4f)
                lineToRelative(30.7f, 27.2f)
                curveToRelative(3.5f, 3.1f, 9.0f, 1.2f, 9.9f, -3.4f)
                curveToRelative(2.2f, -11.8f, 3.0f, -24.2f, 2.1f, -36.8f)
                curveToRelative(-4.9f, -72.0f, -63.3f, -130.0f, -135.4f, -134.4f)
                curveToRelative(-82.7f, -5.1f, -151.8f, 59.5f, -154.0f, 140.6f)
                curveToRelative(-2.1f, 78.9f, 62.6f, 147.0f, 141.6f, 148.7f)
                curveToRelative(33.0f, 0.7f, 63.6f, -9.6f, 88.3f, -27.6f)
                lineTo(495.0f, 509.4f)
                curveToRelative(6.6f, 5.8f, 17.0f, 1.2f, 17.0f, -7.7f)
                verticalLineTo(9.7f)
                curveToRelative(0.0f, -5.4f, -4.4f, -9.7f, -9.7f, -9.7f)
                horizontalLineTo(256.0f)
                close()
            }
        }
        .build()
        return _algolia!!
    }

private var _algolia: ImageVector? = null
