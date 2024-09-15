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

public val LineAwesomeIcons.FutbolSolid: ImageVector
    get() {
        if (_futbolSolid != null) {
            return _futbolSolid!!
        }
        _futbolSolid = Builder(name = "FutbolSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(16.602f, 5.0f, 17.176f, 5.063f, 17.75f, 5.156f)
                lineTo(16.0f, 6.406f)
                lineTo(14.25f, 5.156f)
                curveTo(14.82f, 5.066f, 15.402f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.813f, 5.844f)
                lineTo(15.406f, 8.469f)
                lineTo(16.0f, 8.906f)
                lineTo(16.594f, 8.469f)
                lineTo(20.188f, 5.844f)
                curveTo(21.785f, 6.508f, 23.195f, 7.523f, 24.313f, 8.813f)
                lineTo(22.938f, 13.094f)
                lineTo(22.719f, 13.781f)
                lineTo(23.313f, 14.188f)
                lineTo(26.938f, 16.844f)
                curveTo(26.805f, 18.605f, 26.266f, 20.258f, 25.406f, 21.688f)
                lineTo(20.125f, 21.688f)
                lineTo(19.906f, 22.375f)
                lineTo(18.5f, 26.719f)
                curveTo(17.699f, 26.906f, 16.859f, 27.0f, 16.0f, 27.0f)
                curveTo(15.105f, 27.0f, 14.238f, 26.887f, 13.406f, 26.688f)
                lineTo(12.031f, 22.406f)
                lineTo(11.813f, 21.719f)
                lineTo(6.594f, 21.719f)
                curveTo(5.719f, 20.281f, 5.199f, 18.621f, 5.063f, 16.844f)
                lineTo(8.656f, 14.219f)
                lineTo(9.25f, 13.813f)
                lineTo(9.031f, 13.125f)
                lineTo(7.625f, 8.875f)
                curveTo(8.75f, 7.555f, 10.184f, 6.516f, 11.813f, 5.844f)
                close()
                moveTo(16.0f, 10.094f)
                lineTo(15.406f, 10.531f)
                lineTo(10.844f, 13.844f)
                lineTo(10.281f, 14.281f)
                lineTo(10.5f, 14.969f)
                lineTo(12.25f, 20.313f)
                lineTo(12.469f, 21.0f)
                lineTo(19.531f, 21.0f)
                lineTo(19.75f, 20.313f)
                lineTo(21.5f, 14.969f)
                lineTo(21.719f, 14.281f)
                lineTo(21.156f, 13.844f)
                lineTo(16.594f, 10.531f)
                close()
                moveTo(25.75f, 10.906f)
                curveTo(26.297f, 11.953f, 26.656f, 13.102f, 26.844f, 14.313f)
                lineTo(25.063f, 13.031f)
                close()
                moveTo(6.219f, 10.969f)
                lineTo(6.906f, 13.031f)
                lineTo(5.156f, 14.313f)
                curveTo(5.34f, 13.125f, 5.688f, 12.0f, 6.219f, 10.969f)
                close()
                moveTo(16.0f, 12.594f)
                lineTo(19.375f, 15.031f)
                lineTo(18.094f, 19.0f)
                lineTo(13.906f, 19.0f)
                lineTo(12.625f, 15.031f)
                close()
                moveTo(21.594f, 23.688f)
                lineTo(23.844f, 23.688f)
                curveTo(22.992f, 24.566f, 22.012f, 25.293f, 20.906f, 25.844f)
                close()
                moveTo(8.156f, 23.719f)
                lineTo(10.344f, 23.719f)
                lineTo(11.031f, 25.813f)
                curveTo(9.961f, 25.27f, 8.988f, 24.563f, 8.156f, 23.719f)
                close()
            }
        }
        .build()
        return _futbolSolid!!
    }

private var _futbolSolid: ImageVector? = null
