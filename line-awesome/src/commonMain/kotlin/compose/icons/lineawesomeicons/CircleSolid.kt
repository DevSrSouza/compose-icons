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

public val LineAwesomeIcons.CircleSolid: ImageVector
    get() {
        if (_circleSolid != null) {
            return _circleSolid!!
        }
        _circleSolid = Builder(name = "CircleSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3789f, 4.0f, 4.0f, 9.3789f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6211f, 9.3789f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6211f, 28.0f, 28.0f, 22.6211f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3789f, 22.6211f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.082f, 5.0f, 27.0f, 9.918f, 27.0f, 16.0f)
                curveTo(27.0f, 22.082f, 22.082f, 27.0f, 16.0f, 27.0f)
                curveTo(9.918f, 27.0f, 5.0f, 22.082f, 5.0f, 16.0f)
                curveTo(5.0f, 9.918f, 9.918f, 5.0f, 16.0f, 5.0f)
                close()
            }
        }
        .build()
        return _circleSolid!!
    }

private var _circleSolid: ImageVector? = null
