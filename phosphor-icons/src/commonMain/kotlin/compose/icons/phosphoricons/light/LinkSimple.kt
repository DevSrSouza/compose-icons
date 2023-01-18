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

public val LightGroup.LinkSimple: ImageVector
    get() {
        if (_linkSimple != null) {
            return _linkSimple!!
        }
        _linkSimple = Builder(name = "LinkSimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.2f, 89.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, 8.5f)
                lineTo(98.3f, 166.2f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, true, -8.5f, 0.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, true, 0.0f, -8.5f)
                lineToRelative(67.9f, -67.9f)
                arcTo(6.1f, 6.1f, 0.0f, false, true, 166.2f, 89.8f)
                close()
                moveTo(140.7f, 174.7f)
                lineTo(112.4f, 203.0f)
                arcTo(42.0f, 42.0f, 0.0f, false, true, 53.0f, 143.6f)
                lineToRelative(28.3f, -28.3f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, -8.5f)
                lineTo(44.6f, 135.1f)
                arcToRelative(53.9f, 53.9f, 0.0f, false, false, 0.0f, 76.3f)
                arcToRelative(54.0f, 54.0f, 0.0f, false, false, 76.3f, 0.0f)
                lineToRelative(28.3f, -28.2f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, -8.5f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 140.7f, 174.7f)
                close()
                moveTo(211.4f, 44.6f)
                arcToRelative(53.9f, 53.9f, 0.0f, false, false, -76.3f, 0.0f)
                lineTo(106.8f, 72.8f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.5f, 8.5f)
                lineTo(143.6f, 53.0f)
                arcTo(42.0f, 42.0f, 0.0f, true, true, 203.0f, 112.4f)
                lineToRelative(-28.3f, 28.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 4.2f, 1.8f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.3f, -1.8f)
                lineToRelative(28.2f, -28.3f)
                arcTo(53.9f, 53.9f, 0.0f, false, false, 211.4f, 44.6f)
                close()
            }
        }
        .build()
        return _linkSimple!!
    }

private var _linkSimple: ImageVector? = null
