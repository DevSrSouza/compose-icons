package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Uptimekuma: ImageVector
    get() {
        if (_uptimekuma != null) {
            return _uptimekuma!!
        }
        _uptimekuma = Builder(name = "Uptimekuma", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.759f, 0.955f)
                curveToRelative(-4.071f, 0.0f, -7.93f, 2.265f, -10.06f, 5.774f)
                lineToRelative(-0.16f, 0.263f)
                lineToRelative(-0.116f, 0.284f)
                curveToRelative(-1.81f, 4.44f, -2.188f, 9.118f, 0.621f, 12.459f)
                curveToRelative(2.67f, 3.174f, 6.221f, 3.328f, 9.477f, 3.308f)
                curveToRelative(3.256f, -0.02f, 6.323f, -0.482f, 8.995f, -2.032f)
                curveTo(22.75f, 19.714f, 24.0f, 16.917f, 24.0f, 14.53f)
                curveToRelative(0.0f, -2.388f, -0.724f, -4.698f, -1.882f, -7.343f)
                lineToRelative(-0.112f, -0.257f)
                lineToRelative(-0.148f, -0.238f)
                curveTo(19.683f, 3.2f, 15.83f, 0.955f, 11.758f, 0.955f)
                close()
                moveTo(11.759f, 4.823f)
                curveToRelative(2.919f, 0.0f, 5.19f, 1.305f, 6.816f, 3.914f)
                curveToRelative(2.076f, 4.747f, 2.076f, 7.724f, 0.0f, 8.929f)
                curveToRelative(-3.116f, 1.808f, -11.234f, 2.359f, -13.57f, -0.42f)
                curveToRelative(-1.558f, -1.853f, -1.558f, -4.69f, 0.0f, -8.51f)
                curveToRelative(1.584f, -2.608f, 3.835f, -3.913f, 6.754f, -3.913f)
                close()
            }
        }
        .build()
        return _uptimekuma!!
    }

private var _uptimekuma: ImageVector? = null
