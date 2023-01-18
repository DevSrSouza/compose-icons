package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.MonitorPlay: ImageVector
    get() {
        if (_monitorPlay != null) {
            return _monitorPlay!!
        }
        _monitorPlay = Builder(name = "MonitorPlay", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(96.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(64.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 168.0f, 224.0f)
                close()
                moveTo(232.0f, 64.0f)
                lineTo(232.0f, 176.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, 24.0f)
                lineTo(48.0f, 200.0f)
                arcToRelative(24.1f, 24.1f, 0.0f, false, true, -24.0f, -24.0f)
                lineTo(24.0f, 64.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 48.0f, 40.0f)
                lineTo(208.0f, 40.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, true, 232.0f, 64.0f)
                close()
                moveTo(164.0f, 120.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -3.7f, -6.7f)
                lineToRelative(-44.0f, -28.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, -8.1f, -0.3f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -4.2f, 7.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 4.2f, 7.0f)
                arcToRelative(7.7f, 7.7f, 0.0f, false, false, 8.1f, -0.3f)
                lineToRelative(44.0f, -28.0f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 164.0f, 120.0f)
                close()
            }
        }
        .build()
        return _monitorPlay!!
    }

private var _monitorPlay: ImageVector? = null
