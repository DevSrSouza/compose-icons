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

public val FilledGroup.CreditCardClock: ImageVector
    get() {
        if (_creditCardClock != null) {
            return _creditCardClock!!
        }
        _creditCardClock = Builder(name = "CreditCardClock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 8.25f)
                curveTo(2.0f, 6.4551f, 3.4551f, 5.0f, 5.25f, 5.0f)
                horizontalLineTo(18.75f)
                curveTo(20.5449f, 5.0f, 22.0f, 6.4551f, 22.0f, 8.25f)
                verticalLineTo(9.5f)
                horizontalLineTo(2.0f)
                verticalLineTo(8.25f)
                close()
                moveTo(11.1739f, 19.0f)
                horizontalLineTo(5.25f)
                curveTo(3.4551f, 19.0f, 2.0f, 17.5449f, 2.0f, 15.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.5f)
                curveTo(13.9101f, 11.0f, 11.0f, 13.9101f, 11.0f, 17.5f)
                curveTo(11.0f, 18.0163f, 11.0602f, 18.5185f, 11.1739f, 19.0f)
                close()
                moveTo(17.5f, 12.0f)
                curveTo(20.5376f, 12.0f, 23.0f, 14.4624f, 23.0f, 17.5f)
                curveTo(23.0f, 20.5376f, 20.5376f, 23.0f, 17.5f, 23.0f)
                curveTo(14.4624f, 23.0f, 12.0f, 20.5376f, 12.0f, 17.5f)
                curveTo(12.0f, 14.4624f, 14.4624f, 12.0f, 17.5f, 12.0f)
                close()
                moveTo(19.5f, 17.5001f)
                horizontalLineTo(17.5f)
                lineTo(17.5f, 14.9999f)
                curveTo(17.5f, 14.7238f, 17.2761f, 14.4999f, 17.0f, 14.4999f)
                curveTo(16.7239f, 14.4999f, 16.5f, 14.7238f, 16.5f, 14.9999f)
                lineTo(16.5f, 17.9985f)
                lineTo(16.5f, 18.0001f)
                curveTo(16.5f, 18.2762f, 16.7239f, 18.5001f, 17.0f, 18.5001f)
                horizontalLineTo(19.5f)
                curveTo(19.7761f, 18.5001f, 20.0f, 18.2762f, 20.0f, 18.0001f)
                curveTo(20.0f, 17.7239f, 19.7761f, 17.5001f, 19.5f, 17.5001f)
                close()
            }
        }
        .build()
        return _creditCardClock!!
    }

private var _creditCardClock: ImageVector? = null
