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

public val LightGroup.Backspace: ImageVector
    get() {
        if (_backspace != null) {
            return _backspace!!
        }
        _backspace = Builder(name = "Backspace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 42.0f)
                lineTo(68.5f, 42.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -12.0f, 6.8f)
                lineTo(10.9f, 124.9f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.0f, 6.2f)
                lineToRelative(45.6f, 76.1f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.0f, 6.8f)
                lineTo(216.0f, 214.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(230.0f, 56.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 216.0f, 42.0f)
                close()
                moveTo(218.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(68.5f, 202.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.7f, -1.0f)
                horizontalLineToRelative(0.0f)
                lineTo(23.0f, 128.0f)
                lineTo(66.8f, 55.0f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.7f, -1.0f)
                lineTo(216.0f, 54.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                close()
                moveTo(164.2f, 108.2f)
                lineTo(144.5f, 128.0f)
                lineToRelative(19.7f, 19.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, true, true, -8.4f, 8.4f)
                lineTo(136.0f, 136.5f)
                lineToRelative(-19.8f, 19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, -8.4f, -8.4f)
                lineTo(127.5f, 128.0f)
                lineToRelative(-19.7f, -19.8f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, -8.4f)
                lineTo(136.0f, 119.5f)
                lineToRelative(19.8f, -19.7f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, true, 8.4f, 8.4f)
                close()
            }
        }
        .build()
        return _backspace!!
    }

private var _backspace: ImageVector? = null
