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

public val LineAwesomeIcons.SocksSolid: ImageVector
    get() {
        if (_socksSolid != null) {
            return _socksSolid!!
        }
        _socksSolid = Builder(name = "SocksSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.9375f, 2.0f)
                lineTo(9.6563f, 2.9688f)
                lineTo(5.2188f, 18.5313f)
                lineTo(5.2188f, 18.5625f)
                curveTo(4.5195f, 20.8828f, 5.5781f, 23.3828f, 7.75f, 24.4688f)
                lineTo(7.7813f, 24.5f)
                lineTo(7.8125f, 24.5f)
                lineTo(19.75f, 29.4688f)
                curveTo(19.7695f, 29.4805f, 19.793f, 29.4883f, 19.8125f, 29.5f)
                curveTo(20.5078f, 29.8359f, 21.2695f, 30.0f, 22.0f, 30.0f)
                curveTo(23.8359f, 30.0f, 25.5938f, 28.9922f, 26.4688f, 27.25f)
                curveTo(27.6953f, 24.7891f, 26.7109f, 21.7617f, 24.25f, 20.5313f)
                lineTo(24.1875f, 20.5f)
                lineTo(24.1563f, 20.5f)
                lineTo(23.5f, 20.2188f)
                curveTo(23.4922f, 20.2227f, 23.4766f, 20.2148f, 23.4688f, 20.2188f)
                lineTo(16.4688f, 17.4375f)
                lineTo(19.7188f, 5.9375f)
                lineTo(19.9688f, 5.0f)
                lineTo(10.9063f, 2.2813f)
                close()
                moveTo(11.3125f, 4.4688f)
                lineTo(17.5313f, 6.3438f)
                lineTo(17.0f, 8.2188f)
                lineTo(10.7813f, 6.3438f)
                close()
                moveTo(10.2188f, 8.2813f)
                lineTo(16.4375f, 10.1563f)
                lineTo(14.2813f, 17.75f)
                lineTo(14.0625f, 18.625f)
                lineTo(14.875f, 18.9688f)
                lineTo(21.6563f, 21.6563f)
                curveTo(20.2383f, 23.0664f, 19.2891f, 24.9375f, 19.0625f, 27.0313f)
                lineTo(11.6875f, 23.9375f)
                curveTo(11.8906f, 23.332f, 12.0f, 22.6719f, 12.0f, 22.0f)
                curveTo(12.0f, 19.3672f, 10.2773f, 17.1484f, 7.9063f, 16.3438f)
                close()
                moveTo(7.375f, 18.25f)
                curveTo(8.9063f, 18.8047f, 10.0f, 20.2617f, 10.0f, 22.0f)
                curveTo(10.0f, 22.4063f, 9.9258f, 22.7852f, 9.8125f, 23.1563f)
                lineTo(8.6563f, 22.6875f)
                curveTo(7.3398f, 22.0273f, 6.6914f, 20.5352f, 7.125f, 19.125f)
                lineTo(7.125f, 19.0938f)
                close()
                moveTo(23.6563f, 22.5f)
                curveTo(24.9141f, 23.3281f, 25.3789f, 24.9609f, 24.6875f, 26.3438f)
                curveTo(24.1563f, 27.4023f, 23.0977f, 28.0f, 22.0f, 28.0f)
                curveTo(21.668f, 28.0f, 21.3281f, 27.9258f, 21.0f, 27.8125f)
                curveTo(21.0547f, 25.6563f, 22.082f, 23.7461f, 23.6563f, 22.5f)
                close()
            }
        }
        .build()
        return _socksSolid!!
    }

private var _socksSolid: ImageVector? = null
