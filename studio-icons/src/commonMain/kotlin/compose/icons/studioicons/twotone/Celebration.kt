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

public val TwotoneGroup.Celebration: ImageVector
    get() {
        if (_celebration != null) {
            return _celebration!!
        }
        _celebration = Builder(name = "Celebration", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.35f, 16.18f)
                lineToRelative(-4.53f, -4.53f)
                lineToRelative(-2.52f, 7.05f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 22.0f)
                lineToRelative(14.0f, -5.0f)
                lineTo(7.0f, 8.0f)
                lineTo(2.0f, 22.0f)
                close()
                moveTo(12.35f, 16.18f)
                lineTo(5.3f, 18.7f)
                lineToRelative(2.52f, -7.05f)
                lineTo(12.35f, 16.18f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.53f, 12.53f)
                lineToRelative(5.59f, -5.59f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f)
                lineToRelative(0.59f, 0.59f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-0.59f, -0.59f)
                curveToRelative(-1.07f, -1.07f, -2.82f, -1.07f, -3.89f, 0.0f)
                lineToRelative(-5.59f, 5.59f)
                lineTo(14.53f, 12.53f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.47f, 7.47f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(0.59f, -0.59f)
                curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0.0f, -3.89f)
                lineToRelative(-0.59f, -0.59f)
                lineTo(9.47f, 4.53f)
                lineToRelative(0.59f, 0.59f)
                curveToRelative(0.48f, 0.48f, 0.48f, 1.28f, 0.0f, 1.76f)
                lineTo(9.47f, 7.47f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.06f, 11.88f)
                lineToRelative(-1.59f, 1.59f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(1.59f, -1.59f)
                curveToRelative(0.49f, -0.49f, 1.28f, -0.49f, 1.77f, 0.0f)
                lineToRelative(1.61f, 1.61f)
                lineToRelative(1.06f, -1.06f)
                lineToRelative(-1.61f, -1.61f)
                curveTo(19.87f, 10.81f, 18.13f, 10.81f, 17.06f, 11.88f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.06f, 5.88f)
                lineToRelative(-3.59f, 3.59f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(3.59f, -3.59f)
                curveToRelative(1.07f, -1.07f, 1.07f, -2.82f, 0.0f, -3.89f)
                lineToRelative(-1.59f, -1.59f)
                lineToRelative(-1.06f, 1.06f)
                lineToRelative(1.59f, 1.59f)
                curveTo(15.54f, 4.6f, 15.54f, 5.4f, 15.06f, 5.88f)
                close()
            }
        }
        .build()
        return _celebration!!
    }

private var _celebration: ImageVector? = null
