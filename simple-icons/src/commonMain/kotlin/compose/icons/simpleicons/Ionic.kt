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

public val SimpleIcons.Ionic: ImageVector
    get() {
        if (_ionic != null) {
            return _ionic!!
        }
        _ionic = Builder(name = "Ionic", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.922f, 7.027f)
                lineToRelative(-0.103f, -0.23f)
                lineToRelative(-0.169f, 0.188f)
                curveToRelative(-0.408f, 0.464f, -0.928f, 0.82f, -1.505f, 1.036f)
                lineToRelative(-0.159f, 0.061f)
                lineToRelative(0.066f, 0.155f)
                arcToRelative(9.745f, 9.745f, 0.0f, false, true, 0.75f, 3.759f)
                curveToRelative(0.0f, 5.405f, -4.397f, 9.806f, -9.806f, 9.806f)
                curveToRelative(-5.409f, 0.0f, -9.802f, -4.397f, -9.802f, -9.802f)
                curveToRelative(0.0f, -5.405f, 4.402f, -9.806f, 9.806f, -9.806f)
                curveToRelative(1.467f, 0.0f, 2.883f, 0.319f, 4.2f, 0.947f)
                lineToRelative(0.155f, 0.075f)
                lineToRelative(0.066f, -0.155f)
                arcToRelative(3.767f, 3.767f, 0.0f, false, true, 1.106f, -1.453f)
                lineToRelative(0.197f, -0.159f)
                lineToRelative(-0.225f, -0.117f)
                arcTo(11.905f, 11.905f, 0.0f, false, false, 12.001f, 0.001f)
                curveToRelative(-6.619f, 0.0f, -12.0f, 5.381f, -12.0f, 12.0f)
                reflectiveCurveToRelative(5.381f, 12.0f, 12.0f, 12.0f)
                reflectiveCurveToRelative(12.0f, -5.381f, 12.0f, -12.0f)
                curveToRelative(0.0f, -1.73f, -0.361f, -3.403f, -1.078f, -4.973f)
                close()
                moveTo(12.0f, 6.53f)
                arcTo(5.476f, 5.476f, 0.0f, false, false, 6.53f, 12.0f)
                arcTo(5.476f, 5.476f, 0.0f, false, false, 12.0f, 17.47f)
                arcTo(5.476f, 5.476f, 0.0f, false, false, 17.47f, 12.0f)
                arcTo(5.479f, 5.479f, 0.0f, false, false, 12.0f, 6.53f)
                close()
                moveTo(22.345f, 4.523f)
                arcToRelative(2.494f, 2.494f, 0.0f, true, true, -4.988f, 0.0f)
                arcToRelative(2.494f, 2.494f, 0.0f, false, true, 4.988f, 0.0f)
                close()
            }
        }
        .build()
        return _ionic!!
    }

private var _ionic: ImageVector? = null
