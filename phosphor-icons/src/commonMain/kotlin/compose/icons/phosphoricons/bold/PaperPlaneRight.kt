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

public val BoldGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.4f, 110.5f)
                lineTo(56.5f, 16.0f)
                arcTo(19.9f, 19.9f, 0.0f, false, false, 27.9f, 40.1f)
                lineTo(59.3f, 128.0f)
                lineTo(27.9f, 215.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 5.9f, 22.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 12.9f, 4.7f)
                arcToRelative(19.5f, 19.5f, 0.0f, false, false, 9.8f, -2.6f)
                lineToRelative(168.9f, -94.5f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, 0.0f, -35.0f)
                close()
                moveTo(54.1f, 213.9f)
                lineTo(80.5f, 140.0f)
                horizontalLineTo(136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(80.5f)
                lineTo(54.1f, 42.1f)
                lineTo(207.4f, 128.0f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
