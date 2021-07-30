package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.LessThanEqual: ImageVector
    get() {
        if (_lessThanEqual != null) {
            return _lessThanEqual!!
        }
        _lessThanEqual = Builder(name = "LessThanEqual", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(54.98f, 214.2f)
                lineToRelative(301.41f, 119.87f)
                curveToRelative(18.39f, 6.03f, 38.71f, -2.54f, 45.38f, -19.15f)
                lineToRelative(12.09f, -30.08f)
                curveToRelative(6.68f, -16.61f, -2.82f, -34.97f, -21.21f, -41.0f)
                lineToRelative(-175.44f, -68.05f)
                lineToRelative(175.56f, -68.09f)
                curveToRelative(18.29f, -6.0f, 27.74f, -24.27f, 21.1f, -40.79f)
                lineToRelative(-12.03f, -29.92f)
                curveToRelative(-6.64f, -16.53f, -26.86f, -25.06f, -45.15f, -19.06f)
                lineTo(54.98f, 137.89f)
                curveTo(41.21f, 142.41f, 32.0f, 154.5f, 32.0f, 168.07f)
                verticalLineToRelative(15.96f)
                curveToRelative(0.0f, 13.56f, 9.21f, 25.65f, 22.98f, 30.17f)
                close()
                moveTo(424.0f, 400.0f)
                horizontalLineTo(24.0f)
                curveToRelative(-13.25f, 0.0f, -24.0f, 10.74f, -24.0f, 24.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 13.25f, 10.75f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(400.0f)
                curveToRelative(13.25f, 0.0f, 24.0f, -10.75f, 24.0f, -24.0f)
                verticalLineToRelative(-48.0f)
                curveToRelative(0.0f, -13.26f, -10.75f, -24.0f, -24.0f, -24.0f)
                close()
            }
        }
        .build()
        return _lessThanEqual!!
    }

private var _lessThanEqual: ImageVector? = null
