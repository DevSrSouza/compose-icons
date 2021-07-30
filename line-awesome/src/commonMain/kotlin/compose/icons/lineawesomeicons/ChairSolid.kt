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

public val LineAwesomeIcons.ChairSolid: ImageVector
    get() {
        if (_chairSolid != null) {
            return _chairSolid!!
        }
        _chairSolid = Builder(name = "ChairSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 4.0f)
                lineTo(11.0f, 16.4375f)
                curveTo(10.8984f, 16.4648f, 10.7773f, 16.5039f, 10.6875f, 16.5313f)
                curveTo(10.2031f, 16.6797f, 9.8672f, 16.8359f, 9.625f, 17.0f)
                curveTo(9.5039f, 17.082f, 9.3906f, 17.168f, 9.3125f, 17.25f)
                curveTo(9.2344f, 17.332f, 9.125f, 17.5f, 9.125f, 17.5f)
                lineTo(9.0f, 17.7188f)
                lineTo(9.0f, 20.0f)
                lineTo(10.0f, 20.0f)
                lineTo(10.0f, 28.0f)
                lineTo(12.0f, 28.0f)
                lineTo(12.0f, 20.0f)
                lineTo(20.0f, 20.0f)
                lineTo(20.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 20.0f)
                lineTo(23.0f, 20.0f)
                lineTo(23.0f, 17.7188f)
                lineTo(22.875f, 17.5f)
                curveTo(22.875f, 17.5f, 22.7656f, 17.332f, 22.6875f, 17.25f)
                curveTo(22.6094f, 17.168f, 22.4961f, 17.082f, 22.375f, 17.0f)
                curveTo(22.1328f, 16.8359f, 21.7969f, 16.6797f, 21.3125f, 16.5313f)
                curveTo(21.2227f, 16.5039f, 21.1016f, 16.4648f, 21.0f, 16.4375f)
                lineTo(21.0f, 4.0f)
                lineTo(19.0f, 4.0f)
                lineTo(19.0f, 5.0f)
                lineTo(13.0f, 5.0f)
                lineTo(13.0f, 4.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(15.0f, 7.0f)
                lineTo(15.0f, 16.0313f)
                curveTo(14.2422f, 16.0508f, 13.5625f, 16.0703f, 13.0f, 16.125f)
                close()
                moveTo(17.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 16.125f)
                curveTo(18.4375f, 16.0703f, 17.7578f, 16.0508f, 17.0f, 16.0313f)
                close()
            }
        }
        .build()
        return _chairSolid!!
    }

private var _chairSolid: ImageVector? = null
