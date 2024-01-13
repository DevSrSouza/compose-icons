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

public val SolidGroup.TruckFront: ImageVector
    get() {
        if (_truckFront != null) {
            return _truckFront!!
        }
        _truckFront = Builder(name = "TruckFront", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 80.0f)
                curveTo(0.0f, 35.8f, 35.8f, 0.0f, 80.0f, 0.0f)
                lineTo(432.0f, 0.0f)
                curveToRelative(44.2f, 0.0f, 80.0f, 35.8f, 80.0f, 80.0f)
                lineTo(512.0f, 368.0f)
                curveToRelative(0.0f, 26.2f, -12.6f, 49.4f, -32.0f, 64.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(416.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(384.0f, 448.0f)
                lineTo(128.0f, 448.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(64.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(32.0f, 432.0f)
                curveTo(12.6f, 417.4f, 0.0f, 394.2f, 0.0f, 368.0f)
                lineTo(0.0f, 80.0f)
                close()
                moveTo(129.9f, 152.2f)
                lineTo(112.0f, 224.0f)
                lineTo(400.0f, 224.0f)
                lineToRelative(-17.9f, -71.8f)
                curveTo(378.5f, 138.0f, 365.7f, 128.0f, 351.0f, 128.0f)
                lineTo(161.0f, 128.0f)
                curveToRelative(-14.7f, 0.0f, -27.5f, 10.0f, -31.0f, 24.2f)
                close()
                moveTo(128.0f, 320.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(416.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _truckFront!!
    }

private var _truckFront: ImageVector? = null
