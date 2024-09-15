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

public val LineAwesomeIcons.TramSolid: ImageVector
    get() {
        if (_tramSolid != null) {
            return _tramSolid!!
        }
        _tramSolid = Builder(name = "TramSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 2.0f)
                lineTo(8.563f, 3.094f)
                lineTo(9.438f, 4.906f)
                lineTo(11.25f, 4.0f)
                lineTo(20.75f, 4.0f)
                lineTo(22.563f, 4.906f)
                lineTo(23.438f, 3.094f)
                lineTo(21.25f, 2.0f)
                close()
                moveTo(15.0f, 5.0f)
                lineTo(15.0f, 6.0f)
                lineTo(12.0f, 6.0f)
                curveTo(8.699f, 6.0f, 6.0f, 8.699f, 6.0f, 12.0f)
                lineTo(6.0f, 24.0f)
                curveTo(6.0f, 25.645f, 7.355f, 27.0f, 9.0f, 27.0f)
                lineTo(7.0f, 29.0f)
                lineTo(9.344f, 29.0f)
                lineTo(11.344f, 27.0f)
                lineTo(20.656f, 27.0f)
                lineTo(22.656f, 29.0f)
                lineTo(25.0f, 29.0f)
                lineTo(23.0f, 27.0f)
                curveTo(24.645f, 27.0f, 26.0f, 25.645f, 26.0f, 24.0f)
                lineTo(26.0f, 12.0f)
                curveTo(26.0f, 8.699f, 23.301f, 6.0f, 20.0f, 6.0f)
                lineTo(17.0f, 6.0f)
                lineTo(17.0f, 5.0f)
                close()
                moveTo(12.0f, 8.0f)
                lineTo(20.0f, 8.0f)
                curveTo(22.219f, 8.0f, 24.0f, 9.781f, 24.0f, 12.0f)
                lineTo(24.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 12.0f)
                curveTo(8.0f, 9.781f, 9.781f, 8.0f, 12.0f, 8.0f)
                close()
                moveTo(8.0f, 18.0f)
                lineTo(24.0f, 18.0f)
                lineTo(24.0f, 24.0f)
                curveTo(24.0f, 24.566f, 23.566f, 25.0f, 23.0f, 25.0f)
                lineTo(9.0f, 25.0f)
                curveTo(8.434f, 25.0f, 8.0f, 24.566f, 8.0f, 24.0f)
                close()
                moveTo(11.5f, 20.0f)
                curveTo(10.672f, 20.0f, 10.0f, 20.672f, 10.0f, 21.5f)
                curveTo(10.0f, 22.328f, 10.672f, 23.0f, 11.5f, 23.0f)
                curveTo(12.328f, 23.0f, 13.0f, 22.328f, 13.0f, 21.5f)
                curveTo(13.0f, 20.672f, 12.328f, 20.0f, 11.5f, 20.0f)
                close()
                moveTo(20.5f, 20.0f)
                curveTo(19.672f, 20.0f, 19.0f, 20.672f, 19.0f, 21.5f)
                curveTo(19.0f, 22.328f, 19.672f, 23.0f, 20.5f, 23.0f)
                curveTo(21.328f, 23.0f, 22.0f, 22.328f, 22.0f, 21.5f)
                curveTo(22.0f, 20.672f, 21.328f, 20.0f, 20.5f, 20.0f)
                close()
            }
        }
        .build()
        return _tramSolid!!
    }

private var _tramSolid: ImageVector? = null
