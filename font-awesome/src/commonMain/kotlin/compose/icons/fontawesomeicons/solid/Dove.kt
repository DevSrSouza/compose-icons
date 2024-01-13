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

public val SolidGroup.Dove: ImageVector
    get() {
        if (_dove != null) {
            return _dove!!
        }
        _dove = Builder(name = "Dove", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(160.8f, 96.5f)
                curveToRelative(14.0f, 17.0f, 31.0f, 30.9f, 49.5f, 42.2f)
                curveToRelative(25.9f, 15.8f, 53.7f, 25.9f, 77.7f, 31.6f)
                lineTo(288.0f, 138.8f)
                curveTo(265.8f, 108.5f, 250.0f, 71.5f, 248.6f, 28.0f)
                curveToRelative(-0.4f, -11.3f, -7.5f, -21.5f, -18.4f, -24.4f)
                curveToRelative(-7.6f, -2.0f, -15.8f, -0.2f, -21.0f, 5.8f)
                curveToRelative(-13.3f, 15.4f, -32.7f, 44.6f, -48.4f, 87.2f)
                close()
                moveTo(320.0f, 144.0f)
                verticalLineToRelative(30.6f)
                lineToRelative(0.0f, 0.0f)
                verticalLineToRelative(1.3f)
                lineToRelative(0.0f, 0.0f)
                lineToRelative(0.0f, 32.1f)
                curveToRelative(-60.8f, -5.1f, -185.0f, -43.8f, -219.3f, -157.2f)
                curveTo(97.4f, 40.0f, 87.9f, 32.0f, 76.6f, 32.0f)
                curveToRelative(-7.9f, 0.0f, -15.3f, 3.9f, -18.8f, 11.0f)
                curveTo(46.8f, 65.9f, 32.0f, 112.1f, 32.0f, 176.0f)
                curveToRelative(0.0f, 116.9f, 80.1f, 180.5f, 118.4f, 202.8f)
                lineTo(11.8f, 416.6f)
                curveTo(6.7f, 418.0f, 2.6f, 421.8f, 0.9f, 426.8f)
                reflectiveCurveToRelative(-0.8f, 10.6f, 2.3f, 14.8f)
                curveTo(21.7f, 466.2f, 77.3f, 512.0f, 160.0f, 512.0f)
                curveToRelative(3.6f, 0.0f, 7.2f, -1.2f, 10.0f, -3.5f)
                lineTo(245.6f, 448.0f)
                lineTo(320.0f, 448.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, -71.6f, 160.0f, -160.0f)
                lineTo(480.0f, 128.0f)
                lineToRelative(29.9f, -44.9f)
                curveToRelative(1.3f, -2.0f, 2.1f, -4.4f, 2.1f, -6.8f)
                curveToRelative(0.0f, -6.8f, -5.5f, -12.3f, -12.3f, -12.3f)
                lineTo(400.0f, 64.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.8f, -80.0f, 80.0f)
                close()
                moveTo(400.0f, 128.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, 32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 0.0f, -32.0f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
