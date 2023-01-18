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

public val ThinGroup.Queue: ImageVector
    get() {
        if (_queue != null) {
            return _queue!!
        }
        _queue = Builder(name = "Queue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(36.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(40.0f, 68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 64.0f)
                close()
                moveTo(136.0f, 124.0f)
                lineTo(40.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(136.0f, 188.0f)
                lineTo(40.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(244.0f, 160.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -1.9f, 3.4f)
                lineToRelative(-64.0f, 40.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, -2.1f, 0.6f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -1.9f, -0.5f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 172.0f, 200.0f)
                lineTo(172.0f, 120.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 2.1f, -3.5f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, true, 4.0f, 0.1f)
                lineToRelative(64.0f, 40.0f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 244.0f, 160.0f)
                close()
                moveTo(232.5f, 160.0f)
                lineTo(180.0f, 127.2f)
                verticalLineToRelative(65.6f)
                close()
            }
        }
        .build()
        return _queue!!
    }

private var _queue: ImageVector? = null