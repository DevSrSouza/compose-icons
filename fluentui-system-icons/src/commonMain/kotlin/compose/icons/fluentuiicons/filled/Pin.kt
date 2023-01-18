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

public val FilledGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0682f, 7.7576f)
                lineTo(16.2425f, 2.9319f)
                curveTo(14.9152f, 1.6046f, 12.6777f, 1.9677f, 11.8382f, 3.6466f)
                lineTo(9.4028f, 8.5175f)
                curveTo(9.3151f, 8.6929f, 9.1622f, 8.8269f, 8.9769f, 8.891f)
                lineTo(4.8106f, 10.3302f)
                curveTo(3.9379f, 10.6317f, 3.682f, 11.7427f, 4.3349f, 12.3956f)
                lineTo(7.4394f, 15.5001f)
                lineTo(3.0001f, 19.9394f)
                lineTo(3.0f, 21.0001f)
                horizontalLineTo(4.0607f)
                lineTo(8.5f, 16.5607f)
                lineTo(11.6045f, 19.6653f)
                curveTo(12.2574f, 20.3181f, 13.3684f, 20.0622f, 13.6699f, 19.1895f)
                lineTo(15.1092f, 15.0232f)
                curveTo(15.1732f, 14.8379f, 15.3073f, 14.685f, 15.4826f, 14.5973f)
                lineTo(20.3535f, 12.1619f)
                curveTo(22.0324f, 11.3224f, 22.3955f, 9.0849f, 21.0682f, 7.7576f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
