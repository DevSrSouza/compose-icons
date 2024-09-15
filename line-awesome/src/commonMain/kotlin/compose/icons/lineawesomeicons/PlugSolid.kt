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

public val LineAwesomeIcons.PlugSolid: ImageVector
    get() {
        if (_plugSolid != null) {
            return _plugSolid!!
        }
        _plugSolid = Builder(name = "PlugSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.594f)
                lineTo(18.0f, 7.563f)
                lineTo(15.719f, 5.281f)
                lineTo(14.281f, 6.719f)
                lineTo(15.031f, 7.469f)
                lineTo(9.906f, 12.594f)
                curveTo(8.695f, 13.805f, 8.695f, 15.789f, 9.906f, 17.0f)
                lineTo(11.75f, 18.844f)
                lineTo(4.281f, 26.281f)
                lineTo(5.719f, 27.719f)
                lineTo(13.156f, 20.25f)
                lineTo(15.0f, 22.094f)
                curveTo(16.211f, 23.305f, 18.195f, 23.305f, 19.406f, 22.094f)
                lineTo(24.531f, 16.969f)
                lineTo(25.281f, 17.719f)
                lineTo(26.719f, 16.281f)
                lineTo(24.438f, 14.0f)
                lineTo(28.406f, 10.0f)
                lineTo(27.0f, 8.594f)
                lineTo(23.0f, 12.563f)
                lineTo(19.438f, 9.0f)
                lineTo(23.406f, 5.0f)
                close()
                moveTo(16.438f, 8.875f)
                lineTo(23.125f, 15.563f)
                lineTo(18.0f, 20.688f)
                curveTo(17.613f, 21.074f, 16.793f, 21.074f, 16.406f, 20.688f)
                lineTo(11.313f, 15.594f)
                curveTo(10.926f, 15.207f, 10.926f, 14.387f, 11.313f, 14.0f)
                close()
            }
        }
        .build()
        return _plugSolid!!
    }

private var _plugSolid: ImageVector? = null
