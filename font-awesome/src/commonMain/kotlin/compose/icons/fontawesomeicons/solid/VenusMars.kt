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

public val SolidGroup.VenusMars: ImageVector
    get() {
        if (_venusMars != null) {
            return _venusMars!!
        }
        _venusMars = Builder(name = "VenusMars", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 288.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, -224.0f)
                arcToRelative(112.0f, 112.0f, 0.0f, true, false, 0.0f, 224.0f)
                close()
                moveTo(352.0f, 176.0f)
                curveToRelative(0.0f, 86.3f, -62.1f, 158.1f, -144.0f, 173.1f)
                verticalLineTo(384.0f)
                horizontalLineToRelative(32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(208.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                reflectiveCurveToRelative(-32.0f, -14.3f, -32.0f, -32.0f)
                verticalLineTo(448.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                horizontalLineToRelative(32.0f)
                verticalLineTo(349.1f)
                curveTo(62.1f, 334.1f, 0.0f, 262.3f, 0.0f, 176.0f)
                curveTo(0.0f, 78.8f, 78.8f, 0.0f, 176.0f, 0.0f)
                reflectiveCurveToRelative(176.0f, 78.8f, 176.0f, 176.0f)
                close()
                moveTo(271.9f, 360.6f)
                curveToRelative(19.3f, -10.1f, 36.9f, -23.1f, 52.1f, -38.4f)
                curveToRelative(20.0f, 18.5f, 46.7f, 29.8f, 76.1f, 29.8f)
                curveToRelative(61.9f, 0.0f, 112.0f, -50.1f, 112.0f, -112.0f)
                reflectiveCurveToRelative(-50.1f, -112.0f, -112.0f, -112.0f)
                curveToRelative(-7.2f, 0.0f, -14.3f, 0.7f, -21.1f, 2.0f)
                curveToRelative(-4.9f, -21.5f, -13.0f, -41.7f, -24.0f, -60.2f)
                curveTo(369.3f, 66.0f, 384.4f, 64.0f, 400.0f, 64.0f)
                curveToRelative(37.0f, 0.0f, 71.4f, 11.4f, 99.8f, 31.0f)
                lineToRelative(20.6f, -20.6f)
                lineTo(487.0f, 41.0f)
                curveToRelative(-6.9f, -6.9f, -8.9f, -17.2f, -5.2f, -26.2f)
                reflectiveCurveTo(494.3f, 0.0f, 504.0f, 0.0f)
                horizontalLineTo(616.0f)
                curveToRelative(13.3f, 0.0f, 24.0f, 10.7f, 24.0f, 24.0f)
                verticalLineTo(136.0f)
                curveToRelative(0.0f, 9.7f, -5.8f, 18.5f, -14.8f, 22.2f)
                reflectiveCurveToRelative(-19.3f, 1.7f, -26.2f, -5.2f)
                lineToRelative(-33.4f, -33.4f)
                lineTo(545.0f, 140.2f)
                curveToRelative(19.5f, 28.4f, 31.0f, 62.7f, 31.0f, 99.8f)
                curveToRelative(0.0f, 97.2f, -78.8f, 176.0f, -176.0f, 176.0f)
                curveToRelative(-50.5f, 0.0f, -96.0f, -21.3f, -128.1f, -55.4f)
                close()
            }
        }
        .build()
        return _venusMars!!
    }

private var _venusMars: ImageVector? = null
