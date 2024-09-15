package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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

public val CssGgIcons.AlignTop: ImageVector
    get() {
        if (_alignTop != null) {
            return _alignTop!!
        }
        _alignTop = Builder(name = "AlignTop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(13.035f, 7.988f)
                lineTo(13.037f, 13.988f)
                lineTo(17.037f, 13.986f)
                lineTo(17.035f, 7.987f)
                lineTo(13.035f, 7.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(18.0f, 4.012f)
                lineTo(6.0f, 4.018f)
                lineTo(6.0f, 6.018f)
                lineTo(18.0f, 6.012f)
                lineTo(18.0f, 4.012f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.037f, 19.986f)
                lineTo(11.032f, 7.986f)
                lineTo(7.032f, 7.988f)
                lineTo(7.037f, 19.988f)
                lineTo(11.037f, 19.986f)
                close()
            }
        }
        .build()
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
