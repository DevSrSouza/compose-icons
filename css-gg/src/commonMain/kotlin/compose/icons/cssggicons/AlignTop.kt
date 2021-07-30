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
                moveTo(13.0352f, 7.988f)
                lineTo(13.0374f, 13.988f)
                lineTo(17.0374f, 13.9865f)
                lineTo(17.0352f, 7.9865f)
                lineTo(13.0352f, 7.988f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(17.9996f, 4.0119f)
                lineTo(5.9996f, 4.0184f)
                lineTo(6.0004f, 6.0184f)
                lineTo(18.0004f, 6.0119f)
                lineTo(17.9996f, 4.0119f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.0374f, 19.9864f)
                lineTo(11.0321f, 7.9864f)
                lineTo(7.0321f, 7.9881f)
                lineTo(7.0374f, 19.9881f)
                lineTo(11.0374f, 19.9864f)
                close()
            }
        }
        .build()
        return _alignTop!!
    }

private var _alignTop: ImageVector? = null
