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

public val OutlineGroup.TextRotationNone: ImageVector
    get() {
        if (_textRotationNone != null) {
            return _textRotationNone!!
        }
        _textRotationNone = Builder(name = "TextRotationNone", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 18.0f)
                lineToRelative(-3.0f, -3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(13.0f)
                verticalLineToRelative(2.0f)
                lineToRelative(3.0f, -3.0f)
                close()
                moveTo(9.5f, 11.8f)
                horizontalLineToRelative(5.0f)
                lineToRelative(0.9f, 2.2f)
                horizontalLineToRelative(2.1f)
                lineTo(12.75f, 3.0f)
                horizontalLineToRelative(-1.5f)
                lineTo(6.5f, 14.0f)
                horizontalLineToRelative(2.1f)
                lineToRelative(0.9f, -2.2f)
                close()
                moveTo(12.0f, 4.98f)
                lineTo(13.87f, 10.0f)
                horizontalLineToRelative(-3.74f)
                lineTo(12.0f, 4.98f)
                close()
            }
        }
        .build()
        return _textRotationNone!!
    }

private var _textRotationNone: ImageVector? = null
