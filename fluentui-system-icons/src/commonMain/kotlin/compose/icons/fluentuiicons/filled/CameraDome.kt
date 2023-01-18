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

public val FilledGroup.CameraDome: ImageVector
    get() {
        if (_cameraDome != null) {
            return _cameraDome!!
        }
        _cameraDome = Builder(name = "CameraDome", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 3.75f)
                curveTo(2.0f, 2.7835f, 2.7835f, 2.0f, 3.75f, 2.0f)
                horizontalLineTo(20.25f)
                curveTo(21.2165f, 2.0f, 22.0f, 2.7835f, 22.0f, 3.75f)
                curveTo(22.0f, 4.7165f, 21.2165f, 5.5f, 20.25f, 5.5f)
                horizontalLineTo(3.75f)
                curveTo(2.7835f, 5.5f, 2.0f, 4.7165f, 2.0f, 3.75f)
                close()
                moveTo(12.0f, 17.5f)
                curveTo(14.2091f, 17.5f, 16.0f, 15.7091f, 16.0f, 13.5f)
                curveTo(16.0f, 11.2909f, 14.2091f, 9.5f, 12.0f, 9.5f)
                curveTo(9.7909f, 9.5f, 8.0f, 11.2909f, 8.0f, 13.5f)
                curveTo(8.0f, 15.7091f, 9.7909f, 17.5f, 12.0f, 17.5f)
                close()
                moveTo(14.5f, 13.5f)
                curveTo(14.5f, 14.8807f, 13.3807f, 16.0f, 12.0f, 16.0f)
                curveTo(10.6193f, 16.0f, 9.5f, 14.8807f, 9.5f, 13.5f)
                curveTo(9.5f, 12.1193f, 10.6193f, 11.0f, 12.0f, 11.0f)
                curveTo(13.3807f, 11.0f, 14.5f, 12.1193f, 14.5f, 13.5f)
                close()
                moveTo(3.0f, 7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.0f)
                curveTo(21.0f, 17.9706f, 16.9706f, 22.0f, 12.0f, 22.0f)
                curveTo(7.0294f, 22.0f, 3.0f, 17.9706f, 3.0f, 13.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(12.0f, 19.0f)
                curveTo(15.0376f, 19.0f, 17.5f, 16.5376f, 17.5f, 13.5f)
                curveTo(17.5f, 10.4624f, 15.0376f, 8.0f, 12.0f, 8.0f)
                curveTo(8.9624f, 8.0f, 6.5f, 10.4624f, 6.5f, 13.5f)
                curveTo(6.5f, 16.5376f, 8.9624f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _cameraDome!!
    }

private var _cameraDome: ImageVector? = null
