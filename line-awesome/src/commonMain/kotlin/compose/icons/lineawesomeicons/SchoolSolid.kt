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

public val LineAwesomeIcons.SchoolSolid: ImageVector
    get() {
        if (_schoolSolid != null) {
            return _schoolSolid!!
        }
        _schoolSolid = Builder(name = "SchoolSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                lineTo(3.0f, 7.0f)
                lineTo(3.0f, 9.0f)
                lineTo(16.0f, 6.0f)
                lineTo(29.0f, 9.0f)
                lineTo(29.0f, 7.0f)
                close()
                moveTo(10.0f, 10.0f)
                curveTo(6.7734f, 10.0f, 3.625f, 11.3125f, 3.625f, 11.3125f)
                lineTo(3.0f, 11.5938f)
                lineTo(3.0f, 27.0f)
                lineTo(14.2813f, 27.0f)
                curveTo(14.6289f, 27.5977f, 15.2617f, 28.0f, 16.0f, 28.0f)
                curveTo(16.7383f, 28.0f, 17.3711f, 27.5977f, 17.7188f, 27.0f)
                lineTo(29.0f, 27.0f)
                lineTo(29.0f, 11.5938f)
                lineTo(28.375f, 11.3125f)
                curveTo(28.375f, 11.3125f, 25.2266f, 10.0f, 22.0f, 10.0f)
                curveTo(19.082f, 10.0f, 16.5195f, 10.9805f, 16.0f, 11.1875f)
                curveTo(15.4805f, 10.9805f, 12.918f, 10.0f, 10.0f, 10.0f)
                close()
                moveTo(10.0f, 12.0f)
                curveTo(11.9336f, 12.0f, 14.0f, 12.625f, 15.0f, 12.9688f)
                lineTo(15.0f, 24.0938f)
                curveTo(13.8867f, 23.7266f, 12.0586f, 23.2188f, 10.0f, 23.2188f)
                curveTo(7.8984f, 23.2188f, 6.1875f, 23.7031f, 5.0f, 24.0938f)
                lineTo(5.0f, 12.9688f)
                curveTo(5.7695f, 12.6914f, 7.8008f, 12.0f, 10.0f, 12.0f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(24.1992f, 12.0f, 26.2305f, 12.6914f, 27.0f, 12.9688f)
                lineTo(27.0f, 24.0938f)
                curveTo(25.8125f, 23.7031f, 24.1016f, 23.2188f, 22.0f, 23.2188f)
                curveTo(19.9414f, 23.2188f, 18.1133f, 23.7266f, 17.0f, 24.0938f)
                lineTo(17.0f, 12.9688f)
                curveTo(18.0f, 12.625f, 20.0664f, 12.0f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _schoolSolid!!
    }

private var _schoolSolid: ImageVector? = null
