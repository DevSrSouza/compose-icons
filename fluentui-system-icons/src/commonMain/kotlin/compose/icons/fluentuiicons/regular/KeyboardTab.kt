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

public val RegularGroup.KeyboardTab: ImageVector
    get() {
        if (_keyboardTab != null) {
            return _keyboardTab!!
        }
        _keyboardTab = Builder(name = "KeyboardTab", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0303f, 11.4697f)
                lineTo(11.5303f, 4.9697f)
                curveTo(11.2374f, 4.6768f, 10.7626f, 4.6768f, 10.4697f, 4.9697f)
                curveTo(10.2034f, 5.2359f, 10.1792f, 5.6526f, 10.3971f, 5.9462f)
                lineTo(10.4697f, 6.0303f)
                lineTo(15.69f, 11.25f)
                horizontalLineTo(3.75f)
                curveTo(3.3703f, 11.25f, 3.0565f, 11.5322f, 3.0069f, 11.8982f)
                lineTo(3.0f, 12.0f)
                curveTo(3.0f, 12.3797f, 3.2822f, 12.6935f, 3.6482f, 12.7432f)
                lineTo(3.75f, 12.75f)
                horizontalLineTo(15.69f)
                lineTo(10.4697f, 17.9697f)
                curveTo(10.2034f, 18.2359f, 10.1792f, 18.6526f, 10.3971f, 18.9462f)
                lineTo(10.4697f, 19.0303f)
                curveTo(10.7359f, 19.2966f, 11.1526f, 19.3208f, 11.4462f, 19.1029f)
                lineTo(11.5303f, 19.0303f)
                lineTo(18.0303f, 12.5303f)
                curveTo(18.2966f, 12.2641f, 18.3208f, 11.8474f, 18.1029f, 11.5538f)
                lineTo(18.0303f, 11.4697f)
                lineTo(11.5303f, 4.9697f)
                lineTo(18.0303f, 11.4697f)
                close()
                moveTo(21.0f, 18.5f)
                verticalLineTo(5.5f)
                curveTo(21.0f, 5.0858f, 20.6642f, 4.75f, 20.25f, 4.75f)
                curveTo(19.8358f, 4.75f, 19.5f, 5.0858f, 19.5f, 5.5f)
                verticalLineTo(18.5f)
                curveTo(19.5f, 18.9142f, 19.8358f, 19.25f, 20.25f, 19.25f)
                curveTo(20.6642f, 19.25f, 21.0f, 18.9142f, 21.0f, 18.5f)
                close()
            }
        }
        .build()
        return _keyboardTab!!
    }

private var _keyboardTab: ImageVector? = null
