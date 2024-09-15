package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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

public val CssGgIcons.Stopwatch: ImageVector
    get() {
        if (_stopwatch != null) {
            return _stopwatch!!
        }
        _stopwatch = Builder(name = "Stopwatch", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.621f, 2.55f)
                lineTo(21.45f, 5.379f)
                lineTo(20.036f, 6.793f)
                lineTo(17.207f, 3.965f)
                lineTo(18.621f, 2.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.823f, 8.601f)
                horizontalLineTo(10.823f)
                verticalLineTo(12.601f)
                horizontalLineTo(12.823f)
                verticalLineTo(8.601f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(5.186f, 18.814f)
                curveTo(8.701f, 22.329f, 14.399f, 22.329f, 17.914f, 18.814f)
                curveTo(21.429f, 15.299f, 21.429f, 9.601f, 17.914f, 6.086f)
                curveTo(14.399f, 2.571f, 8.701f, 2.571f, 5.186f, 6.086f)
                curveTo(1.672f, 9.601f, 1.672f, 15.299f, 5.186f, 18.814f)
                close()
                moveTo(6.601f, 17.399f)
                curveTo(9.334f, 20.133f, 13.766f, 20.133f, 16.5f, 17.399f)
                curveTo(19.234f, 14.666f, 19.234f, 10.234f, 16.5f, 7.5f)
                curveTo(13.766f, 4.766f, 9.334f, 4.766f, 6.601f, 7.5f)
                curveTo(3.867f, 10.234f, 3.867f, 14.666f, 6.601f, 17.399f)
                close()
            }
        }
        .build()
        return _stopwatch!!
    }

private var _stopwatch: ImageVector? = null
