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

public val TwotoneGroup.BedtimeOff: ImageVector
    get() {
        if (_bedtimeOff != null) {
            return _bedtimeOff!!
        }
        _bedtimeOff = Builder(name = "BedtimeOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.95f, 5.13f)
                lineTo(9.03f, 6.2f)
                curveToRelative(0.05f, -0.55f, 0.12f, -1.12f, 0.24f, -1.71f)
                curveTo(8.81f, 4.66f, 8.37f, 4.88f, 7.95f, 5.13f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.13f, 7.96f)
                curveTo(4.42f, 9.15f, 4.0f, 10.52f, 4.0f, 12.0f)
                curveToRelative(0.0f, 4.41f, 3.59f, 8.0f, 8.0f, 8.0f)
                curveToRelative(1.45f, 0.0f, 2.84f, -0.4f, 4.05f, -1.12f)
                lineTo(5.13f, 7.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.27f, 4.49f)
                curveTo(9.14f, 5.08f, 9.07f, 5.64f, 9.03f, 6.2f)
                lineToRelative(2.05f, 2.05f)
                curveToRelative(-0.27f, -2.05f, 0.1f, -4.22f, 1.26f, -6.23f)
                curveToRelative(-0.12f, 0.0f, -0.23f, -0.01f, -0.35f, -0.01f)
                curveToRelative(-2.05f, 0.0f, -3.93f, 0.61f, -5.5f, 1.65f)
                lineToRelative(1.46f, 1.46f)
                curveTo(8.37f, 4.88f, 8.81f, 4.66f, 9.27f, 4.49f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.27f, 2.27f)
                curveTo(2.61f, 8.07f, 2.0f, 9.97f, 2.0f, 12.0f)
                curveToRelative(0.0f, 5.52f, 4.48f, 10.0f, 10.0f, 10.0f)
                curveToRelative(2.04f, 0.0f, 3.92f, -0.63f, 5.5f, -1.67f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(12.0f, 20.0f)
                curveToRelative(-4.41f, 0.0f, -8.0f, -3.59f, -8.0f, -8.0f)
                curveToRelative(0.0f, -1.48f, 0.42f, -2.85f, 1.13f, -4.04f)
                lineToRelative(10.92f, 10.92f)
                curveTo(14.84f, 19.6f, 13.45f, 20.0f, 12.0f, 20.0f)
                close()
            }
        }
        .build()
        return _bedtimeOff!!
    }

private var _bedtimeOff: ImageVector? = null
