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

public val SolidGroup.CarSide: ImageVector
    get() {
        if (_carSide != null) {
            return _carSide!!
        }
        _carSide = Builder(name = "CarSide", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(171.3f, 96.0f)
                lineTo(224.0f, 96.0f)
                verticalLineToRelative(96.0f)
                lineTo(111.3f, 192.0f)
                lineToRelative(30.4f, -75.9f)
                curveTo(146.5f, 104.0f, 158.2f, 96.0f, 171.3f, 96.0f)
                close()
                moveTo(272.0f, 192.0f)
                lineTo(272.0f, 96.0f)
                horizontalLineToRelative(81.2f)
                curveToRelative(9.7f, 0.0f, 18.9f, 4.4f, 25.0f, 12.0f)
                lineToRelative(67.2f, 84.0f)
                lineTo(272.0f, 192.0f)
                close()
                moveTo(528.2f, 193.0f)
                lineTo(428.2f, 68.0f)
                curveToRelative(-18.2f, -22.8f, -45.8f, -36.0f, -75.0f, -36.0f)
                lineTo(171.3f, 32.0f)
                curveToRelative(-39.3f, 0.0f, -74.6f, 23.9f, -89.1f, 60.3f)
                lineTo(40.6f, 196.4f)
                curveTo(16.8f, 205.8f, 0.0f, 228.9f, 0.0f, 256.0f)
                lineTo(0.0f, 368.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(65.3f, 400.0f)
                curveToRelative(7.6f, 45.4f, 47.1f, 80.0f, 94.7f, 80.0f)
                reflectiveCurveToRelative(87.1f, -34.6f, 94.7f, -80.0f)
                lineTo(385.3f, 400.0f)
                curveToRelative(7.6f, 45.4f, 47.1f, 80.0f, 94.7f, 80.0f)
                reflectiveCurveToRelative(87.1f, -34.6f, 94.7f, -80.0f)
                lineTo(608.0f, 400.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(640.0f, 320.0f)
                curveToRelative(0.0f, -65.2f, -48.8f, -119.0f, -111.8f, -127.0f)
                close()
                moveTo(434.7f, 368.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 90.5f, 32.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, -90.5f, -32.0f)
                close()
                moveTo(160.0f, 336.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, true, 0.0f, -96.0f)
                close()
            }
        }
        .build()
        return _carSide!!
    }

private var _carSide: ImageVector? = null
