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

public val ThinGroup.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) {
            return _chatCircleText!!
        }
        _chatCircleText = Builder(name = "ChatCircleText", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 28.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 41.1f, 177.5f)
                lineToRelative(-9.0f, 31.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.8f, 14.8f)
                lineToRelative(31.6f, -9.0f)
                arcTo(100.0f, 100.0f, 0.0f, true, false, 128.0f, 28.0f)
                close()
                moveTo(128.0f, 220.0f)
                arcToRelative(91.3f, 91.3f, 0.0f, false, true, -47.0f, -12.9f)
                arcToRelative(4.6f, 4.6f, 0.0f, false, false, -2.0f, -0.5f)
                lineTo(77.9f, 206.6f)
                lineToRelative(-33.2f, 9.5f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.9f, -4.9f)
                lineToRelative(9.5f, -33.2f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -0.4f, -3.1f)
                arcTo(92.0f, 92.0f, 0.0f, true, true, 128.0f, 220.0f)
                close()
                moveTo(164.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 112.0f)
                close()
                moveTo(164.0f, 144.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 148.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 144.0f)
                close()
            }
        }
        .build()
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null
