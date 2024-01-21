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

public val SolidGroup.TrainTram: ImageVector
    get() {
        if (_trainTram != null) {
            return _trainTram!!
        }
        _trainTram = Builder(name = "TrainTram", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(86.8f, 48.0f)
                curveToRelative(-12.2f, 0.0f, -23.6f, 5.5f, -31.2f, 15.0f)
                lineTo(42.7f, 79.0f)
                curveTo(34.5f, 89.3f, 19.4f, 91.0f, 9.0f, 82.7f)
                reflectiveCurveTo(-3.0f, 59.4f, 5.3f, 49.0f)
                lineTo(18.0f, 33.0f)
                curveTo(34.7f, 12.2f, 60.0f, 0.0f, 86.8f, 0.0f)
                lineTo(361.2f, 0.0f)
                curveToRelative(26.7f, 0.0f, 52.0f, 12.2f, 68.7f, 33.0f)
                lineToRelative(12.8f, 16.0f)
                curveToRelative(8.3f, 10.4f, 6.6f, 25.5f, -3.8f, 33.7f)
                reflectiveCurveToRelative(-25.5f, 6.6f, -33.7f, -3.7f)
                lineTo(392.5f, 63.0f)
                curveToRelative(-7.6f, -9.5f, -19.1f, -15.0f, -31.2f, -15.0f)
                lineTo(248.0f, 48.0f)
                lineTo(248.0f, 96.0f)
                horizontalLineToRelative(40.0f)
                curveToRelative(53.0f, 0.0f, 96.0f, 43.0f, 96.0f, 96.0f)
                lineTo(384.0f, 352.0f)
                curveToRelative(0.0f, 30.6f, -14.3f, 57.8f, -36.6f, 75.4f)
                lineToRelative(65.5f, 65.5f)
                curveToRelative(7.1f, 7.1f, 2.1f, 19.1f, -7.9f, 19.1f)
                lineTo(365.3f, 512.0f)
                curveToRelative(-8.5f, 0.0f, -16.6f, -3.4f, -22.6f, -9.4f)
                lineTo(288.0f, 448.0f)
                lineTo(160.0f, 448.0f)
                lineToRelative(-54.6f, 54.6f)
                curveToRelative(-6.0f, 6.0f, -14.1f, 9.4f, -22.6f, 9.4f)
                lineTo(43.0f, 512.0f)
                curveToRelative(-10.0f, 0.0f, -15.0f, -12.1f, -7.9f, -19.1f)
                lineToRelative(65.5f, -65.5f)
                curveTo(78.3f, 409.8f, 64.0f, 382.6f, 64.0f, 352.0f)
                lineTo(64.0f, 192.0f)
                curveToRelative(0.0f, -53.0f, 43.0f, -96.0f, 96.0f, -96.0f)
                horizontalLineToRelative(40.0f)
                lineTo(200.0f, 48.0f)
                lineTo(86.8f, 48.0f)
                close()
                moveTo(160.0f, 160.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(32.0f)
                curveToRelative(0.0f, 17.7f, 14.3f, 32.0f, 32.0f, 32.0f)
                lineTo(288.0f, 256.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, -14.3f, 32.0f, -32.0f)
                lineTo(320.0f, 192.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                lineTo(160.0f, 160.0f)
                close()
                moveTo(192.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, -64.0f, 0.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 64.0f, 0.0f)
                close()
                moveTo(288.0f, 384.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -64.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _trainTram!!
    }

private var _trainTram: ImageVector? = null
