package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.TextRotateUp: ImageVector
    get() {
        if (_textRotateUp != null) {
            return _textRotateUp!!
        }
        _textRotateUp = Builder(name = "TextRotateUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 4.0f)
                lineToRelative(-3.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(13.0f)
                horizontalLineToRelative(2.0f)
                lineTo(19.0f, 7.0f)
                horizontalLineToRelative(2.0f)
                lineToRelative(-3.0f, -3.0f)
                close()
                moveTo(11.8f, 15.5f)
                verticalLineToRelative(-5.0f)
                lineToRelative(2.2f, -0.9f)
                lineTo(14.0f, 7.5f)
                lineTo(3.0f, 12.25f)
                verticalLineToRelative(1.5f)
                lineToRelative(11.0f, 4.75f)
                verticalLineToRelative(-2.1f)
                lineToRelative(-2.2f, -0.9f)
                close()
                moveTo(4.98f, 13.0f)
                lineTo(10.0f, 11.13f)
                verticalLineToRelative(3.74f)
                lineTo(4.98f, 13.0f)
                close()
            }
        }
        .build()
        return _textRotateUp!!
    }

private var _textRotateUp: ImageVector? = null
