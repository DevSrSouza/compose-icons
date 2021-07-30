package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Rtlzwei: ImageVector
    get() {
        if (_rtlzwei != null) {
            return _rtlzwei!!
        }
        _rtlzwei = Builder(name = "Rtlzwei", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(7.38f)
                verticalLineToRelative(-3.69f)
                lineTo(3.692f, 20.31f)
                lineTo(3.69f, 3.69f)
                horizontalLineToRelative(9.229f)
                lineTo(12.919f, 0.0f)
                lineTo(0.0f, 0.0f)
                close()
                moveTo(16.61f, 0.0f)
                verticalLineToRelative(3.69f)
                horizontalLineToRelative(3.7f)
                verticalLineToRelative(16.62f)
                horizontalLineToRelative(-9.238f)
                lineTo(11.072f, 24.0f)
                lineTo(24.0f, 24.0f)
                lineTo(24.0f, 0.0f)
                horizontalLineToRelative(-7.39f)
                close()
                moveTo(16.607f, 6.49f)
                lineToRelative(-3.689f, 0.717f)
                verticalLineToRelative(9.227f)
                lineToRelative(3.69f, -0.715f)
                lineTo(16.608f, 6.49f)
                close()
                moveTo(11.072f, 7.566f)
                lineToRelative(-3.69f, 0.715f)
                verticalLineToRelative(9.229f)
                lineToRelative(3.69f, -0.717f)
                lineTo(11.072f, 7.566f)
                close()
            }
        }
        .build()
        return _rtlzwei!!
    }

private var _rtlzwei: ImageVector? = null
