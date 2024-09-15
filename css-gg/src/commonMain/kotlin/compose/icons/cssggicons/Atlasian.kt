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

public val CssGgIcons.Atlasian: ImageVector
    get() {
        if (_atlasian != null) {
            return _atlasian!!
        }
        _atlasian = Builder(name = "Atlasian", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.8f, strokeAlpha
                    = 0.8f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.507f, 11.556f)
                curveTo(8.19f, 11.104f, 7.782f, 11.158f, 7.596f, 11.678f)
                lineTo(5.0f, 18.907f)
                horizontalLineTo(10.178f)
                curveTo(10.698f, 16.85f, 10.248f, 14.043f, 9.081f, 12.375f)
                lineTo(8.507f, 11.556f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.875f, 7.126f)
                curveTo(11.607f, 8.936f, 11.199f, 12.083f, 11.963f, 14.156f)
                lineTo(13.713f, 18.907f)
                horizontalLineTo(18.964f)
                lineTo(14.367f, 6.426f)
                curveTo(14.176f, 5.908f, 13.765f, 5.855f, 13.448f, 6.307f)
                lineTo(12.875f, 7.126f)
                close()
            }
        }
        .build()
        return _atlasian!!
    }

private var _atlasian: ImageVector? = null
