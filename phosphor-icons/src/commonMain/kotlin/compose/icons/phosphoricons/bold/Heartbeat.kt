package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 140.0f)
                horizontalLineTo(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(65.6f)
                lineTo(78.0f, 97.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 20.0f, 0.0f)
                lineToRelative(22.0f, 33.1f)
                lineToRelative(6.0f, -9.1f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, 10.0f, -5.3f)
                horizontalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(142.4f)
                lineTo(130.0f, 158.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -20.0f, 0.0f)
                lineTo(88.0f, 125.6f)
                lineToRelative(-6.0f, 9.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, true, 72.0f, 140.0f)
                close()
                moveTo(176.0f, 28.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -48.0f, 21.6f)
                arcTo(64.0f, 64.0f, 0.0f, false, false, 16.2f, 87.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.9f, 1.8f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 76.8f, -12.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.2f, 0.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 216.0f, 92.0f)
                curveToRelative(0.0f, 51.2f, -67.5f, 97.2f, -88.0f, 110.0f)
                curveToRelative(-10.6f, -6.6f, -33.5f, -21.9f, -53.4f, -42.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.2f, 16.8f)
                curveToRelative(29.2f, 30.0f, 63.3f, 49.3f, 64.7f, 50.1f)
                arcToRelative(12.4f, 12.4f, 0.0f, false, false, 11.8f, 0.0f)
                curveTo(138.2f, 224.0f, 240.0f, 166.2f, 240.0f, 92.0f)
                arcTo(64.1f, 64.1f, 0.0f, false, false, 176.0f, 28.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
