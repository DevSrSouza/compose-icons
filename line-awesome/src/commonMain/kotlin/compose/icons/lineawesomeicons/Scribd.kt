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

public val LineAwesomeIcons.Scribd: ImageVector
    get() {
        if (_scribd != null) {
            return _scribd!!
        }
        _scribd = Builder(name = "Scribd", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.299f, 4.002f)
                curveTo(11.735f, 4.002f, 8.0f, 6.62f, 8.0f, 11.605f)
                curveTo(8.01f, 13.286f, 8.43f, 14.626f, 9.232f, 15.564f)
                curveTo(10.698f, 17.343f, 13.483f, 17.45f, 14.93f, 15.984f)
                curveTo(16.113f, 14.781f, 16.279f, 12.632f, 14.969f, 11.42f)
                curveTo(14.275f, 10.755f, 13.356f, 10.463f, 12.193f, 10.727f)
                curveTo(11.333f, 10.981f, 10.775f, 10.882f, 10.775f, 9.953f)
                curveTo(10.775f, 7.519f, 13.806f, 6.133f, 16.318f, 6.172f)
                curveTo(18.488f, 6.143f, 20.61f, 6.757f, 22.428f, 7.949f)
                lineTo(21.088f, 9.865f)
                lineTo(22.945f, 11.088f)
                lineTo(25.447f, 7.512f)
                curveTo(24.079f, 6.437f, 21.196f, 3.924f, 16.299f, 4.002f)
                close()
                moveTo(21.666f, 15.006f)
                curveTo(19.783f, 14.909f, 18.145f, 16.391f, 18.174f, 18.332f)
                curveTo(18.145f, 19.171f, 18.475f, 19.971f, 19.09f, 20.527f)
                curveTo(19.782f, 21.219f, 20.72f, 21.501f, 21.881f, 21.238f)
                curveTo(22.74f, 20.984f, 23.295f, 21.093f, 23.295f, 22.02f)
                curveTo(23.295f, 22.224f, 23.266f, 22.438f, 23.227f, 22.643f)
                curveTo(22.397f, 24.672f, 20.28f, 25.832f, 17.207f, 25.832f)
                curveTo(14.641f, 25.842f, 12.133f, 25.024f, 10.074f, 23.492f)
                lineTo(11.742f, 21.541f)
                lineTo(9.977f, 20.186f)
                lineTo(6.963f, 23.736f)
                lineTo(7.732f, 24.42f)
                curveTo(10.327f, 26.742f, 13.695f, 28.019f, 17.178f, 28.0f)
                curveTo(19.724f, 28.0f, 21.851f, 27.483f, 23.793f, 25.814f)
                curveTo(26.622f, 23.268f, 26.476f, 18.419f, 24.799f, 16.42f)
                curveTo(24.038f, 15.493f, 22.876f, 14.967f, 21.666f, 15.006f)
                close()
            }
        }
        .build()
        return _scribd!!
    }

private var _scribd: ImageVector? = null
