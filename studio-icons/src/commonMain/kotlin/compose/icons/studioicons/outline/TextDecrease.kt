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

public val OutlineGroup.TextDecrease: ImageVector
    get() {
        if (_textDecrease != null) {
            return _textDecrease!!
        }
        _textDecrease = Builder(name = "TextDecrease", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.99f, 19.0f)
                horizontalLineToRelative(2.42f)
                lineToRelative(1.27f, -3.58f)
                horizontalLineToRelative(5.65f)
                lineTo(11.59f, 19.0f)
                horizontalLineToRelative(2.42f)
                lineTo(8.75f, 5.0f)
                horizontalLineToRelative(-2.5f)
                lineTo(0.99f, 19.0f)
                close()
                moveTo(5.41f, 13.39f)
                lineTo(7.44f, 7.6f)
                horizontalLineToRelative(0.12f)
                lineToRelative(2.03f, 5.79f)
                horizontalLineTo(5.41f)
                close()
                moveTo(23.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _textDecrease!!
    }

private var _textDecrease: ImageVector? = null
