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

public val LightGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                lineTo(128.0f, 134.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, -6.0f)
                lineTo(122.0f, 72.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(50.0f)
                close()
                moveTo(194.5f, 61.5f)
                arcTo(94.2f, 94.2f, 0.0f, true, true, 128.0f, 34.0f)
                arcTo(93.7f, 93.7f, 0.0f, false, true, 194.5f, 61.5f)
                close()
                moveTo(210.0f, 128.0f)
                arcToRelative(81.9f, 81.9f, 0.0f, true, false, -24.0f, 58.0f)
                arcTo(81.5f, 81.5f, 0.0f, false, false, 210.0f, 128.0f)
                close()
                moveTo(234.1f, 55.9f)
                lineTo(200.1f, 21.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 8.5f)
                lineToRelative(34.0f, 34.0f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 8.5f, 0.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 234.1f, 55.9f)
                close()
                moveTo(64.4f, 21.9f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -8.5f, 0.0f)
                lineToRelative(-34.0f, 34.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 0.0f, 8.5f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, 8.5f, 0.0f)
                lineToRelative(34.0f, -34.0f)
                arcTo(6.1f, 6.1f, 0.0f, false, false, 64.4f, 21.9f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
