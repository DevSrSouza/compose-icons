package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.WifiTethering: ImageVector
    get() {
        if (_wifiTethering != null) {
            return _wifiTethering!!
        }
        _wifiTethering = Builder(name = "WifiTethering", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 11.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                reflectiveCurveToRelative(-0.9f, -2.0f, -2.0f, -2.0f)
                close()
                moveTo(18.0f, 13.0f)
                curveToRelative(0.0f, -3.31f, -2.69f, -6.0f, -6.0f, -6.0f)
                reflectiveCurveToRelative(-6.0f, 2.69f, -6.0f, 6.0f)
                curveToRelative(0.0f, 2.22f, 1.21f, 4.15f, 3.0f, 5.19f)
                lineToRelative(1.0f, -1.74f)
                curveToRelative(-1.19f, -0.7f, -2.0f, -1.97f, -2.0f, -3.45f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.0f, -4.0f)
                reflectiveCurveToRelative(4.0f, 1.79f, 4.0f, 4.0f)
                curveToRelative(0.0f, 1.48f, -0.81f, 2.75f, -2.0f, 3.45f)
                lineToRelative(1.0f, 1.74f)
                curveToRelative(1.79f, -1.04f, 3.0f, -2.97f, 3.0f, -5.19f)
                close()
                moveTo(12.0f, 3.0f)
                curveTo(6.48f, 3.0f, 2.0f, 7.48f, 2.0f, 13.0f)
                curveToRelative(0.0f, 3.7f, 2.01f, 6.92f, 4.99f, 8.65f)
                lineToRelative(1.0f, -1.73f)
                curveTo(5.61f, 18.53f, 4.0f, 15.96f, 4.0f, 13.0f)
                curveToRelative(0.0f, -4.42f, 3.58f, -8.0f, 8.0f, -8.0f)
                reflectiveCurveToRelative(8.0f, 3.58f, 8.0f, 8.0f)
                curveToRelative(0.0f, 2.96f, -1.61f, 5.53f, -4.0f, 6.92f)
                lineToRelative(1.0f, 1.73f)
                curveToRelative(2.99f, -1.73f, 5.0f, -4.95f, 5.0f, -8.65f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10.0f, -10.0f, -10.0f)
                close()
            }
        }
        .build()
        return _wifiTethering!!
    }

private var _wifiTethering: ImageVector? = null
