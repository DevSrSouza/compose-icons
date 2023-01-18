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

public val LightGroup.PenNib: ImageVector
    get() {
        if (_penNib != null) {
            return _penNib!!
        }
        _penNib = Builder(name = "PenNib", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.7f, 104.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -4.1f, -9.9f)
                lineTo(161.9f, 25.4f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -9.9f, -4.1f)
                arcToRelative(14.3f, 14.3f, 0.0f, false, false, -9.9f, 4.1f)
                lineTo(116.7f, 50.8f)
                lineToRelative(-58.5f, 22.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, -8.9f, 10.8f)
                lineTo(26.1f, 223.0f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 1.7f, 5.2f)
                arcTo(5.6f, 5.6f, 0.0f, false, false, 32.0f, 230.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(139.4f, -23.2f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, false, 10.8f, -8.9f)
                lineToRelative(22.0f, -58.5f)
                lineToRelative(25.4f, -25.4f)
                arcTo(14.1f, 14.1f, 0.0f, false, false, 234.7f, 104.0f)
                close()
                moveTo(172.0f, 193.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -1.5f, 1.2f)
                lineTo(49.5f, 215.0f)
                lineToRelative(52.9f, -52.9f)
                arcTo(25.2f, 25.2f, 0.0f, false, false, 116.0f, 166.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, false, -26.0f, -26.0f)
                arcToRelative(25.2f, 25.2f, 0.0f, false, false, 3.9f, 13.6f)
                lineTo(41.0f, 206.5f)
                lineToRelative(20.2f, -121.0f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 62.4f, 84.0f)
                lineToRelative(56.1f, -21.0f)
                lineTo(193.0f, 137.5f)
                close()
                moveTo(102.0f, 140.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 102.0f, 140.0f)
                close()
                moveTo(222.1f, 105.4f)
                lineTo(200.0f, 127.5f)
                lineTo(128.5f, 56.0f)
                lineToRelative(22.1f, -22.1f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 2.8f, 0.0f)
                lineToRelative(68.7f, 68.7f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 222.1f, 105.4f)
                close()
            }
        }
        .build()
        return _penNib!!
    }

private var _penNib: ImageVector? = null
