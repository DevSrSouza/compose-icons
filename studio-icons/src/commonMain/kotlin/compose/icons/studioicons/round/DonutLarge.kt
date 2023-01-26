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

public val RoundGroup.DonutLarge: ImageVector
    get() {
        if (_donutLarge != null) {
            return _donutLarge!!
        }
        _donutLarge = Builder(name = "DonutLarge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.07f, 5.32f)
                curveTo(16.26f, 6.0f, 18.0f, 7.74f, 18.68f, 9.93f)
                curveToRelative(0.19f, 0.63f, 0.76f, 1.07f, 1.41f, 1.07f)
                horizontalLineToRelative(0.04f)
                curveToRelative(1.0f, 0.0f, 1.72f, -0.96f, 1.43f, -1.91f)
                curveToRelative(-0.97f, -3.18f, -3.48f, -5.69f, -6.66f, -6.66f)
                curveToRelative(-0.94f, -0.29f, -1.9f, 0.43f, -1.9f, 1.43f)
                verticalLineToRelative(0.04f)
                curveToRelative(0.0f, 0.66f, 0.44f, 1.23f, 1.07f, 1.42f)
                close()
                moveTo(18.68f, 14.07f)
                curveToRelative(-0.68f, 2.2f, -2.42f, 3.93f, -4.61f, 4.61f)
                curveToRelative(-0.63f, 0.19f, -1.07f, 0.76f, -1.07f, 1.41f)
                verticalLineToRelative(0.04f)
                curveToRelative(0.0f, 1.0f, 0.96f, 1.72f, 1.91f, 1.43f)
                curveToRelative(3.18f, -0.97f, 5.69f, -3.48f, 6.66f, -6.66f)
                curveToRelative(0.29f, -0.95f, -0.43f, -1.91f, -1.42f, -1.91f)
                horizontalLineToRelative(-0.05f)
                curveToRelative(-0.66f, 0.01f, -1.23f, 0.45f, -1.42f, 1.08f)
                close()
                moveTo(11.0f, 20.11f)
                curveToRelative(0.0f, -0.67f, -0.45f, -1.24f, -1.09f, -1.44f)
                curveTo(7.07f, 17.78f, 5.0f, 15.13f, 5.0f, 12.0f)
                reflectiveCurveToRelative(2.07f, -5.78f, 4.91f, -6.67f)
                curveToRelative(0.64f, -0.2f, 1.09f, -0.77f, 1.09f, -1.44f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.0f, -1.0f, -0.97f, -1.74f, -1.93f, -1.44f)
                curveTo(4.98f, 3.69f, 2.0f, 7.5f, 2.0f, 12.0f)
                curveToRelative(0.0f, 4.5f, 2.98f, 8.31f, 7.07f, 9.56f)
                curveToRelative(0.96f, 0.3f, 1.93f, -0.44f, 1.93f, -1.45f)
                close()
            }
        }
        .build()
        return _donutLarge!!
    }

private var _donutLarge: ImageVector? = null
