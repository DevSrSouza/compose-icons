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

public val BoldGroup.Envelope: ImageVector
    get() {
        if (_envelope != null) {
            return _envelope!!
        }
        _envelope = Builder(name = "Envelope", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.0f, 44.0f)
                lineTo(32.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 20.0f, 56.0f)
                lineTo(20.0f, 192.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(236.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 224.0f, 44.0f)
                close()
                moveTo(137.5f, 119.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-9.5f, 8.7f)
                lineTo(62.8f, 68.0f)
                lineTo(193.2f, 68.0f)
                close()
                moveTo(92.8f, 128.0f)
                lineTo(44.0f, 172.7f)
                lineTo(44.0f, 83.3f)
                close()
                moveTo(110.5f, 144.3f)
                lineTo(119.9f, 152.8f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, 16.2f, 0.0f)
                lineToRelative(9.4f, -8.5f)
                lineTo(193.2f, 188.0f)
                lineTo(62.8f, 188.0f)
                close()
                moveTo(163.2f, 128.0f)
                lineTo(212.0f, 83.3f)
                verticalLineToRelative(89.4f)
                close()
            }
        }
        .build()
        return _envelope!!
    }

private var _envelope: ImageVector? = null
