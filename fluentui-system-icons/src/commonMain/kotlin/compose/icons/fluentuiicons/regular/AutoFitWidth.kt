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

public val RegularGroup.AutoFitWidth: ImageVector
    get() {
        if (_autoFitWidth != null) {
            return _autoFitWidth!!
        }
        _autoFitWidth = Builder(name = "AutoFitWidth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 18.25f)
                curveTo(3.0f, 18.6642f, 3.3358f, 19.0f, 3.75f, 19.0f)
                curveTo(4.1642f, 19.0f, 4.5f, 18.6642f, 4.5f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(4.5f, 5.3358f, 4.1642f, 5.0f, 3.75f, 5.0f)
                curveTo(3.3358f, 5.0f, 3.0f, 5.3358f, 3.0f, 5.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(19.5f, 18.25f)
                curveTo(19.5f, 18.6642f, 19.8358f, 19.0f, 20.25f, 19.0f)
                curveTo(20.6642f, 19.0f, 21.0f, 18.6642f, 21.0f, 18.25f)
                verticalLineTo(5.75f)
                curveTo(21.0f, 5.3358f, 20.6642f, 5.0f, 20.25f, 5.0f)
                curveTo(19.8358f, 5.0f, 19.5f, 5.3358f, 19.5f, 5.75f)
                verticalLineTo(18.25f)
                close()
                moveTo(14.1462f, 14.0535f)
                curveTo(13.9284f, 14.3472f, 13.9526f, 14.7638f, 14.2188f, 15.0301f)
                curveTo(14.5117f, 15.323f, 14.9866f, 15.323f, 15.2795f, 15.0301f)
                lineTo(17.6496f, 12.6627f)
                curveTo(17.858f, 12.537f, 18.0f, 12.2869f, 18.0f, 11.9988f)
                curveTo(18.0f, 11.7107f, 17.8578f, 11.4606f, 17.6493f, 11.335f)
                lineTo(15.2795f, 8.9678f)
                lineTo(15.1954f, 8.8952f)
                curveTo(14.9018f, 8.6773f, 14.4851f, 8.7015f, 14.2188f, 8.9678f)
                lineTo(14.1462f, 9.0519f)
                curveTo(13.9284f, 9.3455f, 13.9526f, 9.7622f, 14.2188f, 10.0284f)
                lineTo(15.44f, 11.2498f)
                horizontalLineTo(11.6562f)
                lineTo(11.6308f, 11.2517f)
                horizontalLineTo(8.56f)
                lineTo(9.7811f, 10.0304f)
                lineTo(9.8609f, 9.9365f)
                curveTo(10.0498f, 9.6731f, 10.0474f, 9.3148f, 9.8538f, 9.0539f)
                lineTo(9.7811f, 8.9697f)
                lineTo(9.6872f, 8.8899f)
                curveTo(9.4238f, 8.7011f, 9.0656f, 8.7035f, 8.8046f, 8.8971f)
                lineTo(8.7205f, 8.9697f)
                lineTo(6.3507f, 11.337f)
                lineTo(6.2758f, 11.3897f)
                curveTo(6.1089f, 11.5257f, 6.0f, 11.7487f, 6.0f, 12.0008f)
                curveTo(6.0f, 12.2888f, 6.142f, 12.5389f, 6.3504f, 12.6646f)
                lineTo(8.7205f, 15.032f)
                lineTo(8.8046f, 15.1047f)
                curveTo(9.0982f, 15.3225f, 9.5149f, 15.2983f, 9.7811f, 15.032f)
                curveTo(10.0474f, 14.7658f, 10.0716f, 14.3491f, 9.8538f, 14.0555f)
                lineTo(9.7811f, 13.9714f)
                lineTo(8.56f, 12.7517f)
                horizontalLineTo(12.3437f)
                lineTo(12.3691f, 12.7498f)
                horizontalLineTo(15.44f)
                lineTo(14.2188f, 13.9694f)
                lineTo(14.1462f, 14.0535f)
                close()
            }
        }
        .build()
        return _autoFitWidth!!
    }

private var _autoFitWidth: ImageVector? = null
