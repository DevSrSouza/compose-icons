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

public val LineAwesomeIcons.OmSolid: ImageVector
    get() {
        if (_omSolid != null) {
            return _omSolid!!
        }
        _omSolid = Builder(name = "OmSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(29.0f, 19.1211f)
                curveTo(29.0f, 21.207f, 28.1563f, 26.5742f, 23.5898f, 26.5742f)
                curveTo(19.2383f, 26.5742f, 17.6523f, 22.7305f, 17.9531f, 21.3398f)
                curveTo(18.2031f, 21.7656f, 18.9961f, 23.957f, 23.2773f, 23.957f)
                curveTo(27.668f, 23.957f, 27.7148f, 19.0781f, 27.7148f, 19.0781f)
                curveTo(27.7148f, 19.0781f, 27.6406f, 15.6172f, 24.9648f, 15.6172f)
                curveTo(21.6992f, 15.6172f, 21.5898f, 20.8086f, 18.3086f, 20.8086f)
                curveTo(16.6641f, 20.8086f, 16.1133f, 19.9375f, 15.7813f, 19.6992f)
                curveTo(16.4883f, 21.8945f, 15.6523f, 27.0f, 10.2773f, 27.0f)
                curveTo(2.6055f, 27.0f, 3.0039f, 18.7227f, 3.0039f, 18.7227f)
                curveTo(3.0039f, 18.7227f, 4.2891f, 23.8242f, 10.1445f, 23.8242f)
                curveTo(13.7148f, 23.8242f, 14.1836f, 21.7852f, 14.1836f, 20.8516f)
                curveTo(14.1836f, 19.9219f, 13.4727f, 18.2813f, 10.2773f, 18.2813f)
                lineTo(9.5781f, 14.9648f)
                curveTo(9.5781f, 14.9648f, 10.5234f, 15.2734f, 11.6914f, 15.2734f)
                curveTo(13.2305f, 15.2734f, 13.582f, 14.2461f, 13.582f, 13.4023f)
                curveTo(13.582f, 12.5625f, 12.7578f, 11.7109f, 11.25f, 11.7109f)
                curveTo(8.9141f, 11.7109f, 7.0391f, 14.1094f, 7.0391f, 14.1094f)
                lineTo(5.2227f, 10.7383f)
                curveTo(5.2227f, 10.7383f, 6.9102f, 8.5625f, 10.3281f, 8.5625f)
                curveTo(13.7422f, 8.5625f, 15.293f, 11.3594f, 15.293f, 13.0f)
                curveTo(15.293f, 14.6406f, 14.5273f, 16.0f, 13.0742f, 16.7695f)
                curveTo(15.0352f, 17.6914f, 14.4414f, 18.3672f, 15.6914f, 18.3672f)
                curveTo(17.7617f, 18.3672f, 18.043f, 16.6758f, 19.0156f, 15.1406f)
                curveTo(19.9141f, 13.7305f, 21.1914f, 12.4688f, 23.4531f, 12.4688f)
                curveTo(27.9805f, 12.4688f, 29.0f, 17.0391f, 29.0f, 19.1211f)
                close()
                moveTo(20.1719f, 11.9805f)
                curveTo(22.4727f, 11.9805f, 24.2539f, 10.6484f, 24.2539f, 10.6484f)
                lineTo(22.3438f, 7.2773f)
                curveTo(22.3438f, 7.2773f, 21.0156f, 9.1406f, 18.4414f, 9.1406f)
                curveTo(15.8672f, 9.1406f, 13.7383f, 6.7891f, 13.7383f, 6.7891f)
                curveTo(13.7383f, 6.7891f, 14.7148f, 11.9805f, 20.1719f, 11.9805f)
                close()
                moveTo(20.5273f, 6.6133f)
                lineTo(18.6172f, 4.5703f)
                lineTo(16.4883f, 6.4336f)
                lineTo(18.3984f, 8.6094f)
                close()
            }
        }
        .build()
        return _omSolid!!
    }

private var _omSolid: ImageVector? = null
