package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.SearchFound: ImageVector
    get() {
        if (_searchFound != null) {
            return _searchFound!!
        }
        _searchFound = Builder(name = "SearchFound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.665f, 10.237f)
                lineTo(9.198f, 8.951f)
                lineTo(10.483f, 10.483f)
                lineTo(13.547f, 7.912f)
                lineTo(14.833f, 9.444f)
                lineTo(10.237f, 13.301f)
                lineTo(7.665f, 10.237f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.207f, 4.893f)
                curveTo(19.092f, 7.779f, 19.313f, 12.319f, 16.869f, 15.458f)
                curveTo(16.885f, 15.471f, 16.9f, 15.485f, 16.914f, 15.5f)
                lineTo(21.157f, 19.743f)
                curveTo(21.547f, 20.133f, 21.547f, 20.766f, 21.157f, 21.157f)
                curveTo(20.766f, 21.547f, 20.133f, 21.547f, 19.743f, 21.157f)
                lineTo(15.5f, 16.914f)
                curveTo(15.485f, 16.9f, 15.471f, 16.885f, 15.458f, 16.869f)
                curveTo(12.319f, 19.313f, 7.779f, 19.092f, 4.893f, 16.207f)
                curveTo(1.769f, 13.083f, 1.769f, 8.018f, 4.893f, 4.893f)
                curveTo(8.018f, 1.769f, 13.083f, 1.769f, 16.207f, 4.893f)
                close()
                moveTo(14.793f, 14.793f)
                curveTo(17.136f, 12.45f, 17.136f, 8.651f, 14.793f, 6.308f)
                curveTo(12.45f, 3.965f, 8.651f, 3.965f, 6.308f, 6.308f)
                curveTo(3.965f, 8.651f, 3.965f, 12.45f, 6.308f, 14.793f)
                curveTo(8.651f, 17.136f, 12.45f, 17.136f, 14.793f, 14.793f)
                close()
            }
        }
        .build()
        return _searchFound!!
    }

private var _searchFound: ImageVector? = null
