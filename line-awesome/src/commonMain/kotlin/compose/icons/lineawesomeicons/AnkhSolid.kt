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

public val LineAwesomeIcons.AnkhSolid: ImageVector
    get() {
        if (_ankhSolid != null) {
            return _ankhSolid!!
        }
        _ankhSolid = Builder(name = "AnkhSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 2.0f)
                curveTo(13.25f, 2.0f, 11.0f, 4.25f, 11.0f, 7.0f)
                curveTo(11.0f, 8.957f, 12.1133f, 10.875f, 13.1563f, 12.4375f)
                curveTo(13.2891f, 12.6406f, 13.4297f, 12.8125f, 13.5625f, 13.0f)
                lineTo(8.0f, 13.0f)
                lineTo(8.0f, 16.1563f)
                lineTo(9.1563f, 16.0f)
                lineTo(14.9063f, 15.1875f)
                lineTo(14.0f, 28.9375f)
                lineTo(13.9375f, 30.0f)
                lineTo(18.0625f, 30.0f)
                lineTo(18.0f, 28.9375f)
                lineTo(17.0938f, 15.1875f)
                lineTo(22.8438f, 16.0f)
                lineTo(24.0f, 16.1563f)
                lineTo(24.0f, 13.0f)
                lineTo(18.4375f, 13.0f)
                curveTo(18.5703f, 12.8125f, 18.7109f, 12.6406f, 18.8438f, 12.4375f)
                curveTo(19.8867f, 10.875f, 21.0f, 8.957f, 21.0f, 7.0f)
                curveTo(21.0f, 4.25f, 18.75f, 2.0f, 16.0f, 2.0f)
                close()
                moveTo(16.0f, 4.0f)
                curveTo(17.668f, 4.0f, 19.0f, 5.332f, 19.0f, 7.0f)
                curveTo(19.0f, 8.0781f, 18.1133f, 9.9141f, 17.1563f, 11.3438f)
                curveTo(16.5742f, 12.2188f, 16.3672f, 12.4297f, 16.0f, 12.875f)
                curveTo(15.6328f, 12.4297f, 15.4258f, 12.2188f, 14.8438f, 11.3438f)
                curveTo(13.8867f, 9.9141f, 13.0f, 8.0781f, 13.0f, 7.0f)
                curveTo(13.0f, 5.332f, 14.332f, 4.0f, 16.0f, 4.0f)
                close()
            }
        }
        .build()
        return _ankhSolid!!
    }

private var _ankhSolid: ImageVector? = null
