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

public val ThinGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(107.7f, 54.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -11.1f, -3.3f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -8.7f, 7.6f)
                lineTo(34.1f, 206.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.8f, 12.6f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 8.4f, 3.5f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 4.2f, -0.7f)
                lineToRelative(148.1f, -53.8f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, 7.6f, -8.7f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -3.3f, -11.1f)
                close()
                moveTo(103.4f, 193.8f)
                lineTo(62.2f, 152.6f)
                lineToRelative(16.2f, -44.5f)
                lineToRelative(69.5f, 69.5f)
                close()
                moveTo(46.7f, 214.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.1f, -5.1f)
                lineToRelative(17.6f, -48.4f)
                lineToRelative(35.9f, 35.9f)
                close()
                moveTo(197.4f, 157.6f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, -2.6f, 2.9f)
                lineToRelative(-38.6f, 14.1f)
                lineTo(81.4f, 99.8f)
                lineTo(95.5f, 61.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 2.9f, -2.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.7f, 1.1f)
                lineToRelative(94.2f, 94.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 197.4f, 157.6f)
                close()
                moveTo(220.0f, 24.0f)
                curveToRelative(0.0f, 9.7f, -5.9f, 28.0f, -28.0f, 28.0f)
                curveToRelative(-8.3f, 0.0f, -14.2f, 3.3f, -17.4f, 9.8f)
                arcTo(26.3f, 26.3f, 0.0f, false, false, 172.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                arcToRelative(33.5f, 33.5f, 0.0f, false, true, 3.4f, -13.8f)
                curveTo(170.7f, 51.7f, 177.6f, 44.0f, 192.0f, 44.0f)
                curveToRelative(19.3f, 0.0f, 20.0f, -18.0f, 20.0f, -20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(0.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 24.0f)
                close()
                moveTo(140.0f, 40.0f)
                lineTo(140.0f, 16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                lineTo(148.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                close()
                moveTo(234.8f, 125.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -5.6f, 0.0f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                close()
                moveTo(241.3f, 75.8f)
                lineTo(217.3f, 83.8f)
                lineTo(216.0f, 84.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -3.8f, -2.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.5f, -5.1f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 2.6f, 7.6f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
