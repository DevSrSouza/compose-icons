package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FaceSadCry: ImageVector
    get() {
        if (_faceSadCry != null) {
            return _faceSadCry!!
        }
        _faceSadCry = Builder(name = "FaceSadCry", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(400.0f, 406.1f)
                lineTo(400.0f, 288.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineTo(352.0f, 440.6f)
                curveToRelative(-28.7f, 15.0f, -61.4f, 23.4f, -96.0f, 23.4f)
                reflectiveCurveToRelative(-67.3f, -8.5f, -96.0f, -23.4f)
                lineTo(160.0f, 288.0f)
                curveToRelative(0.0f, -13.3f, -10.7f, -24.0f, -24.0f, -24.0f)
                reflectiveCurveToRelative(-24.0f, 10.7f, -24.0f, 24.0f)
                lineTo(112.0f, 406.1f)
                curveTo(72.6f, 368.2f, 48.0f, 315.0f, 48.0f, 256.0f)
                curveTo(48.0f, 141.1f, 141.1f, 48.0f, 256.0f, 48.0f)
                reflectiveCurveToRelative(208.0f, 93.1f, 208.0f, 208.0f)
                curveToRelative(0.0f, 59.0f, -24.6f, 112.2f, -64.0f, 150.1f)
                close()
                moveTo(256.0f, 512.0f)
                arcTo(256.0f, 256.0f, 0.0f, true, false, 256.0f, 0.0f)
                arcToRelative(256.0f, 256.0f, 0.0f, true, false, 0.0f, 512.0f)
                close()
                moveTo(159.6f, 220.0f)
                curveToRelative(10.6f, 0.0f, 19.9f, 3.8f, 25.4f, 9.7f)
                curveToRelative(7.6f, 8.1f, 20.2f, 8.5f, 28.3f, 0.9f)
                reflectiveCurveToRelative(8.5f, -20.2f, 0.9f, -28.3f)
                curveTo(199.7f, 186.8f, 179.0f, 180.0f, 159.6f, 180.0f)
                reflectiveCurveToRelative(-40.1f, 6.8f, -54.6f, 22.3f)
                curveToRelative(-7.6f, 8.1f, -7.1f, 20.7f, 0.9f, 28.3f)
                reflectiveCurveToRelative(20.7f, 7.1f, 28.3f, -0.9f)
                curveToRelative(5.5f, -5.8f, 14.8f, -9.7f, 25.4f, -9.7f)
                close()
                moveTo(326.2f, 229.7f)
                curveToRelative(5.5f, -5.8f, 14.8f, -9.7f, 25.4f, -9.7f)
                reflectiveCurveToRelative(19.9f, 3.8f, 25.4f, 9.7f)
                curveToRelative(7.6f, 8.1f, 20.2f, 8.5f, 28.3f, 0.9f)
                reflectiveCurveToRelative(8.5f, -20.2f, 0.9f, -28.3f)
                curveTo(391.7f, 186.8f, 371.0f, 180.0f, 351.6f, 180.0f)
                reflectiveCurveToRelative(-40.1f, 6.8f, -54.6f, 22.3f)
                curveToRelative(-7.6f, 8.1f, -7.1f, 20.7f, 0.9f, 28.3f)
                reflectiveCurveToRelative(20.7f, 7.1f, 28.3f, -0.9f)
                close()
                moveTo(208.0f, 320.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 26.5f, 21.5f, 48.0f, 48.0f, 48.0f)
                reflectiveCurveToRelative(48.0f, -21.5f, 48.0f, -48.0f)
                lineTo(304.0f, 320.0f)
                curveToRelative(0.0f, -26.5f, -21.5f, -48.0f, -48.0f, -48.0f)
                reflectiveCurveToRelative(-48.0f, 21.5f, -48.0f, 48.0f)
                close()
            }
        }
        .build()
        return _faceSadCry!!
    }

private var _faceSadCry: ImageVector? = null
