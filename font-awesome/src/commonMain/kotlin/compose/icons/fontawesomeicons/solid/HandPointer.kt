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

public val SolidGroup.HandPointer: ImageVector
    get() {
        if (_handPointer != null) {
            return _handPointer!!
        }
        _handPointer = Builder(name = "HandPointer", defaultWidth = 448.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 40.0f)
                curveToRelative(0.0f, -22.1f, 17.9f, -40.0f, 40.0f, -40.0f)
                reflectiveCurveToRelative(40.0f, 17.9f, 40.0f, 40.0f)
                lineTo(208.0f, 188.2f)
                curveToRelative(8.5f, -7.6f, 19.7f, -12.2f, 32.0f, -12.2f)
                curveToRelative(20.6f, 0.0f, 38.2f, 13.0f, 45.0f, 31.2f)
                curveToRelative(8.8f, -9.3f, 21.2f, -15.2f, 35.0f, -15.2f)
                curveToRelative(25.3f, 0.0f, 46.0f, 19.5f, 47.9f, 44.3f)
                curveToRelative(8.5f, -7.7f, 19.8f, -12.3f, 32.1f, -12.3f)
                curveToRelative(26.5f, 0.0f, 48.0f, 21.5f, 48.0f, 48.0f)
                verticalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 70.7f, -57.3f, 128.0f, -128.0f, 128.0f)
                lineToRelative(-16.0f, 0.0f)
                lineTo(240.0f, 512.0f)
                lineToRelative(-0.1f, 0.0f)
                horizontalLineToRelative(-5.2f)
                curveToRelative(-5.0f, 0.0f, -9.9f, -0.3f, -14.7f, -1.0f)
                curveToRelative(-55.3f, -5.6f, -106.2f, -34.0f, -140.0f, -79.0f)
                lineTo(8.0f, 336.0f)
                curveToRelative(-13.3f, -17.7f, -9.7f, -42.7f, 8.0f, -56.0f)
                reflectiveCurveToRelative(42.7f, -9.7f, 56.0f, 8.0f)
                lineToRelative(56.0f, 74.7f)
                lineTo(128.0f, 40.0f)
                close()
                moveTo(240.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(240.0f, 304.0f)
                close()
                moveTo(288.0f, 288.0f)
                curveToRelative(-8.8f, 0.0f, -16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(304.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                close()
                moveTo(368.0f, 304.0f)
                curveToRelative(0.0f, -8.8f, -7.2f, -16.0f, -16.0f, -16.0f)
                reflectiveCurveToRelative(-16.0f, 7.2f, -16.0f, 16.0f)
                verticalLineToRelative(96.0f)
                curveToRelative(0.0f, 8.8f, 7.2f, 16.0f, 16.0f, 16.0f)
                reflectiveCurveToRelative(16.0f, -7.2f, 16.0f, -16.0f)
                lineTo(368.0f, 304.0f)
                close()
            }
        }
        .build()
        return _handPointer!!
    }

private var _handPointer: ImageVector? = null
