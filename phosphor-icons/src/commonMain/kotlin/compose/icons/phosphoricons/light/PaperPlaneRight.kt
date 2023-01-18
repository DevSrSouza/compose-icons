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

public val LightGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.5f, 115.8f)
                lineTo(53.6f, 21.2f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 33.5f, 38.1f)
                lineToRelative(31.9f, 89.2f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, true, 0.0f, 1.4f)
                lineTo(33.5f, 217.9f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 13.2f, 18.7f)
                arcToRelative(14.5f, 14.5f, 0.0f, false, false, 6.9f, -1.8f)
                lineToRelative(168.9f, -94.6f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 0.0f, -24.4f)
                close()
                moveTo(216.6f, 129.7f)
                lineTo(47.7f, 224.3f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, -2.3f, -0.2f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, -0.6f, -2.2f)
                lineTo(76.2f, 134.0f)
                lineTo(136.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(76.2f, 122.0f)
                lineTo(44.8f, 34.1f)
                arcToRelative(1.8f, 1.8f, 0.0f, false, true, 0.6f, -2.2f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 1.3f, -0.5f)
                lineToRelative(1.0f, 0.3f)
                lineToRelative(168.9f, 94.6f)
                arcToRelative(1.9f, 1.9f, 0.0f, false, true, 0.0f, 3.4f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
