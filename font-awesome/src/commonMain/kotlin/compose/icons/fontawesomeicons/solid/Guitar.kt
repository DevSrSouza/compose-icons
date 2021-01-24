package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Guitar: ImageVector
    get() {
        if (_guitar != null) {
            return _guitar!!
        }
        _guitar = Builder(name = "Guitar", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.63f, 39.0f)
                lineTo(473.0f, 9.37f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -45.26f, 0.0f)
                lineTo(381.46f, 55.7f)
                arcToRelative(35.14f, 35.14f, 0.0f, false, false, -8.53f, 13.79f)
                lineTo(360.77f, 106.0f)
                lineToRelative(-76.26f, 76.26f)
                curveToRelative(-12.16f, -8.76f, -25.5f, -15.74f, -40.1f, -19.14f)
                curveToRelative(-33.45f, -7.78f, -67.0f, -0.88f, -89.88f, 22.0f)
                arcToRelative(82.45f, 82.45f, 0.0f, false, false, -20.24f, 33.47f)
                curveToRelative(-6.0f, 18.56f, -23.21f, 32.69f, -42.15f, 34.46f)
                curveToRelative(-23.7f, 2.27f, -45.73f, 11.45f, -62.61f, 28.44f)
                curveTo(-16.11f, 327.0f, -7.9f, 409.0f, 47.58f, 464.45f)
                reflectiveCurveTo(185.0f, 528.0f, 230.56f, 482.52f)
                curveToRelative(17.0f, -16.88f, 26.16f, -38.9f, 28.45f, -62.71f)
                curveToRelative(1.76f, -18.85f, 15.89f, -36.13f, 34.43f, -42.14f)
                arcToRelative(82.6f, 82.6f, 0.0f, false, false, 33.48f, -20.25f)
                curveToRelative(22.87f, -22.88f, 29.74f, -56.36f, 22.0f, -89.75f)
                curveToRelative(-3.39f, -14.64f, -10.37f, -28.0f, -19.16f, -40.2f)
                lineTo(406.0f, 151.23f)
                lineToRelative(36.48f, -12.16f)
                arcToRelative(35.14f, 35.14f, 0.0f, false, false, 13.79f, -8.53f)
                lineToRelative(46.33f, -46.32f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 0.03f, -45.22f)
                close()
                moveTo(208.0f, 352.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 48.0f, -48.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _guitar!!
    }

private var _guitar: ImageVector? = null
