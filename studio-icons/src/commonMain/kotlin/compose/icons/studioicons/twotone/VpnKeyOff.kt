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

public val TwotoneGroup.VpnKeyOff: ImageVector
    get() {
        if (_vpnKeyOff != null) {
            return _vpnKeyOff!!
        }
        _vpnKeyOff = Builder(name = "VpnKeyOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 14.17f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.17f)
                lineToRelative(-2.0f, -2.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineTo(17.0f, 14.17f)
                close()
                moveTo(7.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f)
                lineToRelative(1.71f, 1.71f)
                curveTo(7.12f, 10.0f, 7.06f, 10.0f, 7.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, -0.01f, -0.18f)
                lineToRelative(1.74f, 1.74f)
                curveTo(10.22f, 14.48f, 9.14f, 16.0f, 7.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.81f, 2.81f)
                lineTo(1.39f, 4.22f)
                lineToRelative(2.59f, 2.59f)
                curveTo(2.2f, 7.85f, 1.0f, 9.79f, 1.0f, 12.0f)
                curveToRelative(0.0f, 3.31f, 2.69f, 6.0f, 6.0f, 6.0f)
                curveToRelative(2.22f, 0.0f, 4.15f, -1.21f, 5.19f, -3.0f)
                lineToRelative(7.59f, 7.61f)
                lineToRelative(1.41f, -1.41f)
                lineTo(2.81f, 2.81f)
                close()
                moveTo(7.0f, 16.0f)
                curveToRelative(-2.21f, 0.0f, -4.0f, -1.79f, -4.0f, -4.0f)
                curveToRelative(0.0f, -1.67f, 1.02f, -3.1f, 2.47f, -3.7f)
                lineToRelative(1.71f, 1.71f)
                curveTo(7.12f, 10.0f, 7.06f, 10.0f, 7.0f, 10.0f)
                curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f)
                reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f)
                reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f)
                curveToRelative(0.0f, -0.06f, 0.0f, -0.12f, -0.01f, -0.18f)
                lineToRelative(1.74f, 1.74f)
                curveTo(10.22f, 14.48f, 9.14f, 16.0f, 7.0f, 16.0f)
                close()
                moveTo(17.0f, 14.17f)
                verticalLineTo(13.0f)
                horizontalLineToRelative(-1.17f)
                lineTo(17.0f, 14.17f)
                close()
                moveTo(13.83f, 11.0f)
                horizontalLineTo(21.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(3.0f)
                lineToRelative(2.0f, 2.0f)
                verticalLineToRelative(-3.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.83f)
                lineTo(13.83f, 11.0f)
                close()
            }
        }
        .build()
        return _vpnKeyOff!!
    }

private var _vpnKeyOff: ImageVector? = null
