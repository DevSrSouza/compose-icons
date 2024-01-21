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

public val BrandsGroup.Patreon: ImageVector
    get() {
        if (_patreon != null) {
            return _patreon!!
        }
        _patreon = Builder(name = "Patreon", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(489.7f, 153.8f)
                curveToRelative(-0.1f, -65.4f, -51.0f, -119.0f, -110.7f, -138.3f)
                curveTo(304.8f, -8.5f, 207.0f, -5.0f, 136.1f, 28.4f)
                curveTo(50.3f, 68.9f, 23.3f, 157.7f, 22.3f, 246.2f)
                curveTo(21.5f, 319.0f, 28.7f, 510.6f, 136.9f, 512.0f)
                curveToRelative(80.3f, 1.0f, 92.3f, -102.5f, 129.5f, -152.3f)
                curveToRelative(26.4f, -35.5f, 60.5f, -45.5f, 102.4f, -55.9f)
                curveToRelative(72.0f, -17.8f, 121.1f, -74.7f, 121.0f, -150.0f)
                close()
            }
        }
        .build()
        return _patreon!!
    }

private var _patreon: ImageVector? = null
