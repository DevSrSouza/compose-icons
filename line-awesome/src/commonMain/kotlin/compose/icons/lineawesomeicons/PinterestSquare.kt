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
                lineTo(13.5137f, 25.0f)
                curveTo(13.7655f, 24.4937f, 13.9921f, 23.9714f, 14.1152f, 23.4961f)
                curveTo(14.2492f, 22.9821f, 15.0f, 20.7402f, 15.0f, 20.7402f)
                curveTo(15.357f, 21.4232f, 16.4027f, 22.0f, 17.5137f, 22.0f)
                curveTo(20.8217f, 22.0f, 23.0f, 19.1071f, 23.0f, 15.3301f)
                curveTo(23.0f, 11.7101f, 20.0442f, 9.0f, 16.2402f, 9.0f)
                curveTo(11.5082f, 9.0f, 9.0f, 12.1748f, 9.0f, 15.6348f)
                curveTo(9.0f, 17.2418f, 9.8567f, 19.2419f, 11.2227f, 19.8809f)
                curveTo(11.4327f, 19.9789f, 11.5408f, 19.9334f, 11.5898f, 19.7324f)
                curveTo(11.6258f, 19.5804f, 11.8116f, 18.8362f, 11.8926f, 18.4922f)
                curveTo(11.9196f, 18.3802f, 11.9054f, 18.2877f, 11.8164f, 18.1797f)
                curveTo(11.3654f, 17.6297f, 11.0f, 16.6217f, 11.0f, 15.6797f)
                curveTo(11.0f, 13.2597f, 12.8302f, 10.9199f, 15.9512f, 10.9199f)
                curveTo(18.6432f, 10.9199f, 20.5313f, 12.7559f, 20.5313f, 15.3809f)
                curveTo(20.5313f, 18.3449f, 19.2362f, 20.252f, 17.2852f, 20.252f)
                curveTo(16.2092f, 20.252f, 15.205f, 19.51f, 15.459f, 18.416f)
                curveTo(15.767f, 17.112f, 16.3652f, 15.7057f, 16.3652f, 14.7637f)
                curveTo(16.3652f, 12.3977f, 12.998f, 12.7249f, 12.998f, 15.8809f)
                curveTo(12.998f, 16.8499f, 13.3203f, 17.5098f, 13.3203f, 17.5098f)
                curveTo(12.2575f, 22.2484f, 11.9556f, 23.2822f, 12.0488f, 25.0f)
                lineTo(7.0f, 25.0f)
                lineTo(7.0f, 7.0f)
                close()
            }
        }
        .build()
        return _pinterestSquare!!
    }

private var _pinterestSquare: ImageVector? = null
