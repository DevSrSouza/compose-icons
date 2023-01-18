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

public val FilledGroup.ArrowTrendingDown: ImageVector
    get() {
        if (_arrowTrendingDown != null) {
            return _arrowTrendingDown!!
        }
        _arrowTrendingDown = Builder(name = "ArrowTrendingDown", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.003f, 18.9985f)
                horizontalLineTo(20.9998f)
                curveTo(21.5126f, 18.9985f, 21.9353f, 18.6124f, 21.993f, 18.1151f)
                lineTo(21.9998f, 17.9985f)
                verticalLineTo(10.9985f)
                curveTo(21.9998f, 10.4462f, 21.552f, 9.9985f, 20.9998f, 9.9985f)
                curveTo(20.4869f, 9.9985f, 20.0643f, 10.3845f, 20.0065f, 10.8819f)
                lineTo(19.9998f, 10.9985f)
                lineTo(19.999f, 15.5845f)
                lineTo(12.7069f, 8.2914f)
                curveTo(12.3466f, 7.9311f, 11.7798f, 7.9032f, 11.3875f, 8.2077f)
                lineTo(11.2933f, 8.2908f)
                lineTo(8.9973f, 10.5828f)
                lineTo(3.7092f, 5.293f)
                curveTo(3.3187f, 4.9024f, 2.6855f, 4.9023f, 2.295f, 5.2928f)
                curveTo(1.9344f, 5.6532f, 1.9066f, 6.2204f, 2.2116f, 6.6128f)
                lineTo(2.2947f, 6.707f)
                lineTo(8.2893f, 12.7035f)
                curveTo(8.6496f, 13.0639f, 9.2164f, 13.0919f, 9.6088f, 12.7873f)
                lineTo(9.703f, 12.7042f)
                lineTo(11.9991f, 10.4121f)
                lineTo(18.584f, 16.9985f)
                horizontalLineTo(14.003f)
                curveTo(13.4902f, 16.9985f, 13.0675f, 17.3845f, 13.0098f, 17.8819f)
                lineTo(13.003f, 17.9985f)
                curveTo(13.003f, 18.5113f, 13.3891f, 18.934f, 13.8864f, 18.9918f)
                lineTo(14.003f, 18.9985f)
                close()
            }
        }
        .build()
        return _arrowTrendingDown!!
    }

private var _arrowTrendingDown: ImageVector? = null
