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

public val SimpleIcons.Ubuntumate: ImageVector
    get() {
        if (_ubuntumate != null) {
            return _ubuntumate!!
        }
        _ubuntumate = Builder(name = "Ubuntumate", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.372f, 0.0f, 12.0f)
                curveToRelative(0.0f, 6.627f, 5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                curveToRelative(0.0f, -6.628f, -5.373f, -12.0f, -12.0f, -12.0f)
                close()
                moveTo(14.005f, 3.245f)
                lineTo(18.667f, 6.0f)
                lineTo(14.0f, 8.755f)
                close()
                moveTo(12.0f, 4.66f)
                curveToRelative(0.342f, 0.0f, 0.676f, 0.028f, 1.005f, 0.073f)
                verticalLineToRelative(1.021f)
                arcTo(6.327f, 6.327f, 0.0f, false, false, 6.12f, 9.63f)
                lineToRelative(-0.865f, -0.51f)
                curveTo(6.378f, 6.503f, 8.978f, 4.66f, 12.0f, 4.66f)
                close()
                moveTo(12.0f, 7.155f)
                curveToRelative(0.342f, 0.0f, 0.677f, 0.041f, 1.0f, 0.11f)
                verticalLineToRelative(1.036f)
                arcToRelative(3.866f, 3.866f, 0.0f, false, false, -1.0f, -0.13f)
                arcToRelative(3.812f, 3.812f, 0.0f, false, false, -3.672f, 2.76f)
                lineToRelative(-0.896f, -0.531f)
                arcTo(4.855f, 4.855f, 0.0f, false, true, 12.0f, 7.156f)
                close()
                moveTo(17.885f, 7.619f)
                arcTo(7.305f, 7.305f, 0.0f, false, true, 19.34f, 12.0f)
                arcToRelative(7.308f, 7.308f, 0.0f, false, true, -1.5f, 4.437f)
                lineToRelative(-0.87f, -0.515f)
                arcTo(6.3f, 6.3f, 0.0f, false, false, 18.329f, 12.0f)
                arcToRelative(6.31f, 6.31f, 0.0f, false, false, -1.313f, -3.865f)
                close()
                moveTo(15.714f, 8.905f)
                arcToRelative(4.81f, 4.81f, 0.0f, false, true, -0.047f, 6.25f)
                lineToRelative(-0.891f, -0.526f)
                arcTo(3.793f, 3.793f, 0.0f, false, false, 15.828f, 12.0f)
                curveToRelative(0.0f, -0.996f, -0.377f, -1.899f, -0.995f, -2.578f)
                close()
                moveTo(3.505f, 9.244f)
                lineTo(8.167f, 12.0f)
                lineTo(3.5f, 14.755f)
                close()
                moveTo(8.328f, 13.067f)
                arcTo(3.809f, 3.809f, 0.0f, false, false, 12.0f, 15.823f)
                curveToRelative(0.346f, 0.0f, 0.681f, -0.047f, 1.0f, -0.13f)
                verticalLineToRelative(1.041f)
                arcToRelative(4.81f, 4.81f, 0.0f, false, true, -1.0f, 0.11f)
                curveToRelative(-2.106f, 0.0f, -3.906f, -1.362f, -4.568f, -3.25f)
                close()
                moveTo(6.12f, 14.37f)
                arcTo(6.327f, 6.327f, 0.0f, false, false, 12.0f, 18.328f)
                curveToRelative(0.34f, 0.0f, 0.67f, -0.027f, 0.995f, -0.078f)
                verticalLineToRelative(1.016f)
                arcToRelative(7.212f, 7.212f, 0.0f, false, true, -0.995f, 0.073f)
                curveToRelative(-3.022f, 0.0f, -5.622f, -1.842f, -6.745f, -4.459f)
                close()
                moveTo(14.0f, 15.333f)
                lineTo(18.661f, 18.083f)
                lineTo(13.995f, 20.839f)
                close()
            }
        }
        .build()
        return _ubuntumate!!
    }

private var _ubuntumate: ImageVector? = null
