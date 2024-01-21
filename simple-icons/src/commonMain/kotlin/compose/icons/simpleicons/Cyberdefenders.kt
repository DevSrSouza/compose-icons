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

public val SimpleIcons.Cyberdefenders: ImageVector
    get() {
        if (_cyberdefenders != null) {
            return _cyberdefenders!!
        }
        _cyberdefenders = Builder(name = "Cyberdefenders", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.918f, 17.48f)
                curveToRelative(-0.126f, 2.727f, -2.384f, 4.696f, -5.364f, 4.696f)
                lineTo(7.34f, 22.176f)
                verticalLineToRelative(-6.123f)
                lineToRelative(-2.185f, -0.957f)
                lineTo(5.155f, 24.0f)
                horizontalLineToRelative(8.381f)
                curveToRelative(4.334f, 0.0f, 7.549f, -2.962f, 7.549f, -6.881f)
                verticalLineToRelative(-0.163f)
                curveToRelative(-0.65f, 0.235f, -1.372f, 0.415f, -2.167f, 0.524f)
                close()
                moveTo(20.273f, 7.979f)
                curveTo(18.611f, 4.313f, 17.726f, 0.989f, 15.432f, 0.213f)
                curveToRelative(-1.336f, -0.452f, -2.005f, -0.091f, -2.637f, 0.217f)
                curveToRelative(-0.199f, 0.09f, -0.235f, 0.361f, -0.072f, 0.505f)
                curveToRelative(0.361f, 0.307f, 0.813f, 0.687f, 1.336f, 1.174f)
                curveToRelative(-1.95f, -1.138f, -7.333f, -2.835f, -7.874f, -0.776f)
                curveToRelative(-0.488f, 1.86f, -1.319f, 4.587f, -1.319f, 4.587f)
                reflectiveCurveTo(0.603f, 5.487f, 0.116f, 7.293f)
                curveToRelative(-0.488f, 1.806f, 3.323f, 5.274f, 9.627f, 7.134f)
                curveToRelative(6.303f, 1.861f, 11.198f, 1.373f, 13.311f, -0.921f)
                curveToRelative(2.113f, -2.294f, 0.072f, -5.473f, -2.781f, -5.527f)
                close()
                moveTo(19.026f, 8.015f)
                curveToRelative(-0.487f, 0.47f, -2.077f, 1.68f, -5.563f, 1.427f)
                curveToRelative(-3.738f, -0.271f, -6.809f, -2.474f, -7.604f, -3.088f)
                curveToRelative(-0.126f, -0.091f, -0.18f, -0.235f, -0.126f, -0.398f)
                curveToRelative(0.054f, -0.18f, 0.126f, -0.469f, 0.253f, -0.849f)
                curveToRelative(0.072f, -0.234f, 0.343f, -0.343f, 0.542f, -0.216f)
                curveToRelative(1.571f, 0.903f, 4.1f, 2.221f, 6.791f, 2.402f)
                curveToRelative(2.402f, 0.163f, 3.847f, -0.542f, 4.786f, -1.066f)
                curveToRelative(0.199f, -0.108f, 0.452f, -0.018f, 0.542f, 0.199f)
                lineToRelative(0.47f, 1.156f)
                curveToRelative(0.036f, 0.162f, 0.018f, 0.325f, -0.091f, 0.433f)
                close()
            }
        }
        .build()
        return _cyberdefenders!!
    }

private var _cyberdefenders: ImageVector? = null
