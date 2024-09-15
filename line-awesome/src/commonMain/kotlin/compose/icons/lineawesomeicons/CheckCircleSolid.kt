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

public val LineAwesomeIcons.CheckCircleSolid: ImageVector
    get() {
        if (_checkCircleSolid != null) {
            return _checkCircleSolid!!
        }
        _checkCircleSolid = Builder(name = "CheckCircleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.801f, 3.0f, 3.0f, 8.801f, 3.0f, 16.0f)
                curveTo(3.0f, 23.199f, 8.801f, 29.0f, 16.0f, 29.0f)
                curveTo(23.199f, 29.0f, 29.0f, 23.199f, 29.0f, 16.0f)
                curveTo(29.0f, 14.602f, 28.813f, 13.207f, 28.313f, 11.906f)
                lineTo(26.688f, 13.5f)
                curveTo(26.887f, 14.301f, 27.0f, 15.102f, 27.0f, 16.0f)
                curveTo(27.0f, 22.102f, 22.102f, 27.0f, 16.0f, 27.0f)
                curveTo(9.898f, 27.0f, 5.0f, 22.102f, 5.0f, 16.0f)
                curveTo(5.0f, 9.898f, 9.898f, 5.0f, 16.0f, 5.0f)
                curveTo(19.0f, 5.0f, 21.695f, 6.195f, 23.594f, 8.094f)
                lineTo(25.0f, 6.688f)
                curveTo(22.699f, 4.387f, 19.5f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(27.281f, 7.281f)
                lineTo(16.0f, 18.563f)
                lineTo(11.719f, 14.281f)
                lineTo(10.281f, 15.719f)
                lineTo(15.281f, 20.719f)
                lineTo(16.0f, 21.406f)
                lineTo(16.719f, 20.719f)
                lineTo(28.719f, 8.719f)
                close()
            }
        }
        .build()
        return _checkCircleSolid!!
    }

private var _checkCircleSolid: ImageVector? = null
