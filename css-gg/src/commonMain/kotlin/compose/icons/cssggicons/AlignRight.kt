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

public val CssGgIcons.AlignRight: ImageVector
    get() {
        if (_alignRight != null) {
            return _alignRight!!
        }
        _alignRight = Builder(name = "AlignRight", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                    strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = EvenOdd) {
                moveTo(15.999f, 13.004f)
                lineTo(9.999f, 12.991f)
                lineTo(9.991f, 16.991f)
                lineTo(15.991f, 17.004f)
                lineTo(15.999f, 13.004f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.978f, 18.002f)
                lineTo(20.004f, 6.002f)
                lineTo(18.004f, 5.998f)
                lineTo(17.978f, 17.998f)
                lineTo(19.978f, 18.002f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.996f, 10.985f)
                lineTo(15.996f, 11.011f)
                lineTo(16.005f, 7.011f)
                lineTo(4.005f, 6.985f)
                lineTo(3.996f, 10.985f)
                close()
            }
        }
        .build()
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
