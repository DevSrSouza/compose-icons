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
                moveTo(9.495f, 8.111f)
                lineTo(3.131f, 14.475f)
                lineTo(4.545f, 15.889f)
                lineTo(9.495f, 10.939f)
                lineTo(14.445f, 15.889f)
                lineTo(15.859f, 14.475f)
                lineTo(9.495f, 8.111f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.505f, 8.111f)
                lineTo(12.532f, 10.084f)
                lineTo(13.95f, 11.494f)
                lineTo(14.505f, 10.939f)
                lineTo(19.455f, 15.889f)
                lineTo(20.869f, 14.475f)
                lineTo(14.505f, 8.111f)
                close()
            }
        }
        .build()
        return _codeClimate!!
    }

private var _codeClimate: ImageVector? = null
