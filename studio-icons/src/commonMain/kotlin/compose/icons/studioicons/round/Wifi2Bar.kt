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

public val RoundGroup.Wifi2Bar: ImageVector
    get() {
        if (_wifi2Bar != null) {
            return _wifi2Bar!!
        }
        _wifi2Bar = Builder(name = "Wifi2Bar", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveTo(13.1f, 16.0f, 12.0f, 16.0f)
                close()
                moveTo(5.38f, 14.37f)
                curveToRelative(-0.63f, -0.63f, -0.59f, -1.71f, 0.13f, -2.24f)
                curveTo(7.33f, 10.79f, 9.57f, 10.0f, 12.0f, 10.0f)
                curveToRelative(2.43f, 0.0f, 4.67f, 0.79f, 6.49f, 2.13f)
                curveToRelative(0.72f, 0.53f, 0.76f, 1.6f, 0.13f, 2.24f)
                curveToRelative(-0.53f, 0.54f, -1.37f, 0.57f, -1.98f, 0.12f)
                curveTo(15.33f, 13.55f, 13.73f, 13.0f, 12.0f, 13.0f)
                curveToRelative(-1.73f, 0.0f, -3.33f, 0.55f, -4.64f, 1.49f)
                curveTo(6.75f, 14.93f, 5.91f, 14.9f, 5.38f, 14.37f)
                close()
            }
        }
        .build()
        return _wifi2Bar!!
    }

private var _wifi2Bar: ImageVector? = null
