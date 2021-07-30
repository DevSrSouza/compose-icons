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

public val LineAwesomeIcons.TintSolid: ImageVector
    get() {
        if (_tintSolid != null) {
            return _tintSolid!!
        }
        _tintSolid = Builder(name = "TintSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.4375f)
                lineTo(15.2188f, 4.375f)
                curveTo(15.2188f, 4.375f, 13.2188f, 6.7852f, 11.1875f, 9.7813f)
                curveTo(10.1719f, 11.2813f, 9.125f, 12.918f, 8.3438f, 14.5f)
                curveTo(7.5625f, 16.082f, 7.0f, 17.5977f, 7.0f, 19.0f)
                curveTo(7.0f, 23.9453f, 11.0547f, 28.0f, 16.0f, 28.0f)
                curveTo(20.9453f, 28.0f, 25.0f, 23.9453f, 25.0f, 19.0f)
                curveTo(25.0f, 17.5977f, 24.4375f, 16.082f, 23.6563f, 14.5f)
                curveTo(22.875f, 12.918f, 21.8281f, 11.2813f, 20.8125f, 9.7813f)
                curveTo(18.7813f, 6.7852f, 16.7813f, 4.375f, 16.7813f, 4.375f)
                close()
                moveTo(16.0f, 6.6563f)
                curveTo(16.5586f, 7.3477f, 17.6055f, 8.5742f, 19.1875f, 10.9063f)
                curveTo(20.1719f, 12.3555f, 21.125f, 13.9531f, 21.8438f, 15.4063f)
                curveTo(22.5625f, 16.8594f, 23.0f, 18.2031f, 23.0f, 19.0f)
                curveTo(23.0f, 22.8555f, 19.8555f, 26.0f, 16.0f, 26.0f)
                curveTo(12.1445f, 26.0f, 9.0f, 22.8555f, 9.0f, 19.0f)
                curveTo(9.0f, 18.2031f, 9.4375f, 16.8594f, 10.1563f, 15.4063f)
                curveTo(10.875f, 13.9531f, 11.8281f, 12.3555f, 12.8125f, 10.9063f)
                curveTo(14.3945f, 8.5742f, 15.4414f, 7.3477f, 16.0f, 6.6563f)
                close()
                moveTo(11.0f, 19.0f)
                curveTo(11.0f, 21.7461f, 13.2539f, 24.0f, 16.0f, 24.0f)
                lineTo(16.0f, 22.0f)
                curveTo(14.3438f, 22.0f, 13.0f, 20.6563f, 13.0f, 19.0f)
                close()
            }
        }
        .build()
        return _tintSolid!!
    }

private var _tintSolid: ImageVector? = null
