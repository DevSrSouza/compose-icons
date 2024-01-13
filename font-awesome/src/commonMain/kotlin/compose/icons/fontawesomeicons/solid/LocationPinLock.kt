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

public val SolidGroup.LocationPinLock: ImageVector
    get() {
        if (_locationPinLock != null) {
            return _locationPinLock!!
        }
        _locationPinLock = Builder(name = "LocationPinLock", defaultWidth = 512.0.dp, defaultHeight
                = 512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(215.7f, 499.2f)
                curveToRelative(11.0f, -13.8f, 25.1f, -31.7f, 40.3f, -52.3f)
                lineTo(256.0f, 352.0f)
                curveToRelative(0.0f, -23.7f, 12.9f, -44.4f, 32.0f, -55.4f)
                lineTo(288.0f, 272.0f)
                curveToRelative(0.0f, -55.6f, 40.5f, -101.7f, 93.6f, -110.5f)
                curveTo(367.0f, 70.0f, 287.7f, 0.0f, 192.0f, 0.0f)
                curveTo(86.0f, 0.0f, 0.0f, 86.0f, 0.0f, 192.0f)
                curveToRelative(0.0f, 87.4f, 117.0f, 243.0f, 168.3f, 307.2f)
                curveToRelative(12.3f, 15.3f, 35.1f, 15.3f, 47.4f, 0.0f)
                close()
                moveTo(192.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, 128.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 0.0f, -128.0f)
                close()
                moveTo(400.0f, 240.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                lineTo(368.0f, 320.0f)
                lineTo(368.0f, 272.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                close()
                moveTo(320.0f, 272.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                lineTo(288.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(480.0f, 512.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(512.0f, 352.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(480.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, -35.8f, -80.0f, -80.0f, -80.0f)
                reflectiveCurveToRelative(-80.0f, 35.8f, -80.0f, 80.0f)
                close()
            }
        }
        .build()
        return _locationPinLock!!
    }

private var _locationPinLock: ImageVector? = null
