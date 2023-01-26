package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.SwipeRight: ImageVector
    get() {
        if (_swipeRight != null) {
            return _swipeRight!!
        }
        _swipeRight = Builder(name = "SwipeRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.98f, 16.82f)
                lineToRelative(-0.63f, 4.46f)
                curveTo(19.21f, 22.27f, 18.36f, 23.0f, 17.37f, 23.0f)
                horizontalLineToRelative(-6.16f)
                curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f)
                lineTo(5.0f, 17.62f)
                lineToRelative(0.83f, -0.84f)
                curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f)
                lineTo(10.0f, 17.24f)
                verticalLineTo(6.5f)
                curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f)
                reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(0.91f)
                curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f)
                lineToRelative(4.09f, 2.04f)
                curveTo(19.66f, 15.14f, 20.1f, 15.97f, 19.98f, 16.82f)
                close()
                moveTo(19.91f, 5.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(5.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(2.02f)
                curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f)
                curveTo(6.51f, 1.0f, 2.73f, 4.12f, 2.0f, 7.0f)
                horizontalLineToRelative(1.57f)
                curveTo(4.33f, 5.02f, 7.26f, 2.5f, 12.0f, 2.5f)
                curveTo(15.03f, 2.5f, 17.79f, 3.64f, 19.91f, 5.5f)
                close()
            }
        }
        .build()
        return _swipeRight!!
    }

private var _swipeRight: ImageVector? = null
