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

public val LineAwesomeIcons.Draft2digital: ImageVector
    get() {
        if (_draft2digital != null) {
            return _draft2digital!!
        }
        _draft2digital = Builder(name = "Draft2digital", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.7695f, 5.0508f)
                curveTo(13.2595f, 5.0608f, 11.0004f, 5.8398f, 9.4004f, 7.0898f)
                curveTo(8.1304f, 7.9398f, 7.2508f, 9.2801f, 7.0508f, 10.8301f)
                lineTo(7.0508f, 10.8496f)
                curveTo(7.0208f, 11.0596f, 7.0f, 11.28f, 7.0f, 11.5f)
                curveTo(7.0f, 13.43f, 8.57f, 15.0f, 10.5f, 15.0f)
                curveTo(12.43f, 15.0f, 14.0f, 13.43f, 14.0f, 11.5f)
                curveTo(14.0f, 10.0f, 13.0505f, 8.7305f, 11.7305f, 8.2305f)
                curveTo(11.9905f, 8.1805f, 12.2608f, 8.1406f, 12.5508f, 8.1406f)
                curveTo(14.4508f, 8.1406f, 16.0f, 9.65f, 16.0f, 11.5f)
                curveTo(16.0f, 14.29f, 11.2903f, 18.6895f, 5.3203f, 24.2695f)
                lineTo(3.4707f, 26.0f)
                lineTo(23.0f, 26.0f)
                lineTo(23.0f, 29.0f)
                lineTo(30.0f, 25.0f)
                lineTo(23.0f, 21.0f)
                lineTo(23.0f, 24.0f)
                lineTo(17.1504f, 24.0f)
                curveTo(21.3104f, 19.6f, 24.0f, 16.4298f, 24.0f, 11.8398f)
                curveTo(24.0f, 7.9798f, 20.4903f, 5.0708f, 15.8203f, 5.0508f)
                lineTo(15.7891f, 5.0508f)
                lineTo(15.7695f, 5.0508f)
                close()
                moveTo(15.5898f, 7.0508f)
                lineTo(15.7891f, 7.0508f)
                curveTo(19.3291f, 7.0608f, 22.0f, 9.1098f, 22.0f, 11.8398f)
                curveTo(22.0f, 15.9998f, 19.2399f, 18.8992f, 14.6699f, 23.6992f)
                lineTo(14.3906f, 24.0f)
                lineTo(8.5293f, 24.0f)
                curveTo(14.5993f, 18.27f, 18.0f, 14.68f, 18.0f, 11.5f)
                curveTo(18.0f, 9.65f, 17.0398f, 8.0208f, 15.5898f, 7.0508f)
                close()
                moveTo(10.5f, 10.0f)
                curveTo(11.33f, 10.0f, 12.0f, 10.67f, 12.0f, 11.5f)
                curveTo(12.0f, 12.33f, 11.33f, 13.0f, 10.5f, 13.0f)
                curveTo(9.67f, 13.0f, 9.0f, 12.33f, 9.0f, 11.5f)
                curveTo(9.0f, 11.39f, 9.0193f, 11.2895f, 9.0293f, 11.1895f)
                curveTo(9.1793f, 10.5095f, 9.78f, 10.0f, 10.5f, 10.0f)
                close()
                moveTo(25.0f, 24.4492f)
                lineTo(25.9707f, 25.0f)
                lineTo(25.0f, 25.5508f)
                lineTo(25.0f, 24.4492f)
                close()
            }
        }
        .build()
        return _draft2digital!!
    }

private var _draft2digital: ImageVector? = null
