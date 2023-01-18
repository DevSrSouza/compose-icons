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

public val DuotoneGroup.TextHSix: ImageVector
    get() {
        if (_textHSix != null) {
            return _textHSix!!
        }
        _textHSix = Builder(name = "TextHSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(252.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, -67.4f, -17.5f)
                lineToRelative(0.3f, -0.6f)
                lineToRelative(32.2f, -54.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.8f, 8.2f)
                lineTo(214.2f, 132.0f)
                lineTo(216.0f, 132.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 252.0f, 168.0f)
                close()
                moveTo(236.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, 20.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, false, 236.0f, 168.0f)
                close()
            }
        }
        .build()
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
