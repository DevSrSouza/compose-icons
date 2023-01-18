package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Chat: ImageVector
    get() {
        if (_chat != null) {
            return _chat!!
        }
        _chat = Builder(name = "Chat", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(40.0f, 236.8f)
                arcToRelative(13.7f, 13.7f, 0.0f, false, true, -5.9f, -1.3f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 26.0f, 222.8f)
                verticalLineTo(64.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 40.0f, 50.0f)
                horizontalLineTo(216.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, 14.0f, 14.0f)
                verticalLineTo(192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, true, -14.0f, 14.0f)
                horizontalLineTo(82.5f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, -1.3f, 0.5f)
                horizontalLineToRelative(0.0f)
                lineTo(49.0f, 233.5f)
                arcTo(13.9f, 13.9f, 0.0f, false, true, 40.0f, 236.8f)
                close()
                moveTo(40.0f, 62.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                verticalLineTo(222.8f)
                arcToRelative(2.1f, 2.1f, 0.0f, false, false, 3.3f, 1.6f)
                lineToRelative(32.2f, -27.1f)
                horizontalLineToRelative(0.0f)
                arcToRelative(14.1f, 14.1f, 0.0f, false, true, 9.0f, -3.3f)
                horizontalLineTo(216.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.0f, -2.0f)
                verticalLineTo(64.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                close()
                moveTo(77.4f, 201.9f)
                close()
            }
        }
        .build()
        return _chat!!
    }

private var _chat: ImageVector? = null
