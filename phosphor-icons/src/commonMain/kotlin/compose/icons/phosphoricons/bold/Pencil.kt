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

public val BoldGroup.Pencil: ImageVector
    get() {
        if (_pencil != null) {
            return _pencil!!
        }
        _pencil = Builder(name = "Pencil", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.8f, 73.9f)
                lineTo(182.1f, 29.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcTo(19.7f, 19.7f, 0.0f, false, false, 28.0f, 163.3f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(92.7f, 228.0f)
                arcToRelative(19.7f, 19.7f, 0.0f, false, false, 14.1f, -5.9f)
                lineToRelative(120.0f, -120.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 226.8f, 73.9f)
                close()
                moveTo(89.0f, 184.0f)
                lineToRelative(75.0f, -75.0f)
                lineToRelative(11.0f, 11.0f)
                lineToRelative(-75.0f, 75.0f)
                close()
                moveTo(72.0f, 167.0f)
                lineTo(61.0f, 156.0f)
                lineToRelative(75.0f, -75.0f)
                lineToRelative(11.0f, 11.0f)
                close()
                moveTo(52.0f, 181.0f)
                lineToRelative(11.5f, 11.5f)
                horizontalLineToRelative(0.0f)
                lineTo(75.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                close()
                moveTo(192.0f, 103.0f)
                lineTo(153.0f, 64.0f)
                lineToRelative(15.0f, -15.0f)
                lineToRelative(39.0f, 39.0f)
                close()
            }
        }
        .build()
        return _pencil!!
    }

private var _pencil: ImageVector? = null
