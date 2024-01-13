package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.MarsAndVenus: ImageVector
    get() {
        if (_marsAndVenus != null) {
            return _marsAndVenus!!
        }
        _marsAndVenus = Builder(name = "MarsAndVenus", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(337.8f, 14.8f)
                curveTo(341.5f, 5.8f, 350.3f, 0.0f, 360.0f, 0.0f)
                horizontalLineTo(472.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(136.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-39.0f, -39.0f)
                lineToRelative(-24.7f, 24.7f)
                curveTo(407.0f, 163.3f, 416.0f, 192.6f, 416.0f, 224.0f)
                curveToRelative(0.0f, 80.2f, -59.0f, 146.6f, -136.0f, 158.2f)
                verticalLineTo(408.0f)
                horizontalLineToRelative(24.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                reflectiveCurveToRelative(-10.7f, 24.0f, -24.0f, 24.0f)
                horizontalLineTo(280.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 13.3f, -10.7f, 24.0f, -24.0f, 24.0f)
                reflectiveCurveToRelative(-24.0f, -10.7f, -24.0f, -24.0f)
                verticalLineTo(456.0f)
                horizontalLineTo(208.0f)
                curveToRelative(-13.3f, 0.0f, -24.0f, -10.7f, -24.0f, -24.0f)
                reflectiveCurveToRelative(10.7f, -24.0f, 24.0f, -24.0f)
                horizontalLineToRelative(24.0f)
                verticalLineTo(382.2f)
                curveTo(155.0f, 370.6f, 96.0f, 304.2f, 96.0f, 224.0f)
                curveToRelative(0.0f, -88.4f, 71.6f, -160.0f, 160.0f, -160.0f)
                curveToRelative(39.6f, 0.0f, 75.9f, 14.4f, 103.8f, 38.2f)
                lineTo(382.1f, 80.0f)
                lineTo(343.0f, 41.0f)
                curveToRelative(-6.9f, -6.9f, -8.9f, -17.2f, -5.2f, -26.2f)
                close()
                moveTo(448.0f, 48.0f)
                lineToRelative(0.0f, 0.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                close()
                moveTo(352.0f, 224.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, -192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, false, 192.0f, 0.0f)
                close()
            }
        }
        .build()
        return _marsAndVenus!!
    }

private var _marsAndVenus: ImageVector? = null
