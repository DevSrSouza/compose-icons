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

public val LightGroup.Confetti: ImageVector
    get() {
        if (_confetti != null) {
            return _confetti!!
        }
        _confetti = Builder(name = "Confetti", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(109.1f, 52.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -23.0f, 5.2f)
                lineToRelative(-53.9f, 148.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.1f, 18.8f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 4.9f, -0.8f)
                lineToRelative(148.0f, -53.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 5.2f, -23.0f)
                close()
                moveTo(103.9f, 191.5f)
                lineTo(64.5f, 152.1f)
                lineToRelative(14.7f, -40.4f)
                lineToRelative(65.1f, 65.1f)
                close()
                moveTo(46.1f, 212.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -2.6f, -2.6f)
                lineTo(60.0f, 164.5f)
                lineTo(91.5f, 196.0f)
                close()
                moveTo(195.4f, 157.2f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, -1.3f, 1.5f)
                lineToRelative(-37.4f, 13.6f)
                lineToRelative(-73.0f, -73.0f)
                lineTo(97.3f, 61.9f)
                arcToRelative(2.2f, 2.2f, 0.0f, false, true, 1.5f, -1.3f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.8f, 0.5f)
                lineToRelative(94.3f, 94.3f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 195.4f, 157.2f)
                close()
                moveTo(162.0f, 72.0f)
                arcToRelative(35.8f, 35.8f, 0.0f, false, true, 3.6f, -14.7f)
                curveToRelative(5.0f, -9.9f, 14.3f, -15.3f, 26.4f, -15.3f)
                curveToRelative(7.5f, 0.0f, 12.5f, -2.7f, 15.5f, -8.4f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 210.0f, 24.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, -6.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 6.0f)
                curveToRelative(0.0f, 10.4f, -6.3f, 30.0f, -30.0f, 30.0f)
                curveToRelative(-7.5f, 0.0f, -12.5f, 2.7f, -15.5f, 8.4f)
                arcTo(24.4f, 24.4f, 0.0f, false, false, 174.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineToRelative(0.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 162.0f, 72.0f)
                close()
                moveTo(138.0f, 40.0f)
                lineTo(138.0f, 16.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                lineTo(150.0f, 40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(236.2f, 123.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineToRelative(-16.0f, -16.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                close()
                moveTo(241.9f, 77.7f)
                lineTo(217.9f, 85.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, true, -1.9f, 0.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.7f, -4.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 3.8f, -7.6f)
                lineToRelative(24.0f, -8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.8f, 11.4f)
                close()
            }
        }
        .build()
        return _confetti!!
    }

private var _confetti: ImageVector? = null
