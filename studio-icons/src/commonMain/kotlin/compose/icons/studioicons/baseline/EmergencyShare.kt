package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.EmergencyShare: ImageVector
    get() {
        if (_emergencyShare != null) {
            return _emergencyShare!!
        }
        _emergencyShare = Builder(name = "EmergencyShare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                curveToRelative(-3.15f, 0.0f, -6.0f, 2.41f, -6.0f, 6.15f)
                curveToRelative(0.0f, 2.49f, 2.0f, 5.44f, 6.0f, 8.85f)
                curveToRelative(4.0f, -3.41f, 6.0f, -6.36f, 6.0f, -8.85f)
                curveTo(18.0f, 11.41f, 15.15f, 9.0f, 12.0f, 9.0f)
                close()
                moveTo(12.0f, 16.5f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(12.83f, 16.5f, 12.0f, 16.5f)
                close()
                moveTo(12.0f, 4.0f)
                curveToRelative(1.93f, 0.0f, 3.68f, 0.78f, 4.95f, 2.05f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(14.63f, 6.56f, 13.38f, 6.0f, 12.0f, 6.0f)
                reflectiveCurveTo(9.37f, 6.56f, 8.46f, 7.46f)
                lineTo(7.05f, 6.05f)
                curveTo(8.32f, 4.78f, 10.07f, 4.0f, 12.0f, 4.0f)
                close()
                moveTo(19.78f, 3.23f)
                lineToRelative(-1.41f, 1.41f)
                curveTo(16.74f, 3.01f, 14.49f, 2.0f, 12.01f, 2.0f)
                reflectiveCurveTo(7.27f, 3.01f, 5.64f, 4.63f)
                lineTo(4.22f, 3.22f)
                curveTo(6.22f, 1.23f, 8.97f, 0.0f, 12.01f, 0.0f)
                reflectiveCurveTo(17.79f, 1.23f, 19.78f, 3.23f)
                close()
            }
        }
        .build()
        return _emergencyShare!!
    }

private var _emergencyShare: ImageVector? = null
