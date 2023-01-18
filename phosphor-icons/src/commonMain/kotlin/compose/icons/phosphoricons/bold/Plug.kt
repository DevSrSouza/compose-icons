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

public val BoldGroup.Plug: ImageVector
    get() {
        if (_plug != null) {
            return _plug!!
        }
        _plug = Builder(name = "Plug", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.5f, 63.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 0.0f)
                lineTo(192.0f, 95.0f)
                lineTo(161.0f, 64.0f)
                lineToRelative(31.5f, -31.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, -17.0f)
                lineTo(144.0f, 47.0f)
                lineTo(120.5f, 23.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                lineTo(107.0f, 44.0f)
                lineTo(58.1f, 92.9f)
                arcToRelative(44.1f, 44.1f, 0.0f, false, false, 0.0f, 62.2f)
                lineTo(71.0f, 168.0f)
                lineTo(23.5f, 215.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                lineTo(88.0f, 185.0f)
                lineToRelative(12.9f, 12.9f)
                arcToRelative(44.2f, 44.2f, 0.0f, false, false, 62.2f, 0.0f)
                lineTo(212.0f, 149.0f)
                lineToRelative(3.5f, 3.5f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(209.0f, 112.0f)
                lineToRelative(31.5f, -31.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.5f, 63.5f)
                close()
                moveTo(146.1f, 180.9f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -28.2f, 0.0f)
                lineTo(75.1f, 138.1f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 0.0f, -28.2f)
                lineTo(124.0f, 61.0f)
                lineToRelative(71.0f, 71.0f)
                close()
            }
        }
        .build()
        return _plug!!
    }

private var _plug: ImageVector? = null
