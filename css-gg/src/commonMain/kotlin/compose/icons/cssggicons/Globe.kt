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

public val CssGgIcons.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(6.8533f, 8.0f)
                curveTo(6.8533f, 5.2386f, 9.0919f, 3.0f, 11.8533f, 3.0f)
                curveTo(14.6147f, 3.0f, 16.8533f, 5.2386f, 16.8533f, 8.0f)
                curveTo(16.8533f, 10.7614f, 14.6147f, 13.0f, 11.8533f, 13.0f)
                curveTo(9.0919f, 13.0f, 6.8533f, 10.7614f, 6.8533f, 8.0f)
                close()
                moveTo(11.8533f, 11.0f)
                curveTo(10.1964f, 11.0f, 8.8533f, 9.6568f, 8.8533f, 8.0f)
                curveTo(8.8533f, 6.3432f, 10.1964f, 5.0f, 11.8533f, 5.0f)
                curveTo(13.5101f, 5.0f, 14.8533f, 6.3432f, 14.8533f, 8.0f)
                curveTo(14.8533f, 9.6568f, 13.5101f, 11.0f, 11.8533f, 11.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 12.1294f)
                curveTo(6.2522f, 14.2031f, 8.4189f, 15.6624f, 10.9414f, 15.9486f)
                verticalLineTo(18.0f)
                horizontalLineTo(8.8533f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.8533f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.9414f)
                verticalLineTo(15.9266f)
                curveTo(16.8449f, 15.3958f, 19.8532f, 12.0492f, 19.8532f, 8.0f)
                curveTo(19.8532f, 6.4364f, 19.4046f, 4.9775f, 18.6291f, 3.7451f)
                lineTo(16.9253f, 4.7933f)
                curveTo(17.513f, 5.7208f, 17.8532f, 6.8207f, 17.8532f, 8.0f)
                curveTo(17.8532f, 11.3137f, 15.167f, 14.0f, 11.8532f, 14.0f)
                curveTo(9.6661f, 14.0f, 7.7523f, 12.8298f, 6.7038f, 11.0813f)
                lineTo(5.0f, 12.1294f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
