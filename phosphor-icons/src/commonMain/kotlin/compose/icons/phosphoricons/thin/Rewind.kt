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

public val ThinGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.8f, 60.1f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, -12.3f, 0.5f)
                lineToRelative(-89.2f, 57.3f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, -4.3f, 4.9f)
                lineTo(120.0f, 70.7f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -18.5f, -10.1f)
                lineTo(12.3f, 117.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 20.2f)
                lineToRelative(89.2f, 57.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.5f, 2.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 5.8f, -1.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.2f, -10.6f)
                lineTo(120.0f, 133.2f)
                arcToRelative(11.3f, 11.3f, 0.0f, false, false, 4.3f, 4.9f)
                lineToRelative(89.2f, 57.3f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, false, 6.5f, 2.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 5.8f, -1.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 6.2f, -10.6f)
                lineTo(232.0f, 70.7f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 225.8f, 60.1f)
                close()
                moveTo(112.0f, 185.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, 3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.1f, -0.2f)
                lineTo(16.6f, 131.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, -6.8f)
                lineToRelative(89.2f, -57.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.2f, -0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.9f, 0.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.1f, 3.6f)
                close()
                moveTo(224.0f, 185.3f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, -2.1f, 3.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.1f, -0.2f)
                lineToRelative(-89.2f, -57.3f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, -6.8f)
                lineToRelative(89.2f, -57.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.2f, -0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.9f, 0.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.1f, 3.6f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
