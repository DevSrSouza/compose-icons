package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Globe: ImageVector
    get() {
        if (_globe != null) {
            return _globe!!
        }
        _globe = Builder(name = "Globe", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(336.5f, 160.0f)
                curveTo(322.0f, 70.7f, 287.8f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveToRelative(-74.0f, 62.7f, -88.5f, 152.0f)
                horizontalLineToRelative(177.0f)
                close()
                moveTo(152.0f, 256.0f)
                curveToRelative(0.0f, 22.2f, 1.2f, 43.5f, 3.3f, 64.0f)
                horizontalLineToRelative(185.3f)
                curveToRelative(2.1f, -20.5f, 3.3f, -41.8f, 3.3f, -64.0f)
                reflectiveCurveToRelative(-1.2f, -43.5f, -3.3f, -64.0f)
                lineTo(155.3f, 192.0f)
                curveToRelative(-2.1f, 20.5f, -3.3f, 41.8f, -3.3f, 64.0f)
                close()
                moveTo(476.7f, 160.0f)
                curveToRelative(-28.6f, -67.9f, -86.5f, -120.4f, -158.0f, -141.6f)
                curveToRelative(24.4f, 33.8f, 41.2f, 84.7f, 50.0f, 141.6f)
                horizontalLineToRelative(108.0f)
                close()
                moveTo(177.2f, 18.4f)
                curveTo(105.8f, 39.6f, 47.8f, 92.1f, 19.3f, 160.0f)
                horizontalLineToRelative(108.0f)
                curveToRelative(8.7f, -56.9f, 25.5f, -107.8f, 49.9f, -141.6f)
                close()
                moveTo(487.4f, 192.0f)
                lineTo(372.7f, 192.0f)
                curveToRelative(2.1f, 21.0f, 3.3f, 42.5f, 3.3f, 64.0f)
                reflectiveCurveToRelative(-1.2f, 43.0f, -3.3f, 64.0f)
                horizontalLineToRelative(114.6f)
                curveToRelative(5.5f, -20.5f, 8.6f, -41.8f, 8.6f, -64.0f)
                reflectiveCurveToRelative(-3.1f, -43.5f, -8.5f, -64.0f)
                close()
                moveTo(120.0f, 256.0f)
                curveToRelative(0.0f, -21.5f, 1.2f, -43.0f, 3.3f, -64.0f)
                lineTo(8.6f, 192.0f)
                curveTo(3.2f, 212.5f, 0.0f, 233.8f, 0.0f, 256.0f)
                reflectiveCurveToRelative(3.2f, 43.5f, 8.6f, 64.0f)
                horizontalLineToRelative(114.6f)
                curveToRelative(-2.0f, -21.0f, -3.2f, -42.5f, -3.2f, -64.0f)
                close()
                moveTo(159.5f, 352.0f)
                curveToRelative(14.5f, 89.3f, 48.7f, 152.0f, 88.5f, 152.0f)
                reflectiveCurveToRelative(74.0f, -62.7f, 88.5f, -152.0f)
                horizontalLineToRelative(-177.0f)
                close()
                moveTo(318.8f, 493.6f)
                curveToRelative(71.4f, -21.2f, 129.4f, -73.7f, 158.0f, -141.6f)
                horizontalLineToRelative(-108.0f)
                curveToRelative(-8.8f, 56.9f, -25.6f, 107.8f, -50.0f, 141.6f)
                close()
                moveTo(19.3f, 352.0f)
                curveToRelative(28.6f, 67.9f, 86.5f, 120.4f, 158.0f, 141.6f)
                curveToRelative(-24.4f, -33.8f, -41.2f, -84.7f, -50.0f, -141.6f)
                horizontalLineToRelative(-108.0f)
                close()
            }
        }
        .build()
        return _globe!!
    }

private var _globe: ImageVector? = null
