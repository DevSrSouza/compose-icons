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

public val FilledGroup.ArrowStepInRight: ImageVector
    get() {
        if (_arrowStepInRight != null) {
            return _arrowStepInRight!!
        }
        _arrowStepInRight = Builder(name = "ArrowStepInRight", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.7055f, 16.2342f)
                curveTo(8.4207f, 16.5349f, 8.4335f, 17.0096f, 8.7342f, 17.2945f)
                curveTo(9.0349f, 17.5793f, 9.5096f, 17.5665f, 9.7945f, 17.2658f)
                lineTo(14.2945f, 12.5158f)
                curveTo(14.5685f, 12.2265f, 14.5685f, 11.7735f, 14.2945f, 11.4842f)
                lineTo(9.7945f, 6.7342f)
                curveTo(9.5096f, 6.4335f, 9.0349f, 6.4207f, 8.7342f, 6.7055f)
                curveTo(8.4335f, 6.9904f, 8.4207f, 7.4651f, 8.7055f, 7.7658f)
                lineTo(12.0064f, 11.25f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 11.25f, 2.0f, 11.5858f, 2.0f, 12.0f)
                curveTo(2.0f, 12.4142f, 2.3358f, 12.75f, 2.75f, 12.75f)
                horizontalLineTo(12.0063f)
                lineTo(8.7055f, 16.2342f)
                close()
                moveTo(22.0f, 12.0f)
                curveTo(22.0f, 10.3431f, 20.6569f, 9.0f, 19.0f, 9.0f)
                curveTo(17.3431f, 9.0f, 16.0f, 10.3431f, 16.0f, 12.0f)
                curveTo(16.0f, 13.6569f, 17.3431f, 15.0f, 19.0f, 15.0f)
                curveTo(20.6569f, 15.0f, 22.0f, 13.6569f, 22.0f, 12.0f)
                close()
            }
        }
        .build()
        return _arrowStepInRight!!
    }

private var _arrowStepInRight: ImageVector? = null
