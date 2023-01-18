package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Ladder: ImageVector
    get() {
        if (_ladder != null) {
            return _ladder!!
        }
        _ladder = Builder(name = "Ladder", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.5f, 213.3f)
                lineTo(164.5f, 73.0f)
                lineToRelative(9.1f, -25.0f)
                lineTo(184.0f, 48.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(88.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(4.6f)
                lineTo(32.5f, 213.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.8f, 10.2f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 2.7f, 0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.5f, -5.3f)
                lineTo(57.2f, 192.0f)
                horizontalLineToRelative(47.0f)
                lineToRelative(-7.7f, 21.3f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 4.8f, 10.2f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 2.7f, 0.5f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.5f, -5.3f)
                lineTo(130.0f, 168.0f)
                horizontalLineToRelative(52.0f)
                lineToRelative(18.5f, 50.7f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 208.0f, 224.0f)
                arcToRelative(8.6f, 8.6f, 0.0f, false, false, 2.7f, -0.5f)
                arcTo(7.9f, 7.9f, 0.0f, false, false, 215.5f, 213.3f)
                close()
                moveTo(127.5f, 128.0f)
                horizontalLineToRelative(-47.0f)
                lineTo(92.1f, 96.0f)
                horizontalLineToRelative(47.0f)
                close()
                moveTo(156.6f, 48.0f)
                lineTo(144.9f, 80.0f)
                lineTo(98.0f, 80.0f)
                lineToRelative(11.6f, -32.0f)
                close()
                moveTo(63.1f, 176.0f)
                lineToRelative(11.6f, -32.0f)
                horizontalLineToRelative(47.0f)
                lineTo(110.0f, 176.0f)
                close()
                moveTo(135.8f, 152.0f)
                lineTo(156.0f, 96.4f)
                lineTo(176.2f, 152.0f)
                close()
            }
        }
        .build()
        return _ladder!!
    }

private var _ladder: ImageVector? = null
