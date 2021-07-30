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

public val CssGgIcons.Gym: ImageVector
    get() {
        if (_gym != null) {
            return _gym!!
        }
        _gym = Builder(name = "Gym", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.2739f, 9.8688f)
                lineTo(16.8325f, 4.9539f)
                lineTo(18.4708f, 3.8068f)
                lineTo(21.9122f, 8.7217f)
                lineTo(20.2739f, 9.8688f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.3901f, 12.4086f)
                lineTo(16.6694f, 9.9512f)
                lineTo(8.4778f, 15.687f)
                lineTo(10.1985f, 18.1444f)
                lineTo(8.5602f, 19.2916f)
                lineTo(3.9716f, 12.7383f)
                lineTo(5.6099f, 11.5912f)
                lineTo(7.3307f, 14.0487f)
                lineTo(15.5222f, 8.3129f)
                lineTo(13.8015f, 5.8554f)
                lineTo(15.4398f, 4.7083f)
                lineTo(20.0284f, 11.2615f)
                lineTo(18.3901f, 12.4086f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.7651f, 7.0833f)
                lineTo(22.4034f, 5.9362f)
                lineTo(21.2562f, 4.2979f)
                lineTo(19.6179f, 5.445f)
                lineTo(20.7651f, 7.0833f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.1675f, 19.046f)
                lineTo(3.7261f, 14.131f)
                lineTo(2.0878f, 15.2782f)
                lineTo(5.5292f, 20.1931f)
                lineTo(7.1675f, 19.046f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.3821f, 18.5549f)
                lineTo(2.7438f, 19.702f)
                lineTo(1.5966f, 18.0637f)
                lineTo(3.2349f, 16.9166f)
                lineTo(4.3821f, 18.5549f)
                close()
            }
        }
        .build()
        return _gym!!
    }

private var _gym: ImageVector? = null
