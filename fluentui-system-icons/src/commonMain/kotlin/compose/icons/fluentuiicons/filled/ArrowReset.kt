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

public val FilledGroup.ArrowReset: ImageVector
    get() {
        if (_arrowReset != null) {
            return _arrowReset!!
        }
        _arrowReset = Builder(name = "ArrowReset", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.2071f, 2.5429f)
                curveTo(7.5976f, 2.9334f, 7.5976f, 3.5666f, 7.2071f, 3.9571f)
                lineTo(5.4142f, 5.75f)
                horizontalLineTo(13.25f)
                curveTo(17.6683f, 5.75f, 21.25f, 9.3317f, 21.25f, 13.75f)
                curveTo(21.25f, 18.1683f, 17.6683f, 21.75f, 13.25f, 21.75f)
                curveTo(8.8317f, 21.75f, 5.25f, 18.1683f, 5.25f, 13.75f)
                curveTo(5.25f, 13.1977f, 5.6977f, 12.75f, 6.25f, 12.75f)
                curveTo(6.8023f, 12.75f, 7.25f, 13.1977f, 7.25f, 13.75f)
                curveTo(7.25f, 17.0637f, 9.9363f, 19.75f, 13.25f, 19.75f)
                curveTo(16.5637f, 19.75f, 19.25f, 17.0637f, 19.25f, 13.75f)
                curveTo(19.25f, 10.4363f, 16.5637f, 7.75f, 13.25f, 7.75f)
                horizontalLineTo(5.4142f)
                lineTo(7.2071f, 9.5429f)
                curveTo(7.5976f, 9.9334f, 7.5976f, 10.5666f, 7.2071f, 10.9571f)
                curveTo(6.8166f, 11.3476f, 6.1834f, 11.3476f, 5.7929f, 10.9571f)
                lineTo(2.2929f, 7.4571f)
                curveTo(1.9024f, 7.0666f, 1.9024f, 6.4334f, 2.2929f, 6.0429f)
                lineTo(5.7929f, 2.5429f)
                curveTo(6.1834f, 2.1524f, 6.8166f, 2.1524f, 7.2071f, 2.5429f)
                close()
            }
        }
        .build()
        return _arrowReset!!
    }

private var _arrowReset: ImageVector? = null
