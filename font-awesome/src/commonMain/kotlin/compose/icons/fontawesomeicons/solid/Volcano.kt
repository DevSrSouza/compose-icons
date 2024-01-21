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

public val SolidGroup.Volcano: ImageVector
    get() {
        if (_volcano != null) {
            return _volcano!!
        }
        _volcano = Builder(name = "Volcano", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.0f, 144.0f)
                curveToRelative(-35.3f, 0.0f, -64.0f, -28.7f, -64.0f, -64.0f)
                reflectiveCurveToRelative(28.7f, -64.0f, 64.0f, -64.0f)
                curveToRelative(15.7f, 0.0f, 30.0f, 5.6f, 41.2f, 15.0f)
                curveTo(212.4f, 12.4f, 232.7f, 0.0f, 256.0f, 0.0f)
                reflectiveCurveToRelative(43.6f, 12.4f, 54.8f, 31.0f)
                curveTo(322.0f, 21.6f, 336.3f, 16.0f, 352.0f, 16.0f)
                curveToRelative(35.3f, 0.0f, 64.0f, 28.7f, 64.0f, 64.0f)
                reflectiveCurveToRelative(-28.7f, 64.0f, -64.0f, 64.0f)
                curveToRelative(-14.7f, 0.0f, -28.3f, -5.0f, -39.1f, -13.3f)
                lineToRelative(-32.0f, 48.0f)
                curveTo(275.3f, 187.0f, 266.0f, 192.0f, 256.0f, 192.0f)
                reflectiveCurveToRelative(-19.3f, -5.0f, -24.9f, -13.3f)
                lineToRelative(-32.0f, -48.0f)
                curveTo(188.3f, 139.0f, 174.7f, 144.0f, 160.0f, 144.0f)
                close()
                moveTo(144.0f, 352.0f)
                lineToRelative(48.4f, -24.2f)
                curveToRelative(10.2f, -5.1f, 21.6f, -7.8f, 33.0f, -7.8f)
                curveToRelative(19.6f, 0.0f, 38.4f, 7.8f, 52.2f, 21.6f)
                lineToRelative(32.5f, 32.5f)
                curveToRelative(6.3f, 6.3f, 14.9f, 9.9f, 23.8f, 9.9f)
                curveToRelative(11.3f, 0.0f, 21.8f, -5.6f, 28.0f, -15.0f)
                lineToRelative(9.7f, -14.6f)
                lineToRelative(-58.9f, -66.3f)
                curveToRelative(-9.1f, -10.2f, -22.2f, -16.1f, -35.9f, -16.1f)
                lineTo(235.1f, 272.0f)
                curveToRelative(-13.7f, 0.0f, -26.8f, 5.9f, -35.9f, 16.1f)
                lineToRelative(-59.9f, 67.4f)
                lineTo(144.0f, 352.0f)
                close()
                moveTo(163.4f, 256.2f)
                curveToRelative(18.2f, -20.5f, 44.3f, -32.2f, 71.8f, -32.2f)
                horizontalLineToRelative(41.8f)
                curveToRelative(27.4f, 0.0f, 53.5f, 11.7f, 71.8f, 32.2f)
                lineToRelative(150.2f, 169.0f)
                curveToRelative(8.5f, 9.5f, 13.2f, 21.9f, 13.2f, 34.7f)
                curveToRelative(0.0f, 28.8f, -23.4f, 52.2f, -52.2f, 52.2f)
                lineTo(52.2f, 512.1f)
                curveTo(23.4f, 512.0f, 0.0f, 488.6f, 0.0f, 459.8f)
                curveToRelative(0.0f, -12.8f, 4.7f, -25.1f, 13.2f, -34.7f)
                lineToRelative(150.2f, -169.0f)
                close()
            }
        }
        .build()
        return _volcano!!
    }

private var _volcano: ImageVector? = null
