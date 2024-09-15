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

public val LineAwesomeIcons.PinterestSquare: ImageVector
    get() {
        if (_pinterestSquare != null) {
            return _pinterestSquare!!
        }
        _pinterestSquare = Builder(name = "PinterestSquare", defaultWidth = 32.0.dp, defaultHeight =
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
                lineTo(13.514f, 25.0f)
                curveTo(13.766f, 24.494f, 13.992f, 23.971f, 14.115f, 23.496f)
                curveTo(14.249f, 22.982f, 15.0f, 20.74f, 15.0f, 20.74f)
                curveTo(15.357f, 21.423f, 16.403f, 22.0f, 17.514f, 22.0f)
                curveTo(20.822f, 22.0f, 23.0f, 19.107f, 23.0f, 15.33f)
                curveTo(23.0f, 11.71f, 20.044f, 9.0f, 16.24f, 9.0f)
                curveTo(11.508f, 9.0f, 9.0f, 12.175f, 9.0f, 15.635f)
                curveTo(9.0f, 17.242f, 9.857f, 19.242f, 11.223f, 19.881f)
                curveTo(11.433f, 19.979f, 11.541f, 19.933f, 11.59f, 19.732f)
                curveTo(11.626f, 19.58f, 11.812f, 18.836f, 11.893f, 18.492f)
                curveTo(11.92f, 18.38f, 11.905f, 18.288f, 11.816f, 18.18f)
                curveTo(11.365f, 17.63f, 11.0f, 16.622f, 11.0f, 15.68f)
                curveTo(11.0f, 13.26f, 12.83f, 10.92f, 15.951f, 10.92f)
                curveTo(18.643f, 10.92f, 20.531f, 12.756f, 20.531f, 15.381f)
                curveTo(20.531f, 18.345f, 19.236f, 20.252f, 17.285f, 20.252f)
                curveTo(16.209f, 20.252f, 15.205f, 19.51f, 15.459f, 18.416f)
                curveTo(15.767f, 17.112f, 16.365f, 15.706f, 16.365f, 14.764f)
                curveTo(16.365f, 12.398f, 12.998f, 12.725f, 12.998f, 15.881f)
                curveTo(12.998f, 16.85f, 13.32f, 17.51f, 13.32f, 17.51f)
                curveTo(12.258f, 22.248f, 11.956f, 23.282f, 12.049f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _pinterestSquare!!
    }

private var _pinterestSquare: ImageVector? = null
