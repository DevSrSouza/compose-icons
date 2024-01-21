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

public val SimpleIcons.Manageiq: ImageVector
    get() {
        if (_manageiq != null) {
            return _manageiq!!
        }
        _manageiq = Builder(name = "Manageiq", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.095f, 0.1f)
                curveTo(5.718f, 0.094f, 0.544f, 5.26f, 0.538f, 11.637f)
                verticalLineToRelative(0.022f)
                curveToRelative(0.0f, 2.069f, 0.547f, 4.005f, 1.496f, 5.683f)
                lineToRelative(2.869f, -2.868f)
                arcToRelative(7.685f, 7.685f, 0.0f, false, true, -0.54f, -2.815f)
                curveToRelative(0.0f, -4.262f, 3.47f, -7.73f, 7.732f, -7.73f)
                reflectiveCurveToRelative(7.732f, 3.468f, 7.732f, 7.73f)
                reflectiveCurveToRelative(-3.47f, 7.732f, -7.732f, 7.732f)
                arcToRelative(7.685f, 7.685f, 0.0f, false, true, -2.6f, -0.46f)
                lineTo(6.596f, 21.83f)
                arcToRelative(11.515f, 11.515f, 0.0f, false, false, 5.499f, 1.388f)
                curveToRelative(2.316f, 0.0f, 4.467f, -0.686f, 6.275f, -1.856f)
                lineToRelative(2.393f, 2.392f)
                lineTo(24.0f, 20.512f)
                lineToRelative(-2.349f, -2.349f)
                curveToRelative(1.262f, -1.852f, 2.0f, -4.09f, 2.0f, -6.505f)
                curveTo(23.66f, 5.269f, 18.452f, 0.078f, 12.096f, 0.101f)
                lineTo(12.095f, 0.1f)
                close()
                moveTo(12.095f, 9.44f)
                curveToRelative(-1.225f, 0.0f, -2.214f, 0.991f, -2.214f, 2.217f)
                reflectiveCurveToRelative(0.989f, 2.215f, 2.214f, 2.215f)
                arcToRelative(2.216f, 2.216f, 0.0f, true, false, 0.0f, -4.432f)
                close()
                moveTo(7.855f, 12.808f)
                curveTo(7.57f, 13.09f, 0.273f, 20.39f, 0.0f, 20.662f)
                lineTo(3.24f, 23.9f)
                lineToRelative(7.855f, -7.855f)
                lineToRelative(-3.24f, -3.238f)
                verticalLineToRelative(0.001f)
                close()
            }
        }
        .build()
        return _manageiq!!
    }

private var _manageiq: ImageVector? = null
