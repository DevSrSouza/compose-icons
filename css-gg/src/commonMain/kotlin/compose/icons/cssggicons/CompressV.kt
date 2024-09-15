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

public val CssGgIcons.CompressV: ImageVector
    get() {
        if (_compressV != null) {
            return _compressV!!
        }
        _compressV = Builder(name = "CompressV", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.034f, 7.356f)
                lineTo(15.5f, 4.854f)
                lineTo(16.924f, 6.258f)
                lineTo(12.011f, 11.243f)
                lineTo(7.025f, 6.329f)
                lineTo(8.429f, 4.905f)
                lineTo(11.033f, 7.471f)
                lineTo(11.083f, 0.844f)
                lineTo(13.083f, 0.859f)
                lineTo(13.034f, 7.356f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.563f, 18.532f)
                lineTo(16.975f, 17.116f)
                lineTo(12.018f, 12.173f)
                lineTo(7.075f, 17.129f)
                lineTo(8.492f, 18.542f)
                lineTo(11.076f, 15.95f)
                lineTo(11.102f, 23.157f)
                lineTo(13.102f, 23.149f)
                lineTo(13.076f, 16.053f)
                lineTo(15.563f, 18.532f)
                close()
            }
        }
        .build()
        return _compressV!!
    }

private var _compressV: ImageVector? = null
