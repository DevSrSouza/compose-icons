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

public val BoldGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.8f, 113.9f)
                lineTo(142.1f, 17.2f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, -28.2f, 0.0f)
                lineTo(17.2f, 113.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, 28.2f)
                lineToRelative(96.7f, 96.7f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 28.2f, 0.0f)
                lineToRelative(96.7f, -96.7f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, false, 0.0f, -28.2f)
                close()
                moveTo(128.0f, 219.0f)
                lineTo(37.0f, 128.0f)
                lineToRelative(91.0f, -91.0f)
                lineToRelative(91.0f, 91.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null
