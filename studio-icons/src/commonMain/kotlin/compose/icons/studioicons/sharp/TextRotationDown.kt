package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.TextRotationDown: ImageVector
    get() {
        if (_textRotationDown != null) {
            return _textRotationDown!!
        }
        _textRotationDown = Builder(name = "TextRotationDown", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 20.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(13.0f)
                lineTo(3.0f, 17.0f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(12.2f, 8.5f)
                verticalLineToRelative(5.0f)
                lineToRelative(-2.2f, 0.9f)
                verticalLineToRelative(2.1f)
                lineToRelative(11.0f, -4.75f)
                verticalLineToRelative(-1.5f)
                lineTo(10.0f, 5.5f)
                verticalLineToRelative(2.1f)
                lineToRelative(2.2f, 0.9f)
                close()
                moveTo(19.02f, 11.0f)
                lineTo(14.0f, 12.87f)
                lineTo(14.0f, 9.13f)
                lineTo(19.02f, 11.0f)
                close()
            }
        }
        .build()
        return _textRotationDown!!
    }

private var _textRotationDown: ImageVector? = null
