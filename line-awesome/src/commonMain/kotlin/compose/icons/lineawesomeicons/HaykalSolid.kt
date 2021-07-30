package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.HaykalSolid: ImageVector
    get() {
        if (_haykalSolid != null) {
            return _haykalSolid!!
        }
        _haykalSolid = Builder(name = "HaykalSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(15.628f, 3.0f, 15.2571f, 3.2164f, 15.1191f, 3.6504f)
                lineTo(13.3887f, 9.0938f)
                lineTo(8.7559f, 6.3984f)
                curveTo(8.5949f, 6.2964f, 8.4257f, 6.25f, 8.2637f, 6.25f)
                curveTo(7.6587f, 6.25f, 7.1373f, 6.8809f, 7.4043f, 7.5469f)
                lineTo(9.3867f, 12.5f)
                lineTo(3.8008f, 13.2832f)
                curveTo(2.9098f, 13.4082f, 2.6991f, 14.6179f, 3.4941f, 15.0449f)
                lineTo(8.4785f, 17.7188f)
                lineTo(4.3262f, 22.0137f)
                curveTo(3.7722f, 22.6357f, 4.24f, 23.584f, 5.002f, 23.584f)
                curveTo(5.069f, 23.584f, 5.138f, 23.5765f, 5.209f, 23.5605f)
                lineTo(11.2109f, 22.3086f)
                lineTo(11.002f, 28.0234f)
                curveTo(10.98f, 28.6154f, 11.4525f, 28.998f, 11.9375f, 28.998f)
                curveTo(12.1995f, 28.998f, 12.4652f, 28.8878f, 12.6582f, 28.6348f)
                lineTo(16.0f, 24.1191f)
                lineTo(19.3438f, 28.6348f)
                curveTo(19.5368f, 28.8868f, 19.8025f, 28.998f, 20.0645f, 28.998f)
                curveTo(20.5485f, 28.998f, 21.02f, 28.6154f, 20.998f, 28.0234f)
                lineTo(20.7891f, 22.3086f)
                lineTo(26.832f, 23.5605f)
                curveTo(26.903f, 23.5755f, 26.9731f, 23.584f, 27.0391f, 23.584f)
                curveTo(27.8031f, 23.584f, 28.2688f, 22.6347f, 27.7148f, 22.0137f)
                lineTo(23.5215f, 17.7188f)
                lineTo(28.5078f, 15.0449f)
                curveTo(29.3018f, 14.6189f, 29.0902f, 13.4102f, 28.1992f, 13.2852f)
                lineTo(22.6133f, 12.5f)
                lineTo(24.5957f, 7.5469f)
                curveTo(24.8627f, 6.8809f, 24.3413f, 6.25f, 23.7363f, 6.25f)
                curveTo(23.5733f, 6.25f, 23.4051f, 6.2964f, 23.2441f, 6.3984f)
                lineTo(18.6133f, 9.0938f)
                lineTo(16.8828f, 3.6504f)
                curveTo(16.7438f, 3.2174f, 16.372f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 10.8672f)
                lineTo(16.8613f, 13.5762f)
                lineTo(19.5723f, 11.998f)
                lineTo(18.3848f, 14.9688f)
                lineTo(21.502f, 15.4043f)
                lineTo(18.5254f, 17.002f)
                lineTo(20.6797f, 19.207f)
                lineTo(17.752f, 18.5879f)
                lineTo(17.8613f, 21.6074f)
                lineTo(16.0f, 19.1836f)
                lineTo(14.1406f, 21.6094f)
                lineTo(14.252f, 18.582f)
                lineTo(11.3086f, 19.209f)
                lineTo(13.4531f, 16.9902f)
                lineTo(10.5f, 15.4063f)
                lineTo(13.6152f, 14.9688f)
                lineTo(12.4277f, 12.0f)
                lineTo(15.1387f, 13.5762f)
                lineTo(16.0f, 10.8672f)
                close()
            }
        }
        .build()
        return _haykalSolid!!
    }

private var _haykalSolid: ImageVector? = null
