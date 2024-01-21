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

public val SolidGroup.PlaneLock: ImageVector
    get() {
        if (_planeLock != null) {
            return _planeLock!!
        }
        _planeLock = Builder(name = "PlaneLock", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 93.7f)
                curveTo(192.0f, 59.5f, 221.0f, 0.0f, 256.0f, 0.0f)
                curveToRelative(36.0f, 0.0f, 64.0f, 59.5f, 64.0f, 93.7f)
                verticalLineToRelative(84.6f)
                lineToRelative(101.8f, 58.2f)
                curveTo(418.0f, 247.6f, 416.0f, 259.6f, 416.0f, 272.0f)
                verticalLineToRelative(24.6f)
                curveToRelative(-17.9f, 10.4f, -30.3f, 29.1f, -31.8f, 50.9f)
                lineTo(320.0f, 329.1f)
                lineTo(320.0f, 400.0f)
                lineToRelative(57.6f, 43.2f)
                curveToRelative(4.0f, 3.0f, 6.4f, 7.8f, 6.4f, 12.8f)
                verticalLineToRelative(24.0f)
                verticalLineToRelative(18.0f)
                curveToRelative(0.0f, 7.8f, -6.3f, 14.0f, -14.0f, 14.0f)
                curveToRelative(-1.3f, 0.0f, -2.6f, -0.2f, -3.9f, -0.5f)
                lineTo(256.0f, 480.0f)
                lineTo(145.9f, 511.5f)
                curveToRelative(-1.3f, 0.4f, -2.6f, 0.5f, -3.9f, 0.5f)
                curveToRelative(-7.8f, 0.0f, -14.0f, -6.3f, -14.0f, -14.0f)
                lineTo(128.0f, 456.0f)
                curveToRelative(0.0f, -5.0f, 2.4f, -9.8f, 6.4f, -12.8f)
                lineTo(192.0f, 400.0f)
                lineToRelative(0.0f, -70.9f)
                lineToRelative(-171.6f, 49.0f)
                curveTo(10.2f, 381.1f, 0.0f, 373.4f, 0.0f, 362.8f)
                lineTo(0.0f, 297.3f)
                curveToRelative(0.0f, -5.7f, 3.1f, -11.0f, 8.1f, -13.9f)
                lineTo(192.0f, 178.3f)
                lineTo(192.0f, 93.7f)
                close()
                moveTo(528.0f, 240.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, 14.3f, -32.0f, 32.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(64.0f)
                lineTo(560.0f, 272.0f)
                curveToRelative(0.0f, -17.7f, -14.3f, -32.0f, -32.0f, -32.0f)
                close()
                moveTo(448.0f, 272.0f)
                curveToRelative(0.0f, -44.2f, 35.8f, -80.0f, 80.0f, -80.0f)
                reflectiveCurveToRelative(80.0f, 35.8f, 80.0f, 80.0f)
                verticalLineToRelative(48.0f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.3f, 32.0f, 32.0f)
                lineTo(640.0f, 480.0f)
                curveToRelative(0.0f, 17.7f, -14.3f, 32.0f, -32.0f, 32.0f)
                lineTo(448.0f, 512.0f)
                curveToRelative(-17.7f, 0.0f, -32.0f, -14.3f, -32.0f, -32.0f)
                lineTo(416.0f, 352.0f)
                curveToRelative(0.0f, -17.7f, 14.3f, -32.0f, 32.0f, -32.0f)
                lineTo(448.0f, 272.0f)
                close()
            }
        }
        .build()
        return _planeLock!!
    }

private var _planeLock: ImageVector? = null
