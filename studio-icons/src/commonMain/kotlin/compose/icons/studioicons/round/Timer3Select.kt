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

public val RoundGroup.Timer3Select: ImageVector
    get() {
        if (_timer3Select != null) {
            return _timer3Select!!
        }
        _timer3Select = Builder(name = "Timer3Select", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(1.0f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0.0f, 1.5f, 0.68f, 1.5f, 1.5f)
                verticalLineToRelative(2.0f)
                curveToRelative(0.0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineTo(16.0f)
                curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-0.82f, 0.0f, -1.5f, -0.68f, -1.5f, -1.5f)
                verticalLineToRelative(-2.0f)
                curveToRelative(0.0f, -0.82f, 0.68f, -1.5f, 1.5f, -1.5f)
                horizontalLineTo(20.0f)
                curveTo(20.55f, 11.0f, 21.0f, 11.45f, 21.0f, 12.0f)
                close()
                moveTo(4.0f, 6.5f)
                lineTo(4.0f, 6.5f)
                curveTo(4.0f, 7.33f, 4.67f, 8.0f, 5.5f, 8.0f)
                horizontalLineTo(10.0f)
                verticalLineToRelative(2.5f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 10.5f, 4.0f, 11.17f, 4.0f, 12.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 16.0f, 4.0f, 16.67f, 4.0f, 17.5f)
                verticalLineToRelative(0.0f)
                curveTo(4.0f, 18.33f, 4.67f, 19.0f, 5.5f, 19.0f)
                horizontalLineTo(10.0f)
                curveToRelative(1.66f, 0.0f, 3.0f, -1.34f, 3.0f, -3.0f)
                verticalLineToRelative(-1.9f)
                curveToRelative(0.0f, -1.16f, -0.94f, -2.1f, -2.1f, -2.1f)
                curveToRelative(1.16f, 0.0f, 2.1f, -0.94f, 2.1f, -2.1f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f)
                horizontalLineTo(5.5f)
                curveTo(4.67f, 5.0f, 4.0f, 5.67f, 4.0f, 6.5f)
                close()
            }
        }
        .build()
        return _timer3Select!!
    }

private var _timer3Select: ImageVector? = null
