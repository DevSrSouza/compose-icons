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

public val BrandsGroup.Centercode: ImageVector
    get() {
        if (_centercode != null) {
            return _centercode!!
        }
        _centercode = Builder(name = "Centercode", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(329.2f, 268.6f)
                curveToRelative(-3.8f, 35.2f, -35.4f, 60.6f, -70.6f, 56.8f)
                curveToRelative(-35.2f, -3.8f, -60.6f, -35.4f, -56.8f, -70.6f)
                curveToRelative(3.8f, -35.2f, 35.4f, -60.6f, 70.6f, -56.8f)
                curveToRelative(35.1f, 3.8f, 60.6f, 35.4f, 56.8f, 70.6f)
                close()
                moveTo(243.4f, 503.7f)
                curveTo(96.7f, 496.0f, -8.2f, 365.5f, 10.1f, 224.3f)
                curveToRelative(11.2f, -86.6f, 65.8f, -156.9f, 139.1f, -192.0f)
                curveToRelative(161.0f, -77.1f, 349.7f, 37.4f, 354.7f, 216.6f)
                curveToRelative(4.1f, 147.0f, -118.4f, 262.2f, -260.5f, 254.8f)
                close()
                moveTo(423.3f, 323.7f)
                curveToRelative(27.9f, -118.0f, -160.5f, -205.9f, -237.2f, -234.2f)
                curveToRelative(-57.5f, 56.3f, -69.1f, 188.6f, -33.8f, 344.4f)
                curveToRelative(68.8f, 15.8f, 169.1f, -26.4f, 271.0f, -110.2f)
                close()
            }
        }
        .build()
        return _centercode!!
    }

private var _centercode: ImageVector? = null
