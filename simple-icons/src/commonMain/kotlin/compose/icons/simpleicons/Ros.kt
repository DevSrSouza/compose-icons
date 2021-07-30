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

public val SimpleIcons.Ros: ImageVector
    get() {
        if (_ros != null) {
            return _ros!!
        }
        _ros = Builder(name = "Ros", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.807f, 0.0f)
                curveTo(1.353f, 0.0f, 0.173f, 1.22f, 0.173f, 2.722f)
                curveToRelative(0.0f, 1.504f, 1.18f, 2.723f, 2.634f, 2.723f)
                curveToRelative(1.455f, 0.0f, 2.635f, -1.22f, 2.635f, -2.723f)
                reflectiveCurveTo(4.262f, 0.0f, 2.807f, 0.0f)
                close()
                moveTo(12.0f, 0.0f)
                curveToRelative(-1.455f, 0.0f, -2.634f, 1.22f, -2.634f, 2.722f)
                curveToRelative(0.0f, 1.504f, 1.18f, 2.723f, 2.634f, 2.723f)
                curveToRelative(1.455f, 0.0f, 2.634f, -1.22f, 2.634f, -2.723f)
                reflectiveCurveTo(13.454f, 0.0f, 12.0f, 0.0f)
                close()
                moveTo(21.193f, 0.0f)
                curveToRelative(-1.455f, 0.0f, -2.635f, 1.22f, -2.635f, 2.722f)
                curveToRelative(0.0f, 1.504f, 1.18f, 2.723f, 2.635f, 2.723f)
                curveToRelative(1.455f, 0.0f, 2.634f, -1.22f, 2.634f, -2.723f)
                reflectiveCurveTo(22.647f, 0.0f, 21.193f, 0.0f)
                close()
                moveTo(2.807f, 9.277f)
                curveTo(1.353f, 9.277f, 0.173f, 10.497f, 0.173f, 12.0f)
                reflectiveCurveToRelative(1.18f, 2.722f, 2.634f, 2.722f)
                curveToRelative(1.455f, 0.0f, 2.635f, -1.219f, 2.635f, -2.722f)
                curveToRelative(0.0f, -1.504f, -1.18f, -2.723f, -2.635f, -2.723f)
                close()
                moveTo(12.0f, 9.277f)
                curveToRelative(-1.455f, 0.0f, -2.634f, 1.22f, -2.634f, 2.723f)
                reflectiveCurveToRelative(1.18f, 2.722f, 2.634f, 2.722f)
                curveToRelative(1.455f, 0.0f, 2.634f, -1.219f, 2.634f, -2.722f)
                curveToRelative(0.0f, -1.504f, -1.18f, -2.723f, -2.634f, -2.723f)
                close()
                moveTo(21.193f, 9.277f)
                curveToRelative(-1.455f, 0.0f, -2.635f, 1.22f, -2.635f, 2.723f)
                reflectiveCurveToRelative(1.18f, 2.722f, 2.635f, 2.722f)
                curveToRelative(1.455f, 0.0f, 2.634f, -1.219f, 2.634f, -2.722f)
                curveToRelative(0.0f, -1.504f, -1.18f, -2.723f, -2.634f, -2.723f)
                close()
                moveTo(2.807f, 18.555f)
                curveToRelative(-1.454f, 0.0f, -2.634f, 1.22f, -2.634f, 2.722f)
                curveTo(0.173f, 22.781f, 1.353f, 24.0f, 2.807f, 24.0f)
                curveToRelative(1.455f, 0.0f, 2.635f, -1.22f, 2.635f, -2.723f)
                reflectiveCurveToRelative(-1.18f, -2.722f, -2.635f, -2.722f)
                close()
                moveTo(12.0f, 18.555f)
                curveToRelative(-1.455f, 0.0f, -2.634f, 1.22f, -2.634f, 2.722f)
                curveTo(9.366f, 22.781f, 10.546f, 24.0f, 12.0f, 24.0f)
                curveToRelative(1.455f, 0.0f, 2.634f, -1.22f, 2.634f, -2.723f)
                reflectiveCurveToRelative(-1.18f, -2.722f, -2.634f, -2.722f)
                close()
                moveTo(21.193f, 18.555f)
                curveToRelative(-1.455f, 0.0f, -2.635f, 1.22f, -2.635f, 2.722f)
                curveToRelative(0.0f, 1.504f, 1.18f, 2.723f, 2.635f, 2.723f)
                curveToRelative(1.455f, 0.0f, 2.634f, -1.22f, 2.634f, -2.723f)
                reflectiveCurveToRelative(-1.18f, -2.722f, -2.634f, -2.722f)
                close()
            }
        }
        .build()
        return _ros!!
    }

private var _ros: ImageVector? = null
