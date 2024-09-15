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
                curveTo(14.906f, 3.0f, 14.0f, 3.906f, 14.0f, 5.0f)
                curveTo(14.0f, 5.359f, 14.109f, 5.707f, 14.281f, 6.0f)
                lineTo(8.0f, 6.0f)
                lineTo(8.0f, 8.375f)
                lineTo(8.219f, 8.625f)
                lineTo(11.875f, 13.0f)
                curveTo(11.324f, 13.035f, 10.902f, 13.512f, 10.938f, 14.063f)
                curveTo(10.973f, 14.613f, 11.449f, 15.035f, 12.0f, 15.0f)
                lineTo(12.656f, 15.0f)
                lineTo(11.094f, 20.563f)
                lineTo(11.031f, 20.719f)
                lineTo(10.375f, 22.0f)
                lineTo(9.0f, 22.0f)
                curveTo(8.969f, 22.0f, 8.938f, 22.0f, 8.906f, 22.0f)
                curveTo(8.355f, 22.027f, 7.926f, 22.496f, 7.953f, 23.047f)
                curveTo(7.98f, 23.598f, 8.449f, 24.027f, 9.0f, 24.0f)
                lineTo(7.188f, 26.406f)
                lineTo(7.0f, 26.656f)
                lineTo(7.0f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(25.0f, 26.656f)
                lineTo(24.813f, 26.406f)
                lineTo(23.0f, 24.0f)
                curveTo(23.359f, 24.004f, 23.695f, 23.816f, 23.879f, 23.504f)
                curveTo(24.059f, 23.191f, 24.059f, 22.809f, 23.879f, 22.496f)
                curveTo(23.695f, 22.184f, 23.359f, 21.996f, 23.0f, 22.0f)
                lineTo(21.625f, 22.0f)
                lineTo(20.969f, 20.719f)
                lineTo(20.938f, 20.656f)
                lineTo(20.906f, 20.563f)
                lineTo(19.344f, 15.0f)
                lineTo(20.0f, 15.0f)
                curveTo(20.551f, 15.043f, 21.035f, 14.629f, 21.078f, 14.078f)
                curveTo(21.121f, 13.527f, 20.707f, 13.043f, 20.156f, 13.0f)
                lineTo(23.781f, 8.625f)
                lineTo(24.0f, 8.375f)
                lineTo(24.0f, 6.0f)
                lineTo(17.719f, 6.0f)
                curveTo(17.891f, 5.707f, 18.0f, 5.359f, 18.0f, 5.0f)
                curveTo(18.0f, 3.906f, 17.094f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(10.313f, 8.0f)
                lineTo(21.688f, 8.0f)
                lineTo(17.531f, 13.0f)
                lineTo(14.469f, 13.0f)
                close()
                moveTo(14.75f, 15.0f)
                lineTo(17.25f, 15.0f)
                lineTo(19.031f, 21.281f)
                lineTo(19.063f, 21.375f)
                lineTo(19.375f, 22.0f)
                lineTo(12.625f, 22.0f)
                lineTo(12.938f, 21.375f)
                lineTo(12.969f, 21.281f)
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
