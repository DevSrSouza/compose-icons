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

public val LineAwesomeIcons.CubeSolid: ImageVector
    get() {
        if (_cubeSolid != null) {
            return _cubeSolid!!
        }
        _cubeSolid = Builder(name = "CubeSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.406f)
                lineTo(15.594f, 4.594f)
                lineTo(5.594f, 9.094f)
                lineTo(5.0f, 9.344f)
                lineTo(5.0f, 22.031f)
                lineTo(5.5f, 22.313f)
                lineTo(15.5f, 27.875f)
                lineTo(16.0f, 28.156f)
                lineTo(16.5f, 27.875f)
                lineTo(26.5f, 22.313f)
                lineTo(27.0f, 22.031f)
                lineTo(27.0f, 9.344f)
                lineTo(26.406f, 9.094f)
                lineTo(16.406f, 4.594f)
                close()
                moveTo(16.0f, 6.594f)
                lineTo(23.688f, 10.031f)
                lineTo(16.0f, 13.875f)
                lineTo(8.313f, 10.031f)
                close()
                moveTo(7.0f, 11.625f)
                lineTo(15.0f, 15.625f)
                lineTo(15.0f, 25.281f)
                lineTo(7.0f, 20.844f)
                close()
                moveTo(25.0f, 11.625f)
                lineTo(25.0f, 20.844f)
                lineTo(17.0f, 25.281f)
                lineTo(17.0f, 15.625f)
                close()
            }
        }
        .build()
        return _cubeSolid!!
    }

private var _cubeSolid: ImageVector? = null
