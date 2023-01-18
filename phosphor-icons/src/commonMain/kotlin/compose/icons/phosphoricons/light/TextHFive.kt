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

public val LightGroup.TextHFive: ImageVector
    get() {
        if (_textHFive != null) {
            return _textHFive!!
        }
        _textHFive = Builder(name = "TextHFive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(150.0f, 56.0f)
                lineTo(150.0f, 176.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(138.0f, 122.0f)
                lineTo(46.0f, 122.0f)
                verticalLineToRelative(54.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(34.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(54.0f)
                horizontalLineToRelative(92.0f)
                lineTo(138.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                close()
                moveTo(211.9f, 142.0f)
                arcToRelative(34.3f, 34.3f, 0.0f, false, false, -11.9f, 2.1f)
                lineToRelative(4.9f, -30.1f)
                lineTo(240.0f, 114.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(199.8f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.9f, 5.0f)
                lineToRelative(-7.8f, 48.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 3.2f, 6.3f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 6.9f, -1.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, 15.7f, -6.5f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, true, 15.6f, 6.5f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, true, 0.0f, 31.0f)
                arcToRelative(21.7f, 21.7f, 0.0f, false, true, -15.6f, 6.5f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -15.7f, -6.5f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -8.5f, 0.1f)
                arcToRelative(5.9f, 5.9f, 0.0f, false, false, 0.1f, 8.4f)
                arcToRelative(34.2f, 34.2f, 0.0f, false, false, 48.2f, 0.1f)
                arcTo(34.1f, 34.1f, 0.0f, false, false, 246.0f, 176.0f)
                arcToRelative(34.1f, 34.1f, 0.0f, false, false, -34.1f, -34.0f)
                close()
            }
        }
        .build()
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
