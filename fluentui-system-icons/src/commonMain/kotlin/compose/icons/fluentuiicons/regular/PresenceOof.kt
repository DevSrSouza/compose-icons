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

public val RegularGroup.PresenceOof: ImageVector
    get() {
        if (_presenceOof != null) {
            return _presenceOof!!
        }
        _presenceOof = Builder(name = "PresenceOof", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.5624f, 9.0567f)
                curveTo(13.1481f, 8.4709f, 13.1481f, 7.5212f, 12.5623f, 6.9354f)
                curveTo(11.9766f, 6.3496f, 11.0268f, 6.3496f, 10.441f, 6.9354f)
                lineTo(6.4369f, 10.9396f)
                curveTo(5.8511f, 11.5254f, 5.8511f, 12.4751f, 6.4369f, 13.0609f)
                lineTo(10.441f, 17.065f)
                curveTo(11.0268f, 17.6508f, 11.9766f, 17.6508f, 12.5624f, 17.065f)
                curveTo(13.1481f, 16.4792f, 13.1481f, 15.5295f, 12.5623f, 14.9437f)
                lineTo(11.1189f, 13.5002f)
                horizontalLineTo(16.4998f)
                curveTo(17.3282f, 13.5002f, 17.9998f, 12.8287f, 17.9998f, 12.0002f)
                curveTo(17.9998f, 11.1718f, 17.3282f, 10.5002f, 16.4998f, 10.5002f)
                horizontalLineTo(11.1189f)
                lineTo(12.5624f, 9.0567f)
                close()
                moveTo(12.0f, 0.0f)
                curveTo(5.3726f, 0.0f, 0.0f, 5.3726f, 0.0f, 12.0f)
                curveTo(0.0f, 18.6274f, 5.3726f, 24.0f, 12.0f, 24.0f)
                curveTo(18.6274f, 24.0f, 24.0f, 18.6274f, 24.0f, 12.0f)
                curveTo(24.0f, 5.3726f, 18.6274f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 7.0294f, 7.0294f, 3.0f, 12.0f, 3.0f)
                curveTo(16.9706f, 3.0f, 21.0f, 7.0294f, 21.0f, 12.0f)
                curveTo(21.0f, 16.9706f, 16.9706f, 21.0f, 12.0f, 21.0f)
                curveTo(7.0294f, 21.0f, 3.0f, 16.9706f, 3.0f, 12.0f)
                close()
            }
        }
        .build()
        return _presenceOof!!
    }

private var _presenceOof: ImageVector? = null
