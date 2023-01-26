package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.SportsBar: ImageVector
    get() {
        if (_sportsBar != null) {
            return _sportsBar!!
        }
        _sportsBar = Builder(name = "SportsBar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 9.0f)
                horizontalLineToRelative(-3.56f)
                curveTo(17.79f, 8.41f, 18.0f, 7.73f, 18.0f, 7.0f)
                curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f)
                curveToRelative(-0.34f, 0.0f, -0.66f, 0.05f, -0.98f, 0.13f)
                curveTo(12.2f, 2.45f, 11.16f, 2.02f, 10.0f, 2.02f)
                curveToRelative(-1.89f, 0.0f, -3.51f, 1.11f, -4.27f, 2.71f)
                curveTo(4.15f, 5.26f, 3.0f, 6.74f, 3.0f, 8.5f)
                curveToRelative(0.0f, 1.86f, 1.28f, 3.41f, 3.0f, 3.86f)
                lineTo(6.0f, 21.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(9.0f)
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
