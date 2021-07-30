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

public val LineAwesomeIcons.LifeRing: ImageVector
    get() {
        if (_lifeRing != null) {
            return _lifeRing!!
        }
        _lifeRing = Builder(name = "LifeRing", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(16.3359f, 6.0f, 16.6719f, 6.0313f, 17.0f, 6.0625f)
                lineTo(17.0f, 9.0938f)
                curveTo(16.6719f, 9.0469f, 16.3398f, 9.0f, 16.0f, 9.0f)
                curveTo(15.6602f, 9.0f, 15.3281f, 9.0469f, 15.0f, 9.0938f)
                lineTo(15.0f, 6.0625f)
                curveTo(15.3281f, 6.0313f, 15.6641f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(13.0f, 6.4375f)
                lineTo(13.0f, 9.6875f)
                curveTo(11.5469f, 10.3828f, 10.3789f, 11.5469f, 9.6875f, 13.0f)
                lineTo(6.4688f, 13.0f)
                curveTo(7.4414f, 9.875f, 9.8828f, 7.4141f, 13.0f, 6.4375f)
                close()
                moveTo(19.0f, 6.4375f)
                curveTo(22.1133f, 7.4141f, 24.5859f, 9.8867f, 25.5625f, 13.0f)
                lineTo(22.3125f, 13.0f)
                curveTo(21.6211f, 11.5469f, 20.4531f, 10.3789f, 19.0f, 9.6875f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(18.7734f, 11.0f, 21.0f, 13.2266f, 21.0f, 16.0f)
                curveTo(21.0f, 18.7734f, 18.7734f, 21.0f, 16.0f, 21.0f)
                curveTo(13.2266f, 21.0f, 11.0f, 18.7734f, 11.0f, 16.0f)
                curveTo(11.0f, 13.2266f, 13.2266f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(6.0625f, 15.0f)
                lineTo(9.0625f, 15.0f)
                curveTo(9.0156f, 15.3242f, 9.0f, 15.6641f, 9.0f, 16.0f)
                curveTo(9.0f, 16.3398f, 9.0469f, 16.6719f, 9.0938f, 17.0f)
                lineTo(6.0625f, 17.0f)
                curveTo(6.0313f, 16.6719f, 6.0f, 16.3359f, 6.0f, 16.0f)
                curveTo(6.0f, 15.6641f, 6.0313f, 15.3281f, 6.0625f, 15.0f)
                close()
                moveTo(22.9063f, 15.0f)
                lineTo(25.9375f, 15.0f)
                curveTo(25.9688f, 15.3281f, 26.0f, 15.6641f, 26.0f, 16.0f)
                curveTo(26.0f, 16.3359f, 25.9688f, 16.6719f, 25.9375f, 17.0f)
                lineTo(22.9063f, 17.0f)
                curveTo(22.9531f, 16.6719f, 23.0f, 16.3398f, 23.0f, 16.0f)
                curveTo(23.0f, 15.6602f, 22.9531f, 15.3281f, 22.9063f, 15.0f)
                close()
                moveTo(6.4375f, 19.0f)
                lineTo(9.6875f, 19.0f)
                curveTo(10.3789f, 20.4531f, 11.5469f, 21.6211f, 13.0f, 22.3125f)
                lineTo(13.0f, 25.5625f)
                curveTo(9.8867f, 24.5859f, 7.4141f, 22.1133f, 6.4375f, 19.0f)
                close()
                moveTo(22.3125f, 19.0f)
                lineTo(25.5625f, 19.0f)
                curveTo(24.5859f, 22.1133f, 22.1133f, 24.5859f, 19.0f, 25.5625f)
                lineTo(19.0f, 22.3125f)
                curveTo(20.4531f, 21.6211f, 21.6211f, 20.4531f, 22.3125f, 19.0f)
                close()
                moveTo(15.0f, 22.9063f)
                curveTo(15.3281f, 22.9531f, 15.6602f, 23.0f, 16.0f, 23.0f)
                curveTo(16.3398f, 23.0f, 16.6719f, 22.9531f, 17.0f, 22.9063f)
                lineTo(17.0f, 25.9375f)
                curveTo(16.6719f, 25.9688f, 16.3359f, 26.0f, 16.0f, 26.0f)
                curveTo(15.6641f, 26.0f, 15.3281f, 25.9688f, 15.0f, 25.9375f)
                close()
            }
        }
        .build()
        return _lifeRing!!
    }

private var _lifeRing: ImageVector? = null
