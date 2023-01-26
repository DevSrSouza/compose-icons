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

public val RoundGroup.SetMeal: ImageVector
    get() {
        if (_setMeal != null) {
            return _setMeal!!
        }
        _setMeal = Builder(name = "SetMeal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.3f, 17.6f)
                lineTo(3.83f, 18.46f)
                curveToRelative(-0.41f, 0.02f, -0.77f, -0.3f, -0.79f, -0.71f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.02f, -0.41f, 0.3f, -0.77f, 0.71f, -0.79f)
                lineToRelative(16.48f, -0.86f)
                curveToRelative(0.41f, -0.02f, 0.77f, 0.3f, 0.79f, 0.71f)
                verticalLineToRelative(0.0f)
                curveTo(21.04f, 17.22f, 20.72f, 17.58f, 20.3f, 17.6f)
                close()
                moveTo(20.25f, 19.48f)
                horizontalLineTo(3.75f)
                curveTo(3.34f, 19.48f, 3.0f, 19.82f, 3.0f, 20.23f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.0f, 0.41f, 0.34f, 0.75f, 0.75f, 0.75f)
                horizontalLineToRelative(16.5f)
                curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f)
                lineToRelative(0.0f, 0.0f)
                curveTo(21.0f, 19.82f, 20.66f, 19.48f, 20.25f, 19.48f)
                close()
                moveTo(22.0f, 5.0f)
                verticalLineToRelative(7.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(16.0f)
                curveTo(21.1f, 3.0f, 22.0f, 3.9f, 22.0f, 5.0f)
                close()
                moveTo(19.12f, 6.09f)
                curveToRelative(-1.25f, 0.27f, -2.19f, 1.11f, -2.33f, 2.14f)
                curveTo(16.15f, 7.5f, 14.06f, 5.5f, 10.25f, 5.5f)
                curveToRelative(-3.44f, 0.0f, -5.48f, 1.63f, -6.31f, 2.49f)
                curveToRelative(-0.28f, 0.29f, -0.28f, 0.74f, 0.0f, 1.03f)
                curveToRelative(0.83f, 0.86f, 2.87f, 2.49f, 6.31f, 2.49f)
                curveToRelative(3.81f, 0.0f, 5.9f, -2.0f, 6.54f, -2.73f)
                curveToRelative(0.14f, 1.02f, 1.08f, 1.86f, 2.33f, 2.14f)
                curveToRelative(0.46f, 0.1f, 0.88f, -0.28f, 0.88f, -0.74f)
                verticalLineTo(6.84f)
                curveTo(20.0f, 6.37f, 19.57f, 5.99f, 19.12f, 6.09f)
                close()
            }
        }
        .build()
        return _setMeal!!
    }

private var _setMeal: ImageVector? = null
