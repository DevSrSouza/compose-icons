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

public val FilledGroup.ArrowCurveDownLeft: ImageVector
    get() {
        if (_arrowCurveDownLeft != null) {
            return _arrowCurveDownLeft!!
        }
        _arrowCurveDownLeft = Builder(name = "ArrowCurveDownLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.8682f, 3.254f)
                curveTo(17.1423f, 3.7335f, 16.9757f, 4.3444f, 16.4961f, 4.6184f)
                curveTo(14.6213f, 5.6897f, 13.7845f, 6.9808f, 13.3824f, 8.3139f)
                curveTo(12.9937f, 9.6029f, 12.9965f, 10.957f, 12.9995f, 12.3757f)
                curveTo(12.9997f, 12.5f, 13.0f, 12.6248f, 13.0f, 12.7501f)
                verticalLineTo(17.8358f)
                lineTo(16.2929f, 14.543f)
                curveTo(16.6834f, 14.1524f, 17.3166f, 14.1524f, 17.7071f, 14.543f)
                curveTo(18.0976f, 14.9335f, 18.0976f, 15.5666f, 17.7071f, 15.9572f)
                lineTo(12.7071f, 20.9571f)
                curveTo(12.3166f, 21.3476f, 11.6834f, 21.3476f, 11.2929f, 20.9571f)
                lineTo(6.2929f, 15.9572f)
                curveTo(5.9024f, 15.5666f, 5.9024f, 14.9335f, 6.2929f, 14.543f)
                curveTo(6.6834f, 14.1524f, 7.3166f, 14.1524f, 7.7071f, 14.543f)
                lineTo(11.0f, 17.8358f)
                verticalLineTo(12.7501f)
                curveTo(11.0f, 12.6196f, 10.9995f, 12.4861f, 10.999f, 12.3498f)
                curveTo(10.994f, 10.9771f, 10.988f, 9.3265f, 11.4676f, 7.7364f)
                curveTo(12.0155f, 5.9195f, 13.1787f, 4.2106f, 15.5039f, 2.8819f)
                curveTo(15.9834f, 2.6079f, 16.5942f, 2.7745f, 16.8682f, 3.254f)
                close()
            }
        }
        .build()
        return _arrowCurveDownLeft!!
    }

private var _arrowCurveDownLeft: ImageVector? = null
