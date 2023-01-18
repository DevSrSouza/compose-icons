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

public val RegularGroup.TextFontInfo: ImageVector
    get() {
        if (_textFontInfo != null) {
            return _textFontInfo!!
        }
        _textFontInfo = Builder(name = "TextFontInfo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.5108f, 2.0001f)
                curveTo(9.8244f, 2.0045f, 10.1021f, 2.2036f, 10.207f, 2.4992f)
                lineTo(13.3885f, 11.4653f)
                curveTo(12.9522f, 11.822f, 12.5631f, 12.2344f, 12.232f, 12.6915f)
                lineTo(9.4696f, 4.9066f)
                lineTo(6.3367f, 13.0f)
                lineTo(12.0218f, 13.0f)
                curveTo(11.7253f, 13.4632f, 11.4858f, 13.9665f, 11.3135f, 14.5f)
                lineTo(5.7561f, 14.5f)
                lineTo(4.1996f, 18.5207f)
                curveTo(4.0501f, 18.907f, 3.6157f, 19.099f, 3.2295f, 18.9494f)
                curveTo(2.8432f, 18.7999f, 2.6512f, 18.3655f, 2.8008f, 17.9793f)
                lineTo(8.8008f, 2.4792f)
                curveTo(8.914f, 2.1868f, 9.1972f, 1.9956f, 9.5108f, 2.0001f)
                close()
                moveTo(17.0f, 16.0f)
                verticalLineTo(19.0f)
                curveTo(17.0f, 19.2761f, 17.2239f, 19.5f, 17.5f, 19.5f)
                curveTo(17.7761f, 19.5f, 18.0f, 19.2761f, 18.0f, 19.0f)
                verticalLineTo(16.0f)
                curveTo(18.0f, 15.7239f, 17.7761f, 15.5f, 17.5f, 15.5f)
                curveTo(17.2239f, 15.5f, 17.0f, 15.7239f, 17.0f, 16.0f)
                close()
                moveTo(18.25f, 13.75f)
                curveTo(18.25f, 14.1642f, 17.9142f, 14.5f, 17.5f, 14.5f)
                curveTo(17.0858f, 14.5f, 16.75f, 14.1642f, 16.75f, 13.75f)
                curveTo(16.75f, 13.3358f, 17.0858f, 13.0f, 17.5f, 13.0f)
                curveTo(17.9142f, 13.0f, 18.25f, 13.3358f, 18.25f, 13.75f)
                close()
                moveTo(23.0f, 16.5f)
                curveTo(23.0f, 19.5376f, 20.5376f, 22.0f, 17.5f, 22.0f)
                curveTo(14.4624f, 22.0f, 12.0f, 19.5376f, 12.0f, 16.5f)
                curveTo(12.0f, 13.4624f, 14.4624f, 11.0f, 17.5f, 11.0f)
                curveTo(20.5376f, 11.0f, 23.0f, 13.4624f, 23.0f, 16.5f)
                close()
                moveTo(22.0f, 16.5f)
                curveTo(22.0f, 14.0147f, 19.9853f, 12.0f, 17.5f, 12.0f)
                curveTo(15.0147f, 12.0f, 13.0f, 14.0147f, 13.0f, 16.5f)
                curveTo(13.0f, 18.9853f, 15.0147f, 21.0f, 17.5f, 21.0f)
                curveTo(19.9853f, 21.0f, 22.0f, 18.9853f, 22.0f, 16.5f)
                close()
            }
        }
        .build()
        return _textFontInfo!!
    }

private var _textFontInfo: ImageVector? = null
