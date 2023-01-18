package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.MapPin: ImageVector
    get() {
        if (_mapPin != null) {
            return _mapPin!!
        }
        _mapPin = Builder(name = "MapPin", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.1f, 66.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.1f, 66.0f)
                close()
                moveTo(128.1f, 130.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 128.1f, 130.0f)
                close()
                moveTo(128.1f, 18.0f)
                arcToRelative(86.1f, 86.1f, 0.0f, false, false, -86.0f, 86.0f)
                curveToRelative(0.0f, 30.9f, 14.4f, 63.7f, 41.5f, 94.9f)
                arcToRelative(247.8f, 247.8f, 0.0f, false, false, 41.1f, 38.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.4f, 1.1f)
                arcToRelative(6.6f, 6.6f, 0.0f, false, false, 3.5f, -1.1f)
                arcToRelative(254.2f, 254.2f, 0.0f, false, false, 41.0f, -38.0f)
                curveToRelative(27.2f, -31.2f, 41.5f, -64.0f, 41.5f, -94.9f)
                arcTo(86.1f, 86.1f, 0.0f, false, false, 128.1f, 18.0f)
                close()
                moveTo(128.1f, 224.5f)
                curveToRelative(-15.0f, -11.6f, -74.0f, -60.9f, -74.0f, -120.5f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                curveTo(202.1f, 163.6f, 143.1f, 212.9f, 128.1f, 224.5f)
                close()
            }
        }
        .build()
        return _mapPin!!
    }

private var _mapPin: ImageVector? = null
