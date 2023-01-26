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

public val TwotoneGroup.Unpublished: ImageVector
    get() {
        if (_unpublished != null) {
            return _unpublished!!
        }
        _unpublished = Builder(name = "Unpublished", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.59f, 10.76f)
                lineToRelative(2.65f, -2.65f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(3.88f, 3.88f)
                curveTo(19.59f, 14.86f, 20.0f, 13.48f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                curveToRelative(-1.48f, 0.0f, -2.86f, 0.41f, -4.06f, 1.12f)
                lineTo(13.59f, 10.76f)
                close()
                moveTo(17.66f, 9.53f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.66f, 9.53f)
                close()
                moveTo(16.06f, 18.88f)
                lineToRelative(-3.88f, -3.88f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(0.18f, -0.18f)
                lineTo(5.12f, 7.94f)
                curveTo(4.41f, 9.14f, 4.0f, 10.52f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                curveTo(13.48f, 20.0f, 14.86f, 19.59f, 16.06f, 18.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.94f, 5.12f)
                lineTo(6.49f, 3.66f)
                curveTo(8.07f, 2.61f, 9.96f, 2.0f, 12.0f, 2.0f)
                curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f)
                curveToRelative(0.0f, 2.04f, -0.61f, 3.93f, -1.66f, 5.51f)
                lineToRelative(-1.46f, -1.46f)
                curveTo(19.59f, 14.86f, 20.0f, 13.48f, 20.0f, 12.0f)
                curveToRelative(0.0f, -4.41f, -3.59f, -8.0f, -8.0f, -8.0f)
                curveTo(10.52f, 4.0f, 9.14f, 4.41f, 7.94f, 5.12f)
                close()
                moveTo(17.66f, 9.53f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-2.65f, 2.65f)
                lineToRelative(1.41f, 1.41f)
                lineTo(17.66f, 9.53f)
                close()
                moveTo(19.78f, 22.61f)
                lineToRelative(-2.27f, -2.27f)
                curveTo(15.93f, 21.39f, 14.04f, 22.0f, 12.0f, 22.0f)
                curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f)
                curveToRelative(0.0f, -2.04f, 0.61f, -3.93f, 1.66f, -5.51f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineTo(19.78f, 22.61f)
                close()
                moveTo(16.06f, 18.88f)
                lineToRelative(-3.88f, -3.88f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(-4.24f, -4.24f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.83f, 2.83f)
                lineToRelative(0.18f, -0.18f)
                lineTo(5.12f, 7.94f)
                curveTo(4.41f, 9.14f, 4.0f, 10.52f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                curveTo(13.48f, 20.0f, 14.86f, 19.59f, 16.06f, 18.88f)
                close()
            }
        }
        .build()
        return _unpublished!!
    }

private var _unpublished: ImageVector? = null
