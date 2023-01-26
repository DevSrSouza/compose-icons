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

public val RoundGroup.SportsBar: ImageVector
    get() {
        if (_sportsBar != null) {
            return _sportsBar!!
        }
        _sportsBar = Builder(name = "SportsBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 9.0f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(0.33f, -0.55f, 0.53f, -1.18f, 0.55f, -1.86f)
                curveToRelative(0.04f, -1.03f, -0.43f, -1.99f, -1.16f, -2.71f)
                curveToRelative(-1.54f, -1.54f, -2.74f, -1.56f, -3.82f, -1.29f)
                curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10.0f, 2.02f)
                curveToRelative(-1.89f, 0.0f, -3.51f, 1.11f, -4.27f, 2.71f)
                curveTo(4.15f, 5.26f, 3.0f, 6.74f, 3.0f, 8.5f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(6.0f, 19.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(7.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(0.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-6.0f)
                curveTo(21.0f, 9.9f, 20.1f, 9.0f, 19.0f, 9.0f)
                close()
                moveTo(7.0f, 10.5f)
                curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f)
                curveToRelative(0.0f, -0.85f, 0.55f, -1.6f, 1.37f, -1.88f)
                lineToRelative(0.8f, -0.27f)
                lineToRelative(0.36f, -0.76f)
                curveTo(8.0f, 4.62f, 8.94f, 4.02f, 10.0f, 4.02f)
                curveToRelative(0.79f, 0.0f, 1.39f, 0.35f, 1.74f, 0.65f)
                lineToRelative(0.78f, 0.65f)
                curveToRelative(0.0f, 0.0f, 0.64f, -0.32f, 1.47f, -0.32f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                curveToRelative(0.0f, 0.0f, -3.0f, 0.0f, -3.0f, 0.0f)
                curveTo(9.67f, 7.0f, 9.15f, 10.5f, 7.0f, 10.5f)
                close()
                moveTo(19.0f, 17.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-6.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _sportsBar!!
    }

private var _sportsBar: ImageVector? = null
