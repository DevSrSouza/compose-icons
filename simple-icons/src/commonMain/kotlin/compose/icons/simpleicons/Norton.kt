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

public val SimpleIcons.Norton: ImageVector
    get() {
        if (_norton != null) {
            return _norton!!
        }
        _norton = Builder(name = "Norton", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.978f, 12.0f)
                curveToRelative(0.0f, 6.617f, -5.373f, 12.0f, -11.978f, 12.0f)
                curveTo(5.395f, 24.0f, 0.022f, 18.617f, 0.022f, 12.0f)
                reflectiveCurveTo(5.395f, 0.0f, 12.0f, 0.0f)
                curveToRelative(1.826f, 0.0f, 3.557f, 0.41f, 5.107f, 1.146f)
                lineToRelative(-1.99f, 2.567f)
                arcTo(8.787f, 8.787f, 0.0f, false, false, 12.0f, 3.145f)
                curveToRelative(-4.657f, 0.0f, -8.484f, 3.627f, -8.815f, 8.21f)
                arcToRelative(9.595f, 9.595f, 0.0f, false, false, -0.023f, 0.645f)
                curveToRelative(0.0f, 4.883f, 3.964f, 8.855f, 8.838f, 8.855f)
                curveToRelative(4.874f, 0.0f, 8.838f, -3.972f, 8.838f, -8.855f)
                curveToRelative(0.0f, -0.652f, -0.07f, -1.29f, -0.205f, -1.902f)
                lineToRelative(2.309f, -2.979f)
                arcTo(11.948f, 11.948f, 0.0f, false, true, 23.978f, 12.0f)
                moveToRelative(-2.442f, -7.253f)
                lineTo(19.518f, 7.35f)
                lineToRelative(-7.082f, 9.14f)
                lineToRelative(-5.778f, -5.175f)
                lineTo(8.75f, 8.97f)
                lineToRelative(3.27f, 2.928f)
                lineTo(17.38f, 4.98f)
                lineToRelative(1.924f, -2.484f)
                arcToRelative(12.08f, 12.08f, 0.0f, false, true, 2.231f, 2.25f)
            }
        }
        .build()
        return _norton!!
    }

private var _norton: ImageVector? = null
