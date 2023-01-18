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

public val ThinGroup.TextHFive: ImageVector
    get() {
        if (_textHFive != null) {
            return _textHFive!!
        }
        _textHFive = Builder(name = "TextHFive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
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
                moveTo(211.9f, 144.0f)
                arcToRelative(32.1f, 32.1f, 0.0f, false, false, -14.4f, 3.4f)
                lineToRelative(5.7f, -35.4f)
                lineTo(240.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(199.8f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.9f, 3.4f)
                lineToRelative(-7.8f, 48.2f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, 2.1f, 4.2f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 4.6f, -0.8f)
                arcToRelative(24.3f, 24.3f, 0.0f, false, true, 34.1f, 0.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -17.0f, 41.0f)
                arcToRelative(24.2f, 24.2f, 0.0f, false, true, -17.1f, -7.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                arcTo(32.0f, 32.0f, 0.0f, true, false, 211.9f, 144.0f)
                close()
            }
        }
        .build()
        return _textHFive!!
    }

private var _textHFive: ImageVector? = null
