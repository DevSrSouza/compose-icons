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

public val TwotoneGroup.WatchOff: ImageVector
    get() {
        if (_watchOff != null) {
            return _watchOff!!
        }
        _watchOff = Builder(name = "WatchOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.89f, 5.27f)
                lineTo(13.51f, 4.0f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(-0.38f, 1.27f)
                curveTo(11.93f, 4.76f, 13.34f, 5.11f, 13.89f, 5.27f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.11f, 18.73f)
                lineTo(10.49f, 20.0f)
                horizontalLineToRelative(3.02f)
                lineToRelative(0.38f, -1.27f)
                curveTo(12.07f, 19.24f, 10.66f, 18.89f, 10.11f, 18.73f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, 2.24f, 5.0f, 5.0f)
                curveToRelative(0.0f, 0.64f, -0.13f, 1.25f, -0.35f, 1.82f)
                lineToRelative(1.5f, 1.5f)
                curveTo(18.69f, 14.33f, 19.0f, 13.2f, 19.0f, 12.0f)
                curveToRelative(0.0f, -2.22f, -1.03f, -4.19f, -2.64f, -5.47f)
                lineTo(15.0f, 2.0f)
                horizontalLineTo(9.0f)
                lineTo(8.04f, 5.21f)
                lineToRelative(2.14f, 2.14f)
                curveTo(10.75f, 7.13f, 11.36f, 7.0f, 12.0f, 7.0f)
                close()
                moveTo(10.49f, 4.0f)
                horizontalLineToRelative(3.02f)
                lineToRelative(0.38f, 1.27f)
                curveToRelative(-0.55f, -0.16f, -1.97f, -0.51f, -3.78f, 0.0f)
                lineTo(10.49f, 4.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(4.46f, 4.46f)
                curveTo(5.31f, 9.67f, 5.0f, 10.8f, 5.0f, 12.0f)
                curveToRelative(0.0f, 2.22f, 1.03f, 4.19f, 2.64f, 5.47f)
                lineTo(9.0f, 22.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(0.96f, -3.21f)
                lineToRelative(3.82f, 3.82f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(13.51f, 20.0f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(-0.38f, -1.27f)
                curveToRelative(0.55f, 0.15f, 1.97f, 0.51f, 3.78f, 0.0f)
                lineTo(13.51f, 20.0f)
                close()
                moveTo(12.0f, 17.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f)
                curveToRelative(0.0f, -0.64f, 0.13f, -1.25f, 0.35f, -1.82f)
                lineToRelative(6.47f, 6.47f)
                curveTo(13.25f, 16.87f, 12.64f, 17.0f, 12.0f, 17.0f)
                close()
            }
        }
        .build()
        return _watchOff!!
    }

private var _watchOff: ImageVector? = null
