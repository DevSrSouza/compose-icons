package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.Flash: ImageVector
    get() {
        if (_flash != null) {
            return _flash!!
        }
        _flash = Builder(name = "Flash", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.425f, 2.8305f)
                curveTo(7.6024f, 2.3325f, 8.0739f, 2.0f, 8.6026f, 2.0f)
                horizontalLineTo(15.0562f)
                curveTo(15.9094f, 2.0f, 16.5118f, 2.8359f, 16.242f, 3.6453f)
                lineTo(14.7905f, 8.0f)
                horizontalLineTo(18.7492f)
                curveTo(19.8534f, 8.0f, 20.4153f, 9.3268f, 19.647f, 10.1198f)
                lineTo(8.586f, 21.536f)
                curveTo(7.5323f, 22.6236f, 5.714f, 21.6422f, 6.045f, 20.1645f)
                lineTo(7.3142f, 14.4964f)
                lineTo(5.7457f, 14.4904f)
                curveTo(4.539f, 14.4858f, 3.699f, 13.2899f, 4.1039f, 12.1532f)
                lineTo(7.425f, 2.8305f)
                close()
            }
        }
        .build()
        return _flash!!
    }

private var _flash: ImageVector? = null
