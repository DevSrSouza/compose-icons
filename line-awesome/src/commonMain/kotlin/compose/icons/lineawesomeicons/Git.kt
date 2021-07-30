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

public val LineAwesomeIcons.Git: ImageVector
    get() {
        if (_git != null) {
            return _git!!
        }
        _git = Builder(name = "Git", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(15.4961f, 2.0f, 15.0039f, 2.1836f, 14.625f, 2.5625f)
                lineTo(11.8125f, 5.4063f)
                curveTo(11.6602f, 5.4883f, 11.5313f, 5.6055f, 11.4375f, 5.75f)
                lineTo(2.5625f, 14.625f)
                curveTo(1.8047f, 15.3789f, 1.8047f, 16.6172f, 2.5625f, 17.375f)
                lineTo(14.625f, 29.4375f)
                curveTo(15.3828f, 30.1914f, 16.6172f, 30.1914f, 17.375f, 29.4375f)
                lineTo(29.4375f, 17.375f)
                curveTo(30.1953f, 16.6211f, 30.1953f, 15.3828f, 29.4375f, 14.625f)
                lineTo(17.375f, 2.5625f)
                curveTo(16.9961f, 2.1836f, 16.5039f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0313f)
                lineTo(27.9688f, 16.0f)
                lineTo(16.0f, 27.9688f)
                lineTo(4.0313f, 16.0f)
                lineTo(12.3125f, 7.7188f)
                lineTo(14.0625f, 9.4688f)
                curveTo(14.0156f, 9.6367f, 14.0f, 9.8164f, 14.0f, 10.0f)
                curveTo(14.0f, 10.7383f, 14.4023f, 11.3711f, 15.0f, 11.7188f)
                lineTo(15.0f, 20.2813f)
                curveTo(14.4023f, 20.6289f, 14.0f, 21.2617f, 14.0f, 22.0f)
                curveTo(14.0f, 23.1055f, 14.8945f, 24.0f, 16.0f, 24.0f)
                curveTo(17.1055f, 24.0f, 18.0f, 23.1055f, 18.0f, 22.0f)
                curveTo(18.0f, 21.2617f, 17.5977f, 20.6289f, 17.0f, 20.2813f)
                lineTo(17.0f, 12.4375f)
                lineTo(20.0625f, 15.5f)
                curveTo(20.0195f, 15.6602f, 20.0f, 15.8281f, 20.0f, 16.0f)
                curveTo(20.0f, 17.1055f, 20.8945f, 18.0f, 22.0f, 18.0f)
                curveTo(23.1055f, 18.0f, 24.0f, 17.1055f, 24.0f, 16.0f)
                curveTo(24.0f, 14.8945f, 23.1055f, 14.0f, 22.0f, 14.0f)
                curveTo(21.8281f, 14.0f, 21.6602f, 14.0195f, 21.5f, 14.0625f)
                lineTo(17.9375f, 10.5f)
                curveTo(17.9805f, 10.3398f, 18.0f, 10.1719f, 18.0f, 10.0f)
                curveTo(18.0f, 8.8945f, 17.1055f, 8.0f, 16.0f, 8.0f)
                curveTo(15.8164f, 8.0f, 15.6367f, 8.0156f, 15.4688f, 8.0625f)
                lineTo(13.7188f, 6.3125f)
                close()
            }
        }
        .build()
        return _git!!
    }

private var _git: ImageVector? = null
