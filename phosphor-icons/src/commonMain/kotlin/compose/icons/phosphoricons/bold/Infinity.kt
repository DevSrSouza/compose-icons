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

public val BoldGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 128.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -102.4f, 42.4f)
                lineToRelative(-0.5f, -0.5f)
                lineTo(89.2f, 102.3f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, 51.4f)
                lineToRelative(3.1f, -3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 18.0f, 15.9f)
                lineToRelative(-3.4f, 3.8f)
                lineToRelative(-0.5f, 0.5f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, true, -84.8f, 0.0f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 64.0f, 68.0f)
                arcToRelative(59.3f, 59.3f, 0.0f, false, true, 42.4f, 17.6f)
                lineToRelative(0.5f, 0.5f)
                lineToRelative(59.9f, 67.6f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 0.0f, -51.4f)
                lineToRelative(-3.1f, 3.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -18.0f, -15.9f)
                lineToRelative(3.4f, -3.8f)
                lineToRelative(0.5f, -0.5f)
                arcTo(60.0f, 60.0f, 0.0f, false, true, 252.0f, 128.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
