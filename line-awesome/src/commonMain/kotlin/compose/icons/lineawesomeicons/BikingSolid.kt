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

public val LineAwesomeIcons.BikingSolid: ImageVector
    get() {
        if (_bikingSolid != null) {
            return _bikingSolid!!
        }
        _bikingSolid = Builder(name = "BikingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 5.0f)
                curveTo(17.5781f, 5.0f, 16.0f, 6.5781f, 16.0f, 8.5f)
                curveTo(16.0f, 10.4219f, 17.5781f, 12.0f, 19.5f, 12.0f)
                curveTo(21.4219f, 12.0f, 23.0f, 10.4219f, 23.0f, 8.5f)
                curveTo(23.0f, 6.5781f, 21.4219f, 5.0f, 19.5f, 5.0f)
                close()
                moveTo(19.5f, 7.0f)
                curveTo(20.3398f, 7.0f, 21.0f, 7.6602f, 21.0f, 8.5f)
                curveTo(21.0f, 9.3398f, 20.3398f, 10.0f, 19.5f, 10.0f)
                curveTo(18.6602f, 10.0f, 18.0f, 9.3398f, 18.0f, 8.5f)
                curveTo(18.0f, 7.6602f, 18.6602f, 7.0f, 19.5f, 7.0f)
                close()
                moveTo(15.0938f, 10.5313f)
                curveTo(14.5859f, 10.582f, 14.0938f, 10.832f, 13.75f, 11.25f)
                lineTo(11.4063f, 14.0938f)
                curveTo(10.5977f, 15.0781f, 10.9492f, 16.6328f, 12.0938f, 17.1875f)
                lineTo(15.5313f, 18.875f)
                lineTo(14.625f, 23.875f)
                lineTo(16.5938f, 24.2188f)
                lineTo(17.6563f, 18.4688f)
                lineTo(17.7813f, 17.7188f)
                lineTo(17.0938f, 17.375f)
                lineTo(12.9375f, 15.375f)
                lineTo(15.3125f, 12.5f)
                lineTo(19.375f, 15.7813f)
                lineTo(19.6563f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 14.0f)
                lineTo(20.3438f, 14.0f)
                lineTo(16.5625f, 10.9688f)
                curveTo(16.1406f, 10.6289f, 15.6016f, 10.4805f, 15.0938f, 10.5313f)
                close()
                moveTo(8.5f, 18.0f)
                curveTo(6.0313f, 18.0f, 4.0f, 20.0313f, 4.0f, 22.5f)
                curveTo(4.0f, 24.9688f, 6.0313f, 27.0f, 8.5f, 27.0f)
                curveTo(10.9688f, 27.0f, 13.0f, 24.9688f, 13.0f, 22.5f)
                curveTo(13.0f, 20.0313f, 10.9688f, 18.0f, 8.5f, 18.0f)
                close()
                moveTo(23.5f, 18.0f)
                curveTo(21.0313f, 18.0f, 19.0f, 20.0313f, 19.0f, 22.5f)
                curveTo(19.0f, 24.9688f, 21.0313f, 27.0f, 23.5f, 27.0f)
                curveTo(25.9688f, 27.0f, 28.0f, 24.9688f, 28.0f, 22.5f)
                curveTo(28.0f, 20.0313f, 25.9688f, 18.0f, 23.5f, 18.0f)
                close()
                moveTo(8.5f, 20.0f)
                curveTo(9.8789f, 20.0f, 11.0f, 21.1211f, 11.0f, 22.5f)
                curveTo(11.0f, 23.8789f, 9.8789f, 25.0f, 8.5f, 25.0f)
                curveTo(7.1211f, 25.0f, 6.0f, 23.8789f, 6.0f, 22.5f)
                curveTo(6.0f, 21.1211f, 7.1211f, 20.0f, 8.5f, 20.0f)
                close()
                moveTo(23.5f, 20.0f)
                curveTo(24.8789f, 20.0f, 26.0f, 21.1211f, 26.0f, 22.5f)
                curveTo(26.0f, 23.8789f, 24.8789f, 25.0f, 23.5f, 25.0f)
                curveTo(22.1211f, 25.0f, 21.0f, 23.8789f, 21.0f, 22.5f)
                curveTo(21.0f, 21.1211f, 22.1211f, 20.0f, 23.5f, 20.0f)
                close()
            }
        }
        .build()
        return _bikingSolid!!
    }

private var _bikingSolid: ImageVector? = null
