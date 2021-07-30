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

public val LineAwesomeIcons.BicycleSolid: ImageVector
    get() {
        if (_bicycleSolid != null) {
            return _bicycleSolid!!
        }
        _bicycleSolid = Builder(name = "BicycleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                lineTo(19.0f, 7.4375f)
                lineTo(19.0938f, 7.625f)
                lineTo(20.125f, 10.0f)
                lineTo(11.4375f, 10.0f)
                lineTo(11.125f, 10.4375f)
                lineTo(8.4063f, 14.2813f)
                curveTo(7.8008f, 14.0938f, 7.1641f, 14.0f, 6.5f, 14.0f)
                curveTo(2.918f, 14.0f, 0.0f, 16.9141f, 0.0f, 20.5f)
                curveTo(0.0f, 24.0859f, 2.9141f, 27.0f, 6.5f, 27.0f)
                curveTo(9.9141f, 27.0f, 12.707f, 24.3477f, 12.9688f, 21.0f)
                lineTo(16.4063f, 21.0f)
                lineTo(16.7188f, 20.5625f)
                lineTo(21.5938f, 13.375f)
                lineTo(22.25f, 14.875f)
                curveTo(20.3086f, 16.0039f, 19.0f, 18.1094f, 19.0f, 20.5f)
                curveTo(19.0f, 24.0703f, 21.9297f, 27.0f, 25.5f, 27.0f)
                curveTo(29.0703f, 27.0f, 32.0f, 24.0703f, 32.0f, 20.5f)
                curveTo(32.0f, 16.9297f, 29.0703f, 14.0f, 25.5f, 14.0f)
                curveTo(25.0195f, 14.0f, 24.5469f, 14.0547f, 24.0938f, 14.1563f)
                lineTo(21.4063f, 8.0f)
                lineTo(24.5f, 8.0f)
                curveTo(24.7852f, 8.0f, 25.0f, 8.2148f, 25.0f, 8.5f)
                curveTo(25.0f, 8.7852f, 24.7852f, 9.0f, 24.5f, 9.0f)
                lineTo(24.5f, 11.0f)
                curveTo(25.8672f, 11.0f, 27.0f, 9.8672f, 27.0f, 8.5f)
                curveTo(27.0f, 7.1328f, 25.8672f, 6.0f, 24.5f, 6.0f)
                close()
                moveTo(8.0f, 7.0f)
                lineTo(8.0f, 9.0f)
                lineTo(14.0f, 9.0f)
                lineTo(13.0f, 7.0f)
                close()
                moveTo(13.4688f, 12.0f)
                lineTo(20.125f, 12.0f)
                lineTo(16.0938f, 17.9375f)
                close()
                moveTo(11.7188f, 13.0f)
                lineTo(14.3438f, 19.0f)
                lineTo(6.0f, 19.0f)
                lineTo(6.0f, 21.0f)
                lineTo(10.9375f, 21.0f)
                curveTo(10.6836f, 23.2422f, 8.8086f, 25.0f, 6.5f, 25.0f)
                curveTo(4.0195f, 25.0f, 2.0f, 22.9805f, 2.0f, 20.5f)
                curveTo(2.0f, 18.0195f, 4.0195f, 16.0f, 6.5f, 16.0f)
                curveTo(8.0586f, 16.0f, 9.4414f, 16.7969f, 10.25f, 18.0f)
                lineTo(12.5f, 18.0f)
                curveTo(12.0195f, 16.8477f, 11.2305f, 15.8594f, 10.2188f, 15.1563f)
                close()
                moveTo(25.5f, 16.0f)
                curveTo(27.9805f, 16.0f, 30.0f, 18.0195f, 30.0f, 20.5f)
                curveTo(30.0f, 22.9805f, 27.9805f, 25.0f, 25.5f, 25.0f)
                curveTo(23.0195f, 25.0f, 21.0f, 22.9805f, 21.0f, 20.5f)
                curveTo(21.0f, 18.9258f, 21.832f, 17.5547f, 23.0625f, 16.75f)
                lineTo(25.0938f, 21.4063f)
                lineTo(26.9063f, 20.5938f)
                lineTo(24.9375f, 16.0625f)
                curveTo(25.125f, 16.0391f, 25.3086f, 16.0f, 25.5f, 16.0f)
                close()
            }
        }
        .build()
        return _bicycleSolid!!
    }

private var _bicycleSolid: ImageVector? = null
