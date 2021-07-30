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

public val CssGgIcons.CompressLeft: ImageVector
    get() {
        if (_compressLeft != null) {
            return _compressLeft!!
        }
        _compressLeft = Builder(name = "CompressLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.9787f, 9.457f)
                lineTo(4.4088f, 9.4542f)
                lineTo(4.4073f, 11.4542f)
                lineTo(11.4073f, 11.4597f)
                lineTo(11.4127f, 4.4597f)
                lineTo(9.4127f, 4.4581f)
                lineTo(9.4099f, 8.0598f)
                lineTo(3.0962f, 1.7694f)
                lineTo(1.6846f, 3.1862f)
                lineTo(7.9787f, 9.457f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5615f, 14.5521f)
                lineTo(19.5535f, 12.5521f)
                lineTo(12.5536f, 12.58f)
                lineTo(12.5814f, 19.5799f)
                lineTo(14.5814f, 19.572f)
                lineTo(14.5671f, 15.9706f)
                lineTo(20.9105f, 22.2307f)
                lineTo(22.3153f, 20.8071f)
                lineTo(15.9914f, 14.5663f)
                lineTo(19.5615f, 14.5521f)
                close()
            }
        }
        .build()
        return _compressLeft!!
    }

private var _compressLeft: ImageVector? = null
