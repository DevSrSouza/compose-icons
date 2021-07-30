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

public val LineAwesomeIcons.TreeSolid: ImageVector
    get() {
        if (_treeSolid != null) {
            return _treeSolid!!
        }
        _treeSolid = Builder(name = "TreeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.5938f)
                lineTo(15.2813f, 4.2813f)
                lineTo(9.3438f, 10.25f)
                lineTo(8.3438f, 11.2188f)
                lineTo(9.625f, 11.8438f)
                curveTo(9.625f, 11.8438f, 10.6406f, 12.2109f, 12.0625f, 12.5313f)
                lineTo(7.6563f, 16.9375f)
                lineTo(6.6563f, 17.9063f)
                lineTo(7.9063f, 18.5313f)
                curveTo(7.9063f, 18.5313f, 8.9844f, 18.8359f, 9.5313f, 19.0313f)
                lineTo(5.9375f, 22.625f)
                lineTo(4.9688f, 23.625f)
                lineTo(6.2188f, 24.25f)
                curveTo(6.2188f, 24.25f, 8.6563f, 25.4258f, 13.0f, 25.8438f)
                lineTo(13.0f, 29.0f)
                lineTo(15.0f, 29.0f)
                lineTo(15.0f, 25.9688f)
                curveTo(15.3359f, 25.9805f, 15.6484f, 26.0f, 16.0f, 26.0f)
                curveTo(16.3516f, 26.0f, 16.6641f, 25.9805f, 17.0f, 25.9688f)
                lineTo(17.0f, 29.0f)
                lineTo(19.0f, 29.0f)
                lineTo(19.0f, 25.8438f)
                curveTo(23.3516f, 25.4258f, 25.8125f, 24.25f, 25.8125f, 24.25f)
                lineTo(27.0313f, 23.625f)
                lineTo(26.0625f, 22.625f)
                lineTo(22.4688f, 19.0313f)
                curveTo(23.0156f, 18.8359f, 24.0938f, 18.5313f, 24.0938f, 18.5313f)
                lineTo(25.3438f, 17.9063f)
                lineTo(24.3438f, 16.9375f)
                lineTo(19.9375f, 12.5313f)
                curveTo(21.3594f, 12.2109f, 22.375f, 11.8438f, 22.375f, 11.8438f)
                lineTo(23.6563f, 11.2188f)
                lineTo(22.6563f, 10.25f)
                lineTo(16.7188f, 4.2813f)
                close()
                moveTo(16.0f, 6.4375f)
                lineTo(20.0f, 10.4063f)
                curveTo(19.4063f, 10.6055f, 19.2852f, 10.7617f, 17.8125f, 10.9063f)
                lineTo(16.0f, 11.0938f)
                lineTo(14.1875f, 10.9063f)
                curveTo(12.7148f, 10.7617f, 12.5938f, 10.6055f, 12.0f, 10.4063f)
                close()
                moveTo(16.0f, 11.4375f)
                lineTo(17.1875f, 12.5938f)
                lineTo(21.7813f, 17.1875f)
                curveTo(21.3164f, 17.3516f, 21.3281f, 17.4063f, 20.375f, 17.5938f)
                lineTo(18.5313f, 17.9688f)
                lineTo(19.875f, 19.2813f)
                lineTo(23.5313f, 22.9375f)
                curveTo(22.2578f, 23.3945f, 20.0781f, 24.0f, 16.0f, 24.0f)
                curveTo(11.9609f, 24.0f, 9.7891f, 23.3945f, 8.5f, 22.9375f)
                lineTo(12.125f, 19.2813f)
                lineTo(13.4688f, 17.9688f)
                lineTo(11.625f, 17.5938f)
                curveTo(10.6719f, 17.4063f, 10.6836f, 17.3516f, 10.2188f, 17.1875f)
                lineTo(14.8125f, 12.5938f)
                close()
            }
        }
        .build()
        return _treeSolid!!
    }

private var _treeSolid: ImageVector? = null
