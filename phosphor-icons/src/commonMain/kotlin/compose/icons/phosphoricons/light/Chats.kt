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

public val LightGroup.Chats: ImageVector
    get() {
        if (_chats != null) {
            return _chats!!
        }
        _chats = Builder(name = "Chats", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.0f, 96.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(182.0f, 82.0f)
                lineTo(182.0f, 48.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -14.0f, -14.0f)
                lineTo(40.0f, 34.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 26.0f, 48.0f)
                lineTo(26.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.4f, 5.4f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.6f, 0.6f)
                arcToRelative(6.7f, 6.7f, 0.0f, false, false, 3.8f, -1.3f)
                lineTo(73.7f, 150.0f)
                lineTo(74.0f, 150.0f)
                verticalLineToRelative(34.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(94.3f)
                lineToRelative(37.9f, 30.7f)
                arcTo(6.7f, 6.7f, 0.0f, false, false, 224.0f, 230.0f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 2.6f, -0.6f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 230.0f, 224.0f)
                close()
                moveTo(71.6f, 138.0f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -3.8f, 1.3f)
                lineTo(38.0f, 163.4f)
                lineTo(38.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, -2.0f)
                lineTo(168.0f, 46.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                close()
                moveTo(188.2f, 187.3f)
                arcToRelative(6.5f, 6.5f, 0.0f, false, false, -3.8f, -1.3f)
                lineTo(88.0f, 186.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(86.0f, 150.0f)
                horizontalLineToRelative(82.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(182.0f, 94.0f)
                horizontalLineToRelative(34.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                lineTo(218.0f, 211.4f)
                close()
            }
        }
        .build()
        return _chats!!
    }

private var _chats: ImageVector? = null
