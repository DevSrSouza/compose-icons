package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.DribbbleSquare: ImageVector
    get() {
        if (_dribbbleSquare != null) {
            return _dribbbleSquare!!
        }
        _dribbbleSquare = Builder(name = "DribbbleSquare", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(16.25f, 8.0f)
                curveTo(14.125f, 8.0f, 14.125f, 13.505f, 14.125f, 13.563f)
                curveTo(14.125f, 14.203f, 14.149f, 14.812f, 14.188f, 15.375f)
                curveTo(13.891f, 15.265f, 13.554f, 15.188f, 13.188f, 15.188f)
                curveTo(11.005f, 15.188f, 10.0f, 17.035f, 10.0f, 19.0f)
                curveTo(10.0f, 20.848f, 11.043f, 23.0f, 13.406f, 23.0f)
                curveTo(14.523f, 23.0f, 15.489f, 22.286f, 16.252f, 21.219f)
                curveTo(16.924f, 21.903f, 17.604f, 22.156f, 18.127f, 22.156f)
                curveTo(19.787f, 22.156f, 20.886f, 19.254f, 21.281f, 18.0f)
                curveTo(21.398f, 17.605f, 21.183f, 17.148f, 20.781f, 17.031f)
                curveTo(20.386f, 16.902f, 19.973f, 17.125f, 19.844f, 17.531f)
                curveTo(19.379f, 19.004f, 18.512f, 20.547f, 18.125f, 20.625f)
                curveTo(17.84f, 20.625f, 17.445f, 20.375f, 17.031f, 19.813f)
                curveTo(17.981f, 17.816f, 18.469f, 15.328f, 18.469f, 13.656f)
                curveTo(18.469f, 8.98f, 17.258f, 8.0f, 16.25f, 8.0f)
                close()
                moveTo(16.313f, 9.625f)
                curveTo(16.552f, 9.98f, 16.969f, 11.105f, 16.969f, 13.656f)
                curveTo(16.969f, 15.008f, 16.64f, 16.586f, 16.156f, 17.969f)
                curveTo(15.84f, 16.891f, 15.625f, 15.441f, 15.625f, 13.563f)
                curveTo(15.625f, 11.823f, 15.997f, 10.18f, 16.313f, 9.625f)
                close()
                moveTo(12.906f, 16.719f)
                curveTo(12.996f, 16.699f, 13.087f, 16.719f, 13.188f, 16.719f)
                curveTo(13.828f, 16.719f, 14.313f, 17.188f, 14.313f, 17.188f)
                curveTo(14.344f, 17.226f, 14.387f, 17.281f, 14.438f, 17.313f)
                curveTo(14.644f, 18.372f, 14.965f, 19.205f, 15.313f, 19.877f)
                curveTo(14.738f, 20.846f, 14.066f, 21.471f, 13.406f, 21.471f)
                curveTo(11.695f, 21.471f, 11.531f, 19.941f, 11.531f, 19.281f)
                curveTo(11.531f, 19.179f, 11.554f, 16.989f, 12.906f, 16.719f)
                close()
            }
        }
        .build()
        return _dribbbleSquare!!
    }

private var _dribbbleSquare: ImageVector? = null
