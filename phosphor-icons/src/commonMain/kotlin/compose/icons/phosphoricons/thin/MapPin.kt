package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 128.1f, 68.0f)
                close()
                moveTo(128.1f, 132.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 128.1f, 132.0f)
                close()
                moveTo(128.1f, 20.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, false, -84.0f, 84.0f)
                curveToRelative(0.0f, 30.4f, 14.2f, 62.8f, 41.0f, 93.6f)
                arcToRelative(255.4f, 255.4f, 0.0f, false, false, 40.7f, 37.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.6f, 0.0f)
                arcToRelative(255.4f, 255.4f, 0.0f, false, false, 40.7f, -37.7f)
                curveToRelative(26.8f, -30.8f, 41.0f, -63.2f, 41.0f, -93.6f)
                arcTo(84.1f, 84.1f, 0.0f, false, false, 128.1f, 20.0f)
                close()
                moveTo(165.2f, 192.2f)
                arcTo(242.6f, 242.6f, 0.0f, false, true, 128.1f, 227.0f)
                arcTo(247.5f, 247.5f, 0.0f, false, true, 91.0f, 192.2f)
                curveTo(73.3f, 171.8f, 52.1f, 139.9f, 52.1f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.1f, 139.9f, 183.0f, 171.8f, 165.2f, 192.2f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
