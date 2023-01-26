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

public val RoundGroup.SwipeLeft: ImageVector
    get() {
        if (_swipeLeft != null) {
            return _swipeLeft!!
        }
        _swipeLeft = Builder(name = "SwipeLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.5f, 4.02f)
                verticalLineTo(2.75f)
                curveTo(3.5f, 2.34f, 3.16f, 2.0f, 2.75f, 2.0f)
                reflectiveCurveTo(2.0f, 2.34f, 2.0f, 2.75f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(3.25f)
                curveTo(6.66f, 7.0f, 7.0f, 6.66f, 7.0f, 6.25f)
                reflectiveCurveTo(6.66f, 5.5f, 6.25f, 5.5f)
                horizontalLineTo(4.09f)
                curveToRelative(2.11f, -1.86f, 4.88f, -3.0f, 7.91f, -3.0f)
                curveToRelative(4.42f, 0.0f, 7.27f, 2.19f, 8.25f, 4.1f)
                curveTo(20.37f, 6.85f, 20.63f, 7.0f, 20.91f, 7.0f)
                curveToRelative(0.56f, 0.0f, 0.93f, -0.59f, 0.67f, -1.08f)
                curveTo(20.3f, 3.39f, 16.81f, 1.0f, 12.0f, 1.0f)
                curveTo(8.78f, 1.0f, 5.82f, 2.13f, 3.5f, 4.02f)
                close()
                moveTo(5.2f, 17.43f)
                curveToRelative(0.0f, -0.65f, 0.6f, -1.13f, 1.24f, -0.99f)
                lineTo(10.0f, 17.24f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.91f)
                curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f)
                lineToRelative(4.09f, 2.04f)
                curveToRelative(0.77f, 0.38f, 1.21f, 1.22f, 1.09f, 2.07f)
                lineToRelative(-0.63f, 4.46f)
                curveTo(19.21f, 22.27f, 18.36f, 23.0f, 17.37f, 23.0f)
                horizontalLineToRelative(-6.16f)
                curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f)
                lineToRelative(-4.07f, -4.29f)
                curveTo(5.3f, 17.94f, 5.2f, 17.69f, 5.2f, 17.43f)
                close()
            }
        }
        .build()
        return _swipeLeft!!
    }

private var _swipeLeft: ImageVector? = null
