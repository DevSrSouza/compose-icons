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

public val RoundGroup.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 1.0f)
                curveTo(7.19f, 1.0f, 3.7f, 3.39f, 2.41f, 5.92f)
                curveTo(2.16f, 6.41f, 2.53f, 7.0f, 3.09f, 7.0f)
                curveToRelative(0.28f, 0.0f, 0.54f, -0.15f, 0.66f, -0.4f)
                curveTo(4.73f, 4.69f, 7.58f, 2.5f, 12.0f, 2.5f)
                curveToRelative(3.03f, 0.0f, 5.79f, 1.14f, 7.91f, 3.0f)
                horizontalLineToRelative(-2.16f)
                curveTo(17.34f, 5.5f, 17.0f, 5.84f, 17.0f, 6.25f)
                reflectiveCurveTo(17.34f, 7.0f, 17.75f, 7.0f)
                horizontalLineTo(21.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineTo(2.75f)
                curveTo(22.0f, 2.34f, 21.66f, 2.0f, 21.25f, 2.0f)
                reflectiveCurveTo(20.5f, 2.34f, 20.5f, 2.75f)
                verticalLineToRelative(1.27f)
                curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f)
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
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
