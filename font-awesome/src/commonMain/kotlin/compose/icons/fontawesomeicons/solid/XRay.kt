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

public val SolidGroup.XRay: ImageVector
    get() {
        if (_xRay != null) {
            return _xRay!!
        }
        _xRay = Builder(name = "XRay", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 64.0f)
                curveTo(0.0f, 46.3f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(480.0f, 32.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(480.0f, 416.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(32.0f, 480.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                reflectiveCurveToRelative(14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(32.0f, 96.0f)
                curveTo(14.3f, 96.0f, 0.0f, 81.7f, 0.0f, 64.0f)
                close()
                moveTo(256.0f, 96.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(32.0f)
                lineTo(160.0f, 144.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(48.0f)
                lineTo(128.0f, 224.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                reflectiveCurveToRelative(7.2f, 16.0f, 16.0f, 16.0f)
                lineTo(240.0f, 256.0f)
                verticalLineToRelative(70.6f)
                lineTo(189.1f, 307.0f)
                curveToRelative(-5.2f, -2.0f, -10.6f, -3.0f, -16.2f, -3.0f)
                horizontalLineToRelative(-2.1f)
                curveToRelative(-23.6f, 0.0f, -42.8f, 19.2f, -42.8f, 42.8f)
                curveToRelative(0.0f, 9.6f, 3.2f, 18.9f, 9.1f, 26.4f)
                lineToRelative(18.2f, 23.2f)
                curveToRelative(9.7f, 12.4f, 24.6f, 19.6f, 40.3f, 19.6f)
                lineTo(316.4f, 416.0f)
                curveToRelative(15.7f, 0.0f, 30.6f, -7.2f, 40.3f, -19.6f)
                lineToRelative(18.2f, -23.2f)
                curveToRelative(5.9f, -7.5f, 9.1f, -16.8f, 9.1f, -26.4f)
                curveToRelative(0.0f, -23.6f, -19.2f, -42.8f, -42.8f, -42.8f)
                lineTo(339.0f, 304.0f)
                curveToRelative(-5.5f, 0.0f, -11.0f, 1.0f, -16.2f, 3.0f)
                lineTo(272.0f, 326.6f)
                lineTo(272.0f, 256.0f)
                lineTo(384.0f, 256.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(272.0f, 224.0f)
                lineTo(272.0f, 176.0f)
                horizontalLineToRelative(80.0f)
                curveToRelative(8.8f, 0.0f, 16.0f, -7.2f, 16.0f, -16.0f)
                reflectiveCurveToRelative(-7.2f, -16.0f, -16.0f, -16.0f)
                lineTo(272.0f, 144.0f)
                lineTo(272.0f, 112.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(208.0f, 352.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
                moveTo(288.0f, 368.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 32.0f, 0.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, -32.0f, 0.0f)
                close()
            }
        }
        .build()
        return _xRay!!
    }

private var _xRay: ImageVector? = null
