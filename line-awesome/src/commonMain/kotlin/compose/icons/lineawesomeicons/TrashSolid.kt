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

public val LineAwesomeIcons.TrashSolid: ImageVector
    get() {
        if (_trashSolid != null) {
            return _trashSolid!!
        }
        _trashSolid = Builder(name = "TrashSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 4.0f)
                curveTo(13.477f, 4.0f, 12.941f, 4.184f, 12.563f, 4.563f)
                curveTo(12.184f, 4.941f, 12.0f, 5.477f, 12.0f, 6.0f)
                lineTo(12.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 9.0f)
                lineTo(6.094f, 9.0f)
                lineTo(8.0f, 27.094f)
                lineTo(8.094f, 28.0f)
                lineTo(23.906f, 28.0f)
                lineTo(24.0f, 27.094f)
                lineTo(25.906f, 9.0f)
                lineTo(27.0f, 9.0f)
                lineTo(27.0f, 7.0f)
                lineTo(20.0f, 7.0f)
                lineTo(20.0f, 6.0f)
                curveTo(20.0f, 5.477f, 19.816f, 4.941f, 19.438f, 4.563f)
                curveTo(19.059f, 4.184f, 18.523f, 4.0f, 18.0f, 4.0f)
                close()
                moveTo(14.0f, 6.0f)
                lineTo(18.0f, 6.0f)
                lineTo(18.0f, 7.0f)
                lineTo(14.0f, 7.0f)
                close()
                moveTo(8.125f, 9.0f)
                lineTo(23.875f, 9.0f)
                lineTo(22.094f, 26.0f)
                lineTo(9.906f, 26.0f)
                close()
                moveTo(12.0f, 12.0f)
                lineTo(12.0f, 23.0f)
                lineTo(14.0f, 23.0f)
                lineTo(14.0f, 12.0f)
                close()
                moveTo(15.0f, 12.0f)
                lineTo(15.0f, 23.0f)
                lineTo(17.0f, 23.0f)
                lineTo(17.0f, 12.0f)
                close()
                moveTo(18.0f, 12.0f)
                lineTo(18.0f, 23.0f)
                lineTo(20.0f, 23.0f)
                lineTo(20.0f, 12.0f)
                close()
            }
        }
        .build()
        return _trashSolid!!
    }

private var _trashSolid: ImageVector? = null
