package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Ericsson: ImageVector
    get() {
        if (_ericsson != null) {
            return _ericsson!!
        }
        _ericsson = Builder(name = "Ericsson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7169f, 5.7231f)
                curveTo(6.7158f, 6.19f, 6.2827f, 7.3799f, 6.7495f, 8.381f)
                curveTo(7.2163f, 9.3821f, 8.4063f, 9.8152f, 9.4074f, 9.3484f)
                lineTo(20.2831f, 4.277f)
                curveTo(21.2841f, 3.8101f, 21.7172f, 2.6202f, 21.2504f, 1.6191f)
                curveTo(20.7836f, 0.618f, 19.5937f, 0.1849f, 18.5926f, 0.6517f)
                lineTo(7.7169f, 5.7231f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.7495f, 15.381f)
                curveTo(4.2827f, 14.3799f, 4.7158f, 13.19f, 5.7169f, 12.7231f)
                lineTo(16.5926f, 7.6517f)
                curveTo(17.5937f, 7.1849f, 18.7836f, 7.618f, 19.2504f, 8.6191f)
                curveTo(19.7172f, 9.6202f, 19.2841f, 10.8101f, 18.2831f, 11.277f)
                lineTo(7.4074f, 16.3484f)
                curveTo(6.4063f, 16.8152f, 5.2163f, 16.3821f, 4.7495f, 15.381f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.7495f, 22.381f)
                curveTo(2.2827f, 21.3799f, 2.7158f, 20.19f, 3.7169f, 19.7231f)
                lineTo(14.5926f, 14.6517f)
                curveTo(15.5937f, 14.1849f, 16.7836f, 14.618f, 17.2504f, 15.6191f)
                curveTo(17.7172f, 16.6202f, 17.2841f, 17.8101f, 16.2831f, 18.277f)
                lineTo(5.4074f, 23.3484f)
                curveTo(4.4063f, 23.8152f, 3.2163f, 23.3821f, 2.7495f, 22.381f)
                close()
            }
        }
        .build()
        return _ericsson!!
    }

private var _ericsson: ImageVector? = null
