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

public val RegularGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7525f, 17.9997f)
                horizontalLineTo(21.2525f)
                curveTo(21.6668f, 17.9997f, 22.0025f, 18.3355f, 22.0025f, 18.7497f)
                curveTo(22.0025f, 19.1294f, 21.7204f, 19.4432f, 21.3543f, 19.4928f)
                lineTo(21.2525f, 19.4997f)
                horizontalLineTo(2.7525f)
                curveTo(2.3383f, 19.4997f, 2.0025f, 19.1639f, 2.0025f, 18.7497f)
                curveTo(2.0025f, 18.37f, 2.2847f, 18.0562f, 2.6508f, 18.0065f)
                lineTo(2.7525f, 17.9997f)
                horizontalLineTo(21.2525f)
                horizontalLineTo(2.7525f)
                close()
                moveTo(2.7525f, 11.5027f)
                horizontalLineTo(21.2525f)
                curveTo(21.6668f, 11.5027f, 22.0025f, 11.8385f, 22.0025f, 12.2527f)
                curveTo(22.0025f, 12.6324f, 21.7204f, 12.9462f, 21.3543f, 12.9959f)
                lineTo(21.2525f, 13.0027f)
                horizontalLineTo(2.7525f)
                curveTo(2.3383f, 13.0027f, 2.0025f, 12.6669f, 2.0025f, 12.2527f)
                curveTo(2.0025f, 11.873f, 2.2847f, 11.5592f, 2.6508f, 11.5095f)
                lineTo(2.7525f, 11.5027f)
                horizontalLineTo(21.2525f)
                horizontalLineTo(2.7525f)
                close()
                moveTo(2.7517f, 5.0029f)
                horizontalLineTo(21.2517f)
                curveTo(21.6659f, 5.0029f, 22.0017f, 5.3387f, 22.0017f, 5.7529f)
                curveTo(22.0017f, 6.1326f, 21.7195f, 6.4464f, 21.3535f, 6.4961f)
                lineTo(21.2517f, 6.5029f)
                horizontalLineTo(2.7517f)
                curveTo(2.3375f, 6.5029f, 2.0017f, 6.1671f, 2.0017f, 5.7529f)
                curveTo(2.0017f, 5.3732f, 2.2838f, 5.0594f, 2.6499f, 5.0098f)
                lineTo(2.7517f, 5.0029f)
                horizontalLineTo(21.2517f)
                horizontalLineTo(2.7517f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
