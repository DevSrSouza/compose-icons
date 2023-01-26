package compose.icons.studioicons.twotone

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
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.ExploreOff: ImageVector
    get() {
        if (_exploreOff != null) {
            return _exploreOff!!
        }
        _exploreOff = Builder(name = "ExploreOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 20.0f)
                curveToRelative(1.48f, 0.0f, 2.86f, -0.41f, 4.06f, -1.12f)
                lineToRelative(-3.98f, -3.98f)
                lineToRelative(-5.58f, 2.6f)
                lineToRelative(2.59f, -5.58f)
                lineToRelative(-3.97f, -3.98f)
                curveTo(4.41f, 9.14f, 4.0f, 10.52f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(-1.48f, 0.0f, -2.86f, 0.41f, -4.06f, 1.12f)
                lineToRelative(3.98f, 3.98f)
                lineToRelative(5.58f, -2.6f)
                lineToRelative(-2.59f, 5.58f)
                lineToRelative(3.98f, 3.98f)
                curveToRelative(0.7f, -1.2f, 1.11f, -2.58f, 1.11f, -4.06f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.5f, 6.5f)
                lineToRelative(-5.58f, 2.59f)
                lineToRelative(2.99f, 2.99f)
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
                moveTo(5.12f, 7.94f)
                lineToRelative(3.98f, 3.98f)
                lineToRelative(-2.6f, 5.58f)
                lineToRelative(5.58f, -2.59f)
                lineToRelative(3.98f, 3.98f)
                curveToRelative(-1.2f, 0.7f, -2.58f, 1.11f, -4.06f, 1.11f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.48f, 0.41f, -2.86f, 1.12f, -4.06f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f)
                curveToRelative(0.0f, 1.48f, -0.41f, 2.86f, -1.12f, 4.06f)
                lineToRelative(1.46f, 1.46f)
                curveTo(21.39f, 15.93f, 22.0f, 14.04f, 22.0f, 12.0f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                curveToRelative(-2.04f, 0.0f, -3.93f, 0.61f, -5.51f, 1.66f)
                lineToRelative(1.46f, 1.46f)
                curveTo(9.14f, 4.41f, 10.52f, 4.0f, 12.0f, 4.0f)
                close()
            }
        }
        .build()
        return _exploreOff!!
    }

private var _exploreOff: ImageVector? = null
