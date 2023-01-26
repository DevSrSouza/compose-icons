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

public val OutlineGroup.SwapHoriz: ImageVector
    get() {
        if (_swapHoriz != null) {
            return _swapHoriz!!
        }
        _swapHoriz = Builder(name = "SwapHoriz", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.99f, 11.0f)
                lineTo(3.0f, 15.0f)
                lineToRelative(3.99f, 4.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(6.99f)
                verticalLineToRelative(-3.0f)
                close()
                moveTo(21.0f, 9.0f)
                lineToRelative(-3.99f, -4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(7.01f)
                verticalLineToRelative(3.0f)
                lineTo(21.0f, 9.0f)
                close()
            }
        }
        .build()
        return _swapHoriz!!
    }

private var _swapHoriz: ImageVector? = null
