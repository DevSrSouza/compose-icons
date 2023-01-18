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

public val FilledGroup.CallMissed: ImageVector
    get() {
        if (_callMissed != null) {
            return _callMissed!!
        }
        _callMissed = Builder(name = "CallMissed", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(11.7498f, 14.0004f)
                curveTo(12.164f, 14.0004f, 12.4998f, 14.3362f, 12.4998f, 14.7504f)
                verticalLineTo(16.5004f)
                horizontalLineTo(13.4998f)
                curveTo(13.914f, 16.5004f, 14.2498f, 16.8362f, 14.2498f, 17.2504f)
                curveTo(14.2498f, 17.6646f, 13.914f, 18.0004f, 13.4998f, 18.0004f)
                horizontalLineTo(11.7498f)
                curveTo(11.3356f, 18.0004f, 10.9998f, 17.6646f, 10.9998f, 17.2504f)
                verticalLineTo(14.7504f)
                curveTo(10.9998f, 14.3362f, 11.3355f, 14.0004f, 11.7498f, 14.0004f)
                close()
                moveTo(11.9998f, 11.0004f)
                curveTo(8.9622f, 11.0004f, 6.4998f, 13.4628f, 6.4998f, 16.5004f)
                curveTo(6.4998f, 19.5379f, 8.9622f, 22.0004f, 11.9998f, 22.0004f)
                curveTo(15.0373f, 22.0004f, 17.4998f, 19.5379f, 17.4998f, 16.5004f)
                curveTo(17.4998f, 13.4628f, 15.0373f, 11.0004f, 11.9998f, 11.0004f)
                close()
                moveTo(7.9998f, 16.5004f)
                curveTo(7.9998f, 14.2912f, 9.7906f, 12.5004f, 11.9998f, 12.5004f)
                curveTo(14.2089f, 12.5004f, 15.9998f, 14.2912f, 15.9998f, 16.5004f)
                curveTo(15.9998f, 18.7095f, 14.2089f, 20.5004f, 11.9998f, 20.5004f)
                curveTo(9.7906f, 20.5004f, 7.9998f, 18.7095f, 7.9998f, 16.5004f)
                close()
            }
        }
        .build()
        return _callMissed!!
    }

private var _callMissed: ImageVector? = null
