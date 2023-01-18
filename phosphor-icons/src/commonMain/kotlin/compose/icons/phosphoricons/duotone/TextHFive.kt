package compose.icons.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.TextHFive: ImageVector
    get() {
        if (_textHFive != null) {
            return _textHFive!!
        }
        _textHFive = Builder(name = "TextHFive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(152.0f, 56.0f)
                lineTo(152.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(136.0f, 124.0f)
                lineTo(48.0f, 124.0f)
                verticalLineToRelative(52.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(32.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(136.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                close()
                moveTo(211.9f, 140.0f)
                arcToRelative(37.3f, 37.3f, 0.0f, false, false, -9.4f, 1.2f)
                lineToRelative(4.1f, -25.2f)
                lineTo(240.0f, 116.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(199.8f, 100.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.9f, 6.7f)
                lineToRelative(-7.8f, 48.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 13.5f, 7.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, 14.3f, -5.9f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, 14.2f, 5.9f)
                arcToRelative(19.8f, 19.8f, 0.0f, false, true, 0.0f, 28.2f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, true, -14.2f, 5.9f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -14.3f, -5.9f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -11.2f, 11.4f)
                arcTo(36.1f, 36.1f, 0.0f, true, false, 211.9f, 140.0f)
                close()
            }
        }
        .build()
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
