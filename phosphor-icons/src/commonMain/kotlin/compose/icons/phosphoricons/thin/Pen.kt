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

public val ThinGroup.Pen: ImageVector
    get() {
        if (_pen != null) {
            return _pen!!
        }
        _pen = Builder(name = "Pen", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(224.7f, 88.0f)
                arcToRelative(12.3f, 12.3f, 0.0f, false, false, -3.5f, -8.5f)
                lineTo(176.5f, 34.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, -17.0f, 0.0f)
                lineToRelative(-120.0f, 120.0f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, -2.7f, 4.2f)
                horizontalLineToRelative(0.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, -0.8f, 4.2f)
                lineTo(36.0f, 208.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(92.7f, 220.0f)
                arcToRelative(11.6f, 11.6f, 0.0f, false, false, 4.2f, -0.8f)
                lineTo(97.0f, 219.2f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 4.2f, -2.7f)
                lineToRelative(88.6f, -88.7f)
                lineToRelative(5.8f, 23.0f)
                lineToRelative(-38.4f, 38.4f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 5.6f, 0.0f)
                lineToRelative(40.0f, -40.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 1.1f, -3.8f)
                lineToRelative(-7.5f, -29.8f)
                lineToRelative(24.8f, -24.7f)
                arcTo(12.3f, 12.3f, 0.0f, false, false, 224.7f, 88.0f)
                close()
                moveTo(44.0f, 208.0f)
                lineTo(44.0f, 169.7f)
                lineTo(86.3f, 212.0f)
                lineTo(48.0f, 212.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.0f, 208.0f)
                close()
                moveTo(96.0f, 210.3f)
                lineTo(45.7f, 160.0f)
                lineTo(136.0f, 69.7f)
                lineTo(186.3f, 120.0f)
                close()
                moveTo(215.5f, 90.8f)
                lineTo(192.0f, 114.3f)
                lineTo(141.7f, 64.0f)
                lineToRelative(23.5f, -23.5f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 5.6f, 0.0f)
                lineToRelative(44.7f, 44.7f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                close()
            }
        }
        .build()
        return _pen!!
    }

private var _pen: ImageVector? = null
