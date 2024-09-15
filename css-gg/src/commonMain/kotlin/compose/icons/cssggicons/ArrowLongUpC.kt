package compose.icons.cssggicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.CssGgIcons

public val CssGgIcons.ArrowLongUpC: ImageVector
    get() {
        if (_arrowLongUpC != null) {
            return _arrowLongUpC!!
        }
        _arrowLongUpC = Builder(name = "ArrowLongUpC", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(7.758f, 5.231f)
                lineTo(12.032f, 1.02f)
                lineTo(16.243f, 5.295f)
                lineTo(14.818f, 6.698f)
                lineTo(13.014f, 4.867f)
                lineTo(12.943f, 17.156f)
                curveTo(14.105f, 17.573f, 14.934f, 18.688f, 14.928f, 19.994f)
                curveTo(14.92f, 21.651f, 13.571f, 22.988f, 11.914f, 22.98f)
                curveTo(10.257f, 22.972f, 8.92f, 21.622f, 8.928f, 19.965f)
                curveTo(8.935f, 18.659f, 9.775f, 17.551f, 10.943f, 17.145f)
                lineTo(11.014f, 4.83f)
                lineTo(9.161f, 6.656f)
                lineTo(7.758f, 5.231f)
                close()
                moveTo(11.933f, 18.98f)
                curveTo(11.381f, 18.977f, 10.931f, 19.423f, 10.928f, 19.975f)
                curveTo(10.926f, 20.527f, 11.371f, 20.977f, 11.924f, 20.98f)
                curveTo(12.476f, 20.982f, 12.926f, 20.537f, 12.928f, 19.985f)
                curveTo(12.931f, 19.432f, 12.485f, 18.982f, 11.933f, 18.98f)
                close()
            }
        }
        .build()
        return _arrowLongUpC!!
    }

private var _arrowLongUpC: ImageVector? = null
