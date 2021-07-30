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

public val BrandsGroup.DigitalOcean: ImageVector
    get() {
        if (_digitalOcean != null) {
            return _digitalOcean!!
        }
        _digitalOcean = Builder(name = "DigitalOcean", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(87.0f, 481.8f)
                horizontalLineToRelative(73.7f)
                verticalLineToRelative(-73.6f)
                lineTo(87.0f, 408.2f)
                close()
                moveTo(25.4f, 346.6f)
                verticalLineToRelative(61.6f)
                lineTo(87.0f, 408.2f)
                verticalLineToRelative(-61.6f)
                close()
                moveTo(491.6f, 176.9f)
                curveToRelative(-23.0f, -74.2f, -82.4f, -133.3f, -156.6f, -156.6f)
                curveTo(164.9f, -32.8f, 8.0f, 93.7f, 8.0f, 255.9f)
                horizontalLineToRelative(95.8f)
                curveToRelative(0.0f, -101.8f, 101.0f, -180.5f, 208.1f, -141.7f)
                curveToRelative(39.7f, 14.3f, 71.5f, 46.1f, 85.8f, 85.7f)
                curveToRelative(39.1f, 107.0f, -39.7f, 207.8f, -141.4f, 208.0f)
                verticalLineToRelative(0.3f)
                horizontalLineToRelative(-0.3f)
                lineTo(256.0f, 504.0f)
                curveToRelative(162.6f, 0.0f, 288.8f, -156.8f, 235.6f, -327.1f)
                close()
                moveTo(256.3f, 407.9f)
                verticalLineToRelative(-95.3f)
                horizontalLineToRelative(-95.6f)
                verticalLineToRelative(95.6f)
                lineTo(256.0f, 408.2f)
                verticalLineToRelative(-0.3f)
                close()
            }
        }
        .build()
        return _digitalOcean!!
    }

private var _digitalOcean: ImageVector? = null
