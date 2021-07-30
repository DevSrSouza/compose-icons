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

public val BrandsGroup.KickstarterK: ImageVector
    get() {
        if (_kickstarterK != null) {
            return _kickstarterK!!
        }
        _kickstarterK = Builder(name = "KickstarterK", defaultWidth = 384.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(147.3f, 114.4f)
                curveToRelative(0.0f, -56.2f, -32.5f, -82.4f, -73.4f, -82.4f)
                curveTo(26.2f, 32.0f, 0.0f, 68.2f, 0.0f, 113.4f)
                verticalLineToRelative(283.0f)
                curveToRelative(0.0f, 47.3f, 25.3f, 83.4f, 74.9f, 83.4f)
                curveToRelative(39.8f, 0.0f, 72.4f, -25.6f, 72.4f, -83.4f)
                verticalLineToRelative(-76.5f)
                lineToRelative(112.1f, 138.3f)
                curveToRelative(22.7f, 27.2f, 72.1f, 30.7f, 103.2f, 0.0f)
                curveToRelative(27.0f, -27.6f, 27.3f, -67.4f, 7.4f, -92.2f)
                lineToRelative(-90.8f, -114.8f)
                lineToRelative(74.9f, -107.4f)
                curveToRelative(17.4f, -24.7f, 17.5f, -63.1f, -10.4f, -89.8f)
                curveToRelative(-30.3f, -29.0f, -82.4f, -31.6f, -113.6f, 12.8f)
                lineTo(147.3f, 185.0f)
                verticalLineToRelative(-70.6f)
                close()
            }
        }
        .build()
        return _kickstarterK!!
    }

private var _kickstarterK: ImageVector? = null
