package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.Alarm: ImageVector
    get() {
        if (_alarm != null) {
            return _alarm!!
        }
        _alarm = Builder(name = "Alarm", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 116.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(128.0f, 140.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                close()
                moveTo(198.7f, 57.3f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 57.3f, 198.7f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 198.7f, 57.3f)
                close()
                moveTo(204.0f, 128.0f)
                arcTo(75.9f, 75.9f, 0.0f, false, false, 74.3f, 74.3f)
                arcTo(75.9f, 75.9f, 0.0f, true, false, 181.7f, 181.7f)
                arcTo(75.2f, 75.2f, 0.0f, false, false, 204.0f, 128.0f)
                close()
                moveTo(244.0f, 46.0f)
                lineTo(210.0f, 12.0f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -16.9f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 17.0f)
                lineTo(227.0f, 62.9f)
                arcToRelative(11.7f, 11.7f, 0.0f, false, false, 8.5f, 3.6f)
                arcTo(12.1f, 12.1f, 0.0f, false, false, 244.0f, 46.0f)
                close()
                moveTo(62.9f, 29.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -17.0f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 46.0f, 12.0f)
                lineTo(12.0f, 46.0f)
                arcToRelative(12.1f, 12.1f, 0.0f, false, false, 8.5f, 20.5f)
                arcTo(11.7f, 11.7f, 0.0f, false, false, 29.0f, 62.9f)
                close()
            }
        }
        .build()
        return _alarm!!
    }

private var _alarm: ImageVector? = null
