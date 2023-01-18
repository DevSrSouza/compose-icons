package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.TextHSix: ImageVector
    get() {
        if (_textHSix != null) {
            return _textHSix!!
        }
        _textHSix = Builder(name = "TextHSix", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(148.0f, 56.0f)
                lineTo(148.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(140.0f, 120.0f)
                lineTo(44.0f, 120.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(96.0f)
                lineTo(140.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(248.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -64.0f, 0.0f)
                arcToRelative(31.1f, 31.1f, 0.0f, false, true, 4.2f, -15.8f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, 0.1f, -0.3f)
                lineToRelative(32.3f, -54.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 6.8f, 4.2f)
                lineToRelative(-21.2f, 35.4f)
                arcTo(32.1f, 32.1f, 0.0f, false, true, 248.0f, 168.0f)
                close()
                moveTo(240.0f, 168.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, false, -24.0f, 24.0f)
                arcTo(24.1f, 24.1f, 0.0f, false, false, 240.0f, 168.0f)
                close()
            }
        }
        .build()
        return _textHSix!!
    }

private var _textHSix: ImageVector? = null
