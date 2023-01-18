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

public val FilledGroup.ArrowExportUp: ImageVector
    get() {
        if (_arrowExportUp != null) {
            return _arrowExportUp!!
        }
        _arrowExportUp = Builder(name = "ArrowExportUp", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.7071f, 2.2929f)
                curveTo(12.3166f, 1.9024f, 11.6834f, 1.9024f, 11.2929f, 2.2929f)
                lineTo(6.2929f, 7.2929f)
                curveTo(5.9024f, 7.6834f, 5.9024f, 8.3166f, 6.2929f, 8.7071f)
                curveTo(6.6834f, 9.0976f, 7.3166f, 9.0976f, 7.7071f, 8.7071f)
                lineTo(11.0f, 5.4142f)
                verticalLineTo(18.0f)
                curveTo(11.0f, 18.5523f, 11.4477f, 19.0f, 12.0f, 19.0f)
                curveTo(12.5523f, 19.0f, 13.0f, 18.5523f, 13.0f, 18.0f)
                verticalLineTo(5.4142f)
                lineTo(16.2929f, 8.7071f)
                curveTo(16.6834f, 9.0976f, 17.3166f, 9.0976f, 17.7071f, 8.7071f)
                curveTo(18.0976f, 8.3166f, 18.0976f, 7.6834f, 17.7071f, 7.2929f)
                lineTo(12.7071f, 2.2929f)
                close()
                moveTo(5.25f, 20.5f)
                curveTo(4.8358f, 20.5f, 4.5f, 20.8358f, 4.5f, 21.25f)
                curveTo(4.5f, 21.6642f, 4.8358f, 22.0f, 5.25f, 22.0f)
                horizontalLineTo(18.75f)
                curveTo(19.1642f, 22.0f, 19.5f, 21.6642f, 19.5f, 21.25f)
                curveTo(19.5f, 20.8358f, 19.1642f, 20.5f, 18.75f, 20.5f)
                horizontalLineTo(5.25f)
                close()
            }
        }
        .build()
        return _arrowExportUp!!
    }

private var _arrowExportUp: ImageVector? = null
