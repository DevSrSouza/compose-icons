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

public val ThinGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(221.5f, 117.5f)
                lineTo(52.6f, 22.9f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 39.0f, 24.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -3.6f, 13.2f)
                lineToRelative(31.9f, 89.3f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 0.0f, 2.6f)
                lineTo(35.4f, 218.6f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 39.0f, 231.8f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 7.7f, 2.8f)
                arcToRelative(12.6f, 12.6f, 0.0f, false, false, 5.9f, -1.5f)
                lineToRelative(168.9f, -94.6f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 0.0f, -21.0f)
                close()
                moveTo(217.6f, 131.5f)
                lineTo(48.7f, 226.1f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -5.8f, -4.9f)
                lineTo(74.8f, 132.0f)
                lineTo(136.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(74.8f, 124.0f)
                lineTo(42.9f, 34.8f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.2f, -4.4f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, true, 2.6f, -1.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.0f, 0.5f)
                lineToRelative(168.9f, 94.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, 0.0f, 7.0f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
