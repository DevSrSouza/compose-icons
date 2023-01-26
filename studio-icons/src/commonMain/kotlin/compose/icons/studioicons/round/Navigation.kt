package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.Navigation: ImageVector
    get() {
        if (_navigation != null) {
            return _navigation!!
        }
        _navigation = Builder(name = "Navigation", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.93f, 4.26f)
                lineToRelative(6.15f, 14.99f)
                curveToRelative(0.34f, 0.83f, -0.51f, 1.66f, -1.33f, 1.29f)
                lineToRelative(-5.34f, -2.36f)
                curveToRelative(-0.26f, -0.11f, -0.55f, -0.11f, -0.81f, 0.0f)
                lineToRelative(-5.34f, 2.36f)
                curveToRelative(-0.82f, 0.36f, -1.67f, -0.46f, -1.33f, -1.29f)
                lineToRelative(6.15f, -14.99f)
                curveToRelative(0.33f, -0.83f, 1.51f, -0.83f, 1.85f, 0.0f)
                close()
            }
        }
        .build()
        return _navigation!!
    }

private var _navigation: ImageVector? = null
