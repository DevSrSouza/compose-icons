package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Timer10Select: ImageVector
    get() {
        if (_timer10Select != null) {
            return _timer10Select!!
        }
        _timer10Select = Builder(name = "Timer10Select", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 8.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(13.0f)
                moveTo(13.0f, 5.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(8.34f, 5.0f, 7.0f, 6.34f, 7.0f, 8.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineTo(8.0f)
                curveTo(16.0f, 6.34f, 14.66f, 5.0f, 13.0f, 5.0f)
                close()
                moveTo(2.5f, 8.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(9.5f)
                curveTo(3.0f, 18.33f, 3.67f, 19.0f, 4.5f, 19.0f)
                horizontalLineToRelative(0.0f)
                curveTo(5.33f, 19.0f, 6.0f, 18.33f, 6.0f, 17.5f)
                verticalLineTo(7.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(2.5f)
                curveTo(1.67f, 5.0f, 1.0f, 5.67f, 1.0f, 6.5f)
                verticalLineToRelative(0.0f)
                curveTo(1.0f, 7.33f, 1.67f, 8.0f, 2.5f, 8.0f)
                close()
                moveTo(18.5f, 11.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, 0.68f, -1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineTo(19.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(3.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(18.5f)
                close()
            }
        }
        .build()
        return _timer10Select!!
    }

private var _timer10Select: ImageVector? = null
