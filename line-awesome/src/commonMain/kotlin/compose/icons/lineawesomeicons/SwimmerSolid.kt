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

public val LineAwesomeIcons.SwimmerSolid: ImageVector
    get() {
        if (_swimmerSolid != null) {
            return _swimmerSolid!!
        }
        _swimmerSolid = Builder(name = "SwimmerSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.5f, 11.0f)
                curveTo(21.5781f, 11.0f, 20.0f, 12.5781f, 20.0f, 14.5f)
                curveTo(20.0f, 16.4219f, 21.5781f, 18.0f, 23.5f, 18.0f)
                curveTo(25.4219f, 18.0f, 27.0f, 16.4219f, 27.0f, 14.5f)
                curveTo(27.0f, 12.5781f, 25.4219f, 11.0f, 23.5f, 11.0f)
                close()
                moveTo(13.7188f, 11.0313f)
                curveTo(13.3555f, 11.0547f, 13.0039f, 11.1758f, 12.6875f, 11.4063f)
                lineTo(7.4063f, 15.1875f)
                lineTo(8.5938f, 16.8125f)
                lineTo(13.8438f, 13.0313f)
                lineTo(16.125f, 15.6563f)
                lineTo(8.7188f, 21.9375f)
                curveTo(9.125f, 21.9727f, 9.5586f, 22.0f, 10.0f, 22.0f)
                curveTo(10.6758f, 22.0f, 11.3242f, 21.9297f, 11.9688f, 21.8125f)
                lineTo(17.4063f, 17.1563f)
                lineTo(19.4375f, 19.5f)
                curveTo(20.1758f, 19.3086f, 20.9336f, 19.1445f, 21.7188f, 19.0625f)
                lineTo(15.3438f, 11.7188f)
                curveTo(14.918f, 11.2227f, 14.3242f, 10.9922f, 13.7188f, 11.0313f)
                close()
                moveTo(23.5f, 13.0f)
                curveTo(24.3398f, 13.0f, 25.0f, 13.6602f, 25.0f, 14.5f)
                curveTo(25.0f, 15.3438f, 24.3398f, 16.0f, 23.5f, 16.0f)
                curveTo(22.6563f, 16.0f, 22.0f, 15.3438f, 22.0f, 14.5f)
                curveTo(22.0f, 13.6602f, 22.6563f, 13.0f, 23.5f, 13.0f)
                close()
                moveTo(23.0f, 20.0f)
                curveTo(20.5625f, 20.0f, 18.4258f, 20.8164f, 16.3438f, 21.5625f)
                curveTo(14.2617f, 22.3086f, 12.2344f, 23.0f, 10.0f, 23.0f)
                curveTo(4.5039f, 23.0f, 1.6875f, 20.2813f, 1.6875f, 20.2813f)
                lineTo(0.3125f, 21.7188f)
                curveTo(0.3125f, 21.7188f, 3.8164f, 25.0f, 10.0f, 25.0f)
                curveTo(12.6445f, 25.0f, 14.9063f, 24.1914f, 17.0f, 23.4375f)
                curveTo(19.0938f, 22.6836f, 21.0156f, 22.0f, 23.0f, 22.0f)
                curveTo(26.9688f, 22.0f, 30.3438f, 24.7813f, 30.3438f, 24.7813f)
                lineTo(31.6563f, 23.2188f)
                curveTo(31.6563f, 23.2188f, 27.875f, 20.0f, 23.0f, 20.0f)
                close()
            }
        }
        .build()
        return _swimmerSolid!!
    }

private var _swimmerSolid: ImageVector? = null
