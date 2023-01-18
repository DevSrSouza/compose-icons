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

public val ThinGroup.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) {
            return _monitorPlay!!
        }
        _monitorPlay = Builder(name = "MonitorPlay", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(162.2f, 116.7f)
                lineToRelative(-48.0f, -32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.1f, -0.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 108.0f, 88.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 3.5f)
                arcToRelative(4.5f, 4.5f, 0.0f, false, false, 1.9f, 0.5f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, 2.2f, -0.7f)
                lineToRelative(48.0f, -32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -6.6f)
                close()
                moveTo(116.0f, 144.5f)
                verticalLineToRelative(-49.0f)
                lineTo(152.8f, 120.0f)
                close()
                moveTo(208.0f, 44.0f)
                lineTo(48.0f, 44.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 28.0f, 64.0f)
                lineTo(28.0f, 176.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 196.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 64.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 208.0f, 44.0f)
                close()
                moveTo(220.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(48.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(36.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 48.0f, 52.0f)
                lineTo(208.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                close()
                moveTo(164.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 224.0f)
                close()
            }
        }
        .build()
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
