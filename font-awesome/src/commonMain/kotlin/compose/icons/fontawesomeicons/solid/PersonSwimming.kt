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

public val SolidGroup.PersonSwimming: ImageVector
    get() {
        if (_personSwimming != null) {
            return _personSwimming!!
        }
        _personSwimming = Builder(name = "PersonSwimming", defaultWidth = 576.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 576.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(309.5f, 178.4f)
                lineTo(447.9f, 297.1f)
                curveToRelative(-1.6f, 0.9f, -3.2f, 2.0f, -4.8f, 3.0f)
                curveToRelative(-18.0f, 12.4f, -40.1f, 20.3f, -59.2f, 20.3f)
                curveToRelative(-19.6f, 0.0f, -40.8f, -7.7f, -59.2f, -20.3f)
                curveToRelative(-22.1f, -15.5f, -51.6f, -15.5f, -73.7f, 0.0f)
                curveToRelative(-17.1f, 11.8f, -38.0f, 20.3f, -59.2f, 20.3f)
                curveToRelative(-10.1f, 0.0f, -21.1f, -2.2f, -31.9f, -6.2f)
                curveTo(163.1f, 193.2f, 262.2f, 96.0f, 384.0f, 96.0f)
                horizontalLineToRelative(64.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                reflectiveCurveToRelative(-14.3f, 32.0f, -32.0f, 32.0f)
                horizontalLineTo(384.0f)
                curveToRelative(-26.9f, 0.0f, -52.3f, 6.6f, -74.5f, 18.4f)
                close()
                moveTo(160.0f, 160.0f)
                arcTo(64.0f, 64.0f, 0.0f, true, true, 32.0f, 160.0f)
                arcToRelative(64.0f, 64.0f, 0.0f, true, true, 128.0f, 0.0f)
                close()
                moveTo(306.5f, 325.9f)
                curveTo(329.0f, 341.4f, 356.5f, 352.0f, 384.0f, 352.0f)
                curveToRelative(26.9f, 0.0f, 55.4f, -10.8f, 77.4f, -26.1f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(11.9f, -8.5f, 28.1f, -7.8f, 39.2f, 1.7f)
                curveToRelative(14.4f, 11.9f, 32.5f, 21.0f, 50.6f, 25.2f)
                curveToRelative(17.2f, 4.0f, 27.9f, 21.2f, 23.9f, 38.4f)
                reflectiveCurveToRelative(-21.2f, 27.9f, -38.4f, 23.9f)
                curveToRelative(-24.5f, -5.7f, -44.9f, -16.5f, -58.2f, -25.0f)
                curveTo(449.5f, 405.7f, 417.0f, 416.0f, 384.0f, 416.0f)
                curveToRelative(-31.9f, 0.0f, -60.6f, -9.9f, -80.4f, -18.9f)
                curveToRelative(-5.8f, -2.7f, -11.1f, -5.3f, -15.6f, -7.7f)
                curveToRelative(-4.5f, 2.4f, -9.7f, 5.1f, -15.6f, 7.7f)
                curveToRelative(-19.8f, 9.0f, -48.5f, 18.9f, -80.4f, 18.9f)
                curveToRelative(-33.0f, 0.0f, -65.5f, -10.3f, -94.5f, -25.8f)
                curveToRelative(-13.4f, 8.4f, -33.7f, 19.3f, -58.2f, 25.0f)
                curveToRelative(-17.2f, 4.0f, -34.4f, -6.7f, -38.4f, -23.9f)
                reflectiveCurveToRelative(6.7f, -34.4f, 23.9f, -38.4f)
                curveToRelative(18.1f, -4.2f, 36.2f, -13.3f, 50.6f, -25.2f)
                curveToRelative(11.1f, -9.4f, 27.3f, -10.1f, 39.2f, -1.7f)
                lineToRelative(0.0f, 0.0f)
                curveTo(136.7f, 341.2f, 165.1f, 352.0f, 192.0f, 352.0f)
                curveToRelative(27.5f, 0.0f, 55.0f, -10.6f, 77.5f, -26.1f)
                curveToRelative(11.1f, -7.9f, 25.9f, -7.9f, 37.0f, 0.0f)
                close()
            }
        }
        .build()
        return _personSwimming!!
    }

private var _personSwimming: ImageVector? = null
