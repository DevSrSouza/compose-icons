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

public val LineAwesomeIcons.GetPocket: ImageVector
    get() {
        if (_getPocket != null) {
            return _getPocket!!
        }
        _getPocket = Builder(name = "GetPocket", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 5.0f)
                curveTo(5.355f, 5.0f, 4.0f, 6.355f, 4.0f, 8.0f)
                lineTo(4.0f, 15.0f)
                curveTo(4.0f, 21.617f, 9.383f, 27.0f, 16.0f, 27.0f)
                curveTo(22.617f, 27.0f, 28.0f, 21.617f, 28.0f, 15.0f)
                lineTo(28.0f, 8.0f)
                curveTo(28.0f, 6.355f, 26.645f, 5.0f, 25.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(25.0f, 7.0f)
                curveTo(25.566f, 7.0f, 26.0f, 7.434f, 26.0f, 8.0f)
                lineTo(26.0f, 15.0f)
                curveTo(26.0f, 20.535f, 21.535f, 25.0f, 16.0f, 25.0f)
                curveTo(10.465f, 25.0f, 6.0f, 20.535f, 6.0f, 15.0f)
                lineTo(6.0f, 8.0f)
                curveTo(6.0f, 7.434f, 6.434f, 7.0f, 7.0f, 7.0f)
                close()
                moveTo(10.656f, 11.406f)
                curveTo(10.273f, 11.406f, 9.887f, 11.582f, 9.594f, 11.875f)
                curveTo(9.008f, 12.461f, 9.008f, 13.383f, 9.594f, 13.969f)
                lineTo(15.0f, 19.375f)
                curveTo(15.281f, 19.656f, 15.664f, 19.813f, 16.063f, 19.813f)
                curveTo(16.461f, 19.813f, 16.844f, 19.656f, 17.125f, 19.375f)
                lineTo(22.406f, 14.125f)
                curveTo(22.992f, 13.539f, 22.992f, 12.586f, 22.406f, 12.0f)
                curveTo(21.82f, 11.414f, 20.867f, 11.414f, 20.281f, 12.0f)
                lineTo(16.063f, 16.219f)
                lineTo(11.719f, 11.875f)
                curveTo(11.426f, 11.582f, 11.039f, 11.406f, 10.656f, 11.406f)
                close()
            }
        }
        .build()
        return _getPocket!!
    }

private var _getPocket: ImageVector? = null
