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

public val ThinGroup.Shower: ImageVector
    get() {
        if (_shower != null) {
            return _shower!!
        }
        _shower = Builder(name = "Shower", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(68.0f, 228.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 68.0f, 228.0f)
                close()
                moveTo(88.0f, 192.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 88.0f, 192.0f)
                close()
                moveTo(28.0f, 188.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 28.0f, 188.0f)
                close()
                moveTo(64.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 64.0f, 168.0f)
                close()
                moveTo(252.0f, 40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(219.3f, 44.0f)
                arcToRelative(3.6f, 3.6f, 0.0f, false, false, -2.8f, 1.2f)
                lineTo(187.7f, 73.9f)
                lineTo(166.5f, 201.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.2f, 9.5f)
                arcToRelative(11.5f, 11.5f, 0.0f, false, true, -3.7f, 0.6f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -8.4f, -3.6f)
                lineToRelative(-98.0f, -98.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 6.5f, -20.3f)
                lineTo(182.1f, 68.3f)
                lineToRelative(28.7f, -28.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, 8.5f, -3.5f)
                lineTo(248.0f, 36.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 252.0f, 40.0f)
                close()
                moveTo(179.1f, 76.9f)
                lineTo(56.0f, 97.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.2f, 2.7f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.0f, 4.1f)
                lineToRelative(98.0f, 98.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 4.1f, 1.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.7f, -3.2f)
                close()
            }
        }
        .build()
        return _shower!!
    }

private var _shower: ImageVector? = null
