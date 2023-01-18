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

public val BoldGroup.TextHSix: ImageVector
    get() {
        if (_textHSix != null) {
            return _textHSix!!
        }
        _textHSix = Builder(name = "TextHSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(256.0f, 168.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -80.0f, 0.0f)
                arcToRelative(40.6f, 40.6f, 0.0f, false, true, 5.1f, -19.6f)
                lineToRelative(0.3f, -0.6f)
                lineToRelative(32.3f, -54.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 20.6f, 12.4f)
                lineToRelative(-13.2f, 22.1f)
                arcTo(40.1f, 40.1f, 0.0f, false, true, 256.0f, 168.0f)
                close()
                moveTo(232.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 168.0f)
                close()
            }
        }
        .build()
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
