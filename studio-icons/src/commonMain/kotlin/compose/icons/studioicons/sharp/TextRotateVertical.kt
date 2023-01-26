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

public val SharpGroup.TextRotateVertical: ImageVector
    get() {
        if (_textRotateVertical != null) {
            return _textRotateVertical!!
        }
        _textRotateVertical = Builder(name = "TextRotateVertical", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.75f, 5.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(9.5f, 16.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -2.2f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.9f, 2.2f)
                horizontalLineToRelative(2.1f)
                lineTo(15.75f, 5.0f)
                close()
                moveTo(13.13f, 12.0f)
                lineTo(15.0f, 6.98f)
                lineTo(16.87f, 12.0f)
                horizontalLineToRelative(-3.74f)
                close()
                moveTo(6.0f, 20.0f)
                lineToRelative(3.0f, -3.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 4.0f)
                lineTo(5.0f, 4.0f)
                verticalLineToRelative(13.0f)
                lineTo(3.0f, 17.0f)
                lineToRelative(3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _textRotateVertical!!
    }

private var _textRotateVertical: ImageVector? = null
