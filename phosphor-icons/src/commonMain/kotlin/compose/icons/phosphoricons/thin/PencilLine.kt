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

public val ThinGroup.PencilLine: ImageVector
    get() {
        if (_pencilLine != null) {
            return _pencilLine!!
        }
        _pencilLine = Builder(name = "PencilLine", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(194.8f, 122.8f)
                horizontalLineToRelative(0.0f)
                lineToRelative(26.4f, -26.3f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -17.0f)
                lineTo(176.5f, 34.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -2.7f, 4.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -0.8f, 4.2f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(105.7f, 212.0f)
                lineToRelative(89.1f, -89.2f)
                close()
                moveTo(165.2f, 40.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                lineTo(192.0f, 114.3f)
                lineTo(141.7f, 64.0f)
                close()
                moveTo(73.7f, 188.0f)
                lineTo(164.0f, 97.7f)
                lineTo(186.3f, 120.0f)
                lineTo(96.0f, 210.3f)
                close()
                moveTo(45.7f, 160.0f)
                lineTo(136.0f, 69.7f)
                lineTo(158.3f, 92.0f)
                lineTo(68.0f, 182.3f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(44.0f, 169.7f)
                lineToRelative(21.2f, 21.1f)
                horizontalLineToRelative(0.0f)
                lineTo(86.3f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
            }
        }
        .build()
        return _pencilLine!!
    }

private var _pencilLine: ImageVector? = null
