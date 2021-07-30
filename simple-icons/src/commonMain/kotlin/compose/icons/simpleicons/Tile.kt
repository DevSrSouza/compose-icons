package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Tile: ImageVector
    get() {
        if (_tile != null) {
            return _tile!!
        }
        _tile = Builder(name = "Tile", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.486f, 8.483f)
                horizontalLineToRelative(1.617f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, 0.15f, 0.15f)
                verticalLineToRelative(9.706f)
                arcToRelative(0.16f, 0.16f, 0.0f, false, true, -0.15f, 0.15f)
                lineTo(7.486f, 18.489f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, true, -0.15f, -0.15f)
                lineTo(7.336f, 8.633f)
                curveToRelative(0.0f, -0.075f, 0.075f, -0.15f, 0.15f, -0.15f)
                close()
                moveTo(11.022f, 5.511f)
                horizontalLineToRelative(1.617f)
                curveToRelative(0.076f, 0.0f, 0.151f, 0.075f, 0.151f, 0.15f)
                verticalLineToRelative(12.64f)
                curveToRelative(0.0f, 0.075f, -0.075f, 0.15f, -0.15f, 0.15f)
                horizontalLineToRelative(-1.618f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, true, -0.15f, -0.15f)
                lineTo(10.872f, 5.66f)
                curveToRelative(0.0f, -0.075f, 0.075f, -0.15f, 0.15f, -0.15f)
                close()
                moveTo(5.68f, 8.483f)
                lineTo(1.918f, 8.483f)
                lineTo(1.918f, 5.66f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, false, -0.15f, -0.15f)
                lineTo(0.15f, 5.51f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, false, -0.15f, 0.15f)
                verticalLineToRelative(7.787f)
                curveToRelative(0.0f, 2.746f, 2.257f, 5.003f, 5.003f, 5.003f)
                horizontalLineToRelative(0.677f)
                curveToRelative(0.075f, 0.0f, 0.15f, -0.075f, 0.15f, -0.15f)
                verticalLineToRelative(-1.618f)
                arcToRelative(0.162f, 0.162f, 0.0f, false, false, -0.15f, -0.15f)
                horizontalLineToRelative(-0.677f)
                arcToRelative(3.099f, 3.099f, 0.0f, false, true, -3.085f, -3.085f)
                verticalLineToRelative(-3.084f)
                lineTo(5.68f, 10.363f)
                curveToRelative(0.075f, 0.0f, 0.15f, -0.076f, 0.15f, -0.15f)
                lineTo(5.83f, 8.595f)
                curveToRelative(0.0f, -0.076f, -0.075f, -0.113f, -0.15f, -0.113f)
                close()
                moveTo(22.533f, 9.95f)
                arcToRelative(5.018f, 5.018f, 0.0f, false, false, -7.035f, 0.0f)
                curveToRelative(-1.956f, 1.918f, -1.918f, 5.078f, 0.0f, 7.034f)
                curveToRelative(1.919f, 1.956f, 5.079f, 1.919f, 7.035f, 0.0f)
                arcToRelative(4.48f, 4.48f, 0.0f, false, false, 0.865f, -1.166f)
                arcToRelative(0.08f, 0.08f, 0.0f, false, false, -0.075f, -0.075f)
                horizontalLineToRelative(-2.07f)
                lineToRelative(-0.225f, 0.075f)
                curveToRelative(-1.279f, 1.129f, -3.235f, 0.978f, -4.363f, -0.338f)
                curveToRelative(-0.339f, -0.414f, -0.602f, -0.903f, -0.678f, -1.43f)
                curveToRelative(0.0f, -0.075f, 0.038f, -0.113f, 0.113f, -0.113f)
                horizontalLineToRelative(7.75f)
                curveToRelative(0.075f, 0.0f, 0.15f, -0.075f, 0.15f, -0.15f)
                verticalLineToRelative(-0.301f)
                arcToRelative(5.013f, 5.013f, 0.0f, false, false, -1.467f, -3.536f)
                close()
                moveTo(21.63f, 12.207f)
                horizontalLineToRelative(-5.266f)
                curveToRelative(-0.076f, 0.0f, -0.113f, -0.038f, -0.113f, -0.113f)
                arcToRelative(3.066f, 3.066f, 0.0f, false, true, 2.708f, -1.655f)
                curveToRelative(1.129f, 0.0f, 2.182f, 0.64f, 2.709f, 1.655f)
                curveToRelative(0.0f, 0.038f, 0.0f, 0.075f, -0.038f, 0.113f)
                close()
                moveTo(9.404f, 6.602f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, -1.09f, 1.09f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, -1.091f, -1.09f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, 1.09f, -1.091f)
                arcToRelative(1.09f, 1.09f, 0.0f, false, true, 1.091f, 1.09f)
                close()
            }
        }
        .build()
        return _tile!!
    }

private var _tile: ImageVector? = null
