package compose.icons.studioicons.round

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.RoundGroup

public val RoundGroup.EmergencyRecording: ImageVector
    get() {
        if (_emergencyRecording != null) {
            return _emergencyRecording!!
        }
        _emergencyRecording = Builder(name = "EmergencyRecording", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.48f)
                verticalLineTo(6.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 4.0f, 2.0f, 4.9f, 2.0f, 6.0f)
                verticalLineToRelative(12.0f)
                curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(-4.48f)
                lineToRelative(3.15f, 3.13f)
                curveTo(21.46f, 16.97f, 22.0f, 16.74f, 22.0f, 16.3f)
                verticalLineTo(7.7f)
                curveToRelative(0.0f, -0.44f, -0.54f, -0.67f, -0.85f, -0.35f)
                lineTo(18.0f, 10.48f)
                close()
                moveTo(14.5f, 14.6f)
                curveToRelative(-0.28f, 0.48f, -0.89f, 0.64f, -1.37f, 0.37f)
                lineTo(11.0f, 13.73f)
                verticalLineTo(16.0f)
                curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                reflectiveCurveToRelative(-1.0f, -0.45f, -1.0f, -1.0f)
                verticalLineToRelative(-2.27f)
                lineToRelative(-2.13f, 1.23f)
                curveToRelative(-0.48f, 0.28f, -1.09f, 0.11f, -1.37f, -0.37f)
                curveToRelative(-0.28f, -0.48f, -0.11f, -1.09f, 0.37f, -1.37f)
                lineTo(8.0f, 12.0f)
                lineToRelative(-2.13f, -1.23f)
                curveTo(5.39f, 10.49f, 5.22f, 9.88f, 5.5f, 9.4f)
                curveToRelative(0.28f, -0.48f, 0.89f, -0.64f, 1.37f, -0.37f)
                lineTo(9.0f, 10.27f)
                verticalLineTo(8.0f)
                curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
                reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
                verticalLineToRelative(2.27f)
                lineToRelative(2.13f, -1.23f)
                curveToRelative(0.48f, -0.28f, 1.09f, -0.11f, 1.37f, 0.37f)
                curveToRelative(0.28f, 0.48f, 0.11f, 1.09f, -0.37f, 1.37f)
                lineTo(12.0f, 12.0f)
                lineToRelative(2.13f, 1.23f)
                curveTo(14.61f, 13.51f, 14.78f, 14.12f, 14.5f, 14.6f)
                close()
            }
        }
        .build()
        return _emergencyRecording!!
    }

private var _emergencyRecording: ImageVector? = null
