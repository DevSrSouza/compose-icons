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
                moveTo(15.305f, 12.0f)
                lineTo(18.13f, 9.175f)
                lineTo(16.716f, 7.761f)
                lineTo(13.891f, 10.586f)
                lineTo(13.887f, 10.582f)
                lineTo(12.473f, 11.996f)
                lineTo(12.477f, 12.0f)
                lineTo(12.473f, 12.004f)
                lineTo(13.887f, 13.418f)
                lineTo(13.891f, 13.414f)
                lineTo(16.716f, 16.239f)
                lineTo(18.13f, 14.825f)
                lineTo(15.305f, 12.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.109f, 10.586f)
                lineTo(10.113f, 10.582f)
                lineTo(11.527f, 11.996f)
                lineTo(11.523f, 12.0f)
                lineTo(11.527f, 12.004f)
                lineTo(10.113f, 13.418f)
                lineTo(10.109f, 13.414f)
                lineTo(7.284f, 16.239f)
                lineTo(5.87f, 14.825f)
                lineTo(8.695f, 12.0f)
                lineTo(5.87f, 9.175f)
                lineTo(7.284f, 7.761f)
                lineTo(10.109f, 10.586f)
                close()
            }
        }
        .build()
        return _arrowsScrollH!!
    }

private var _arrowsScrollH: ImageVector? = null
