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

public val RegularGroup.MailAttach: ImageVector
    get() {
        if (_mailAttach != null) {
            return _mailAttach!!
        }
        _mailAttach = Builder(name = "MailAttach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.9543f, 4.1f)
                curveTo(18.7656f, 3.2888f, 20.0809f, 3.2888f, 20.8921f, 4.1f)
                curveTo(21.7034f, 4.9112f, 21.7034f, 6.2265f, 20.8921f, 7.0377f)
                curveTo(20.8655f, 7.0642f, 20.8414f, 7.0923f, 20.8196f, 7.1217f)
                lineTo(16.6389f, 11.3012f)
                curveTo(16.3766f, 11.5635f, 15.9513f, 11.5635f, 15.689f, 11.3012f)
                curveTo(15.4268f, 11.0391f, 15.4267f, 10.6141f, 15.6887f, 10.3518f)
                lineTo(19.5226f, 6.5291f)
                curveTo(19.8158f, 6.2368f, 19.8165f, 5.7621f, 19.5242f, 5.4689f)
                curveTo(19.2318f, 5.1757f, 18.7571f, 5.175f, 18.4639f, 5.4674f)
                lineTo(14.6288f, 9.2913f)
                curveTo(13.7809f, 10.1391f, 13.7809f, 11.5136f, 14.6288f, 12.3615f)
                curveTo(15.4766f, 13.2092f, 16.8512f, 13.2093f, 17.699f, 12.3615f)
                lineTo(22.0237f, 8.0381f)
                curveTo(22.0622f, 7.9995f, 22.0957f, 7.9578f, 22.1241f, 7.9138f)
                curveTo(23.3466f, 6.5088f, 23.2894f, 4.3767f, 21.9524f, 3.0398f)
                curveTo(20.5556f, 1.6431f, 18.2909f, 1.6431f, 16.8941f, 3.0398f)
                lineTo(13.2159f, 6.7176f)
                curveTo(12.9231f, 7.0103f, 12.9231f, 7.485f, 13.2159f, 7.7778f)
                curveTo(13.5087f, 8.0706f, 13.9833f, 8.0706f, 14.2761f, 7.7778f)
                lineTo(17.9543f, 4.1f)
                close()
                moveTo(13.0823f, 11.5764f)
                lineTo(11.9962f, 12.1481f)
                lineTo(3.4994f, 7.6765f)
                verticalLineTo(7.2477f)
                lineTo(3.5052f, 7.1042f)
                curveTo(3.5782f, 6.2053f, 4.3309f, 5.4985f, 5.2488f, 5.4985f)
                horizontalLineTo(13.021f)
                lineTo(14.5205f, 3.9991f)
                horizontalLineTo(5.2488f)
                lineTo(5.0644f, 4.0043f)
                curveTo(3.3559f, 4.0998f, 2.0f, 5.5154f, 2.0f, 7.2477f)
                verticalLineTo(16.7436f)
                lineTo(2.0051f, 16.928f)
                curveTo(2.1007f, 18.6364f, 3.5164f, 19.9922f, 5.2488f, 19.9922f)
                horizontalLineTo(18.7437f)
                lineTo(18.9281f, 19.9871f)
                curveTo(20.6365f, 19.8915f, 21.9925f, 18.4759f, 21.9925f, 16.7436f)
                verticalLineTo(9.4823f)
                lineTo(20.493f, 10.9813f)
                verticalLineTo(16.7436f)
                lineTo(20.4872f, 16.8871f)
                curveTo(20.4143f, 17.7861f, 19.6615f, 18.4929f, 18.7437f, 18.4929f)
                horizontalLineTo(5.2488f)
                lineTo(5.1053f, 18.4871f)
                curveTo(4.2063f, 18.4141f, 3.4994f, 17.6614f, 3.4994f, 16.7436f)
                verticalLineTo(9.3708f)
                lineTo(11.6471f, 13.6587f)
                lineTo(11.7431f, 13.7009f)
                curveTo(11.9394f, 13.7713f, 12.1581f, 13.7573f, 12.3454f, 13.6587f)
                lineTo(13.7717f, 12.9079f)
                curveTo(13.4285f, 12.5144f, 13.1987f, 12.0563f, 13.0823f, 11.5764f)
                close()
            }
        }
        .build()
        return _mailAttach!!
    }

private var _mailAttach: ImageVector? = null
