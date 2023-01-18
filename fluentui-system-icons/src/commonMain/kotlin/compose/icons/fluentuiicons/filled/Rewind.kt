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

public val FilledGroup.Rewind: ImageVector
    get() {
        if (_rewind != null) {
            return _rewind!!
        }
        _rewind = Builder(name = "Rewind", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0295f, 4.3616f)
                curveTo(11.0035f, 3.5326f, 12.5017f, 4.2248f, 12.5017f, 5.5039f)
                verticalLineTo(9.4933f)
                lineTo(18.5295f, 4.3632f)
                curveTo(19.5035f, 3.5343f, 21.0017f, 4.2265f, 21.0017f, 5.5055f)
                verticalLineTo(18.4984f)
                curveTo(21.0017f, 19.3769f, 20.2949f, 19.9786f, 19.5367f, 20.0007f)
                horizontalLineTo(19.4503f)
                curveTo(19.1321f, 19.9914f, 18.8092f, 19.8788f, 18.5295f, 19.6408f)
                lineTo(12.5017f, 14.5109f)
                verticalLineTo(18.4968f)
                curveTo(12.5017f, 19.7758f, 11.0036f, 20.468f, 10.0295f, 19.6391f)
                lineTo(2.6197f, 13.3332f)
                curveTo(1.7986f, 12.6344f, 1.7986f, 11.3666f, 2.6197f, 10.6678f)
                lineTo(10.0295f, 4.3616f)
                close()
                moveTo(2.6197f, 10.6678f)
                lineTo(3.1058f, 11.2389f)
                close()
            }
        }
        .build()
        return _rewind!!
    }

private var _rewind: ImageVector? = null
