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

public val TwotoneGroup.WbCloudy: ImageVector
    get() {
        if (_wbCloudy != null) {
            return _wbCloudy!!
        }
        _wbCloudy = Builder(name = "WbCloudy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.23f, 12.04f)
                lineToRelative(-1.52f, -0.11f)
                lineToRelative(-0.3f, -1.5f)
                curveTo(16.89f, 7.86f, 14.62f, 6.0f, 12.01f, 6.0f)
                curveTo(9.95f, 6.0f, 8.08f, 7.14f, 7.13f, 8.96f)
                lineToRelative(-0.5f, 0.95f)
                lineToRelative(-1.07f, 0.11f)
                curveToRelative(-2.02f, 0.22f, -3.55f, 1.93f, -3.55f, 3.98f)
                curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(1.65f, 0.0f, 3.0f, -1.35f, 3.0f, -3.0f)
                curveToRelative(0.0f, -1.55f, -1.23f, -2.86f, -2.78f, -2.96f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.36f, 10.04f)
                curveTo(18.67f, 6.59f, 15.65f, 4.0f, 12.01f, 4.0f)
                curveTo(9.11f, 4.0f, 6.6f, 5.64f, 5.35f, 8.04f)
                curveTo(2.35f, 8.36f, 0.01f, 10.91f, 0.01f, 14.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                horizontalLineToRelative(13.0f)
                curveToRelative(2.76f, 0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                curveToRelative(0.0f, -2.64f, -2.05f, -4.78f, -4.65f, -4.96f)
                close()
                moveTo(19.01f, 18.0f)
                horizontalLineToRelative(-13.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -2.05f, 1.53f, -3.76f, 3.56f, -3.97f)
                lineToRelative(1.07f, -0.11f)
                lineToRelative(0.5f, -0.95f)
                curveTo(8.08f, 7.14f, 9.95f, 6.0f, 12.01f, 6.0f)
                curveToRelative(2.61f, 0.0f, 4.89f, 1.86f, 5.4f, 4.43f)
                lineToRelative(0.3f, 1.5f)
                lineToRelative(1.52f, 0.11f)
                curveToRelative(1.56f, 0.11f, 2.78f, 1.41f, 2.78f, 2.96f)
                curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f)
                close()
            }
        }
        .build()
        return _wbCloudy!!
    }

private var _wbCloudy: ImageVector? = null
