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

public val RoundGroup.Numbers: ImageVector
    get() {
        if (_numbers != null) {
            return _numbers!!
        }
        _numbers = Builder(name = "Numbers", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.68f, 9.27f)
                lineToRelative(0.01f, -0.06f)
                curveTo(20.85f, 8.59f, 20.39f, 8.0f, 19.76f, 8.0f)
                horizontalLineTo(17.0f)
                lineToRelative(0.7f, -2.79f)
                curveTo(17.85f, 4.59f, 17.39f, 4.0f, 16.76f, 4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f)
                lineTo(15.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(0.7f, -2.79f)
                curveTo(11.85f, 4.59f, 11.39f, 4.0f, 10.76f, 4.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f)
                lineTo(9.0f, 8.0f)
                horizontalLineTo(5.76f)
                curveTo(5.31f, 8.0f, 4.92f, 8.3f, 4.82f, 8.73f)
                lineTo(4.8f, 8.79f)
                curveTo(4.65f, 9.41f, 5.11f, 10.0f, 5.74f, 10.0f)
                horizontalLineTo(8.5f)
                lineToRelative(-1.0f, 4.0f)
                horizontalLineTo(4.26f)
                curveToRelative(-0.45f, 0.0f, -0.83f, 0.3f, -0.94f, 0.73f)
                lineTo(3.3f, 14.79f)
                curveTo(3.15f, 15.41f, 3.61f, 16.0f, 4.24f, 16.0f)
                horizontalLineTo(7.0f)
                lineToRelative(-0.7f, 2.79f)
                curveTo(6.15f, 19.41f, 6.61f, 20.0f, 7.24f, 20.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f)
                lineTo(9.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-0.7f, 2.79f)
                curveTo(12.15f, 19.41f, 12.61f, 20.0f, 13.24f, 20.0f)
                horizontalLineToRelative(0.0f)
                curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f)
                lineTo(15.0f, 16.0f)
                horizontalLineToRelative(3.24f)
                curveToRelative(0.45f, 0.0f, 0.83f, -0.3f, 0.94f, -0.73f)
                lineToRelative(0.01f, -0.06f)
                curveToRelative(0.15f, -0.61f, -0.31f, -1.21f, -0.94f, -1.21f)
                horizontalLineTo(15.5f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(3.24f)
                curveTo(20.19f, 10.0f, 20.58f, 9.7f, 20.68f, 9.27f)
                close()
                moveTo(13.5f, 14.0f)
                horizontalLineToRelative(-4.0f)
                lineToRelative(1.0f, -4.0f)
                horizontalLineToRelative(4.0f)
                lineTo(13.5f, 14.0f)
                close()
            }
        }
        .build()
        return _numbers!!
    }

private var _numbers: ImageVector? = null
