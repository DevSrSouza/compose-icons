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

public val LightGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.7f, 58.4f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, -14.3f, 0.5f)
                lineToRelative(-89.2f, 57.3f)
                lineToRelative(-1.2f, 0.9f)
                lineTo(122.0f, 70.7f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -21.6f, -11.8f)
                lineTo(11.2f, 116.2f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, false, 0.0f, 23.6f)
                lineToRelative(89.2f, 57.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.6f, 2.2f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, 6.7f, -1.7f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 7.3f, -12.3f)
                lineTo(122.0f, 138.9f)
                lineToRelative(1.2f, 0.9f)
                lineToRelative(89.2f, 57.3f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 7.6f, 2.2f)
                arcToRelative(13.4f, 13.4f, 0.0f, false, false, 6.7f, -1.7f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 7.3f, -12.3f)
                lineTo(234.0f, 70.7f)
                arcTo(13.9f, 13.9f, 0.0f, false, false, 226.7f, 58.4f)
                close()
                moveTo(110.0f, 185.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.0f, 1.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.1f, -0.1f)
                lineTo(17.7f, 129.7f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.0f, -3.4f)
                lineTo(106.9f, 69.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.1f, -0.4f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 1.0f, 0.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.0f, 1.8f)
                close()
                moveTo(222.0f, 185.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, -1.0f, 1.8f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.1f, -0.1f)
                lineToRelative(-89.2f, -57.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 0.0f, -3.4f)
                lineTo(218.9f, 69.0f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.1f, -0.4f)
                arcToRelative(2.9f, 2.9f, 0.0f, false, true, 1.0f, 0.3f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, true, 1.0f, 1.8f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
