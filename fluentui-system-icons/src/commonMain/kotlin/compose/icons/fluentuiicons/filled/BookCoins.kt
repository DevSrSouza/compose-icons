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

public val FilledGroup.BookCoins: ImageVector
    get() {
        if (_bookCoins != null) {
            return _bookCoins!!
        }
        _bookCoins = Builder(name = "BookCoins", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 4.5f)
                curveTo(4.0f, 3.1193f, 5.1193f, 2.0f, 6.5f, 2.0f)
                horizontalLineTo(18.0f)
                curveTo(19.3807f, 2.0f, 20.5f, 3.1193f, 20.5f, 4.5f)
                verticalLineTo(18.75f)
                curveTo(20.5f, 19.1642f, 20.1642f, 19.5f, 19.75f, 19.5f)
                horizontalLineTo(5.5f)
                curveTo(5.5f, 20.0523f, 5.9477f, 20.5f, 6.5f, 20.5f)
                horizontalLineTo(19.75f)
                curveTo(20.1642f, 20.5f, 20.5f, 20.8358f, 20.5f, 21.25f)
                curveTo(20.5f, 21.6642f, 20.1642f, 22.0f, 19.75f, 22.0f)
                horizontalLineTo(6.5f)
                curveTo(5.1193f, 22.0f, 4.0f, 20.8807f, 4.0f, 19.5f)
                verticalLineTo(4.5f)
                close()
                moveTo(10.1974f, 7.4639f)
                curveTo(9.6215f, 7.7393f, 9.0f, 8.2414f, 9.0f, 9.0f)
                curveTo(9.0f, 9.7586f, 9.6215f, 10.2607f, 10.1974f, 10.5361f)
                curveTo(10.819f, 10.8334f, 11.6338f, 11.0f, 12.5f, 11.0f)
                curveTo(13.3662f, 11.0f, 14.181f, 10.8334f, 14.8026f, 10.5361f)
                curveTo(15.3785f, 10.2607f, 16.0f, 9.7586f, 16.0f, 9.0f)
                curveTo(16.0f, 8.2414f, 15.3785f, 7.7393f, 14.8026f, 7.4639f)
                curveTo(14.181f, 7.1666f, 13.3662f, 7.0f, 12.5f, 7.0f)
                curveTo(11.6338f, 7.0f, 10.819f, 7.1666f, 10.1974f, 7.4639f)
                close()
                moveTo(15.9948f, 10.8901f)
                curveTo(15.1697f, 11.5673f, 13.9107f, 12.0001f, 12.5f, 12.0001f)
                curveTo(11.0893f, 12.0001f, 9.8303f, 11.5673f, 9.0052f, 10.8901f)
                curveTo(9.0017f, 10.9266f, 9.0f, 10.9633f, 9.0f, 11.0003f)
                curveTo(9.0f, 12.1048f, 10.567f, 13.0003f, 12.5f, 13.0003f)
                curveTo(14.433f, 13.0003f, 16.0f, 12.1048f, 16.0f, 11.0003f)
                curveTo(16.0f, 10.9633f, 15.9982f, 10.9266f, 15.9948f, 10.8901f)
                close()
                moveTo(12.5f, 14.0001f)
                curveTo(11.0893f, 14.0001f, 9.8303f, 13.5673f, 9.0052f, 12.8901f)
                curveTo(9.0017f, 12.9265f, 9.0f, 12.9632f, 9.0f, 13.0001f)
                curveTo(9.0f, 14.1047f, 10.567f, 15.0001f, 12.5f, 15.0001f)
                curveTo(14.433f, 15.0001f, 16.0f, 14.1047f, 16.0f, 13.0001f)
                curveTo(16.0f, 12.9632f, 15.9983f, 12.9265f, 15.9948f, 12.8901f)
                curveTo(15.1697f, 13.5673f, 13.9107f, 14.0001f, 12.5f, 14.0001f)
                close()
            }
        }
        .build()
        return _bookCoins!!
    }

private var _bookCoins: ImageVector? = null
