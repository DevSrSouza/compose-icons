package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Now: ImageVector
    get() {
        if (_now != null) {
            return _now!!
        }
        _now = Builder(name = "Now", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.8009f, 11.9974f)
                curveToRelative(0.0f, -0.974f, 0.7878f, -1.7634f, 1.7596f, -1.7634f)
                curveToRelative(0.9718f, 0.0f, 1.7596f, 0.7895f, 1.7596f, 1.7634f)
                curveToRelative(0.0f, 0.9738f, -0.7878f, 1.7634f, -1.7596f, 1.7634f)
                curveToRelative(-0.9718f, 0.0f, -1.7596f, -0.7896f, -1.7596f, -1.7634f)
                close()
                moveTo(21.8286f, 9.1014f)
                lineToRelative(-1.2166f, 2.4524f)
                lineToRelative(-0.7878f, -2.3188f)
                lineToRelative(-0.0015f, -3.0E-4f)
                curveToRelative(-0.1566f, -0.4505f, -0.5822f, -0.7737f, -1.0829f, -0.7737f)
                curveToRelative(-0.399f, 0.0f, -0.7505f, 0.2054f, -0.956f, 0.517f)
                curveToRelative(-0.5255f, 0.8015f, -1.0497f, 1.6094f, -1.5735f, 2.414f)
                lineToRelative(-0.2785f, -1.956f)
                curveToRelative(-0.0963f, -0.6296f, -0.6807f, -1.0587f, -1.3048f, -0.9624f)
                curveToRelative(-0.6249f, 0.096f, -1.0538f, 0.6778f, -0.958f, 1.304f)
                lineToRelative(0.0488f, 0.328f)
                curveToRelative(-0.6427f, -1.0749f, -1.8162f, -1.7945f, -3.1575f, -1.7945f)
                curveToRelative(-1.353f, 0.0f, -2.5352f, 0.7324f, -3.174f, 1.823f)
                lineToRelative(0.07f, -0.3434f)
                curveToRelative(0.1223f, -0.6008f, -0.2645f, -1.1873f, -0.864f, -1.31f)
                curveToRelative(-0.5993f, -0.1223f, -1.1848f, 0.265f, -1.307f, 0.8659f)
                lineToRelative(-0.4763f, 2.3382f)
                lineToRelative(-1.752f, -2.7177f)
                curveToRelative(-0.198f, -0.3042f, -0.5399f, -0.5053f, -0.9284f, -0.5053f)
                curveToRelative(-0.5317f, 0.0f, -0.976f, 0.3765f, -1.084f, 0.879f)
                lineToRelative(-1.0217f, 5.012f)
                curveToRelative(-0.1223f, 0.6007f, 0.257f, 1.1846f, 0.8575f, 1.3121f)
                curveToRelative(0.0747f, 0.0159f, 0.1556f, 0.0235f, 0.2291f, 0.024f)
                curveToRelative(0.5139f, 0.0036f, 0.9763f, -0.3579f, 1.0844f, -0.892f)
                lineToRelative(0.4763f, -2.3383f)
                curveToRelative(0.5924f, 0.9217f, 1.1845f, 1.844f, 1.779f, 2.7641f)
                curveToRelative(0.196f, 0.2777f, 0.5281f, 0.4662f, 0.9018f, 0.4662f)
                curveToRelative(0.5462f, 0.0f, 1.0002f, -0.398f, 1.0915f, -0.9219f)
                lineToRelative(0.469f, -2.302f)
                curveToRelative(0.2292f, 1.815f, 1.7755f, 3.2187f, 3.6488f, 3.2187f)
                curveToRelative(1.7257f, 0.0f, 3.1736f, -1.191f, 3.5705f, -2.7972f)
                lineToRelative(0.2613f, 1.759f)
                curveToRelative(0.0736f, 0.579f, 0.5474f, 1.0371f, 1.1411f, 1.0371f)
                curveToRelative(0.4272f, 0.0f, 0.7756f, -0.2445f, 0.9972f, -0.5841f)
                lineToRelative(1.8844f, -2.8942f)
                lineToRelative(0.905f, 2.6645f)
                curveToRelative(0.1622f, 0.4752f, 0.5808f, 0.8138f, 1.0961f, 0.8138f)
                curveToRelative(0.4788f, 0.0f, 0.855f, -0.288f, 1.0609f, -0.7155f)
                lineToRelative(2.402f, -4.845f)
                curveToRelative(0.2834f, -0.568f, 0.0528f, -1.2551f, -0.5123f, -1.5403f)
                curveToRelative(-0.5647f, -0.285f, -1.2558f, -0.0524f, -1.5379f, 0.5196f)
                close()
            }
        }
        .build()
        return _now!!
    }

private var _now: ImageVector? = null
