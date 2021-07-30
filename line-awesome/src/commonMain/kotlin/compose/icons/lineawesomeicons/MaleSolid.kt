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

public val LineAwesomeIcons.MaleSolid: ImageVector
    get() {
        if (_maleSolid != null) {
            return _maleSolid!!
        }
        _maleSolid = Builder(name = "MaleSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.8008f, 2.0f, 12.0f, 3.8008f, 12.0f, 6.0f)
                curveTo(12.0f, 7.0664f, 12.4336f, 8.0313f, 13.125f, 8.75f)
                curveTo(11.2734f, 9.7734f, 10.0f, 11.7461f, 10.0f, 14.0f)
                lineTo(10.0f, 19.4063f)
                lineTo(10.2813f, 19.7188f)
                lineTo(12.0f, 21.4375f)
                lineTo(12.0f, 30.0f)
                lineTo(14.0f, 30.0f)
                lineTo(14.0f, 20.5938f)
                lineTo(13.7188f, 20.2813f)
                lineTo(12.0f, 18.5625f)
                lineTo(12.0f, 14.0f)
                curveTo(12.0f, 11.7813f, 13.7813f, 10.0f, 16.0f, 10.0f)
                curveTo(18.2188f, 10.0f, 20.0f, 11.7813f, 20.0f, 14.0f)
                lineTo(20.0f, 18.5625f)
                lineTo(18.2813f, 20.2813f)
                lineTo(18.0f, 20.5938f)
                lineTo(18.0f, 30.0f)
                lineTo(20.0f, 30.0f)
                lineTo(20.0f, 21.4375f)
                lineTo(21.7188f, 19.7188f)
                lineTo(22.0f, 19.4063f)
                lineTo(22.0f, 14.0f)
                curveTo(22.0f, 11.7461f, 20.7266f, 9.7734f, 18.875f, 8.75f)
                curveTo(19.5664f, 8.0313f, 20.0f, 7.0664f, 20.0f, 6.0f)
                curveTo(20.0f, 3.8008f, 18.1992f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(17.1172f, 4.0f, 18.0f, 4.8828f, 18.0f, 6.0f)
                curveTo(18.0f, 7.1172f, 17.1172f, 8.0f, 16.0f, 8.0f)
                curveTo(14.8828f, 8.0f, 14.0f, 7.1172f, 14.0f, 6.0f)
                curveTo(14.0f, 4.8828f, 14.8828f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _maleSolid!!
    }

private var _maleSolid: ImageVector? = null
