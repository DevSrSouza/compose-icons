package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.Pexels: ImageVector
    get() {
        if (_pexels != null) {
            return _pexels!!
        }
        _pexels = Builder(name = "Pexels", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.0f, 5.0f)
                curveTo(12.711f, 5.0f, 13.387f, 5.148f, 14.0f, 5.416f)
                curveTo(15.766f, 6.188f, 17.0f, 7.95f, 17.0f, 10.0f)
                curveTo(17.0f, 12.05f, 15.766f, 13.812f, 14.0f, 14.584f)
                curveTo(13.387f, 14.852f, 12.711f, 15.0f, 12.0f, 15.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                close()
                moveTo(8.0f, 7.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                lineTo(12.003f, 12.999f)
                curveTo(13.643f, 13.03f, 15.075f, 11.693f, 15.044f, 9.955f)
                lineTo(15.038f, 9.565f)
                curveTo(15.012f, 8.102f, 13.788f, 6.945f, 12.326f, 7.003f)
                lineTo(12.02f, 7.008f)
                lineTo(12.0f, 7.0f)
                horizontalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _pexels!!
    }

private var _pexels: ImageVector? = null
