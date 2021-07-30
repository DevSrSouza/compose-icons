package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.GgCircle: ImageVector
    get() {
        if (_ggCircle != null) {
            return _ggCircle!!
        }
        _ggCircle = Builder(name = "GgCircle", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(18.5449f, 9.4863f)
                lineTo(14.6914f, 13.3398f)
                lineTo(18.6563f, 17.3066f)
                lineTo(19.9102f, 16.0527f)
                lineTo(17.1816f, 13.3359f)
                lineTo(18.543f, 11.9746f)
                lineTo(22.5098f, 15.9414f)
                lineTo(18.543f, 19.9063f)
                lineTo(17.9727f, 19.3379f)
                lineTo(16.7344f, 20.5898f)
                lineTo(18.543f, 22.3984f)
                lineTo(25.0f, 15.9453f)
                lineTo(18.5449f, 9.4863f)
                close()
                moveTo(13.457f, 9.5977f)
                lineTo(7.0f, 16.0547f)
                lineTo(13.457f, 22.5117f)
                lineTo(17.3086f, 18.6504f)
                lineTo(13.3438f, 14.6836f)
                lineTo(12.0898f, 15.9375f)
                lineTo(14.8184f, 18.6543f)
                lineTo(13.4512f, 20.0195f)
                lineTo(9.4863f, 16.0547f)
                lineTo(13.4512f, 12.0879f)
                lineTo(14.0215f, 12.6582f)
                lineTo(15.2656f, 11.4141f)
                lineTo(13.457f, 9.5977f)
                close()
            }
        }
        .build()
        return _ggCircle!!
    }

private var _ggCircle: ImageVector? = null
