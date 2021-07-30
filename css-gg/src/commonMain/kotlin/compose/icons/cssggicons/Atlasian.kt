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
                moveTo(8.507f, 11.5562f)
                curveTo(8.1903f, 11.1038f, 7.7822f, 11.1585f, 7.5956f, 11.6783f)
                lineTo(5.0f, 18.9075f)
                horizontalLineTo(10.1778f)
                curveTo(10.6982f, 16.85f, 10.2481f, 14.0427f, 9.0806f, 12.3754f)
                lineTo(8.507f, 11.5562f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.8745f, 7.1264f)
                curveTo(11.6074f, 8.936f, 11.1992f, 12.0835f, 11.9627f, 14.1565f)
                lineTo(13.7126f, 18.9074f)
                horizontalLineTo(18.9644f)
                lineTo(14.3673f, 6.4265f)
                curveTo(14.1764f, 5.9082f, 13.7649f, 5.8548f, 13.4481f, 6.3073f)
                lineTo(12.8745f, 7.1264f)
                close()
            }
        }
        .build()
        return _atlasian!!
    }

private var _atlasian: ImageVector? = null
