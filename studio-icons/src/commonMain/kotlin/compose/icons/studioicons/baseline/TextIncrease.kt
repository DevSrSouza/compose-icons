package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.TextIncrease: ImageVector
    get() {
        if (_textIncrease != null) {
            return _textIncrease!!
        }
        _textIncrease = Builder(name = "TextIncrease", defaultWidth = 24.0.dp, defaultHeight =
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
                moveTo(20.0f, 11.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _textIncrease!!
    }

private var _textIncrease: ImageVector? = null
