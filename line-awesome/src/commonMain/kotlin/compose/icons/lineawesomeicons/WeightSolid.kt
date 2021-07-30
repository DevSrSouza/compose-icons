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

public val LineAwesomeIcons.WeightSolid: ImageVector
    get() {
        if (_weightSolid != null) {
            return _weightSolid!!
        }
        _weightSolid = Builder(name = "WeightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                lineTo(4.0f, 26.0f)
                lineTo(28.0f, 26.0f)
                lineTo(28.0f, 6.0f)
                close()
                moveTo(6.0f, 8.0f)
                lineTo(26.0f, 8.0f)
                lineTo(26.0f, 24.0f)
                lineTo(6.0f, 24.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(11.668f, 10.0f, 8.4375f, 12.1563f, 8.4375f, 12.1563f)
                lineTo(7.6563f, 12.6875f)
                lineTo(8.1563f, 13.5f)
                lineTo(11.1563f, 18.5f)
                lineTo(11.4375f, 19.0f)
                lineTo(20.5625f, 19.0f)
                lineTo(20.8438f, 18.5f)
                lineTo(23.8438f, 13.5f)
                lineTo(24.3438f, 12.6875f)
                lineTo(23.5625f, 12.1563f)
                curveTo(23.5625f, 12.1563f, 20.332f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(18.8242f, 12.0f, 20.6875f, 12.9063f, 21.5938f, 13.4063f)
                lineTo(19.4688f, 17.0f)
                lineTo(17.625f, 17.0f)
                lineTo(18.9063f, 14.4375f)
                lineTo(17.0938f, 13.5625f)
                lineTo(15.375f, 17.0f)
                lineTo(12.5313f, 17.0f)
                lineTo(10.4063f, 13.4063f)
                curveTo(11.3125f, 12.9063f, 13.1758f, 12.0f, 16.0f, 12.0f)
                close()
            }
        }
        .build()
        return _weightSolid!!
    }

private var _weightSolid: ImageVector? = null
