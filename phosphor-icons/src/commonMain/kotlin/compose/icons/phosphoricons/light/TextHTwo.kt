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

public val LightGroup.TextHTwo: ImageVector
    get() {
        if (_textHTwo != null) {
            return _textHTwo!!
        }
        _textHTwo = Builder(name = "TextHTwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(240.0f, 194.0f)
                lineTo(204.0f, 194.0f)
                lineToRelative(36.7f, -49.0f)
                lineToRelative(0.2f, -0.2f)
                arcTo(30.4f, 30.4f, 0.0f, false, false, 246.0f, 128.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, false, -57.6f, -11.7f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, 4.7f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, true, 34.6f, 7.0f)
                arcToRelative(17.2f, 17.2f, 0.0f, false, true, -3.0f, 9.9f)
                lineToRelative(-43.7f, 58.4f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 186.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 4.1f, 5.7f)
                arcToRelative(6.3f, 6.3f, 0.0f, false, false, 1.9f, 0.3f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
            }
        }
        .build()
        return _textHTwo!!
    }

private var _textHTwo: ImageVector? = null
