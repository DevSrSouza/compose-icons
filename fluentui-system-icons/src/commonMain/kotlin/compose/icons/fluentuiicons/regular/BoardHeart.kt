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

public val RegularGroup.BoardHeart: ImageVector
    get() {
        if (_boardHeart != null) {
            return _boardHeart!!
        }
        _boardHeart = Builder(name = "BoardHeart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.4963f, 5.5637f)
                curveTo(21.4007f, 3.8545f, 19.9844f, 2.4982f, 18.2514f, 2.4982f)
                horizontalLineTo(6.2506f)
                curveTo(4.4558f, 2.4982f, 3.0008f, 3.9533f, 3.0006f, 5.7481f)
                lineTo(3.0f, 17.7519f)
                lineTo(3.0051f, 17.9364f)
                curveTo(3.1008f, 19.6455f, 4.517f, 21.0018f, 6.2501f, 21.0018f)
                horizontalLineTo(13.3659f)
                lineTo(11.915f, 19.5f)
                horizontalLineTo(11.5f)
                verticalLineTo(19.5012f)
                lineTo(6.25f, 19.5018f)
                curveTo(5.3376f, 19.5018f, 4.5884f, 18.8038f, 4.5073f, 17.9126f)
                lineTo(4.5001f, 17.7519f)
                lineTo(4.5f, 9.4992f)
                lineTo(11.5f, 9.4982f)
                verticalLineTo(12.1731f)
                curveTo(11.9493f, 11.7601f, 12.4601f, 11.4561f, 13.0f, 11.2612f)
                verticalLineTo(3.9972f)
                lineTo(18.2514f, 3.9982f)
                curveTo(19.1638f, 3.9982f, 19.913f, 4.6962f, 19.9941f, 5.5874f)
                lineTo(20.0013f, 5.7482f)
                lineTo(20.0005f, 11.0278f)
                curveTo(20.517f, 11.0861f, 21.0256f, 11.2362f, 21.5011f, 11.4782f)
                lineTo(21.5014f, 5.7481f)
                lineTo(21.4963f, 5.5637f)
                close()
                moveTo(6.2507f, 3.9982f)
                lineTo(11.5f, 3.9972f)
                verticalLineTo(7.9982f)
                lineTo(4.5f, 7.9992f)
                lineTo(4.5006f, 5.7482f)
                curveTo(4.5007f, 4.8301f, 5.2078f, 4.0771f, 6.1072f, 4.004f)
                lineTo(6.2507f, 3.9982f)
                close()
                moveTo(21.9768f, 13.0591f)
                curveTo(23.3411f, 14.4712f, 23.3411f, 16.7607f, 21.9768f, 18.1728f)
                lineTo(17.5345f, 22.7709f)
                curveTo(17.3869f, 22.9236f, 17.1935f, 23.0f, 17.0f, 23.0f)
                curveTo(16.8065f, 23.0f, 16.6131f, 22.9236f, 16.4655f, 22.7709f)
                lineTo(12.0232f, 18.1728f)
                curveTo(11.8179f, 17.9603f, 11.6435f, 17.728f, 11.5f, 17.4817f)
                curveTo(10.8333f, 16.3378f, 10.8333f, 14.8941f, 11.5f, 13.7502f)
                curveTo(11.6435f, 13.5039f, 11.8179f, 13.2716f, 12.0232f, 13.0591f)
                curveTo(12.3155f, 12.7566f, 12.6466f, 12.5189f, 13.0f, 12.346f)
                curveTo(14.2963f, 11.7118f, 15.8917f, 11.9495f, 16.9637f, 13.0591f)
                lineTo(17.0f, 13.0966f)
                lineTo(17.0363f, 13.0591f)
                curveTo(17.8443f, 12.2227f, 18.9498f, 11.8817f, 20.0003f, 12.0361f)
                curveTo(20.5295f, 12.1139f, 21.0448f, 12.3173f, 21.5011f, 12.6465f)
                curveTo(21.6683f, 12.7672f, 21.8276f, 12.9047f, 21.9768f, 13.0591f)
                close()
            }
        }
        .build()
        return _boardHeart!!
    }

private var _boardHeart: ImageVector? = null
