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

public val LightGroup.MapPinLine: ImageVector
    get() {
        if (_mapPinLine != null) {
            return _mapPinLine!!
        }
        _mapPinLine = Builder(name = "MapPinLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.1f, 226.0f)
                lineTo(145.3f, 226.0f)
                arcToRelative(263.3f, 263.3f, 0.0f, false, false, 27.3f, -27.1f)
                curveToRelative(27.2f, -31.2f, 41.5f, -64.0f, 41.5f, -94.9f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, -172.0f, 0.0f)
                curveToRelative(0.0f, 30.9f, 14.4f, 63.7f, 41.5f, 94.9f)
                arcTo(263.3f, 263.3f, 0.0f, false, false, 110.9f, 226.0f)
                lineTo(56.1f, 226.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 0.0f, -12.0f)
                close()
                moveTo(54.1f, 104.0f)
                arcToRelative(74.0f, 74.0f, 0.0f, false, true, 148.0f, 0.0f)
                curveToRelative(0.0f, 59.6f, -59.0f, 108.9f, -74.0f, 120.5f)
                curveTo(113.1f, 212.9f, 54.1f, 163.6f, 54.1f, 104.0f)
                close()
                moveTo(166.1f, 104.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, -38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 166.1f, 104.0f)
                close()
                moveTo(102.1f, 104.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, 26.0f)
                arcTo(26.1f, 26.1f, 0.0f, false, true, 102.1f, 104.0f)
                close()
            }
        }
        .build()
        return _mapPinLine!!
    }

private var _mapPinLine: ImageVector? = null
