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

public val RegularGroup.ReadAloud: ImageVector
    get() {
        if (_readAloud != null) {
            return _readAloud!!
        }
        _readAloud = Builder(name = "ReadAloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8614f, 2.092f)
                curveTo(15.4979f, 1.8934f, 15.0422f, 2.0271f, 14.8436f, 2.3906f)
                curveTo(14.645f, 2.7541f, 14.7787f, 3.2098f, 15.1422f, 3.4084f)
                curveTo(16.9956f, 4.4211f, 18.3577f, 5.694f, 19.2441f, 7.2294f)
                curveTo(20.1305f, 8.7649f, 20.5518f, 10.581f, 20.502f, 12.6925f)
                curveTo(20.4923f, 13.1066f, 20.82f, 13.4503f, 21.2341f, 13.46f)
                curveTo(21.6482f, 13.4698f, 21.9918f, 13.142f, 22.0016f, 12.7279f)
                curveTo(22.0576f, 10.3516f, 21.5734f, 8.2639f, 20.5431f, 6.4794f)
                curveTo(19.5129f, 4.6948f, 17.9471f, 3.2316f, 15.8614f, 2.092f)
                close()
                moveTo(15.6238f, 5.6929f)
                curveTo(15.2602f, 5.4946f, 14.8046f, 5.6286f, 14.6063f, 5.9923f)
                curveTo(14.408f, 6.356f, 14.5421f, 6.8116f, 14.9057f, 7.0099f)
                curveTo(15.6273f, 7.4034f, 16.2028f, 7.9733f, 16.6411f, 8.7324f)
                curveTo(17.0793f, 9.4915f, 17.2851f, 10.2749f, 17.265f, 11.0966f)
                curveTo(17.2549f, 11.5107f, 17.5824f, 11.8546f, 17.9965f, 11.8647f)
                curveTo(18.4106f, 11.8748f, 18.7545f, 11.5473f, 18.7646f, 11.1332f)
                curveTo(18.7914f, 10.032f, 18.5144f, 8.9771f, 17.9401f, 7.9823f)
                curveTo(17.3658f, 6.9876f, 16.5908f, 6.2202f, 15.6238f, 5.6929f)
                close()
                moveTo(9.0002f, 3.9987f)
                curveTo(9.3077f, 3.9987f, 9.584f, 4.1864f, 9.6974f, 4.4722f)
                lineTo(15.4474f, 18.9733f)
                curveTo(15.6001f, 19.3583f, 15.4117f, 19.7943f, 15.0267f, 19.947f)
                curveTo(14.6416f, 20.0997f, 14.2057f, 19.9113f, 14.053f, 19.5262f)
                lineTo(12.258f, 14.9994f)
                horizontalLineTo(5.7424f)
                lineTo(3.9474f, 19.5262f)
                curveTo(3.7947f, 19.9113f, 3.3588f, 20.0997f, 2.9737f, 19.947f)
                curveTo(2.5887f, 19.7943f, 2.4003f, 19.3583f, 2.553f, 18.9733f)
                lineTo(8.303f, 4.4722f)
                curveTo(8.4164f, 4.1864f, 8.6927f, 3.9987f, 9.0002f, 3.9987f)
                close()
                moveTo(9.0002f, 6.7835f)
                lineTo(6.3372f, 13.4993f)
                horizontalLineTo(11.6632f)
                lineTo(9.0002f, 6.7835f)
                close()
            }
        }
        .build()
        return _readAloud!!
    }

private var _readAloud: ImageVector? = null
