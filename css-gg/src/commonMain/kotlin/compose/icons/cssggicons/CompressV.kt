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
                moveTo(13.0338f, 7.3559f)
                lineTo(15.4999f, 4.8538f)
                lineTo(16.9244f, 6.2577f)
                lineTo(12.0107f, 11.2432f)
                lineTo(7.0251f, 6.3295f)
                lineTo(8.4291f, 4.905f)
                lineTo(11.0329f, 7.4714f)
                lineTo(11.0834f, 0.8435f)
                lineTo(13.0833f, 0.8587f)
                lineTo(13.0338f, 7.3559f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.5627f, 18.532f)
                lineTo(16.9749f, 17.1159f)
                lineTo(12.0184f, 12.1729f)
                lineTo(7.0754f, 17.1295f)
                lineTo(8.4916f, 18.5418f)
                lineTo(11.0762f, 15.95f)
                lineTo(11.1019f, 23.1566f)
                lineTo(13.1019f, 23.1495f)
                lineTo(13.0765f, 16.0528f)
                lineTo(15.5627f, 18.532f)
                close()
            }
        }
        .build()
        return _compressV!!
    }

private var _compressV: ImageVector? = null
