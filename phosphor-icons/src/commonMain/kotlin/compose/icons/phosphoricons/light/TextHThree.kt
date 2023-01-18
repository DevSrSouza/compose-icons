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

public val LightGroup.TextHThree: ImageVector
    get() {
        if (_textHThree != null) {
            return _textHThree!!
        }
        _textHThree = Builder(name = "TextHThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(236.0f, 152.0f)
                arcToRelative(32.8f, 32.8f, 0.0f, false, false, -13.6f, -8.4f)
                lineToRelative(22.5f, -32.2f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, 0.4f, -6.2f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 240.0f, 102.0f)
                lineTo(192.0f, 102.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(36.5f)
                lineToRelative(-21.4f, 30.6f)
                arcToRelative(5.8f, 5.8f, 0.0f, false, false, -0.4f, 6.2f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 212.0f, 154.0f)
                arcToRelative(22.0f, 22.0f, 0.0f, true, true, -15.6f, 37.6f)
                arcTo(5.9f, 5.9f, 0.0f, false, false, 188.0f, 200.0f)
                arcToRelative(33.9f, 33.9f, 0.0f, true, false, 48.0f, -48.0f)
                close()
            }
        }
        .build()
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
