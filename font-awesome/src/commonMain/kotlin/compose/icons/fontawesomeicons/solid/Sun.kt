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

public val SolidGroup.Sun: ImageVector
    get() {
        if (_sun != null) {
            return _sun!!
        }
        _sun = Builder(name = "Sun", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(361.5f, 1.2f)
                curveToRelative(5.0f, 2.1f, 8.6f, 6.6f, 9.6f, 11.9f)
                lineTo(391.0f, 121.0f)
                lineToRelative(107.9f, 19.8f)
                curveToRelative(5.3f, 1.0f, 9.8f, 4.6f, 11.9f, 9.6f)
                reflectiveCurveToRelative(1.5f, 10.7f, -1.6f, 15.2f)
                lineTo(446.9f, 256.0f)
                lineToRelative(62.3f, 90.3f)
                curveToRelative(3.1f, 4.5f, 3.7f, 10.2f, 1.6f, 15.2f)
                reflectiveCurveToRelative(-6.6f, 8.6f, -11.9f, 9.6f)
                lineTo(391.0f, 391.0f)
                lineTo(371.1f, 498.9f)
                curveToRelative(-1.0f, 5.3f, -4.6f, 9.8f, -9.6f, 11.9f)
                reflectiveCurveToRelative(-10.7f, 1.5f, -15.2f, -1.6f)
                lineTo(256.0f, 446.9f)
                lineToRelative(-90.3f, 62.3f)
                curveToRelative(-4.5f, 3.1f, -10.2f, 3.7f, -15.2f, 1.6f)
                reflectiveCurveToRelative(-8.6f, -6.6f, -9.6f, -11.9f)
                lineTo(121.0f, 391.0f)
                lineTo(13.1f, 371.1f)
                curveToRelative(-5.3f, -1.0f, -9.8f, -4.6f, -11.9f, -9.6f)
                reflectiveCurveToRelative(-1.5f, -10.7f, 1.6f, -15.2f)
                lineTo(65.1f, 256.0f)
                lineTo(2.8f, 165.7f)
                curveToRelative(-3.1f, -4.5f, -3.7f, -10.2f, -1.6f, -15.2f)
                reflectiveCurveToRelative(6.6f, -8.6f, 11.9f, -9.6f)
                lineTo(121.0f, 121.0f)
                lineTo(140.9f, 13.1f)
                curveToRelative(1.0f, -5.3f, 4.6f, -9.8f, 9.6f, -11.9f)
                reflectiveCurveToRelative(10.7f, -1.5f, 15.2f, 1.6f)
                lineTo(256.0f, 65.1f)
                lineTo(346.3f, 2.8f)
                curveToRelative(4.5f, -3.1f, 10.2f, -3.7f, 15.2f, -1.6f)
                close()
                moveTo(160.0f, 256.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, 192.0f, 0.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -192.0f, 0.0f)
                close()
                moveTo(384.0f, 256.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, -256.0f, 0.0f)
                arcToRelative(128.0f, 128.0f, 0.0f, true, false, 256.0f, 0.0f)
                close()
            }
        }
        .build()
        return _sun!!
    }

private var _sun: ImageVector? = null
