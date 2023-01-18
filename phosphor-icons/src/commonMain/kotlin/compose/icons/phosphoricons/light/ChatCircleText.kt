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

public val LightGroup.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) {
            return _chatCircleText!!
        }
        _chatCircleText = Builder(name = "ChatCircleText", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 39.0f, 177.8f)
                lineToRelative(-8.8f, 30.7f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 17.3f, 17.3f)
                lineTo(78.2f, 217.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.9f, -12.6f)
                arcToRelative(6.8f, 6.8f, 0.0f, false, false, -3.1f, -0.8f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -1.6f, 0.2f)
                lineToRelative(-33.2f, 9.5f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.5f, -2.5f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.6f, -4.7f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 128.0f, 218.0f)
                close()
                moveTo(166.0f, 112.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 118.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 112.0f)
                close()
                moveTo(166.0f, 144.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(96.0f, 150.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(64.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 166.0f, 144.0f)
                close()
            }
        }
        .build()
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
