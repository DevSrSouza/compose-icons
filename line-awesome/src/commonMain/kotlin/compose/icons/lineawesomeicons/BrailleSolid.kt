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

public val LineAwesomeIcons.BrailleSolid: ImageVector
    get() {
        if (_brailleSolid != null) {
            return _brailleSolid!!
        }
        _brailleSolid = Builder(name = "BrailleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 6.0f)
                curveTo(10.895f, 6.0f, 10.0f, 6.895f, 10.0f, 8.0f)
                curveTo(10.0f, 9.105f, 10.895f, 10.0f, 12.0f, 10.0f)
                curveTo(13.105f, 10.0f, 14.0f, 9.105f, 14.0f, 8.0f)
                curveTo(14.0f, 6.895f, 13.105f, 6.0f, 12.0f, 6.0f)
                close()
                moveTo(20.0f, 6.0f)
                curveTo(18.895f, 6.0f, 18.0f, 6.895f, 18.0f, 8.0f)
                curveTo(18.0f, 9.105f, 18.895f, 10.0f, 20.0f, 10.0f)
                curveTo(21.105f, 10.0f, 22.0f, 9.105f, 22.0f, 8.0f)
                curveTo(22.0f, 6.895f, 21.105f, 6.0f, 20.0f, 6.0f)
                close()
                moveTo(12.0f, 14.0f)
                curveTo(10.895f, 14.0f, 10.0f, 14.895f, 10.0f, 16.0f)
                curveTo(10.0f, 17.105f, 10.895f, 18.0f, 12.0f, 18.0f)
                curveTo(13.105f, 18.0f, 14.0f, 17.105f, 14.0f, 16.0f)
                curveTo(14.0f, 14.895f, 13.105f, 14.0f, 12.0f, 14.0f)
                close()
                moveTo(20.0f, 14.0f)
                curveTo(18.895f, 14.0f, 18.0f, 14.895f, 18.0f, 16.0f)
                curveTo(18.0f, 17.105f, 18.895f, 18.0f, 20.0f, 18.0f)
                curveTo(21.105f, 18.0f, 22.0f, 17.105f, 22.0f, 16.0f)
                curveTo(22.0f, 14.895f, 21.105f, 14.0f, 20.0f, 14.0f)
                close()
                moveTo(12.0f, 22.0f)
                curveTo(10.895f, 22.0f, 10.0f, 22.895f, 10.0f, 24.0f)
                curveTo(10.0f, 25.105f, 10.895f, 26.0f, 12.0f, 26.0f)
                curveTo(13.105f, 26.0f, 14.0f, 25.105f, 14.0f, 24.0f)
                curveTo(14.0f, 22.895f, 13.105f, 22.0f, 12.0f, 22.0f)
                close()
                moveTo(20.0f, 22.0f)
                curveTo(18.895f, 22.0f, 18.0f, 22.895f, 18.0f, 24.0f)
                curveTo(18.0f, 25.105f, 18.895f, 26.0f, 20.0f, 26.0f)
                curveTo(21.105f, 26.0f, 22.0f, 25.105f, 22.0f, 24.0f)
                curveTo(22.0f, 22.895f, 21.105f, 22.0f, 20.0f, 22.0f)
                close()
            }
        }
        .build()
        return _brailleSolid!!
    }

private var _brailleSolid: ImageVector? = null
