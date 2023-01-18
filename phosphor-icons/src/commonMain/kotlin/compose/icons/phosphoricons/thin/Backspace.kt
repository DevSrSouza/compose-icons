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

public val ThinGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(68.5f, 44.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, -10.3f, 5.8f)
                lineTo(12.6f, 125.9f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.2f)
                lineToRelative(45.6f, 76.1f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 68.5f, 212.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(68.5f, 204.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -3.4f, -1.9f)
                horizontalLineToRelative(0.0f)
                lineTo(20.7f, 128.0f)
                lineTo(65.1f, 53.9f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 68.5f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(162.8f, 106.8f)
                lineTo(141.7f, 128.0f)
                lineToRelative(21.1f, 21.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 5.6f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 160.0f, 156.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                lineTo(136.0f, 133.7f)
                lineToRelative(-21.2f, 21.1f)
                arcTo(3.8f, 3.8f, 0.0f, false, true, 112.0f, 156.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.8f, -1.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, -5.6f)
                lineTo(130.3f, 128.0f)
                lineToRelative(-21.1f, -21.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.6f, -5.6f)
                lineTo(136.0f, 122.3f)
                lineToRelative(21.2f, -21.1f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 5.6f, 5.6f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
