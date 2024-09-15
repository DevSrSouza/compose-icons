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

public val LineAwesomeIcons.BoxSolid: ImageVector
    get() {
        if (_boxSolid != null) {
            return _boxSolid!!
        }
        _boxSolid = Builder(name = "BoxSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.5f, 5.0f)
                lineTo(8.188f, 5.406f)
                lineTo(5.0f, 9.656f)
                lineTo(5.0f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 9.656f)
                lineTo(23.813f, 5.406f)
                lineTo(23.5f, 5.0f)
                close()
                moveTo(9.5f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 9.0f)
                lineTo(8.0f, 9.0f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(22.5f, 7.0f)
                lineTo(24.0f, 9.0f)
                lineTo(17.0f, 9.0f)
                close()
                moveTo(7.0f, 11.0f)
                lineTo(25.0f, 11.0f)
                lineTo(25.0f, 25.0f)
                lineTo(7.0f, 25.0f)
                close()
                moveTo(12.813f, 13.0f)
                curveTo(12.262f, 13.051f, 11.855f, 13.543f, 11.906f, 14.094f)
                curveTo(11.957f, 14.645f, 12.449f, 15.051f, 13.0f, 15.0f)
                lineTo(19.0f, 15.0f)
                curveTo(19.359f, 15.004f, 19.695f, 14.816f, 19.879f, 14.504f)
                curveTo(20.059f, 14.191f, 20.059f, 13.809f, 19.879f, 13.496f)
                curveTo(19.695f, 13.184f, 19.359f, 12.996f, 19.0f, 13.0f)
                lineTo(13.0f, 13.0f)
                curveTo(12.969f, 13.0f, 12.938f, 13.0f, 12.906f, 13.0f)
                curveTo(12.875f, 13.0f, 12.844f, 13.0f, 12.813f, 13.0f)
                close()
            }
        }
        .build()
        return _boxSolid!!
    }

private var _boxSolid: ImageVector? = null
