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

public val BoldGroup.Bicycle: ImageVector
    get() {
        if (_bicycle != null) {
            return _bicycle!!
        }
        _bicycle = Builder(name = "Bicycle", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.0f, 108.0f)
                arcToRelative(50.2f, 50.2f, 0.0f, false, false, -15.1f, 2.3f)
                lineTo(168.9f, 76.0f)
                lineTo(192.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, false, -28.0f, -28.0f)
                lineTo(148.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.4f, 6.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 0.0f, 12.0f)
                lineToRelative(8.2f, 14.0f)
                lineTo(109.6f, 84.0f)
                lineTo(94.4f, 58.0f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 84.0f, 52.0f)
                lineTo(52.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                lineTo(77.1f, 76.0f)
                lineTo(88.2f, 95.0f)
                lineTo(74.0f, 112.9f)
                arcToRelative(52.1f, 52.1f, 0.0f, true, false, 18.8f, 14.9f)
                lineToRelative(8.4f, -10.6f)
                lineTo(118.0f, 146.0f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 10.3f, 6.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 10.4f, -18.0f)
                lineToRelative(-15.1f, -26.0f)
                horizontalLineToRelative(36.2f)
                lineToRelative(8.4f, 14.4f)
                arcTo(51.9f, 51.9f, 0.0f, true, false, 204.0f, 108.0f)
                close()
                moveTo(80.0f, 160.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, -28.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 6.3f, 0.7f)
                lineTo(42.6f, 152.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 2.0f, 16.8f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 52.0f, 172.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 9.4f, -4.6f)
                lineToRelative(15.7f, -19.8f)
                arcTo(27.6f, 27.6f, 0.0f, false, true, 80.0f, 160.0f)
                close()
                moveTo(204.0f, 188.0f)
                arcToRelative(28.1f, 28.1f, 0.0f, false, true, -28.0f, -28.0f)
                arcToRelative(27.6f, 27.6f, 0.0f, false, true, 4.9f, -15.8f)
                lineTo(193.6f, 166.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 10.4f, 6.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 6.0f, -1.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 4.4f, -16.4f)
                lineToRelative(-12.8f, -21.9f)
                lineTo(204.0f, 132.1f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _bicycle!!
    }

private var _bicycle: ImageVector? = null
