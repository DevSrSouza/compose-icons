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

public val BoldGroup.HourglassLow: ImageVector
    get() {
        if (_hourglassLow != null) {
            return _hourglassLow!!
        }
        _hourglassLow = Builder(name = "HourglassLow", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 75.6f)
                lineTo(204.0f, 40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.0f, -20.0f)
                lineTo(72.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 52.0f, 40.0f)
                lineTo(52.0f, 76.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 8.0f, 16.0f)
                lineToRelative(48.0f, 36.0f)
                lineTo(60.0f, 164.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -8.0f, 15.9f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(184.0f, 235.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(204.0f, 180.4f)
                arcToRelative(20.3f, 20.3f, 0.0f, false, false, -7.9f, -16.0f)
                lineTo(147.9f, 128.0f)
                lineToRelative(48.2f, -36.4f)
                arcTo(20.3f, 20.3f, 0.0f, false, false, 204.0f, 75.6f)
                close()
                moveTo(161.4f, 168.3f)
                lineTo(94.6f, 168.1f)
                lineTo(128.0f, 143.0f)
                close()
                moveTo(76.0f, 212.0f)
                lineTo(76.0f, 192.0f)
                lineToRelative(104.0f, 0.3f)
                lineTo(180.0f, 212.0f)
                close()
                moveTo(180.0f, 73.7f)
                lineTo(128.0f, 113.0f)
                lineTo(76.0f, 74.0f)
                lineTo(76.0f, 44.0f)
                lineTo(180.0f, 44.0f)
                close()
            }
        }
        .build()
        return _hourglassLow!!
    }

private var _hourglassLow: ImageVector? = null
