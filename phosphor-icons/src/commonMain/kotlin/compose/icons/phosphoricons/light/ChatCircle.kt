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

public val LightGroup.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) {
            return _chatCircle!!
        }
        _chatCircle = Builder(name = "ChatCircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 230.0f)
                arcToRelative(101.9f, 101.9f, 0.0f, false, true, -49.8f, -13.0f)
                lineToRelative(-30.7f, 8.8f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, true, -17.3f, -17.3f)
                lineTo(39.0f, 177.8f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 128.0f, 230.0f)
                close()
                moveTo(79.0f, 204.6f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, true, 3.1f, 0.8f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, -31.5f, -31.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.6f, 4.7f)
                lineToRelative(-9.5f, 33.2f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 2.5f, 2.5f)
                lineToRelative(33.2f, -9.5f)
                arcTo(4.1f, 4.1f, 0.0f, false, true, 79.0f, 204.6f)
                close()
            }
        }
        .build()
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null
