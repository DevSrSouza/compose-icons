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

public val BrandsGroup.Osi: ImageVector
    get() {
        if (_osi != null) {
            return _osi!!
        }
        _osi = Builder(name = "Osi", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 266.44f)
                curveTo(10.3f, 130.64f, 105.4f, 34.0f, 221.8f, 18.34f)
                curveToRelative(138.8f, -18.6f, 255.6f, 75.8f, 278.0f, 201.1f)
                curveToRelative(21.3f, 118.8f, -44.0f, 230.0f, -151.6f, 274.0f)
                curveToRelative(-9.3f, 3.8f, -14.4f, 1.7f, -18.0f, -7.7f)
                quadToRelative(-26.7f, -69.45f, -53.4f, -139.0f)
                curveToRelative(-3.1f, -8.1f, -1.0f, -13.2f, 7.0f, -16.8f)
                curveToRelative(24.2f, -11.0f, 39.3f, -29.4f, 43.3f, -55.8f)
                arcToRelative(71.47f, 71.47f, 0.0f, false, false, -64.5f, -82.2f)
                curveToRelative(-39.0f, -3.4f, -71.8f, 23.7f, -77.5f, 59.7f)
                curveToRelative(-5.2f, 33.0f, 11.1f, 63.7f, 41.9f, 77.7f)
                curveToRelative(9.6f, 4.4f, 11.5f, 8.6f, 7.8f, 18.4f)
                quadToRelative(-26.85f, 69.9f, -53.7f, 139.9f)
                curveToRelative(-2.6f, 6.9f, -8.3f, 9.3f, -15.5f, 6.5f)
                curveToRelative(-52.6f, -20.3f, -101.4f, -61.0f, -130.8f, -119.0f)
                curveToRelative(-24.9f, -49.2f, -25.2f, -87.7f, -26.8f, -108.7f)
                close()
                moveTo(28.9f, 264.54f)
                curveToRelative(0.4f, 6.6f, 0.6f, 14.3f, 1.3f, 22.1f)
                curveToRelative(6.3f, 71.9f, 49.6f, 143.5f, 131.0f, 183.1f)
                curveToRelative(3.2f, 1.5f, 4.4f, 0.8f, 5.6f, -2.3f)
                quadToRelative(22.35f, -58.65f, 45.0f, -117.3f)
                curveToRelative(1.3f, -3.3f, 0.6f, -4.8f, -2.4f, -6.7f)
                curveToRelative(-31.6f, -19.9f, -47.3f, -48.5f, -45.6f, -86.0f)
                curveToRelative(1.0f, -21.6f, 9.3f, -40.5f, 23.8f, -56.3f)
                curveToRelative(30.0f, -32.7f, 77.0f, -39.8f, 115.5f, -17.6f)
                arcToRelative(91.64f, 91.64f, 0.0f, false, true, 45.2f, 90.4f)
                curveToRelative(-3.6f, 30.6f, -19.3f, 53.9f, -45.7f, 69.8f)
                curveToRelative(-2.7f, 1.6f, -3.5f, 2.9f, -2.3f, 6.0f)
                quadToRelative(22.8f, 58.8f, 45.2f, 117.7f)
                curveToRelative(1.2f, 3.1f, 2.4f, 3.8f, 5.6f, 2.3f)
                curveToRelative(35.5f, -16.6f, 65.2f, -40.3f, 88.1f, -72.0f)
                curveToRelative(34.8f, -48.2f, 49.1f, -101.9f, 42.3f, -161.0f)
                curveToRelative(-13.7f, -117.5f, -119.4f, -214.8f, -255.5f, -198.0f)
                curveToRelative(-106.1f, 13.0f, -195.3f, 102.5f, -197.1f, 225.8f)
                close()
            }
        }
        .build()
        return _osi!!
    }

private var _osi: ImageVector? = null
