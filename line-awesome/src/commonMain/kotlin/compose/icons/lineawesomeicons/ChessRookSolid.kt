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
                lineTo(12.531f, 14.0f)
                lineTo(12.0f, 14.0f)
                curveTo(11.969f, 14.0f, 11.938f, 14.0f, 11.906f, 14.0f)
                curveTo(11.355f, 14.027f, 10.926f, 14.496f, 10.953f, 15.047f)
                curveTo(10.98f, 15.598f, 11.449f, 16.027f, 12.0f, 16.0f)
                lineTo(12.094f, 16.0f)
                lineTo(11.094f, 20.563f)
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
                lineTo(20.906f, 20.563f)
                lineTo(19.906f, 16.0f)
                lineTo(20.0f, 16.0f)
                curveTo(20.359f, 16.004f, 20.695f, 15.816f, 20.879f, 15.504f)
                curveTo(21.059f, 15.191f, 21.059f, 14.809f, 20.879f, 14.496f)
                curveTo(20.695f, 14.184f, 20.359f, 13.996f, 20.0f, 14.0f)
                lineTo(19.469f, 14.0f)
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
                moveTo(14.781f, 13.0f)
                lineTo(17.219f, 13.0f)
                lineTo(17.438f, 14.0f)
                lineTo(14.563f, 14.0f)
                close()
                moveTo(14.125f, 16.0f)
                lineTo(17.875f, 16.0f)
                lineTo(19.031f, 21.219f)
                lineTo(19.063f, 21.344f)
                lineTo(19.094f, 21.438f)
                lineTo(19.375f, 22.0f)
                lineTo(12.625f, 22.0f)
                lineTo(12.906f, 21.438f)
                lineTo(12.938f, 21.344f)
                lineTo(12.969f, 21.219f)
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
