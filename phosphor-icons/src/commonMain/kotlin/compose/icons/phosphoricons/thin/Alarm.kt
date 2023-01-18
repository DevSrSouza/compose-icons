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

public val ThinGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(188.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(128.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(124.0f, 72.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 188.0f, 128.0f)
                close()
                moveTo(193.1f, 62.9f)
                arcTo(92.2f, 92.2f, 0.0f, true, true, 128.0f, 36.0f)
                arcTo(91.8f, 91.8f, 0.0f, false, true, 193.1f, 62.9f)
                close()
                moveTo(212.0f, 128.0f)
                arcTo(84.0f, 84.0f, 0.0f, false, false, 68.6f, 68.6f)
                horizontalLineToRelative(0.0f)
                arcTo(84.0f, 84.0f, 0.0f, true, false, 212.0f, 128.0f)
                close()
                moveTo(232.7f, 57.3f)
                lineTo(198.7f, 23.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.7f)
                lineTo(227.0f, 62.9f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.8f, 1.2f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, -1.2f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.7f, 57.3f)
                close()
                moveTo(62.9f, 23.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-34.0f, 34.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 5.6f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 2.9f, 1.2f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 29.0f, 62.9f)
                lineTo(62.9f, 29.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 62.9f, 23.3f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
