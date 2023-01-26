package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.Timer3Select: ImageVector
    get() {
        if (_timer3Select != null) {
            return _timer3Select!!
        }
        _timer3Select = Builder(name = "Timer3Select", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 11.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.82f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.82f, 0.68f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(21.0f)
                close()
                moveTo(4.0f, 5.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(6.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f)
                curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(4.0f)
                close()
            }
        }
        .build()
        return _timer3Select!!
    }

private var _timer3Select: ImageVector? = null
