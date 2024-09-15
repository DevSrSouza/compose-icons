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
                curveTo(13.801f, 9.0f, 12.0f, 10.801f, 12.0f, 13.0f)
                curveTo(12.0f, 14.199f, 12.559f, 15.266f, 13.406f, 16.0f)
                lineTo(12.0f, 16.0f)
                curveTo(11.969f, 16.0f, 11.938f, 16.0f, 11.906f, 16.0f)
                curveTo(11.355f, 16.027f, 10.926f, 16.496f, 10.953f, 17.047f)
                curveTo(10.98f, 17.598f, 11.449f, 18.027f, 12.0f, 18.0f)
                lineTo(12.5f, 18.0f)
                lineTo(11.094f, 21.563f)
                lineTo(10.375f, 23.0f)
                lineTo(9.0f, 23.0f)
                curveTo(8.969f, 23.0f, 8.938f, 23.0f, 8.906f, 23.0f)
                curveTo(8.434f, 23.031f, 8.051f, 23.387f, 7.98f, 23.855f)
                curveTo(7.914f, 24.32f, 8.184f, 24.773f, 8.625f, 24.938f)
                lineTo(7.281f, 26.281f)
                lineTo(7.0f, 26.594f)
                lineTo(7.0f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(25.0f, 26.594f)
                lineTo(24.719f, 26.281f)
                lineTo(23.375f, 24.938f)
                curveTo(23.832f, 24.766f, 24.102f, 24.289f, 24.008f, 23.809f)
                curveTo(23.918f, 23.328f, 23.488f, 22.988f, 23.0f, 23.0f)
                lineTo(21.625f, 23.0f)
                lineTo(20.906f, 21.563f)
                lineTo(19.5f, 18.0f)
                lineTo(20.0f, 18.0f)
                curveTo(20.359f, 18.004f, 20.695f, 17.816f, 20.879f, 17.504f)
                curveTo(21.059f, 17.191f, 21.059f, 16.809f, 20.879f, 16.496f)
                curveTo(20.695f, 16.184f, 20.359f, 15.996f, 20.0f, 16.0f)
                lineTo(18.594f, 16.0f)
                curveTo(19.441f, 15.266f, 20.0f, 14.199f, 20.0f, 13.0f)
                curveTo(20.0f, 10.801f, 18.199f, 9.0f, 16.0f, 9.0f)
                close()
                moveTo(16.0f, 11.0f)
                curveTo(17.117f, 11.0f, 18.0f, 11.883f, 18.0f, 13.0f)
                curveTo(18.0f, 14.117f, 17.117f, 15.0f, 16.0f, 15.0f)
                curveTo(14.883f, 15.0f, 14.0f, 14.117f, 14.0f, 13.0f)
                curveTo(14.0f, 11.883f, 14.883f, 11.0f, 16.0f, 11.0f)
                close()
                moveTo(14.688f, 18.0f)
                lineTo(17.313f, 18.0f)
                lineTo(19.063f, 22.375f)
                lineTo(19.094f, 22.406f)
                lineTo(19.094f, 22.438f)
                lineTo(19.375f, 23.0f)
                lineTo(12.625f, 23.0f)
                lineTo(12.906f, 22.438f)
                lineTo(12.906f, 22.406f)
                lineTo(12.938f, 22.375f)
                close()
                moveTo(11.438f, 25.0f)
                lineTo(20.563f, 25.0f)
                lineTo(22.563f, 27.0f)
                lineTo(9.438f, 27.0f)
                close()
            }
        }
        .build()
        return _chessPawnSolid!!
    }

private var _chessPawnSolid: ImageVector? = null
