package compose.icons.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.RegularGroup

public val RegularGroup.Infinity: ImageVector
    get() {
        if (_infinity != null) {
            return _infinity!!
        }
        _infinity = Builder(name = "Infinity", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(248.0f, 128.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -95.6f, 39.6f)
                lineToRelative(-0.3f, -0.4f)
                lineToRelative(-60.0f, -67.6f)
                arcTo(39.5f, 39.5f, 0.0f, false, false, 64.0f, 88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, 80.0f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, false, 28.1f, -11.6f)
                lineToRelative(8.5f, -9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 12.0f, 10.6f)
                lineToRelative(-8.7f, 9.8f)
                lineToRelative(-0.3f, 0.4f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, true, -79.2f, 0.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 64.0f, 72.0f)
                arcToRelative(55.5f, 55.5f, 0.0f, false, true, 39.6f, 16.4f)
                lineToRelative(0.3f, 0.4f)
                lineToRelative(60.0f, 67.6f)
                arcTo(39.5f, 39.5f, 0.0f, false, false, 192.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                arcToRelative(39.5f, 39.5f, 0.0f, false, false, -28.1f, 11.6f)
                lineToRelative(-8.5f, 9.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -12.0f, -10.6f)
                lineToRelative(8.7f, -9.8f)
                lineToRelative(0.3f, -0.4f)
                arcTo(56.0f, 56.0f, 0.0f, false, true, 248.0f, 128.0f)
                close()
            }
        }
        .build()
        return _infinity!!
    }

private var _infinity: ImageVector? = null
