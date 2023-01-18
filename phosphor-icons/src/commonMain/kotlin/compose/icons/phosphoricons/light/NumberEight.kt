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

public val LightGroup.NumberEight: ImageVector
    get() {
        if (_numberEight != null) {
            return _numberEight!!
        }
        _numberEight = Builder(name = "NumberEight", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.5f, 131.5f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, false, -19.4f, -12.7f)
                arcToRelative(54.8f, 54.8f, 0.0f, false, false, 12.9f, -9.1f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, false, 0.0f, -76.1f)
                arcToRelative(59.1f, 59.1f, 0.0f, false, false, -80.0f, 0.0f)
                arcToRelative(51.5f, 51.5f, 0.0f, false, false, 0.0f, 76.1f)
                arcToRelative(54.8f, 54.8f, 0.0f, false, false, 12.9f, 9.1f)
                arcToRelative(65.8f, 65.8f, 0.0f, false, false, -19.4f, 12.7f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, false, 0.0f, 88.4f)
                arcToRelative(68.8f, 68.8f, 0.0f, false, false, 93.0f, 0.0f)
                arcToRelative(59.8f, 59.8f, 0.0f, false, false, 0.0f, -88.4f)
                close()
                moveTo(96.2f, 101.0f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, true, 0.0f, -58.7f)
                arcToRelative(47.3f, 47.3f, 0.0f, false, true, 63.6f, 0.0f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, true, 0.0f, 58.7f)
                arcToRelative(47.3f, 47.3f, 0.0f, false, true, -63.6f, 0.0f)
                close()
                moveTo(166.3f, 211.1f)
                arcToRelative(56.7f, 56.7f, 0.0f, false, true, -76.6f, 0.0f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, 0.0f, -70.9f)
                arcToRelative(56.7f, 56.7f, 0.0f, false, true, 76.6f, 0.0f)
                arcToRelative(47.9f, 47.9f, 0.0f, false, true, 0.0f, 70.9f)
                close()
            }
        }
        .build()
        return _numberEight!!
    }

private var _numberEight: ImageVector? = null
