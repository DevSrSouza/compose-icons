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

public val BoldGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.6f, 53.1f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, false, -20.4f, 0.7f)
                lineTo(132.0f, 103.4f)
                lineTo(132.0f, 70.7f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -30.8f, -16.9f)
                lineTo(12.0f, 111.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 0.0f, 33.6f)
                lineToRelative(89.2f, 57.4f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.8f, 3.1f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 9.6f, -2.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 132.0f, 185.3f)
                lineTo(132.0f, 152.6f)
                lineToRelative(77.2f, 49.6f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, 10.8f, 3.1f)
                arcToRelative(20.4f, 20.4f, 0.0f, false, false, 9.6f, -2.4f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 240.0f, 185.3f)
                lineTo(240.0f, 70.7f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 229.6f, 53.1f)
                close()
                moveTo(108.0f, 178.0f)
                lineTo(30.2f, 128.0f)
                lineTo(108.0f, 78.0f)
                close()
                moveTo(216.0f, 178.0f)
                lineTo(138.2f, 128.0f)
                lineTo(216.0f, 78.0f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
