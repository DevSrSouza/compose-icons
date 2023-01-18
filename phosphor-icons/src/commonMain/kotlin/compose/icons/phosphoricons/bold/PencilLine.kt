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

public val BoldGroup.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = Builder(name = "PencilLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 204.0f)
                lineTo(125.0f, 204.0f)
                lineToRelative(75.5f, -75.5f)
                horizontalLineToRelative(0.0f)
                lineToRelative(26.3f, -26.4f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                lineTo(182.1f, 29.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -28.2f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcTo(19.8f, 19.8f, 0.0f, false, false, 28.0f, 163.3f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(216.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(61.0f, 156.0f)
                lineToRelative(75.0f, -75.0f)
                lineToRelative(11.0f, 11.0f)
                lineTo(72.0f, 167.0f)
                close()
                moveTo(164.0f, 109.0f)
                lineTo(175.0f, 120.0f)
                lineTo(100.0f, 195.0f)
                lineTo(89.0f, 184.0f)
                close()
                moveTo(168.0f, 49.0f)
                lineTo(207.0f, 88.0f)
                lineTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                close()
                moveTo(52.0f, 181.0f)
                lineToRelative(11.5f, 11.5f)
                horizontalLineToRelative(0.0f)
                lineTo(75.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                close()
            }
        }
        .build()
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
