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

public val LineAwesomeIcons.FillSolid: ImageVector
    get() {
        if (_fillSolid != null) {
            return _fillSolid!!
        }
        _fillSolid = Builder(name = "FillSolid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.3125f, 3.2813f)
                lineTo(9.9063f, 4.7188f)
                lineTo(11.6875f, 6.5f)
                lineTo(4.7813f, 13.4063f)
                curveTo(3.5977f, 14.5898f, 3.5977f, 16.5352f, 4.7813f, 17.7188f)
                lineTo(4.8438f, 17.7813f)
                lineTo(11.1875f, 24.0938f)
                curveTo(12.3711f, 25.2773f, 14.3164f, 25.2773f, 15.5f, 24.0938f)
                lineTo(23.0938f, 16.5f)
                lineTo(23.8125f, 15.8125f)
                lineTo(14.0938f, 6.0938f)
                lineTo(13.3125f, 5.2813f)
                lineTo(13.0938f, 5.0938f)
                close()
                moveTo(13.125f, 7.9375f)
                lineTo(21.0f, 15.8125f)
                lineTo(14.0938f, 22.6875f)
                curveTo(13.6758f, 23.1055f, 13.0117f, 23.1055f, 12.5938f, 22.6875f)
                lineTo(6.2188f, 16.2813f)
                curveTo(5.8008f, 15.8633f, 5.8008f, 15.2305f, 6.2188f, 14.8125f)
                close()
                moveTo(25.0f, 19.25f)
                lineTo(24.1875f, 20.4375f)
                curveTo(24.1875f, 20.4375f, 23.6484f, 21.1914f, 23.125f, 22.0938f)
                curveTo(22.8633f, 22.5469f, 22.6172f, 23.0195f, 22.4063f, 23.5f)
                curveTo(22.1953f, 23.9805f, 22.0f, 24.4219f, 22.0f, 25.0f)
                curveTo(22.0f, 26.6445f, 23.3555f, 28.0f, 25.0f, 28.0f)
                curveTo(26.6445f, 28.0f, 28.0f, 26.6445f, 28.0f, 25.0f)
                curveTo(28.0f, 24.4219f, 27.8047f, 23.9805f, 27.5938f, 23.5f)
                curveTo(27.3828f, 23.0195f, 27.1367f, 22.5469f, 26.875f, 22.0938f)
                curveTo(26.3516f, 21.1914f, 25.8125f, 20.4375f, 25.8125f, 20.4375f)
                close()
                moveTo(25.0f, 22.875f)
                curveTo(25.0664f, 22.9844f, 25.0586f, 22.9766f, 25.125f, 23.0938f)
                curveTo(25.3633f, 23.5039f, 25.6172f, 23.9414f, 25.7813f, 24.3125f)
                curveTo(25.9453f, 24.6836f, 26.0f, 25.0273f, 26.0f, 25.0f)
                curveTo(26.0f, 25.5547f, 25.5547f, 26.0f, 25.0f, 26.0f)
                curveTo(24.4453f, 26.0f, 24.0f, 25.5547f, 24.0f, 25.0f)
                curveTo(24.0f, 25.0273f, 24.0547f, 24.6836f, 24.2188f, 24.3125f)
                curveTo(24.3828f, 23.9414f, 24.6367f, 23.5039f, 24.875f, 23.0938f)
                curveTo(24.9414f, 22.9766f, 24.9336f, 22.9844f, 25.0f, 22.875f)
                close()
            }
        }
        .build()
        return _fillSolid!!
    }

private var _fillSolid: ImageVector? = null
