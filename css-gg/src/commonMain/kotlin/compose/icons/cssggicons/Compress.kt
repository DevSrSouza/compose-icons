package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Compress: ImageVector
    get() {
        if (_compress != null) {
            return _compress!!
        }
        _compress = Builder(name = "Compress", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.095f, 8.43f)
                lineTo(17.671f, 7.026f)
                lineTo(12.757f, 12.011f)
                lineTo(17.742f, 16.925f)
                lineTo(19.146f, 15.501f)
                lineTo(16.644f, 13.034f)
                lineTo(23.141f, 13.085f)
                lineTo(23.156f, 11.085f)
                lineTo(16.529f, 11.033f)
                lineTo(19.095f, 8.43f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.467f, 15.562f)
                lineTo(6.883f, 16.974f)
                lineTo(11.827f, 12.018f)
                lineTo(6.871f, 7.075f)
                lineTo(5.459f, 8.491f)
                lineTo(8.05f, 11.076f)
                lineTo(0.844f, 11.1f)
                lineTo(0.85f, 13.1f)
                lineTo(7.947f, 13.076f)
                lineTo(5.467f, 15.562f)
                close()
            }
        }
        .build()
        return _compress!!
    }

private var _compress: ImageVector? = null
