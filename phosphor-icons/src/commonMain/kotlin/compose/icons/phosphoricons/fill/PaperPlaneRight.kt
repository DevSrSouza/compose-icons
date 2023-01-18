package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.PaperPlaneRight: ImageVector
    get() {
        if (_paperPlaneRight != null) {
            return _paperPlaneRight!!
        }
        _paperPlaneRight = Builder(name = "PaperPlaneRight", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.4f, 114.0f)
                lineTo(54.9f, 19.7f)
                arcToRelative(16.3f, 16.3f, 0.0f, false, false, -18.2f, 1.2f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, false, -5.1f, 17.9f)
                lineToRelative(28.1f, 78.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.8f, 2.7f)
                horizontalLineToRelative(72.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, 8.3f, 7.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.5f)
                horizontalLineTo(63.5f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.8f, 2.7f)
                lineTo(31.6f, 217.2f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 15.1f, 21.4f)
                arcToRelative(16.5f, 16.5f, 0.0f, false, false, 7.8f, -2.0f)
                lineTo(223.4f, 142.0f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 0.0f, -28.0f)
                close()
            }
        }
        .build()
        return _paperPlaneRight!!
    }

private var _paperPlaneRight: ImageVector? = null
