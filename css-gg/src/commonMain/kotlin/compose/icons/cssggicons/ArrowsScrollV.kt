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
                moveTo(13.414f, 10.109f)
                lineTo(13.418f, 10.113f)
                lineTo(12.004f, 11.527f)
                lineTo(12.0f, 11.523f)
                lineTo(11.996f, 11.527f)
                lineTo(10.582f, 10.113f)
                lineTo(10.586f, 10.109f)
                lineTo(7.761f, 7.284f)
                lineTo(9.175f, 5.87f)
                lineTo(12.0f, 8.695f)
                lineTo(14.825f, 5.87f)
                lineTo(16.239f, 7.284f)
                lineTo(13.414f, 10.109f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 15.305f)
                lineTo(14.825f, 18.13f)
                lineTo(16.239f, 16.716f)
                lineTo(13.414f, 13.891f)
                lineTo(13.418f, 13.887f)
                lineTo(12.004f, 12.473f)
                lineTo(12.0f, 12.477f)
                lineTo(11.996f, 12.473f)
                lineTo(10.582f, 13.887f)
                lineTo(10.586f, 13.891f)
                lineTo(7.761f, 16.716f)
                lineTo(9.175f, 18.13f)
                lineTo(12.0f, 15.305f)
                close()
            }
        }
        .build()
        return _arrowsScrollV!!
    }

private var _arrowsScrollV: ImageVector? = null
