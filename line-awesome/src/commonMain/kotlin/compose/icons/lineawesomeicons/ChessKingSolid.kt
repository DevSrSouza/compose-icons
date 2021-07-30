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

public val LineAwesomeIcons.ChessKingSolid: ImageVector
    get() {
        if (_chessKingSolid != null) {
            return _chessKingSolid!!
        }
        _chessKingSolid = Builder(name = "ChessKingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(14.9063f, 3.0f, 14.0f, 3.9063f, 14.0f, 5.0f)
                curveTo(14.0f, 5.3594f, 14.1094f, 5.707f, 14.2813f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 8.375f)
                lineTo(8.2188f, 8.625f)
                lineTo(11.875f, 13.0f)
                curveTo(11.3242f, 13.0352f, 10.9023f, 13.5117f, 10.9375f, 14.0625f)
                curveTo(10.9727f, 14.6133f, 11.4492f, 15.0352f, 12.0f, 15.0f)
                lineTo(12.6563f, 15.0f)
                lineTo(11.0938f, 20.5625f)
                lineTo(11.0313f, 20.7188f)
                lineTo(10.375f, 22.0f)
                lineTo(9.0f, 22.0f)
                curveTo(8.9688f, 22.0f, 8.9375f, 22.0f, 8.9063f, 22.0f)
                curveTo(8.3555f, 22.0273f, 7.9258f, 22.4961f, 7.9531f, 23.0469f)
                curveTo(7.9805f, 23.5977f, 8.4492f, 24.0273f, 9.0f, 24.0f)
                lineTo(7.1875f, 26.4063f)
                lineTo(7.0f, 26.6563f)
                lineTo(7.0f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(25.0f, 26.6563f)
                lineTo(24.8125f, 26.4063f)
                lineTo(23.0f, 24.0f)
                curveTo(23.3594f, 24.0039f, 23.6953f, 23.8164f, 23.8789f, 23.5039f)
                curveTo(24.0586f, 23.1914f, 24.0586f, 22.8086f, 23.8789f, 22.4961f)
                curveTo(23.6953f, 22.1836f, 23.3594f, 21.9961f, 23.0f, 22.0f)
                lineTo(21.625f, 22.0f)
                lineTo(20.9688f, 20.7188f)
                lineTo(20.9375f, 20.6563f)
                lineTo(20.9063f, 20.5625f)
                lineTo(19.3438f, 15.0f)
                lineTo(20.0f, 15.0f)
                curveTo(20.5508f, 15.043f, 21.0352f, 14.6289f, 21.0781f, 14.0781f)
                curveTo(21.1211f, 13.5273f, 20.707f, 13.043f, 20.1563f, 13.0f)
                lineTo(23.7813f, 8.625f)
                lineTo(24.0f, 8.375f)
                lineTo(24.0f, 6.0f)
                lineTo(17.7188f, 6.0f)
                curveTo(17.8906f, 5.707f, 18.0f, 5.3594f, 18.0f, 5.0f)
                curveTo(18.0f, 3.9063f, 17.0938f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(10.3125f, 8.0f)
                lineTo(21.6875f, 8.0f)
                lineTo(17.5313f, 13.0f)
                lineTo(14.4688f, 13.0f)
                close()
                moveTo(14.75f, 15.0f)
                lineTo(17.25f, 15.0f)
                lineTo(19.0313f, 21.2813f)
                lineTo(19.0625f, 21.375f)
                lineTo(19.375f, 22.0f)
                lineTo(12.625f, 22.0f)
                lineTo(12.9375f, 21.375f)
                lineTo(12.9688f, 21.2813f)
                close()
                moveTo(11.5f, 24.0f)
                lineTo(20.5f, 24.0f)
                lineTo(22.75f, 27.0f)
                lineTo(9.25f, 27.0f)
                close()
            }
        }
        .build()
        return _chessKingSolid!!
    }

private var _chessKingSolid: ImageVector? = null
