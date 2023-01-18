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

public val RegularGroup.Pin: ImageVector
    get() {
        if (_pin != null) {
            return _pin!!
        }
        _pin = Builder(name = "Pin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.2425f, 2.9319f)
                lineTo(21.0682f, 7.7576f)
                curveTo(22.3955f, 9.0849f, 22.0324f, 11.3224f, 20.3535f, 12.1619f)
                lineTo(15.4826f, 14.5973f)
                curveTo(15.3073f, 14.685f, 15.1732f, 14.8379f, 15.1092f, 15.0232f)
                lineTo(13.6699f, 19.1895f)
                curveTo(13.3684f, 20.0622f, 12.2574f, 20.3181f, 11.6045f, 19.6653f)
                lineTo(8.5f, 16.5607f)
                lineTo(4.0607f, 21.0001f)
                horizontalLineTo(3.0f)
                lineTo(3.0001f, 19.9394f)
                lineTo(7.4394f, 15.5001f)
                lineTo(4.3349f, 12.3956f)
                curveTo(3.682f, 11.7427f, 3.9379f, 10.6317f, 4.8106f, 10.3302f)
                lineTo(8.9769f, 8.891f)
                curveTo(9.1622f, 8.8269f, 9.3151f, 8.6929f, 9.4028f, 8.5175f)
                lineTo(11.8382f, 3.6466f)
                curveTo(12.6777f, 1.9677f, 14.9152f, 1.6046f, 16.2425f, 2.9319f)
                close()
                moveTo(20.0076f, 8.8183f)
                lineTo(15.1818f, 3.9925f)
                curveTo(14.5785f, 3.3892f, 13.5614f, 3.5543f, 13.1799f, 4.3174f)
                lineTo(10.7445f, 9.1883f)
                curveTo(10.4814f, 9.7145f, 10.0227f, 10.1167f, 9.4667f, 10.3087f)
                lineTo(5.6781f, 11.6175f)
                lineTo(12.3826f, 18.322f)
                lineTo(13.6914f, 14.5335f)
                curveTo(13.8835f, 13.9774f, 14.2857f, 13.5188f, 14.8118f, 13.2557f)
                lineTo(19.6827f, 10.8202f)
                curveTo(20.4458f, 10.4387f, 20.6109f, 9.4216f, 20.0076f, 8.8183f)
                close()
            }
        }
        .build()
        return _pin!!
    }

private var _pin: ImageVector? = null
