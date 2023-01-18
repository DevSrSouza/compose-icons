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

public val BoldGroup.TextHThree: ImageVector
    get() {
        if (_textHThree != null) {
            return _textHThree!!
        }
        _textHThree = Builder(name = "TextHThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 56.0f)
                lineTo(156.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(132.0f, 128.0f)
                lineTo(52.0f, 128.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(80.0f)
                lineTo(132.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(240.3f, 147.7f)
                arcToRelative(39.7f, 39.7f, 0.0f, false, false, -8.8f, -6.6f)
                lineToRelative(18.3f, -26.2f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 96.0f)
                lineTo(192.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(25.0f)
                lineToRelative(-14.8f, 21.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 212.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -11.3f, 27.3f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 56.6f, -56.6f)
                close()
            }
        }
        .build()
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
