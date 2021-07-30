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

public val LineAwesomeIcons.ChessRookSolid: ImageVector
    get() {
        if (_chessRookSolid != null) {
            return _chessRookSolid!!
        }
        _chessRookSolid = Builder(name = "ChessRookSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 4.0f)
                lineTo(9.0f, 13.0f)
                lineTo(12.75f, 13.0f)
                lineTo(12.5313f, 14.0f)
                lineTo(12.0f, 14.0f)
                curveTo(11.9688f, 14.0f, 11.9375f, 14.0f, 11.9063f, 14.0f)
                curveTo(11.3555f, 14.0273f, 10.9258f, 14.4961f, 10.9531f, 15.0469f)
                curveTo(10.9805f, 15.5977f, 11.4492f, 16.0273f, 12.0f, 16.0f)
                lineTo(12.0938f, 16.0f)
                lineTo(11.0938f, 20.5625f)
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
                lineTo(20.9063f, 20.5625f)
                lineTo(19.9063f, 16.0f)
                lineTo(20.0f, 16.0f)
                curveTo(20.3594f, 16.0039f, 20.6953f, 15.8164f, 20.8789f, 15.5039f)
                curveTo(21.0586f, 15.1914f, 21.0586f, 14.8086f, 20.8789f, 14.4961f)
                curveTo(20.6953f, 14.1836f, 20.3594f, 13.9961f, 20.0f, 14.0f)
                lineTo(19.4688f, 14.0f)
                lineTo(19.25f, 13.0f)
                lineTo(23.0f, 13.0f)
                lineTo(23.0f, 4.0f)
                close()
                moveTo(11.0f, 6.0f)
                lineTo(13.0f, 6.0f)
                lineTo(13.0f, 9.0f)
                lineTo(15.0f, 9.0f)
                lineTo(15.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 9.0f)
                lineTo(19.0f, 9.0f)
                lineTo(19.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 11.0f)
                lineTo(11.0f, 11.0f)
                close()
                moveTo(14.7813f, 13.0f)
                lineTo(17.2188f, 13.0f)
                lineTo(17.4375f, 14.0f)
                lineTo(14.5625f, 14.0f)
                close()
                moveTo(14.125f, 16.0f)
                lineTo(17.875f, 16.0f)
                lineTo(19.0313f, 21.2188f)
                lineTo(19.0625f, 21.3438f)
                lineTo(19.0938f, 21.4375f)
                lineTo(19.375f, 22.0f)
                lineTo(12.625f, 22.0f)
                lineTo(12.9063f, 21.4375f)
                lineTo(12.9375f, 21.3438f)
                lineTo(12.9688f, 21.2188f)
                close()
                moveTo(11.5f, 24.0f)
                lineTo(20.5f, 24.0f)
                lineTo(22.75f, 27.0f)
                lineTo(9.25f, 27.0f)
                close()
            }
        }
        .build()
        return _chessRookSolid!!
    }

private var _chessRookSolid: ImageVector? = null
