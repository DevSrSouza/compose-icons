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

public val LineAwesomeIcons.MercurySolid: ImageVector
    get() {
        if (_mercurySolid != null) {
            return _mercurySolid!!
        }
        _mercurySolid = Builder(name = "MercurySolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.0f, 2.0f)
                curveTo(11.0f, 3.4766f, 11.6602f, 4.8008f, 12.6875f, 5.7188f)
                curveTo(9.9297f, 6.9844f, 8.0f, 9.7773f, 8.0f, 13.0f)
                curveTo(8.0f, 17.0664f, 11.0664f, 20.4375f, 15.0f, 20.9375f)
                lineTo(15.0f, 24.0f)
                lineTo(11.0f, 24.0f)
                lineTo(11.0f, 26.0f)
                lineTo(15.0f, 26.0f)
                lineTo(15.0f, 30.0f)
                lineTo(17.0f, 30.0f)
                lineTo(17.0f, 26.0f)
                lineTo(21.0f, 26.0f)
                lineTo(21.0f, 24.0f)
                lineTo(17.0f, 24.0f)
                lineTo(17.0f, 20.9375f)
                curveTo(20.9336f, 20.4375f, 24.0f, 17.0664f, 24.0f, 13.0f)
                curveTo(24.0f, 9.7773f, 22.0703f, 6.9844f, 19.3125f, 5.7188f)
                curveTo(20.3398f, 4.8008f, 21.0f, 3.4766f, 21.0f, 2.0f)
                lineTo(19.0f, 2.0f)
                curveTo(19.0f, 3.668f, 17.668f, 5.0f, 16.0f, 5.0f)
                curveTo(14.332f, 5.0f, 13.0f, 3.668f, 13.0f, 2.0f)
                close()
                moveTo(16.0f, 7.0f)
                curveTo(19.3242f, 7.0f, 22.0f, 9.6758f, 22.0f, 13.0f)
                curveTo(22.0f, 16.3242f, 19.3242f, 19.0f, 16.0f, 19.0f)
                curveTo(12.6758f, 19.0f, 10.0f, 16.3242f, 10.0f, 13.0f)
                curveTo(10.0f, 9.6758f, 12.6758f, 7.0f, 16.0f, 7.0f)
                close()
            }
        }
        .build()
        return _mercurySolid!!
    }

private var _mercurySolid: ImageVector? = null
