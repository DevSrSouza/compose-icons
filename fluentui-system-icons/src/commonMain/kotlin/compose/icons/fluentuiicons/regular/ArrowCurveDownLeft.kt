package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.ArrowCurveDownLeft: ImageVector
    get() {
        if (_arrowCurveDownLeft != null) {
            return _arrowCurveDownLeft!!
        }
        _arrowCurveDownLeft = Builder(name = "ArrowCurveDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.4012f, 3.378f)
                curveTo(16.1957f, 3.0184f, 15.7375f, 2.8934f, 15.3779f, 3.0989f)
                curveTo(13.109f, 4.3954f, 11.9867f, 6.0521f, 11.4569f, 7.8085f)
                curveTo(10.9888f, 9.3608f, 10.9943f, 10.9741f, 10.9991f, 12.3513f)
                curveTo(10.9995f, 12.4866f, 11.0f, 12.6196f, 11.0f, 12.7501f)
                verticalLineTo(18.4394f)
                lineTo(7.2803f, 14.7197f)
                curveTo(6.9874f, 14.4268f, 6.5126f, 14.4268f, 6.2197f, 14.7197f)
                curveTo(5.9268f, 15.0126f, 5.9268f, 15.4875f, 6.2197f, 15.7804f)
                lineTo(11.2197f, 20.7803f)
                curveTo(11.5126f, 21.0732f, 11.9874f, 21.0732f, 12.2803f, 20.7803f)
                lineTo(17.2803f, 15.7804f)
                curveTo(17.5732f, 15.4875f, 17.5732f, 15.0126f, 17.2803f, 14.7197f)
                curveTo(16.9874f, 14.4268f, 16.5126f, 14.4268f, 16.2197f, 14.7197f)
                lineTo(12.5f, 18.4394f)
                verticalLineTo(12.7501f)
                curveTo(12.5f, 12.6234f, 12.4997f, 12.4968f, 12.4994f, 12.3704f)
                curveTo(12.4962f, 10.9589f, 12.493f, 9.5681f, 12.8931f, 8.2416f)
                curveTo(13.3133f, 6.8481f, 14.191f, 5.5048f, 16.1221f, 4.4013f)
                curveTo(16.4817f, 4.1958f, 16.6067f, 3.7377f, 16.4012f, 3.378f)
                close()
            }
        }
        .build()
        return _arrowCurveDownLeft!!
    }

private var _arrowCurveDownLeft: ImageVector? = null
