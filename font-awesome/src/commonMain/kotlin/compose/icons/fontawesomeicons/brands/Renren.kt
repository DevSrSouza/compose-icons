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

public val BrandsGroup.Renren: ImageVector
    get() {
        if (_renren != null) {
            return _renren!!
        }
        _renren = Builder(name = "Renren", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.0f, 169.1f)
                curveToRelative(0.0f, 110.4f, -61.0f, 205.4f, -147.6f, 247.4f)
                curveTo(30.0f, 373.2f, 8.0f, 317.7f, 8.0f, 256.6f)
                curveTo(8.0f, 133.9f, 97.1f, 32.2f, 214.0f, 12.5f)
                verticalLineToRelative(156.6f)
                close()
                moveTo(255.0f, 504.0f)
                curveToRelative(-42.9f, 0.0f, -83.3f, -11.0f, -118.5f, -30.4f)
                curveTo(193.7f, 437.5f, 239.9f, 382.9f, 255.0f, 319.0f)
                curveToRelative(15.5f, 63.9f, 61.7f, 118.5f, 118.8f, 154.7f)
                curveTo(338.7f, 493.0f, 298.3f, 504.0f, 255.0f, 504.0f)
                close()
                moveTo(445.6f, 416.5f)
                curveTo(359.0f, 374.5f, 298.0f, 279.6f, 298.0f, 169.1f)
                lineTo(298.0f, 12.5f)
                curveToRelative(116.9f, 19.7f, 206.0f, 121.4f, 206.0f, 244.1f)
                curveToRelative(0.0f, 61.1f, -22.0f, 116.6f, -58.4f, 159.9f)
                close()
            }
        }
        .build()
        return _renren!!
    }

private var _renren: ImageVector? = null
