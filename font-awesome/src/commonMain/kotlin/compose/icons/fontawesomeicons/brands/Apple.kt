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

public val BrandsGroup.Apple: ImageVector
    get() {
        if (_apple != null) {
            return _apple!!
        }
        _apple = Builder(name = "Apple", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(318.7f, 268.7f)
                curveToRelative(-0.2f, -36.7f, 16.4f, -64.4f, 50.0f, -84.8f)
                curveToRelative(-18.8f, -26.9f, -47.2f, -41.7f, -84.7f, -44.6f)
                curveToRelative(-35.5f, -2.8f, -74.3f, 20.7f, -88.5f, 20.7f)
                curveToRelative(-15.0f, 0.0f, -49.4f, -19.7f, -76.4f, -19.7f)
                curveTo(63.3f, 141.2f, 4.0f, 184.8f, 4.0f, 273.5f)
                quadToRelative(0.0f, 39.3f, 14.4f, 81.2f)
                curveToRelative(12.8f, 36.7f, 59.0f, 126.7f, 107.2f, 125.2f)
                curveToRelative(25.2f, -0.6f, 43.0f, -17.9f, 75.8f, -17.9f)
                curveToRelative(31.8f, 0.0f, 48.3f, 17.9f, 76.4f, 17.9f)
                curveToRelative(48.6f, -0.7f, 90.4f, -82.5f, 102.6f, -119.3f)
                curveToRelative(-65.2f, -30.7f, -61.7f, -90.0f, -61.7f, -91.9f)
                close()
                moveTo(262.1f, 104.5f)
                curveToRelative(27.3f, -32.4f, 24.8f, -61.9f, 24.0f, -72.5f)
                curveToRelative(-24.1f, 1.4f, -52.0f, 16.4f, -67.9f, 34.9f)
                curveToRelative(-17.5f, 19.8f, -27.8f, 44.3f, -25.6f, 71.9f)
                curveToRelative(26.1f, 2.0f, 49.9f, -11.4f, 69.5f, -34.3f)
                close()
            }
        }
        .build()
        return _apple!!
    }

private var _apple: ImageVector? = null
