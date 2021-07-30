package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Stark: ImageVector
    get() {
        if (_stark != null) {
            return _stark!!
        }
        _stark = Builder(name = "Stark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1722f, 18.0249f)
                curveTo(5.8166f, 17.2862f, 4.6952f, 16.1661f, 3.9553f, 14.791f)
                curveTo(3.0166f, 13.0467f, 2.7585f, 11.0163f, 3.2307f, 9.0927f)
                curveTo(3.703f, 7.1691f, 4.872f, 5.489f, 6.5116f, 4.3777f)
                curveTo(8.1513f, 3.2665f, 10.1449f, 2.8029f, 12.1066f, 3.0769f)
                lineTo(11.67f, 6.2026f)
                curveTo(10.4822f, 6.0367f, 9.2751f, 6.3173f, 8.2823f, 6.9902f)
                curveTo(7.2895f, 7.6631f, 6.5816f, 8.6804f, 6.2957f, 9.8451f)
                curveTo(6.0098f, 11.0099f, 6.1661f, 12.2393f, 6.7344f, 13.2954f)
                curveTo(7.1825f, 14.1281f, 7.8615f, 14.8063f, 8.6823f, 15.2536f)
                lineTo(14.8278f, 3.9754f)
                lineTo(17.4621f, 5.4108f)
                curveTo(18.8177f, 6.1495f, 19.9391f, 7.2696f, 20.679f, 8.6447f)
                curveTo(21.6177f, 10.3889f, 21.8758f, 12.4193f, 21.4036f, 14.343f)
                curveTo(20.9314f, 16.2666f, 19.7623f, 17.9466f, 18.1227f, 19.0579f)
                curveTo(16.483f, 20.1692f, 14.4894f, 20.6327f, 12.5277f, 20.3587f)
                lineTo(12.9643f, 17.2331f)
                curveTo(14.1521f, 17.399f, 15.3592f, 17.1183f, 16.352f, 16.4454f)
                curveTo(17.3448f, 15.7725f, 18.0527f, 14.7553f, 18.3386f, 13.5905f)
                curveTo(18.6245f, 12.4258f, 18.4682f, 11.1964f, 17.8999f, 10.1402f)
                curveTo(17.4518f, 9.3076f, 16.7728f, 8.6294f, 15.952f, 8.1821f)
                lineTo(9.8065f, 19.4604f)
                lineTo(7.1722f, 18.0249f)
                close()
            }
        }
        .build()
        return _stark!!
    }

private var _stark: ImageVector? = null
