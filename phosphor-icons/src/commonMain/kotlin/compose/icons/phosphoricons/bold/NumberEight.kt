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

public val BoldGroup.NumberEight: ImageVector
    get() {
        if (_numberEight != null) {
            return _numberEight!!
        }
        _numberEight = Builder(name = "NumberEight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.6f, 127.1f)
                arcToRelative(73.8f, 73.8f, 0.0f, false, false, -11.4f, -8.8f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 4.9f, -4.2f)
                arcToRelative(57.5f, 57.5f, 0.0f, false, false, 0.0f, -84.9f)
                arcToRelative(65.1f, 65.1f, 0.0f, false, false, -88.2f, 0.0f)
                arcToRelative(57.5f, 57.5f, 0.0f, false, false, 0.0f, 84.9f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, 4.9f, 4.2f)
                arcToRelative(73.8f, 73.8f, 0.0f, false, false, -11.4f, 8.8f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, false, 0.0f, 97.1f)
                arcToRelative(74.6f, 74.6f, 0.0f, false, false, 101.2f, 0.0f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, false, 0.0f, -97.1f)
                close()
                moveTo(100.3f, 96.6f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, 0.0f, -49.9f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, true, 55.4f, 0.0f)
                arcToRelative(33.6f, 33.6f, 0.0f, false, true, 0.0f, 49.9f)
                arcToRelative(41.2f, 41.2f, 0.0f, false, true, -55.4f, 0.0f)
                close()
                moveTo(162.2f, 206.8f)
                arcToRelative(50.9f, 50.9f, 0.0f, false, true, -68.4f, 0.0f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, true, 0.0f, -62.2f)
                arcToRelative(50.6f, 50.6f, 0.0f, false, true, 68.4f, 0.0f)
                arcToRelative(41.9f, 41.9f, 0.0f, false, true, 0.0f, 62.2f)
                close()
            }
        }
        .build()
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
