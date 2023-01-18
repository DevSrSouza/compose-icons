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

public val FilledGroup.MoviesAndTv: ImageVector
    get() {
        if (_moviesAndTv != null) {
            return _moviesAndTv!!
        }
        _moviesAndTv = Builder(name = "MoviesAndTv", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.7289f, 3.8751f)
                lineTo(19.7799f, 4.0347f)
                lineTo(20.3312f, 5.9572f)
                curveTo(20.4359f, 6.3222f, 20.2512f, 6.7016f, 19.9129f, 6.8503f)
                lineTo(19.817f, 6.8849f)
                lineTo(9.0901f, 9.96f)
                lineTo(20.2492f, 9.9609f)
                curveTo(20.6289f, 9.9609f, 20.9426f, 10.2431f, 20.9923f, 10.6092f)
                lineTo(20.9992f, 10.7109f)
                verticalLineTo(19.2089f)
                curveTo(20.9992f, 20.6715f, 19.8575f, 21.8673f, 18.4167f, 21.9539f)
                lineTo(18.2492f, 21.9589f)
                horizontalLineTo(5.7503f)
                curveTo(4.2878f, 21.9589f, 3.0919f, 20.8172f, 3.0053f, 19.3765f)
                lineTo(3.0003f, 19.2089f)
                lineTo(3.0001f, 10.817f)
                lineTo(2.4783f, 8.9959f)
                curveTo(2.0752f, 7.59f, 2.8431f, 6.1257f, 4.2042f, 5.6454f)
                lineTo(4.3638f, 5.5944f)
                lineTo(16.3785f, 2.1492f)
                curveTo(17.7844f, 1.7461f, 19.2486f, 2.514f, 19.7289f, 3.8751f)
                close()
                moveTo(6.273f, 6.6074f)
                lineTo(4.7773f, 7.0363f)
                curveTo(4.1551f, 7.2147f, 3.779f, 7.8342f, 3.8912f, 8.4578f)
                lineTo(3.9202f, 8.5824f)
                lineTo(4.2645f, 9.7833f)
                lineTo(4.5596f, 9.6984f)
                lineTo(6.273f, 6.6074f)
                close()
                moveTo(11.0293f, 5.2435f)
                lineTo(8.3118f, 6.0228f)
                lineTo(6.5984f, 9.1138f)
                lineTo(9.3159f, 8.3345f)
                lineTo(11.0293f, 5.2435f)
                close()
                moveTo(15.7866f, 3.8794f)
                lineTo(13.0691f, 4.6586f)
                lineTo(11.3557f, 7.7496f)
                lineTo(14.0723f, 6.9707f)
                lineTo(15.7866f, 3.8794f)
                close()
                moveTo(17.6338f, 3.6458f)
                lineTo(16.113f, 6.3855f)
                lineTo(18.6815f, 5.6493f)
                lineTo(18.3381f, 4.4482f)
                curveTo(18.2309f, 4.0744f, 17.9645f, 3.7895f, 17.6338f, 3.6458f)
                close()
            }
        }
        .build()
        return _moviesAndTv!!
    }

private var _moviesAndTv: ImageVector? = null
