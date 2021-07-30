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

public val LineAwesomeIcons.PauseCircleSolid: ImageVector
    get() {
        if (_pauseCircleSolid != null) {
            return _pauseCircleSolid!!
        }
        _pauseCircleSolid = Builder(name = "PauseCircleSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 4.0f)
                curveTo(9.3828f, 4.0f, 4.0f, 9.3828f, 4.0f, 16.0f)
                curveTo(4.0f, 22.6172f, 9.3828f, 28.0f, 16.0f, 28.0f)
                curveTo(22.6172f, 28.0f, 28.0f, 22.6172f, 28.0f, 16.0f)
                curveTo(28.0f, 9.3828f, 22.6172f, 4.0f, 16.0f, 4.0f)
                close()
                moveTo(16.0f, 6.0f)
                curveTo(21.5352f, 6.0f, 26.0f, 10.4648f, 26.0f, 16.0f)
                curveTo(26.0f, 21.5352f, 21.5352f, 26.0f, 16.0f, 26.0f)
                curveTo(10.4648f, 26.0f, 6.0f, 21.5352f, 6.0f, 16.0f)
                curveTo(6.0f, 10.4648f, 10.4648f, 6.0f, 16.0f, 6.0f)
                close()
                moveTo(12.0f, 11.0f)
                lineTo(12.0f, 21.0f)
                lineTo(14.0f, 21.0f)
                lineTo(14.0f, 11.0f)
                close()
                moveTo(18.0f, 11.0f)
                lineTo(18.0f, 21.0f)
                lineTo(20.0f, 21.0f)
                lineTo(20.0f, 11.0f)
                close()
            }
        }
        .build()
        return _pauseCircleSolid!!
    }

private var _pauseCircleSolid: ImageVector? = null
