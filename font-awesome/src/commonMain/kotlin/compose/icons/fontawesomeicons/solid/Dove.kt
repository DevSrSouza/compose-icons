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
                moveTo(288.0f, 167.2f)
                verticalLineToRelative(-28.1f)
                curveToRelative(-28.2f, -36.3f, -47.1f, -79.3f, -54.1f, -125.2f)
                curveToRelative(-2.1f, -13.5f, -19.0f, -18.8f, -27.8f, -8.3f)
                curveToRelative(-21.1f, 24.9f, -37.7f, 54.1f, -48.9f, 86.5f)
                curveToRelative(34.2f, 38.3f, 80.0f, 64.6f, 130.8f, 75.1f)
                close()
                moveTo(400.0f, 64.0f)
                curveToRelative(-44.2f, 0.0f, -80.0f, 35.9f, -80.0f, 80.1f)
                verticalLineToRelative(59.4f)
                curveTo(215.6f, 197.3f, 127.0f, 133.0f, 87.0f, 41.8f)
                curveToRelative(-5.5f, -12.5f, -23.2f, -13.2f, -29.0f, -0.9f)
                curveTo(41.4f, 76.0f, 32.0f, 115.2f, 32.0f, 156.6f)
                curveToRelative(0.0f, 70.8f, 34.1f, 136.9f, 85.1f, 185.9f)
                curveToRelative(13.2f, 12.7f, 26.1f, 23.2f, 38.9f, 32.8f)
                lineToRelative(-143.9f, 36.0f)
                curveTo(1.4f, 414.0f, -3.4f, 426.4f, 2.6f, 435.7f)
                curveTo(20.0f, 462.6f, 63.0f, 508.2f, 155.8f, 512.0f)
                curveToRelative(8.0f, 0.3f, 16.0f, -2.6f, 22.1f, -7.9f)
                lineToRelative(65.2f, -56.1f)
                lineTo(320.0f, 448.0f)
                curveToRelative(88.4f, 0.0f, 160.0f, -71.5f, 160.0f, -159.9f)
                lineTo(480.0f, 128.0f)
                lineToRelative(32.0f, -64.0f)
                lineTo(400.0f, 64.0f)
                close()
                moveTo(400.0f, 160.1f)
                curveToRelative(-8.8f, 0.0f, -16.0f, -7.2f, -16.0f, -16.0f)
                reflectiveCurveToRelative(7.2f, -16.0f, 16.0f, -16.0f)
                reflectiveCurveToRelative(16.0f, 7.2f, 16.0f, 16.0f)
                reflectiveCurveToRelative(-7.2f, 16.0f, -16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _dove!!
    }

private var _dove: ImageVector? = null
