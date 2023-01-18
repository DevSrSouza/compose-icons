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

public val FillGroup.Users: ImageVector
    get() {
        if (_users != null) {
            return _users!!
        }
        _users = Builder(name = "Users", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(166.5f, 192.8f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.6f, 8.3f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.1f, 4.3f)
                lineTo(16.0f, 205.4f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, true, -7.1f, -4.3f)
                arcToRelative(7.8f, 7.8f, 0.0f, false, true, 0.6f, -8.3f)
                arcToRelative(95.5f, 95.5f, 0.0f, false, true, 45.3f, -34.9f)
                arcToRelative(60.0f, 60.0f, 0.0f, true, true, 66.4f, 0.0f)
                arcTo(95.5f, 95.5f, 0.0f, false, true, 166.5f, 192.8f)
                close()
                moveTo(248.1f, 192.8f)
                arcToRelative(96.3f, 96.3f, 0.0f, false, false, -45.4f, -34.9f)
                arcTo(59.9f, 59.9f, 0.0f, false, false, 169.5f, 48.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, false, false, -16.3f, 2.2f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, false, -5.4f, 5.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.2f, 7.3f)
                arcToRelative(75.8f, 75.8f, 0.0f, false, true, 3.8f, 84.9f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 2.1f, 10.6f)
                quadToRelative(4.5f, 3.5f, 8.7f, 7.2f)
                lineToRelative(0.5f, 0.5f)
                arcToRelative(112.6f, 112.6f, 0.0f, false, true, 25.5f, 34.9f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, false, 7.2f, 4.6f)
                horizontalLineToRelative(44.7f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, 7.1f, -4.3f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 248.1f, 192.8f)
                close()
            }
        }
        .build()
        return _users!!
    }

private var _users: ImageVector? = null
