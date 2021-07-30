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

public val LineAwesomeIcons.InfinitySolid: ImageVector
    get() {
        if (_infinitySolid != null) {
            return _infinitySolid!!
        }
        _infinitySolid = Builder(name = "InfinitySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                curveTo(5.1445f, 9.0f, 2.0f, 12.1445f, 2.0f, 16.0f)
                curveTo(2.0f, 19.8594f, 5.1406f, 23.0f, 9.0f, 23.0f)
                curveTo(11.9297f, 23.0f, 13.7188f, 21.3906f, 15.0938f, 19.4063f)
                curveTo(14.6836f, 18.7461f, 14.3398f, 18.0938f, 14.0f, 17.4688f)
                curveTo(12.7734f, 19.4961f, 11.3984f, 21.0f, 9.0f, 21.0f)
                curveTo(6.2422f, 21.0f, 4.0f, 18.7578f, 4.0f, 16.0f)
                curveTo(4.0f, 13.2266f, 6.2266f, 11.0f, 9.0f, 11.0f)
                curveTo(10.6172f, 11.0f, 11.6445f, 11.5781f, 12.5938f, 12.5625f)
                curveTo(13.543f, 13.5469f, 14.3438f, 14.9688f, 15.1563f, 16.4688f)
                curveTo(15.9688f, 17.9688f, 16.793f, 19.5469f, 18.0f, 20.8125f)
                curveTo(19.207f, 22.0781f, 20.8711f, 23.0f, 23.0f, 23.0f)
                curveTo(26.8555f, 23.0f, 30.0f, 19.8555f, 30.0f, 16.0f)
                curveTo(30.0f, 12.1406f, 26.8594f, 9.0f, 23.0f, 9.0f)
                curveTo(20.0859f, 9.0f, 18.2852f, 10.5586f, 16.9063f, 12.5f)
                curveTo(17.3164f, 13.1484f, 17.6914f, 13.7852f, 18.0313f, 14.4063f)
                curveTo(19.25f, 12.4375f, 20.6094f, 11.0f, 23.0f, 11.0f)
                curveTo(25.7578f, 11.0f, 28.0f, 13.2422f, 28.0f, 16.0f)
                curveTo(28.0f, 18.7734f, 25.7734f, 21.0f, 23.0f, 21.0f)
                curveTo(21.4102f, 21.0f, 20.4102f, 20.4219f, 19.4688f, 19.4375f)
                curveTo(18.5273f, 18.4531f, 17.7227f, 17.0313f, 16.9063f, 15.5313f)
                curveTo(16.0898f, 14.0313f, 15.25f, 12.4531f, 14.0313f, 11.1875f)
                curveTo(12.8125f, 9.9219f, 11.1484f, 9.0f, 9.0f, 9.0f)
                close()
            }
        }
        .build()
        return _infinitySolid!!
    }

private var _infinitySolid: ImageVector? = null
