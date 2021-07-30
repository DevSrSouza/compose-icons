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

public val LineAwesomeIcons.MountainSolid: ImageVector
    get() {
        if (_mountainSolid != null) {
            return _mountainSolid!!
        }
        _mountainSolid = Builder(name = "MountainSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0117f, 3.0215f)
                lineTo(16.0996f, 4.6816f)
                curveTo(13.9253f, 8.6341f, 11.7522f, 12.5848f, 9.5781f, 16.5371f)
                lineTo(7.6621f, 14.6211f)
                lineTo(7.002f, 15.7188f)
                curveTo(5.049f, 18.9737f, 3.0957f, 22.2302f, 1.1426f, 25.4863f)
                lineTo(0.2344f, 27.0f)
                lineTo(2.0f, 27.0f)
                lineTo(31.5176f, 27.0f)
                lineTo(30.9199f, 25.6055f)
                curveTo(29.92f, 23.2726f, 28.92f, 20.9386f, 27.9199f, 18.6055f)
                lineTo(27.3379f, 17.248f)
                lineTo(25.2695f, 19.3164f)
                curveTo(22.8033f, 14.4479f, 20.3341f, 9.5793f, 17.8672f, 4.7109f)
                lineTo(17.0117f, 3.0215f)
                close()
                moveTo(16.9395f, 7.3027f)
                curveTo(17.9524f, 9.3017f, 18.9658f, 11.3f, 19.9785f, 13.2988f)
                lineTo(19.2051f, 13.9629f)
                lineTo(16.9258f, 12.0098f)
                lineTo(14.6465f, 13.9629f)
                lineTo(13.7168f, 13.1641f)
                curveTo(14.791f, 11.2103f, 15.8649f, 9.2563f, 16.9395f, 7.3027f)
                close()
                moveTo(16.9258f, 14.6426f)
                lineTo(19.2051f, 16.5957f)
                lineTo(20.9082f, 15.1367f)
                curveTo(21.9745f, 17.2415f, 23.0412f, 19.3463f, 24.1074f, 21.4512f)
                lineTo(24.7305f, 22.6836f)
                lineTo(26.6621f, 20.752f)
                curveTo(27.2689f, 22.1679f, 27.8756f, 23.584f, 28.4824f, 25.0f)
                lineTo(3.7656f, 25.0f)
                curveTo(5.1966f, 22.6147f, 6.6276f, 20.2306f, 8.0586f, 17.8457f)
                lineTo(10.0469f, 19.834f)
                lineTo(10.6895f, 18.668f)
                curveTo(11.3704f, 17.4302f, 12.0518f, 16.1929f, 12.7324f, 14.9551f)
                lineTo(14.6465f, 16.5957f)
                lineTo(16.9258f, 14.6426f)
                close()
            }
        }
        .build()
        return _mountainSolid!!
    }

private var _mountainSolid: ImageVector? = null
