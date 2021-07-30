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

public val CssGgIcons.ArrowsScrollH: ImageVector
    get() {
        if (_arrowsScrollH != null) {
            return _arrowsScrollH!!
        }
        _arrowsScrollH = Builder(name = "ArrowsScrollH", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.3052f, 12.0f)
                lineTo(18.1299f, 9.1753f)
                lineTo(16.7157f, 7.7611f)
                lineTo(13.891f, 10.5858f)
                lineTo(13.8873f, 10.5821f)
                lineTo(12.4731f, 11.9963f)
                lineTo(12.4768f, 12.0f)
                lineTo(12.4731f, 12.0037f)
                lineTo(13.8873f, 13.4179f)
                lineTo(13.891f, 13.4142f)
                lineTo(16.7157f, 16.239f)
                lineTo(18.1299f, 14.8248f)
                lineTo(15.3052f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.1091f, 10.5858f)
                lineTo(10.1128f, 10.5821f)
                lineTo(11.527f, 11.9963f)
                lineTo(11.5233f, 12.0f)
                lineTo(11.527f, 12.0037f)
                lineTo(10.1128f, 13.4179f)
                lineTo(10.1091f, 13.4142f)
                lineTo(7.2843f, 16.239f)
                lineTo(5.8701f, 14.8248f)
                lineTo(8.6949f, 12.0f)
                lineTo(5.8701f, 9.1753f)
                lineTo(7.2843f, 7.7611f)
                lineTo(10.1091f, 10.5858f)
                close()
            }
        }
        .build()
        return _arrowsScrollH!!
    }

private var _arrowsScrollH: ImageVector? = null
