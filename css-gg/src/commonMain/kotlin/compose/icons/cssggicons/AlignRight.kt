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
                moveTo(15.9991f, 13.0039f)
                lineTo(9.9991f, 12.9911f)
                lineTo(9.9905f, 16.9911f)
                lineTo(15.9905f, 17.0039f)
                lineTo(15.9991f, 13.0039f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(19.978f, 18.0021f)
                lineTo(20.0036f, 6.0021f)
                lineTo(18.0036f, 5.9979f)
                lineTo(17.978f, 17.9979f)
                lineTo(19.978f, 18.0021f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.9964f, 10.9851f)
                lineTo(15.9964f, 11.0107f)
                lineTo(16.0049f, 7.0107f)
                lineTo(4.0049f, 6.9851f)
                lineTo(3.9964f, 10.9851f)
                close()
            }
        }
        .build()
        return _alignRight!!
    }

private var _alignRight: ImageVector? = null
