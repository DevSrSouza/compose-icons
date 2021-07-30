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

public val BrandsGroup.Sellcast: ImageVector
    get() {
        if (_sellcast != null) {
            return _sellcast!!
        }
        _sellcast = Builder(name = "Sellcast", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(353.4f, 32.0f)
                lineTo(94.7f, 32.0f)
                curveTo(42.6f, 32.0f, 0.0f, 74.6f, 0.0f, 126.6f)
                verticalLineToRelative(258.7f)
                curveTo(0.0f, 437.4f, 42.6f, 480.0f, 94.7f, 480.0f)
                horizontalLineToRelative(258.7f)
                curveToRelative(52.1f, 0.0f, 94.7f, -42.6f, 94.7f, -94.6f)
                lineTo(448.1f, 126.6f)
                curveToRelative(0.0f, -52.0f, -42.6f, -94.6f, -94.7f, -94.6f)
                close()
                moveTo(303.4f, 348.4f)
                curveToRelative(-27.9f, 48.2f, -89.9f, 64.9f, -138.2f, 37.2f)
                curveToRelative(-22.9f, 39.8f, -54.9f, 8.6f, -42.3f, -13.2f)
                lineToRelative(15.7f, -27.2f)
                curveToRelative(5.9f, -10.3f, 19.2f, -13.9f, 29.5f, -7.9f)
                curveToRelative(18.6f, 10.8f, -0.1f, -0.1f, 18.5f, 10.7f)
                curveToRelative(27.6f, 15.9f, 63.4f, 6.3f, 79.4f, -21.3f)
                curveToRelative(15.9f, -27.6f, 6.3f, -63.4f, -21.3f, -79.4f)
                curveToRelative(-17.8f, -10.2f, -0.6f, -0.4f, -18.6f, -10.6f)
                curveToRelative(-24.6f, -14.2f, -3.4f, -51.9f, 21.6f, -37.5f)
                curveToRelative(18.6f, 10.8f, -0.1f, -0.1f, 18.5f, 10.7f)
                curveToRelative(48.4f, 28.0f, 65.1f, 90.3f, 37.2f, 138.5f)
                close()
                moveTo(325.2f, 139.6f)
                curveToRelative(-17.0f, 29.5f, -16.3f, 28.8f, -19.0f, 31.5f)
                curveToRelative(-6.5f, 6.5f, -16.3f, 8.7f, -26.5f, 3.6f)
                curveToRelative(-18.6f, -10.8f, 0.1f, 0.1f, -18.5f, -10.7f)
                curveToRelative(-27.6f, -15.9f, -63.4f, -6.3f, -79.4f, 21.3f)
                reflectiveCurveToRelative(-6.3f, 63.4f, 21.3f, 79.4f)
                curveToRelative(0.0f, 0.0f, 18.5f, 10.6f, 18.6f, 10.6f)
                curveToRelative(24.6f, 14.2f, 3.4f, 51.9f, -21.6f, 37.5f)
                curveToRelative(-18.6f, -10.8f, 0.1f, 0.1f, -18.5f, -10.7f)
                curveToRelative(-48.2f, -27.8f, -64.9f, -90.1f, -37.1f, -138.4f)
                curveToRelative(27.9f, -48.2f, 89.9f, -64.9f, 138.2f, -37.2f)
                lineToRelative(4.8f, -8.4f)
                curveToRelative(14.3f, -24.9f, 52.0f, -3.3f, 37.7f, 21.5f)
                close()
            }
        }
        .build()
        return _sellcast!!
    }

private var _sellcast: ImageVector? = null
