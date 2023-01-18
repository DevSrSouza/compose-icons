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

public val BoldGroup.Brain: ImageVector
    get() {
        if (_brain != null) {
            return _brain!!
        }
        _brain = Builder(name = "Brain", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 132.0f)
                arcToRelative(60.3f, 60.3f, 0.0f, false, false, -32.0f, -53.1f)
                lineTo(220.0f, 72.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, -92.0f, -33.2f)
                arcTo(52.0f, 52.0f, 0.0f, false, false, 36.0f, 72.0f)
                verticalLineToRelative(6.9f)
                arcToRelative(60.1f, 60.1f, 0.0f, false, false, 0.0f, 106.2f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 92.0f, 32.1f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 92.0f, -32.1f)
                arcTo(60.2f, 60.2f, 0.0f, false, false, 252.0f, 132.0f)
                close()
                moveTo(88.0f, 212.0f)
                arcToRelative(28.2f, 28.2f, 0.0f, false, true, -26.9f, -20.1f)
                lineTo(72.0f, 191.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(64.0f, 167.9f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 52.0f, 98.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 8.0f, -11.3f)
                lineTo(60.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                verticalLineToRelative(68.2f)
                arcToRelative(50.1f, 50.1f, 0.0f, false, false, -7.2f, -3.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -9.6f, 22.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 88.0f, 212.0f)
                close()
                moveTo(192.0f, 168.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(10.9f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -38.1f, -33.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.6f, -22.0f)
                arcToRelative(50.1f, 50.1f, 0.0f, false, false, -7.2f, 3.9f)
                lineTo(140.0f, 72.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 56.0f, 0.0f)
                lineTo(196.0f, 86.7f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 204.0f, 98.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -12.0f, 70.0f)
                close()
                moveTo(100.0f, 96.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 76.0f, 96.0f)
                lineTo(76.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(208.0f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, -40.0f)
                lineTo(156.0f, 88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 208.0f, 124.0f)
                close()
            }
        }
        .build()
        return _brain!!
    }

private var _brain: ImageVector? = null
