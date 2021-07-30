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

public val SimpleIcons.Steem: ImageVector
    get() {
        if (_steem != null) {
            return _steem!!
        }
        _steem = Builder(name = "Steem", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.683f, 16.148f)
                lineToRelative(-0.114f, 0.114f)
                curveToRelative(-0.235f, 0.236f, -0.486f, 0.46f, -0.748f, 0.666f)
                lineToRelative(-0.298f, 0.235f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.176f, -0.11f)
                lineToRelative(0.12f, -0.53f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.084f, -1.746f)
                lineToRelative(-0.064f, -0.195f)
                arcToRelative(7.193f, 7.193f, 0.0f, false, false, -0.257f, -0.671f)
                lineToRelative(-1.387f, -3.27f)
                lineToRelative(-0.149f, -0.445f)
                arcToRelative(2.08f, 2.08f, 0.0f, false, true, -0.093f, -0.425f)
                lineToRelative(-0.025f, -0.223f)
                arcToRelative(2.065f, 2.065f, 0.0f, false, true, 0.59f, -1.696f)
                lineToRelative(0.115f, -0.114f)
                arcToRelative(8.33f, 8.33f, 0.0f, false, true, 0.747f, -0.666f)
                lineToRelative(0.299f, -0.235f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, true, 0.126f, -0.007f)
                curveToRelative(0.04f, 0.025f, 0.06f, 0.071f, 0.049f, 0.117f)
                lineToRelative(-0.119f, 0.53f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 0.083f, 1.746f)
                lineToRelative(0.064f, 0.195f)
                curveToRelative(0.074f, 0.227f, 0.16f, 0.453f, 0.257f, 0.671f)
                lineToRelative(1.387f, 3.27f)
                lineToRelative(0.15f, 0.445f)
                curveToRelative(0.045f, 0.138f, 0.077f, 0.28f, 0.093f, 0.425f)
                lineToRelative(0.025f, 0.223f)
                arcToRelative(2.065f, 2.065f, 0.0f, false, true, -0.591f, 1.696f)
                close()
                moveTo(13.686f, 17.221f)
                lineToRelative(-0.146f, 0.147f)
                curveToRelative(-0.296f, 0.297f, -0.612f, 0.579f, -0.941f, 0.838f)
                lineToRelative(-0.39f, 0.307f)
                arcToRelative(0.12f, 0.12f, 0.0f, false, true, -0.192f, -0.12f)
                lineToRelative(0.154f, -0.687f)
                arcToRelative(4.169f, 4.169f, 0.0f, false, false, -0.105f, -2.205f)
                lineToRelative(-0.08f, -0.248f)
                arcToRelative(9.058f, 9.058f, 0.0f, false, false, -0.325f, -0.848f)
                lineTo(9.91f, 10.28f)
                lineToRelative(-0.188f, -0.56f)
                arcToRelative(2.608f, 2.608f, 0.0f, false, true, -0.117f, -0.532f)
                lineToRelative(-0.032f, -0.285f)
                arcToRelative(2.586f, 2.586f, 0.0f, false, true, 0.74f, -2.124f)
                lineToRelative(0.146f, -0.147f)
                curveToRelative(0.296f, -0.297f, 0.612f, -0.579f, 0.941f, -0.838f)
                lineToRelative(0.39f, -0.307f)
                arcToRelative(0.119f, 0.119f, 0.0f, false, true, 0.138f, -0.007f)
                arcToRelative(0.119f, 0.119f, 0.0f, false, true, 0.054f, 0.127f)
                lineToRelative(-0.154f, 0.687f)
                arcToRelative(4.168f, 4.168f, 0.0f, false, false, 0.105f, 2.205f)
                lineToRelative(0.08f, 0.248f)
                curveToRelative(0.094f, 0.287f, 0.204f, 0.572f, 0.325f, 0.848f)
                lineToRelative(1.75f, 4.125f)
                lineToRelative(0.188f, 0.56f)
                curveToRelative(0.057f, 0.173f, 0.097f, 0.352f, 0.117f, 0.532f)
                lineToRelative(0.032f, 0.285f)
                arcToRelative(2.586f, 2.586f, 0.0f, false, true, -0.74f, 2.124f)
                close()
                moveTo(9.0f, 16.148f)
                lineToRelative(-0.114f, 0.114f)
                curveToRelative(-0.234f, 0.236f, -0.486f, 0.46f, -0.747f, 0.666f)
                lineToRelative(-0.299f, 0.235f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, true, -0.175f, -0.11f)
                lineToRelative(0.12f, -0.53f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, -0.084f, -1.746f)
                lineToRelative(-0.064f, -0.195f)
                arcToRelative(7.181f, 7.181f, 0.0f, false, false, -0.257f, -0.671f)
                lineToRelative(-1.387f, -3.27f)
                lineToRelative(-0.15f, -0.445f)
                arcToRelative(2.076f, 2.076f, 0.0f, false, true, -0.093f, -0.425f)
                lineToRelative(-0.025f, -0.223f)
                arcToRelative(2.065f, 2.065f, 0.0f, false, true, 0.591f, -1.696f)
                lineToRelative(0.114f, -0.114f)
                arcToRelative(8.34f, 8.34f, 0.0f, false, true, 0.748f, -0.666f)
                lineToRelative(0.298f, -0.235f)
                arcToRelative(0.109f, 0.109f, 0.0f, false, true, 0.127f, -0.007f)
                curveToRelative(0.04f, 0.025f, 0.059f, 0.071f, 0.049f, 0.117f)
                lineToRelative(-0.12f, 0.53f)
                arcToRelative(3.3f, 3.3f, 0.0f, false, false, 0.084f, 1.746f)
                lineToRelative(0.064f, 0.195f)
                curveToRelative(0.074f, 0.227f, 0.16f, 0.453f, 0.257f, 0.671f)
                lineToRelative(1.387f, 3.27f)
                lineToRelative(0.149f, 0.445f)
                curveToRelative(0.046f, 0.138f, 0.077f, 0.28f, 0.093f, 0.425f)
                lineToRelative(0.025f, 0.223f)
                arcToRelative(2.065f, 2.065f, 0.0f, false, true, -0.59f, 1.696f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.373f, 0.0f, 0.0f, 5.373f, 0.0f, 12.0f)
                reflectiveCurveToRelative(5.373f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.373f, 12.0f, -12.0f)
                reflectiveCurveTo(18.627f, 0.0f, 12.0f, 0.0f)
            }
        }
        .build()
        return _steem!!
    }

private var _steem: ImageVector? = null
