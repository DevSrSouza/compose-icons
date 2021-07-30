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

public val CssGgIcons.ArrowsScrollV: ImageVector
    get() {
        if (_arrowsScrollV != null) {
            return _arrowsScrollV!!
        }
        _arrowsScrollV = Builder(name = "ArrowsScrollV", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4142f, 10.1091f)
                lineTo(13.4179f, 10.1128f)
                lineTo(12.0037f, 11.527f)
                lineTo(12.0f, 11.5233f)
                lineTo(11.9963f, 11.527f)
                lineTo(10.5821f, 10.1128f)
                lineTo(10.5858f, 10.1091f)
                lineTo(7.7611f, 7.2843f)
                lineTo(9.1753f, 5.8701f)
                lineTo(12.0f, 8.6949f)
                lineTo(14.8247f, 5.8701f)
                lineTo(16.239f, 7.2843f)
                lineTo(13.4142f, 10.1091f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.3052f)
                lineTo(14.8247f, 18.1299f)
                lineTo(16.239f, 16.7157f)
                lineTo(13.4142f, 13.891f)
                lineTo(13.4179f, 13.8873f)
                lineTo(12.0037f, 12.4731f)
                lineTo(12.0f, 12.4767f)
                lineTo(11.9963f, 12.4731f)
                lineTo(10.5821f, 13.8873f)
                lineTo(10.5858f, 13.891f)
                lineTo(7.7611f, 16.7157f)
                lineTo(9.1753f, 18.1299f)
                lineTo(12.0f, 15.3052f)
                close()
            }
        }
        .build()
        return _arrowsScrollV!!
    }

private var _arrowsScrollV: ImageVector? = null
