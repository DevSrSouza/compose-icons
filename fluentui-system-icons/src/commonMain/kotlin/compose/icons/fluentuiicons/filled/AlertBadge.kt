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

public val FilledGroup.AlertBadge: ImageVector
    get() {
        if (_alertBadge != null) {
            return _alertBadge!!
        }
        _alertBadge = Builder(name = "AlertBadge", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 9.0f)
                curveTo(18.8376f, 9.0f, 19.1641f, 8.9522f, 19.473f, 8.863f)
                curveTo(19.4909f, 9.0743f, 19.5f, 9.288f, 19.5f, 9.5039f)
                verticalLineTo(13.5024f)
                lineTo(20.9183f, 16.6625f)
                curveTo(20.9732f, 16.7848f, 21.0016f, 16.9174f, 21.0016f, 17.0515f)
                curveTo(21.0016f, 17.5762f, 20.5763f, 18.0015f, 20.0516f, 18.0015f)
                horizontalLineTo(3.9522f)
                curveTo(3.8184f, 18.0015f, 3.6861f, 17.9733f, 3.564f, 17.9186f)
                curveTo(3.0852f, 17.7042f, 2.8707f, 17.1422f, 3.0851f, 16.6633f)
                lineTo(4.5f, 13.5028f)
                lineTo(4.5001f, 9.491f)
                lineTo(4.5045f, 9.2411f)
                curveTo(4.6436f, 5.2104f, 7.9559f, 2.0039f, 12.0f, 2.0039f)
                curveTo(13.4433f, 2.0039f, 14.7915f, 2.4116f, 15.9355f, 3.1181f)
                curveTo(15.355f, 3.7429f, 15.0f, 4.58f, 15.0f, 5.5f)
                curveTo(15.0f, 7.433f, 16.567f, 9.0f, 18.5f, 9.0f)
                close()
                moveTo(14.9583f, 19.003f)
                curveTo(14.7196f, 20.4211f, 13.486f, 21.5015f, 12.0f, 21.5015f)
                curveTo(10.514f, 21.5015f, 9.2804f, 20.4211f, 9.0417f, 19.003f)
                horizontalLineTo(14.9583f)
                close()
                moveTo(18.5f, 8.0f)
                curveTo(19.8807f, 8.0f, 21.0f, 6.8807f, 21.0f, 5.5f)
                curveTo(21.0f, 4.1193f, 19.8807f, 3.0f, 18.5f, 3.0f)
                curveTo(17.1193f, 3.0f, 16.0f, 4.1193f, 16.0f, 5.5f)
                curveTo(16.0f, 6.8807f, 17.1193f, 8.0f, 18.5f, 8.0f)
                close()
            }
        }
        .build()
        return _alertBadge!!
    }

private var _alertBadge: ImageVector? = null
