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

public val LineAwesomeIcons.DrawPolygonSolid: ImageVector
    get() {
        if (_drawPolygonSolid != null) {
            return _drawPolygonSolid!!
        }
        _drawPolygonSolid = Builder(name = "DrawPolygonSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(12.895f, 4.0f, 12.0f, 4.895f, 12.0f, 6.0f)
                curveTo(12.0f, 6.02f, 12.0f, 6.043f, 12.0f, 6.063f)
                lineTo(6.938f, 9.25f)
                curveTo(6.656f, 9.102f, 6.34f, 9.0f, 6.0f, 9.0f)
                curveTo(4.895f, 9.0f, 4.0f, 9.895f, 4.0f, 11.0f)
                curveTo(4.0f, 11.738f, 4.402f, 12.371f, 5.0f, 12.719f)
                lineTo(5.0f, 24.281f)
                curveTo(4.402f, 24.629f, 4.0f, 25.262f, 4.0f, 26.0f)
                curveTo(4.0f, 27.105f, 4.895f, 28.0f, 6.0f, 28.0f)
                curveTo(6.738f, 28.0f, 7.371f, 27.598f, 7.719f, 27.0f)
                lineTo(20.281f, 27.0f)
                curveTo(20.629f, 27.598f, 21.262f, 28.0f, 22.0f, 28.0f)
                curveTo(23.105f, 28.0f, 24.0f, 27.105f, 24.0f, 26.0f)
                curveTo(24.0f, 25.602f, 23.891f, 25.219f, 23.688f, 24.906f)
                lineTo(26.125f, 20.0f)
                curveTo(27.172f, 19.934f, 28.0f, 19.063f, 28.0f, 18.0f)
                curveTo(28.0f, 17.023f, 27.301f, 16.207f, 26.375f, 16.031f)
                lineTo(24.469f, 10.313f)
                curveTo(24.785f, 9.957f, 25.0f, 9.512f, 25.0f, 9.0f)
                curveTo(25.0f, 7.895f, 24.105f, 7.0f, 23.0f, 7.0f)
                curveTo(22.488f, 7.0f, 22.043f, 7.215f, 21.688f, 7.531f)
                lineTo(15.969f, 5.594f)
                curveTo(15.781f, 4.684f, 14.965f, 4.0f, 14.0f, 4.0f)
                close()
                moveTo(15.313f, 7.5f)
                lineTo(21.031f, 9.375f)
                curveTo(21.184f, 10.18f, 21.82f, 10.816f, 22.625f, 10.969f)
                lineTo(24.531f, 16.656f)
                curveTo(24.207f, 17.012f, 24.0f, 17.48f, 24.0f, 18.0f)
                curveTo(24.0f, 18.414f, 24.129f, 18.805f, 24.344f, 19.125f)
                lineTo(21.875f, 24.0f)
                curveTo(21.188f, 24.043f, 20.609f, 24.438f, 20.281f, 25.0f)
                lineTo(7.719f, 25.0f)
                curveTo(7.543f, 24.699f, 7.301f, 24.457f, 7.0f, 24.281f)
                lineTo(7.0f, 12.719f)
                curveTo(7.598f, 12.371f, 8.0f, 11.738f, 8.0f, 11.0f)
                curveTo(8.0f, 10.98f, 8.0f, 10.957f, 8.0f, 10.938f)
                lineTo(13.063f, 7.75f)
                curveTo(13.344f, 7.898f, 13.66f, 8.0f, 14.0f, 8.0f)
                curveTo(14.504f, 8.0f, 14.961f, 7.809f, 15.313f, 7.5f)
                close()
            }
        }
        .build()
        return _drawPolygonSolid!!
    }

private var _drawPolygonSolid: ImageVector? = null
