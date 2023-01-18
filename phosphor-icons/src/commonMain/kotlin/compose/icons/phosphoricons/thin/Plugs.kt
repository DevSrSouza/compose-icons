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

public val ThinGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.8f, 21.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineTo(200.0f, 50.3f)
                lineToRelative(-8.2f, -8.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(124.0f, 70.3f)
                lineToRelative(-5.2f, -5.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineToRelative(64.0f, 64.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(8.0f, 8.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineToRelative(-5.1f, -5.2f)
                lineToRelative(28.2f, -28.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -39.6f)
                lineTo(205.7f, 56.0f)
                lineToRelative(29.1f, -29.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 234.8f, 21.2f)
                close()
                moveTo(214.1f, 84.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, true, -5.9f, 14.1f)
                lineTo(180.0f, 126.3f)
                lineTo(129.7f, 76.0f)
                lineToRelative(28.2f, -28.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 28.2f, 0.0f)
                lineToRelative(22.1f, 22.1f)
                arcTo(19.7f, 19.7f, 0.0f, false, true, 214.1f, 84.0f)
                close()
                moveTo(141.2f, 141.2f)
                lineTo(120.0f, 162.3f)
                lineTo(93.7f, 136.0f)
                lineToRelative(21.1f, -21.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, -5.6f)
                lineTo(88.0f, 130.3f)
                lineTo(70.8f, 113.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                lineToRelative(5.1f, 5.2f)
                lineTo(42.1f, 152.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(8.2f, 8.2f)
                lineTo(21.2f, 229.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineTo(56.0f, 205.7f)
                lineToRelative(8.2f, 8.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineTo(132.0f, 185.7f)
                lineToRelative(5.2f, 5.1f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, -5.6f)
                lineTo(125.7f, 168.0f)
                lineToRelative(21.1f, -21.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, -5.6f)
                close()
                moveTo(98.1f, 208.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, -28.2f, 0.0f)
                lineTo(47.8f, 186.1f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, -28.2f)
                lineTo(76.0f, 129.7f)
                lineTo(126.3f, 180.0f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null
