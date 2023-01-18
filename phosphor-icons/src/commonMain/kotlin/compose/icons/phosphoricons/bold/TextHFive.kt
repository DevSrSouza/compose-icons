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

public val BoldGroup.TextHFive: ImageVector
    get() {
        if (_textHFive != null) {
            return _textHFive!!
        }
        _textHFive = Builder(name = "TextHFive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(211.9f, 136.0f)
                lineTo(207.4f, 136.2f)
                lineTo(210.0f, 120.0f)
                horizontalLineToRelative(30.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(199.8f, 96.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 188.0f, 106.1f)
                lineToRelative(-7.8f, 48.2f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 20.3f, 10.4f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, 22.8f, 0.0f)
                arcToRelative(15.9f, 15.9f, 0.0f, false, true, 0.0f, 22.6f)
                arcToRelative(16.2f, 16.2f, 0.0f, false, true, -22.8f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -17.0f, 17.0f)
                arcTo(40.3f, 40.3f, 0.0f, false, false, 211.9f, 216.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, 0.0f, -80.0f)
                close()
            }
        }
        .build()
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
