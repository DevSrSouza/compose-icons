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

public val BoldGroup.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 148.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 128.0f, 148.0f)
                close()
                moveTo(85.6f, 170.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, -3.5f)
                arcToRelative(83.9f, 83.9f, 0.0f, false, true, 0.0f, -118.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, false, 0.0f, 84.8f)
                close()
                moveTo(205.4f, 160.7f)
                arcToRelative(83.3f, 83.3f, 0.0f, false, true, -18.0f, 26.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.5f, 3.5f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, true, -8.5f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                arcToRelative(59.7f, 59.7f, 0.0f, false, false, 0.0f, -84.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcToRelative(84.1f, 84.1f, 0.0f, false, true, 18.0f, 92.1f)
                close()
                moveTo(57.3f, 198.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 17.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(124.1f, 124.1f, 0.0f, false, true, 0.0f, -175.4f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, 17.0f)
                arcTo(99.0f, 99.0f, 0.0f, false, false, 35.9f, 89.1f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 0.0f, 77.8f)
                arcTo(99.0f, 99.0f, 0.0f, false, false, 57.3f, 198.7f)
                close()
                moveTo(252.0f, 128.0f)
                arcToRelative(124.2f, 124.2f, 0.0f, false, true, -36.3f, 87.7f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, true, -17.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -17.0f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, false, 21.4f, -31.8f)
                arcToRelative(99.7f, 99.7f, 0.0f, false, false, 0.0f, -77.8f)
                arcToRelative(99.0f, 99.0f, 0.0f, false, false, -21.4f, -31.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 17.0f, -17.0f)
                arcTo(124.2f, 124.2f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null
