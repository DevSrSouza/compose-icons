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

public val FilledGroup.CallProhibited: ImageVector
    get() {
        if (_callProhibited != null) {
            return _callProhibited!!
        }
        _callProhibited = Builder(name = "CallProhibited", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.9337f, 5.66f)
                curveTo(18.974f, 3.9295f, 15.9126f, 3.067f, 11.7493f, 3.0723f)
                curveTo(7.592f, 3.0777f, 4.623f, 3.9455f, 2.8422f, 5.6758f)
                curveTo(2.0879f, 6.4088f, 1.8132f, 7.4946f, 2.121f, 8.5265f)
                lineTo(2.4303f, 9.5631f)
                curveTo(2.7189f, 10.5304f, 3.6922f, 11.1763f, 4.7074f, 11.0743f)
                lineTo(6.7419f, 10.8697f)
                curveTo(7.6153f, 10.7819f, 8.3048f, 10.1585f, 8.453f, 9.3229f)
                lineTo(8.8441f, 7.1181f)
                curveTo(9.8123f, 6.6793f, 10.8591f, 6.4434f, 11.9845f, 6.4105f)
                curveTo(13.1099f, 6.3776f, 14.1398f, 6.5528f, 15.0743f, 6.936f)
                lineTo(15.7056f, 9.2912f)
                curveTo(15.9325f, 10.1376f, 16.6923f, 10.771f, 17.5841f, 10.8572f)
                lineTo(19.6305f, 11.0549f)
                curveTo(20.6588f, 11.1543f, 21.5664f, 10.502f, 21.7513f, 9.5307f)
                lineTo(21.9487f, 8.4941f)
                curveTo(22.1443f, 7.4663f, 21.7582f, 6.3881f, 20.9337f, 5.66f)
                close()
                moveTo(12.0f, 22.0004f)
                curveTo(8.9624f, 22.0004f, 6.5f, 19.5379f, 6.5f, 16.5004f)
                curveTo(6.5f, 13.4628f, 8.9624f, 11.0004f, 12.0f, 11.0004f)
                curveTo(15.0376f, 11.0004f, 17.5f, 13.4628f, 17.5f, 16.5004f)
                curveTo(17.5f, 19.5379f, 15.0376f, 22.0004f, 12.0f, 22.0004f)
                close()
                moveTo(12.0f, 20.5004f)
                curveTo(14.2091f, 20.5004f, 16.0f, 18.7095f, 16.0f, 16.5004f)
                curveTo(16.0f, 15.6669f, 15.7451f, 14.8929f, 15.3089f, 14.2522f)
                lineTo(9.7519f, 19.8093f)
                curveTo(10.3925f, 20.2454f, 11.1665f, 20.5004f, 12.0f, 20.5004f)
                close()
                moveTo(8.6912f, 18.7486f)
                lineTo(14.2483f, 13.1915f)
                curveTo(13.6076f, 12.7553f, 12.8336f, 12.5004f, 12.0f, 12.5004f)
                curveTo(9.7909f, 12.5004f, 8.0f, 14.2912f, 8.0f, 16.5004f)
                curveTo(8.0f, 17.3339f, 8.255f, 18.1079f, 8.6912f, 18.7486f)
                close()
            }
        }
        .build()
        return _callProhibited!!
    }

private var _callProhibited: ImageVector? = null
