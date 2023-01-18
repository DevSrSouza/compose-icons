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

public val BoldGroup.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) {
            return _trafficSignal!!
        }
        _trafficSignal = Builder(name = "TrafficSignal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 140.0f)
                lineTo(204.0f, 140.0f)
                lineTo(204.0f, 84.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(204.0f, 60.0f)
                lineTo(204.0f, 40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 60.0f)
                lineTo(40.0f, 60.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 84.0f)
                verticalLineToRelative(56.0f)
                lineTo(40.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(52.0f, 164.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 236.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 164.0f)
                horizontalLineToRelative(12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(180.0f, 212.0f)
                lineTo(76.0f, 212.0f)
                lineTo(76.0f, 44.0f)
                lineTo(180.0f, 44.0f)
                close()
                moveTo(128.0f, 120.0f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 96.0f, 88.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 128.0f, 120.0f)
                close()
                moveTo(128.0f, 80.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 80.0f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -32.0f, -32.0f)
                arcTo(32.1f, 32.1f, 0.0f, false, false, 128.0f, 200.0f)
                close()
                moveTo(128.0f, 160.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 128.0f, 160.0f)
                close()
            }
        }
        .build()
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
