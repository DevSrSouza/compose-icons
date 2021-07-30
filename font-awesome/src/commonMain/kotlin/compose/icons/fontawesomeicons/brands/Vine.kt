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

public val BrandsGroup.Vine: ImageVector
    get() {
        if (_vine != null) {
            return _vine!!
        }
        _vine = Builder(name = "Vine", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(384.0f, 254.7f)
                verticalLineToRelative(52.1f)
                curveToRelative(-18.4f, 4.2f, -36.9f, 6.1f, -52.1f, 6.1f)
                curveToRelative(-36.9f, 77.4f, -103.0f, 143.8f, -125.1f, 156.2f)
                curveToRelative(-14.0f, 7.9f, -27.1f, 8.4f, -42.7f, -0.8f)
                curveTo(137.0f, 452.0f, 34.2f, 367.7f, 0.0f, 102.7f)
                horizontalLineToRelative(74.5f)
                curveTo(93.2f, 261.8f, 139.0f, 343.4f, 189.3f, 404.5f)
                curveToRelative(27.9f, -27.9f, 54.8f, -65.1f, 75.6f, -106.9f)
                curveToRelative(-49.8f, -25.3f, -80.1f, -80.9f, -80.1f, -145.6f)
                curveToRelative(0.0f, -65.6f, 37.7f, -115.1f, 102.2f, -115.1f)
                curveToRelative(114.9f, 0.0f, 106.2f, 127.9f, 81.6f, 181.5f)
                curveToRelative(0.0f, 0.0f, -46.4f, 9.2f, -63.5f, -20.5f)
                curveToRelative(3.4f, -11.3f, 8.2f, -30.8f, 8.2f, -48.5f)
                curveToRelative(0.0f, -31.3f, -11.3f, -46.6f, -28.4f, -46.6f)
                curveToRelative(-18.2f, 0.0f, -30.8f, 17.1f, -30.8f, 50.0f)
                curveToRelative(0.1f, 79.2f, 59.4f, 118.7f, 129.9f, 101.9f)
                close()
            }
        }
        .build()
        return _vine!!
    }

private var _vine: ImageVector? = null
