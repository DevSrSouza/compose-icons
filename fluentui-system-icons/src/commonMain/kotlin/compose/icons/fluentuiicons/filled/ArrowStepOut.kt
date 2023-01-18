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

public val FilledGroup.ArrowStepOut: ImageVector
    get() {
        if (_arrowStepOut != null) {
            return _arrowStepOut!!
        }
        _arrowStepOut = Builder(name = "ArrowStepOut", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.75f, 13.75f)
                curveTo(12.75f, 14.1642f, 12.4142f, 14.5f, 12.0f, 14.5f)
                curveTo(11.5858f, 14.5f, 11.25f, 14.1642f, 11.25f, 13.75f)
                verticalLineTo(4.4936f)
                lineTo(7.7658f, 7.7945f)
                curveTo(7.4651f, 8.0793f, 6.9904f, 8.0665f, 6.7055f, 7.7658f)
                curveTo(6.4207f, 7.4651f, 6.4335f, 6.9904f, 6.7342f, 6.7055f)
                lineTo(11.4842f, 2.2055f)
                curveTo(11.7735f, 1.9315f, 12.2265f, 1.9315f, 12.5158f, 2.2055f)
                lineTo(17.2658f, 6.7055f)
                curveTo(17.5665f, 6.9904f, 17.5793f, 7.4651f, 17.2945f, 7.7658f)
                curveTo(17.0096f, 8.0665f, 16.5349f, 8.0793f, 16.2342f, 7.7945f)
                lineTo(12.75f, 4.4936f)
                verticalLineTo(13.75f)
                close()
                moveTo(15.0f, 19.0f)
                curveTo(15.0f, 20.6569f, 13.6569f, 22.0f, 12.0f, 22.0f)
                curveTo(10.3431f, 22.0f, 9.0f, 20.6569f, 9.0f, 19.0f)
                curveTo(9.0f, 17.3431f, 10.3431f, 16.0f, 12.0f, 16.0f)
                curveTo(13.6569f, 16.0f, 15.0f, 17.3431f, 15.0f, 19.0f)
                close()
            }
        }
        .build()
        return _arrowStepOut!!
    }

private var _arrowStepOut: ImageVector? = null
