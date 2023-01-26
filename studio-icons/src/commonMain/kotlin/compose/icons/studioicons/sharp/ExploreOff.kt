package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ExploreOff: ImageVector
    get() {
        if (_exploreOff != null) {
            return _exploreOff!!
        }
        _exploreOff = Builder(name = "ExploreOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 6.0f)
                lineToRelative(-2.91f, 6.26f)
                lineToRelative(5.25f, 5.25f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-2.04f, 0.0f, -3.93f, 0.61f, -5.51f, 1.66f)
                lineToRelative(5.25f, 5.25f)
                lineTo(18.0f, 6.0f)
                close()
                moveTo(2.1f, 4.93f)
                lineToRelative(1.56f, 1.56f)
                curveTo(2.61f, 8.07f, 2.0f, 9.96f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.04f, 0.0f, 3.93f, -0.61f, 5.51f, -1.66f)
                lineToRelative(1.56f, 1.56f)
                lineToRelative(1.41f, -1.41f)
                lineTo(3.51f, 3.51f)
                lineTo(2.1f, 4.93f)
                close()
                moveTo(8.91f, 11.74f)
                lineToRelative(3.35f, 3.35f)
                lineTo(6.0f, 18.0f)
                lineToRelative(2.91f, -6.26f)
                close()
            }
        }
        .build()
        return _exploreOff!!
    }

private var _exploreOff: ImageVector? = null
