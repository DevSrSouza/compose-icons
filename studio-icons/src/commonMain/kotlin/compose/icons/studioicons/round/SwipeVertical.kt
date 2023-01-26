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

public val RoundGroup.SwipeVertical: ImageVector
    get() {
        if (_swipeVertical != null) {
            return _swipeVertical!!
        }
        _swipeVertical = Builder(name = "SwipeVertical", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 12.0f)
                curveToRelative(0.0f, 3.22f, 1.13f, 6.18f, 3.02f, 8.5f)
                horizontalLineTo(1.75f)
                curveTo(1.34f, 20.5f, 1.0f, 20.84f, 1.0f, 21.25f)
                reflectiveCurveTo(1.34f, 22.0f, 1.75f, 22.0f)
                horizontalLineTo(5.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-3.25f)
                curveTo(6.0f, 17.34f, 5.66f, 17.0f, 5.25f, 17.0f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.34f, -0.75f, 0.75f)
                verticalLineToRelative(2.16f)
                curveToRelative(-1.86f, -2.11f, -3.0f, -4.88f, -3.0f, -7.91f)
                reflectiveCurveToRelative(1.14f, -5.79f, 3.0f, -7.91f)
                verticalLineToRelative(2.16f)
                curveTo(4.5f, 6.66f, 4.84f, 7.0f, 5.25f, 7.0f)
                curveTo(5.66f, 7.0f, 6.0f, 6.66f, 6.0f, 6.25f)
                verticalLineTo(3.0f)
                curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f)
                horizontalLineTo(1.75f)
                curveTo(1.34f, 2.0f, 1.0f, 2.34f, 1.0f, 2.75f)
                reflectiveCurveTo(1.34f, 3.5f, 1.75f, 3.5f)
                horizontalLineToRelative(1.27f)
                curveTo(1.13f, 5.82f, 0.0f, 8.78f, 0.0f, 12.0f)
                close()
                moveTo(8.83f, 19.1f)
                curveToRelative(-0.26f, -0.6f, 0.09f, -1.28f, 0.73f, -1.41f)
                lineToRelative(3.58f, -0.71f)
                lineTo(8.79f, 7.17f)
                curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f)
                curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f)
                lineToRelative(2.43f, 5.49f)
                lineToRelative(0.84f, -0.37f)
                curveToRelative(0.28f, -0.13f, 0.59f, -0.18f, 0.9f, -0.17f)
                lineToRelative(4.56f, 0.21f)
                curveToRelative(0.86f, 0.04f, 1.6f, 0.63f, 1.83f, 1.45f)
                lineToRelative(1.23f, 4.33f)
                curveToRelative(0.27f, 0.96f, -0.2f, 1.97f, -1.11f, 2.37f)
                lineToRelative(-5.63f, 2.49f)
                curveToRelative(-0.48f, 0.21f, -1.26f, 0.33f, -1.76f, 0.14f)
                lineToRelative(-5.45f, -2.27f)
                curveTo(9.13f, 19.53f, 8.93f, 19.34f, 8.83f, 19.1f)
                close()
            }
        }
        .build()
        return _swipeVertical!!
    }

private var _swipeVertical: ImageVector? = null
