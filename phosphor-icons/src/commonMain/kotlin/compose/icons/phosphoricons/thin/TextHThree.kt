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

public val ThinGroup.TextHThree: ImageVector
    get() {
        if (_textHThree != null) {
            return _textHThree!!
        }
        _textHThree = Builder(name = "TextHThree", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
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
                moveTo(234.6f, 153.4f)
                arcToRelative(30.7f, 30.7f, 0.0f, false, false, -15.5f, -8.6f)
                lineToRelative(24.2f, -34.5f)
                arcToRelative(4.2f, 4.2f, 0.0f, false, false, 0.2f, -4.2f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 240.0f, 104.0f)
                lineTo(192.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(40.3f)
                lineToRelative(-23.6f, 33.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.2f, 4.1f)
                arcTo(3.7f, 3.7f, 0.0f, false, false, 212.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, -17.0f, 41.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.6f, 5.6f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 45.2f, -45.2f)
                close()
            }
        }
        .build()
        return _textHThree!!
    }

private var _textHThree: ImageVector? = null
