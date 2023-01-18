package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.LeafTwo: ImageVector
    get() {
        if (_leafTwo != null) {
            return _leafTwo!!
        }
        _leafTwo = Builder(name = "LeafTwo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.707f, 2.0f)
                curveTo(2.7656f, 2.0f, 2.0024f, 2.7631f, 2.0024f, 3.7046f)
                verticalLineTo(8.0f)
                curveTo(2.0024f, 10.9738f, 4.1659f, 13.4423f, 7.0048f, 13.9174f)
                curveTo(7.0207f, 12.2669f, 7.5365f, 10.7359f, 8.408f, 9.4686f)
                lineTo(6.2197f, 7.2803f)
                curveTo(5.9268f, 6.9874f, 5.9268f, 6.5126f, 6.2197f, 6.2197f)
                curveTo(6.5125f, 5.9268f, 6.9874f, 5.9268f, 7.2803f, 6.2197f)
                lineTo(9.3738f, 8.3132f)
                curveTo(10.5261f, 7.1715f, 12.0238f, 6.3777f, 13.6963f, 6.1026f)
                curveTo(12.9023f, 3.7188f, 10.6531f, 2.0f, 8.0024f, 2.0f)
                horizontalLineTo(3.707f)
                close()
                moveTo(9.5539f, 18.3868f)
                lineTo(7.2198f, 20.7195f)
                curveTo(6.9268f, 21.0123f, 6.9267f, 21.4871f, 7.2195f, 21.7801f)
                curveTo(7.5123f, 22.0731f, 7.9872f, 22.0733f, 8.2802f, 21.7804f)
                lineTo(10.6146f, 19.4474f)
                curveTo(11.8152f, 20.4154f, 13.3421f, 20.9949f, 15.0044f, 20.9949f)
                curveTo(18.8696f, 20.9949f, 22.0031f, 17.8615f, 22.0031f, 13.9962f)
                verticalLineTo(8.7476f)
                curveTo(22.0031f, 7.7811f, 21.2196f, 6.9976f, 20.2531f, 6.9976f)
                horizontalLineTo(15.0044f)
                curveTo(11.1391f, 6.9976f, 8.0057f, 10.131f, 8.0057f, 13.9962f)
                curveTo(8.0057f, 15.6589f, 8.5855f, 17.1861f, 9.5539f, 18.3868f)
                close()
                moveTo(15.7802f, 14.285f)
                lineTo(11.6849f, 18.3803f)
                curveTo(11.2848f, 18.0769f, 10.9275f, 17.72f, 10.6237f, 17.3202f)
                lineTo(14.7195f, 13.2243f)
                curveTo(15.0124f, 12.9314f, 15.4873f, 12.9314f, 15.7802f, 13.2243f)
                curveTo(16.0731f, 13.5172f, 16.0731f, 13.9921f, 15.7802f, 14.285f)
                close()
            }
        }
        .build()
        return _leafTwo!!
    }

private var _leafTwo: ImageVector? = null
