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

public val CssGgIcons.CodeClimate: ImageVector
    get() {
        if (_codeClimate != null) {
            return _codeClimate!!
        }
        _codeClimate = Builder(name = "CodeClimate", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.4951f, 8.1109f)
                lineTo(3.1311f, 14.4749f)
                lineTo(4.5453f, 15.8891f)
                lineTo(9.4951f, 10.9393f)
                lineTo(14.4448f, 15.8891f)
                lineTo(15.859f, 14.4749f)
                lineTo(9.4951f, 8.1109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5049f, 8.1109f)
                lineTo(12.5317f, 10.0842f)
                lineTo(13.9503f, 11.494f)
                lineTo(14.5049f, 10.9393f)
                lineTo(19.4547f, 15.8891f)
                lineTo(20.8689f, 14.4749f)
                lineTo(14.5049f, 8.1109f)
                close()
            }
        }
        .build()
        return _codeClimate!!
    }

private var _codeClimate: ImageVector? = null
