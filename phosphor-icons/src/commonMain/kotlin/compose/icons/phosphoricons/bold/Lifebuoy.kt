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

public val BoldGroup.Lifebuoy: ImageVector
    get() {
        if (_lifebuoy != null) {
            return _lifebuoy!!
        }
        _lifebuoy = Builder(name = "Lifebuoy", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(205.2f, 203.4f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 0.0f, -150.8f)
                lineToRelative(-0.8f, -1.0f)
                lineToRelative(-1.0f, -0.8f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, -150.8f, 0.0f)
                lineToRelative(-1.0f, 0.8f)
                lineToRelative(-0.8f, 1.0f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 0.0f, 150.8f)
                lineToRelative(0.8f, 1.0f)
                lineToRelative(1.0f, 0.8f)
                arcToRelative(107.7f, 107.7f, 0.0f, false, false, 150.8f, 0.0f)
                lineToRelative(1.0f, -0.8f)
                close()
                moveTo(195.2f, 178.3f)
                lineTo(172.2f, 155.3f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, 0.0f, -54.6f)
                lineToRelative(23.0f, -23.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 0.0f, 100.6f)
                close()
                moveTo(100.0f, 128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, 28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 100.0f, 128.0f)
                close()
                moveTo(178.3f, 60.8f)
                lineTo(155.3f, 83.8f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, -54.6f, 0.0f)
                lineToRelative(-23.0f, -23.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 100.6f, 0.0f)
                close()
                moveTo(60.8f, 77.7f)
                lineToRelative(23.0f, 23.0f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, 0.0f, 54.6f)
                lineToRelative(-23.0f, 23.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, 0.0f, -100.6f)
                close()
                moveTo(77.7f, 195.2f)
                lineToRelative(23.0f, -23.0f)
                arcToRelative(51.7f, 51.7f, 0.0f, false, false, 54.6f, 0.0f)
                lineToRelative(23.0f, 23.0f)
                arcToRelative(83.7f, 83.7f, 0.0f, false, true, -100.6f, 0.0f)
                close()
            }
        }
        .build()
        return _lifebuoy!!
    }

private var _lifebuoy: ImageVector? = null
