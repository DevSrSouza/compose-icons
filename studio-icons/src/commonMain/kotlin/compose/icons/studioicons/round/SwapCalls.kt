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

public val RoundGroup.SwapCalls: ImageVector
    get() {
        if (_swapCalls != null) {
            return _swapCalls!!
        }
        _swapCalls = Builder(name = "SwapCalls", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.65f, 4.35f)
                lineToRelative(-2.79f, 2.79f)
                curveToRelative(-0.32f, 0.32f, -0.1f, 0.86f, 0.35f, 0.86f)
                horizontalLineTo(17.0f)
                verticalLineToRelative(6.88f)
                curveToRelative(0.0f, 1.0f, -0.67f, 1.93f, -1.66f, 2.09f)
                curveToRelative(-1.25f, 0.21f, -2.34f, -0.76f, -2.34f, -1.97f)
                verticalLineTo(8.17f)
                curveToRelative(0.0f, -2.09f, -1.53f, -3.95f, -3.61f, -4.15f)
                curveTo(7.01f, 3.79f, 5.0f, 5.66f, 5.0f, 8.0f)
                verticalLineToRelative(7.0f)
                horizontalLineTo(3.21f)
                curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.2f, 0.2f, 0.51f, 0.2f, 0.71f, 0.0f)
                lineToRelative(2.79f, -2.79f)
                curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.36f, -0.85f)
                horizontalLineTo(7.0f)
                verticalLineTo(8.12f)
                curveToRelative(0.0f, -1.0f, 0.67f, -1.93f, 1.66f, -2.09f)
                curveTo(9.91f, 5.82f, 11.0f, 6.79f, 11.0f, 8.0f)
                verticalLineToRelative(6.83f)
                curveToRelative(0.0f, 2.09f, 1.53f, 3.95f, 3.61f, 4.15f)
                curveTo(16.99f, 19.21f, 19.0f, 17.34f, 19.0f, 15.0f)
                verticalLineTo(8.0f)
                horizontalLineToRelative(1.79f)
                curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(-0.19f, -0.2f, -0.51f, -0.2f, -0.7f, -0.01f)
                close()
            }
        }
        .build()
        return _swapCalls!!
    }

private var _swapCalls: ImageVector? = null
