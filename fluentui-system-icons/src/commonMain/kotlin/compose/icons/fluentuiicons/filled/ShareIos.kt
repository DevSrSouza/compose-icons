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

public val FilledGroup.ShareIos: ImageVector
    get() {
        if (_shareIos != null) {
            return _shareIos!!
        }
        _shareIos = Builder(name = "ShareIos", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.9958f, 11.0f)
                curveTo(19.5087f, 11.0f, 19.9313f, 11.386f, 19.9891f, 11.8834f)
                lineTo(19.9958f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(19.9958f, 20.1422f, 18.3119f, 21.8911f, 16.1955f, 21.9951f)
                lineTo(15.9958f, 22.0f)
                horizontalLineTo(8.0f)
                curveTo(5.8578f, 22.0f, 4.1089f, 20.316f, 4.0049f, 18.1996f)
                lineTo(4.0f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 11.4477f, 4.4477f, 11.0f, 5.0f, 11.0f)
                curveTo(5.5128f, 11.0f, 5.9355f, 11.386f, 5.9933f, 11.8834f)
                lineTo(6.0f, 12.0f)
                verticalLineTo(18.0f)
                curveTo(6.0f, 19.0544f, 6.8159f, 19.9182f, 7.8507f, 19.9945f)
                lineTo(8.0f, 20.0f)
                horizontalLineTo(15.9958f)
                curveTo(17.0502f, 20.0f, 17.914f, 19.1841f, 17.9903f, 18.1493f)
                lineTo(17.9958f, 18.0f)
                verticalLineTo(12.0f)
                curveTo(17.9958f, 11.4477f, 18.4435f, 11.0f, 18.9958f, 11.0f)
                close()
                moveTo(6.2887f, 7.2894f)
                lineTo(11.2864f, 2.2928f)
                curveTo(11.6467f, 1.9326f, 12.2135f, 1.9047f, 12.6058f, 2.2093f)
                lineTo(12.7f, 2.2924f)
                lineTo(17.7035f, 7.289f)
                curveTo(18.0943f, 7.6793f, 18.0947f, 8.3125f, 17.7044f, 8.7032f)
                curveTo(17.3442f, 9.064f, 16.777f, 9.0921f, 16.3845f, 8.7873f)
                lineTo(16.2902f, 8.7042f)
                lineTo(12.996f, 5.415f)
                lineTo(12.9963f, 15.2549f)
                curveTo(12.9963f, 15.7678f, 12.6103f, 16.1905f, 12.1129f, 16.2482f)
                lineTo(11.9963f, 16.2549f)
                curveTo(11.4835f, 16.2549f, 11.0608f, 15.8689f, 11.003f, 15.3716f)
                lineTo(10.9963f, 15.2549f)
                lineTo(10.996f, 5.41f)
                lineTo(7.7028f, 8.7038f)
                curveTo(7.3423f, 9.0642f, 6.775f, 9.0919f, 6.3828f, 8.7868f)
                lineTo(6.2886f, 8.7037f)
                curveTo(5.9281f, 8.3431f, 5.9005f, 7.7759f, 6.2055f, 7.3836f)
                lineTo(6.2887f, 7.2894f)
                lineTo(11.2864f, 2.2928f)
                lineTo(6.2887f, 7.2894f)
                close()
            }
        }
        .build()
        return _shareIos!!
    }

private var _shareIos: ImageVector? = null
