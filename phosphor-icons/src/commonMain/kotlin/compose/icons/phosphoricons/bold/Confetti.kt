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

public val BoldGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.1f, 60.1f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, -18.5f, -5.4f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 76.2f, 67.4f)
                lineTo(26.6f, 203.8f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 18.7f, 26.8f)
                arcToRelative(20.9f, 20.9f, 0.0f, false, false, 6.9f, -1.2f)
                lineToRelative(136.4f, -49.6f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 12.7f, -14.4f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, -5.4f, -18.5f)
                close()
                moveTo(105.5f, 184.5f)
                lineTo(71.5f, 150.5f)
                lineTo(79.5f, 128.5f)
                lineTo(127.5f, 176.5f)
                close()
                moveTo(52.1f, 203.9f)
                lineToRelative(10.3f, -28.5f)
                lineToRelative(18.2f, 18.2f)
                close()
                moveTo(152.4f, 167.4f)
                lineTo(88.6f, 103.6f)
                lineToRelative(8.0f, -22.1f)
                lineToRelative(77.9f, 77.9f)
                close()
                moveTo(124.0f, 40.0f)
                lineTo(124.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(148.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                close()
                moveTo(240.5f, 127.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                close()
                moveTo(243.8f, 87.4f)
                lineTo(219.8f, 95.4f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, true, -3.8f, 0.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -3.8f, -23.4f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 7.6f, 22.8f)
                close()
                moveTo(164.0f, 88.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, 2.0f, -7.2f)
                curveToRelative(1.3f, -2.4f, 3.5f, -4.9f, 10.0f, -4.9f)
                curveToRelative(26.4f, 0.0f, 36.0f, -21.5f, 36.0f, -36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(17.0f, 17.0f, 0.0f, false, true, -2.0f, 7.2f)
                curveToRelative(-1.3f, 2.4f, -3.5f, 4.9f, -10.0f, 4.9f)
                curveToRelative(-14.5f, 0.0f, -25.7f, 6.6f, -31.7f, 18.6f)
                arcTo(41.2f, 41.2f, 0.0f, false, false, 152.0f, 76.0f)
                horizontalLineToRelative(0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 88.1f)
                close()
                moveTo(176.0f, 76.1f)
                horizontalLineToRelative(0.0f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
