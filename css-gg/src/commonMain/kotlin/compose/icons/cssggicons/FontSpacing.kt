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

public val CssGgIcons.FontSpacing: ImageVector
    get() {
        if (_fontSpacing != null) {
            return _fontSpacing!!
        }
        _fontSpacing = Builder(name = "FontSpacing", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(19.0f)
                lineTo(19.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(5.0f)
                lineTo(5.0f, 21.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(9.4642f, 16.0479f)
                lineTo(9.9528f, 14.9999f)
                horizontalLineTo(14.0473f)
                lineTo(14.5359f, 16.0478f)
                curveTo(14.7693f, 16.5484f, 15.3643f, 16.7649f, 15.8649f, 16.5315f)
                curveTo(16.3654f, 16.2981f, 16.582f, 15.7031f, 16.3485f, 15.2026f)
                lineTo(12.9676f, 7.9521f)
                curveTo(12.7888f, 7.5688f, 12.398f, 7.352f, 11.9999f, 7.3764f)
                curveTo(11.6019f, 7.3521f, 11.2112f, 7.5689f, 11.0325f, 7.9522f)
                lineTo(7.6515f, 15.2026f)
                curveTo(7.4181f, 15.7032f, 7.6347f, 16.2981f, 8.1352f, 16.5315f)
                curveTo(8.6358f, 16.7649f, 9.2308f, 16.5484f, 9.4642f, 16.0479f)
                close()
                moveTo(12.0001f, 10.6096f)
                lineTo(10.8854f, 12.9999f)
                horizontalLineTo(13.1147f)
                lineTo(12.0001f, 10.6096f)
                close()
            }
        }
        .build()
        return _fontSpacing!!
    }

private var _fontSpacing: ImageVector? = null
