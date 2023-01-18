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

public val ThinGroup.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) {
            return _mapPinLine!!
        }
        _mapPinLine = Builder(name = "MapPinLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 228.0f)
                lineTo(139.8f, 228.0f)
                arcToRelative(255.1f, 255.1f, 0.0f, false, false, 31.3f, -30.4f)
                curveToRelative(26.8f, -30.8f, 41.0f, -63.2f, 41.0f, -93.6f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, false, -168.0f, 0.0f)
                curveToRelative(0.0f, 30.4f, 14.2f, 62.8f, 41.0f, 93.6f)
                arcTo(262.4f, 262.4f, 0.0f, false, false, 116.4f, 228.0f)
                lineTo(56.1f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 0.0f, -8.0f)
                close()
                moveTo(91.0f, 192.2f)
                curveTo(73.3f, 171.8f, 52.1f, 139.9f, 52.1f, 104.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveToRelative(0.0f, 35.9f, -21.1f, 67.8f, -38.9f, 88.2f)
                arcTo(242.6f, 242.6f, 0.0f, false, true, 128.1f, 227.0f)
                arcTo(247.5f, 247.5f, 0.0f, false, true, 91.0f, 192.2f)
                close()
                moveTo(164.1f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 164.1f, 104.0f)
                close()
                moveTo(100.1f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 100.1f, 104.0f)
                close()
            }
        }
        .build()
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
