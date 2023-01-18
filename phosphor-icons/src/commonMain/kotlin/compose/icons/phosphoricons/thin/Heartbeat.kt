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

public val ThinGroup.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) {
            return _heartbeat!!
        }
        _heartbeat = Builder(name = "Heartbeat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 132.0f)
                horizontalLineTo(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(69.9f)
                lineToRelative(14.8f, -22.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 6.6f, 0.0f)
                lineToRelative(28.7f, 43.0f)
                lineToRelative(12.7f, -19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 136.0f, 124.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                horizontalLineTo(138.1f)
                lineToRelative(-14.8f, 22.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -6.6f, 0.0f)
                lineTo(88.0f, 111.2f)
                lineToRelative(-12.7f, 19.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 72.0f, 132.0f)
                close()
                moveTo(176.0f, 36.0f)
                arcToRelative(55.8f, 55.8f, 0.0f, false, false, -48.0f, 27.1f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 24.0f, 92.0f)
                curveToRelative(0.0f, 1.4f, 0.0f, 2.8f, 0.1f, 4.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, -0.4f)
                curveTo(32.0f, 94.5f, 32.0f, 93.2f, 32.0f, 92.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 92.3f, -18.5f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 128.0f, 76.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.7f, -2.5f)
                arcTo(48.0f, 48.0f, 0.0f, false, true, 224.0f, 92.0f)
                curveToRelative(0.0f, 59.7f, -82.2f, 111.1f, -96.0f, 119.4f)
                curveToRelative(-8.3f, -5.0f, -41.4f, -25.5f, -66.3f, -54.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 56.0f, 157.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.4f, 5.6f)
                curveToRelative(29.6f, 33.8f, 68.8f, 56.0f, 70.4f, 56.9f)
                arcToRelative(4.3f, 4.3f, 0.0f, false, false, 4.0f, 0.0f)
                arcToRelative(321.4f, 321.4f, 0.0f, false, false, 50.7f, -37.0f)
                curveToRelative(34.0f, -30.7f, 51.3f, -61.1f, 51.3f, -90.5f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 176.0f, 36.0f)
                close()
            }
        }
        .build()
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
