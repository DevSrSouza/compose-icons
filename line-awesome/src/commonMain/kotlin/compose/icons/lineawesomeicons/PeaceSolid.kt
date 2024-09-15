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

public val LineAwesomeIcons.PeaceSolid: ImageVector
    get() {
        if (_peaceSolid != null) {
            return _peaceSolid!!
        }
        _peaceSolid = Builder(name = "PeaceSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(15.0f, 5.051f)
                lineTo(15.0f, 15.518f)
                lineTo(6.801f, 22.016f)
                curveTo(5.665f, 20.285f, 5.0f, 18.22f, 5.0f, 16.0f)
                curveTo(5.0f, 10.273f, 9.402f, 5.558f, 15.0f, 5.051f)
                close()
                moveTo(17.0f, 5.051f)
                curveTo(22.598f, 5.558f, 27.0f, 10.273f, 27.0f, 16.0f)
                curveTo(27.0f, 18.221f, 26.334f, 20.287f, 25.197f, 22.018f)
                lineTo(17.0f, 15.518f)
                lineTo(17.0f, 5.051f)
                close()
                moveTo(15.0f, 18.07f)
                lineTo(15.0f, 26.949f)
                curveTo(12.275f, 26.702f, 9.839f, 25.455f, 8.051f, 23.58f)
                lineTo(15.0f, 18.07f)
                close()
                moveTo(17.0f, 18.07f)
                lineTo(23.949f, 23.58f)
                curveTo(22.161f, 25.455f, 19.725f, 26.702f, 17.0f, 26.949f)
                lineTo(17.0f, 18.07f)
                close()
            }
        }
        .build()
        return _peaceSolid!!
    }

private var _peaceSolid: ImageVector? = null
