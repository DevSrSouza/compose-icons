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

public val SolidGroup.TruckRampBox: ImageVector
    get() {
        if (_truckRampBox != null) {
            return _truckRampBox!!
        }
        _truckRampBox = Builder(name = "TruckRampBox", defaultWidth = 640.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(640.0f, 0.0f)
                verticalLineTo(400.0f)
                curveToRelative(0.0f, 61.9f, -50.1f, 112.0f, -112.0f, 112.0f)
                curveToRelative(-61.0f, 0.0f, -110.5f, -48.7f, -112.0f, -109.3f)
                lineTo(48.4f, 502.9f)
                curveToRelative(-17.1f, 4.6f, -34.6f, -5.4f, -39.3f, -22.5f)
                reflectiveCurveToRelative(5.4f, -34.6f, 22.5f, -39.3f)
                lineTo(352.0f, 353.8f)
                verticalLineTo(64.0f)
                curveToRelative(0.0f, -35.3f, 28.7f, -64.0f, 64.0f, -64.0f)
                horizontalLineTo(640.0f)
                close()
                moveTo(576.0f, 400.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, -96.0f, 0.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, true, false, 96.0f, 0.0f)
                close()
                moveTo(23.1f, 207.7f)
                curveToRelative(-4.6f, -17.1f, 5.6f, -34.6f, 22.6f, -39.2f)
                lineToRelative(46.4f, -12.4f)
                lineToRelative(20.7f, 77.3f)
                curveToRelative(2.3f, 8.5f, 11.1f, 13.6f, 19.6f, 11.3f)
                lineToRelative(30.9f, -8.3f)
                curveToRelative(8.5f, -2.3f, 13.6f, -11.1f, 11.3f, -19.6f)
                lineToRelative(-20.7f, -77.3f)
                lineToRelative(46.4f, -12.4f)
                curveToRelative(17.1f, -4.6f, 34.6f, 5.6f, 39.2f, 22.6f)
                lineToRelative(41.4f, 154.5f)
                curveToRelative(4.6f, 17.1f, -5.6f, 34.6f, -22.6f, 39.2f)
                lineTo(103.7f, 384.9f)
                curveToRelative(-17.1f, 4.6f, -34.6f, -5.6f, -39.2f, -22.6f)
                lineTo(23.1f, 207.7f)
                close()
            }
        }
        .build()
        return _truckRampBox!!
    }

private var _truckRampBox: ImageVector? = null
