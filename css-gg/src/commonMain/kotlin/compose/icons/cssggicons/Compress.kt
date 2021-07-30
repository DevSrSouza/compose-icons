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
                moveTo(19.0954f, 8.4299f)
                lineTo(17.6711f, 7.0258f)
                lineTo(12.7568f, 12.0107f)
                lineTo(17.7417f, 16.925f)
                lineTo(19.1458f, 15.5007f)
                lineTo(16.644f, 13.0344f)
                lineTo(23.1411f, 13.0847f)
                lineTo(23.1565f, 11.0848f)
                lineTo(16.5286f, 11.0334f)
                lineTo(19.0954f, 8.4299f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.4674f, 15.5618f)
                lineTo(6.8834f, 16.9742f)
                lineTo(11.827f, 12.0183f)
                lineTo(6.871f, 7.0748f)
                lineTo(5.4586f, 8.4907f)
                lineTo(8.0499f, 11.0756f)
                lineTo(0.8435f, 11.1004f)
                lineTo(0.8504f, 13.1004f)
                lineTo(7.947f, 13.076f)
                lineTo(5.4674f, 15.5618f)
                close()
            }
        }
        .build()
        return _compress!!
    }

private var _compress: ImageVector? = null
