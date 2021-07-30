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

public val LineAwesomeIcons.ChessPawnSolid: ImageVector
    get() {
        if (_chessPawnSolid != null) {
            return _chessPawnSolid!!
        }
        _chessPawnSolid = Builder(name = "ChessPawnSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 9.0f)
                curveTo(13.8008f, 9.0f, 12.0f, 10.8008f, 12.0f, 13.0f)
                curveTo(12.0f, 14.1992f, 12.5586f, 15.2656f, 13.4063f, 16.0f)
                lineTo(12.0f, 16.0f)
                curveTo(11.9688f, 16.0f, 11.9375f, 16.0f, 11.9063f, 16.0f)
                curveTo(11.3555f, 16.0273f, 10.9258f, 16.4961f, 10.9531f, 17.0469f)
                curveTo(10.9805f, 17.5977f, 11.4492f, 18.0273f, 12.0f, 18.0f)
                lineTo(12.5f, 18.0f)
                lineTo(11.0938f, 21.5625f)
                lineTo(10.375f, 23.0f)
                lineTo(9.0f, 23.0f)
                curveTo(8.9688f, 23.0f, 8.9375f, 23.0f, 8.9063f, 23.0f)
                curveTo(8.4336f, 23.0313f, 8.0508f, 23.3867f, 7.9805f, 23.8555f)
                curveTo(7.9141f, 24.3203f, 8.1836f, 24.7734f, 8.625f, 24.9375f)
                lineTo(7.2813f, 26.2813f)
                lineTo(7.0f, 26.5938f)
                lineTo(7.0f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(25.0f, 26.5938f)
                lineTo(24.7188f, 26.2813f)
                lineTo(23.375f, 24.9375f)
                curveTo(23.832f, 24.7656f, 24.1016f, 24.2891f, 24.0078f, 23.8086f)
                curveTo(23.918f, 23.3281f, 23.4883f, 22.9883f, 23.0f, 23.0f)
                lineTo(21.625f, 23.0f)
                lineTo(20.9063f, 21.5625f)
                lineTo(19.5f, 18.0f)
                lineTo(20.0f, 18.0f)
                curveTo(20.3594f, 18.0039f, 20.6953f, 17.8164f, 20.8789f, 17.5039f)
                curveTo(21.0586f, 17.1914f, 21.0586f, 16.8086f, 20.8789f, 16.4961f)
                curveTo(20.6953f, 16.1836f, 20.3594f, 15.9961f, 20.0f, 16.0f)
                lineTo(18.5938f, 16.0f)
                curveTo(19.4414f, 15.2656f, 20.0f, 14.1992f, 20.0f, 13.0f)
                curveTo(20.0f, 10.8008f, 18.1992f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(17.1172f, 11.0f, 18.0f, 11.8828f, 18.0f, 13.0f)
                curveTo(18.0f, 14.1172f, 17.1172f, 15.0f, 16.0f, 15.0f)
                curveTo(14.8828f, 15.0f, 14.0f, 14.1172f, 14.0f, 13.0f)
                curveTo(14.0f, 11.8828f, 14.8828f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(14.6875f, 18.0f)
                lineTo(17.3125f, 18.0f)
                lineTo(19.0625f, 22.375f)
                lineTo(19.0938f, 22.4063f)
                lineTo(19.0938f, 22.4375f)
                lineTo(19.375f, 23.0f)
                lineTo(12.625f, 23.0f)
                lineTo(12.9063f, 22.4375f)
                lineTo(12.9063f, 22.4063f)
                lineTo(12.9375f, 22.375f)
                close()
                moveTo(11.4375f, 25.0f)
                lineTo(20.5625f, 25.0f)
                lineTo(22.5625f, 27.0f)
                lineTo(9.4375f, 27.0f)
                close()
            }
        }
        .build()
        return _chessPawnSolid!!
    }

private var _chessPawnSolid: ImageVector? = null
