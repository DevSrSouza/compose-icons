package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.EmergencyRecording: ImageVector
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
                verticalLineTo(4.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(-6.48f)
                lineToRelative(4.0f, 3.98f)
                verticalLineToRelative(-11.0f)
                lineTo(18.0f, 10.48f)
                close()
                moveTo(12.0f, 12.0f)
                lineToRelative(3.0f, 1.73f)
                lineToRelative(-1.0f, 1.73f)
                lineToRelative(-3.0f, -1.73f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-3.27f)
                lineToRelative(-3.0f, 1.73f)
                lineToRelative(-1.0f, -1.73f)
                lineTo(8.0f, 12.0f)
                lineToRelative(-3.0f, -1.73f)
                lineToRelative(1.0f, -1.73f)
                lineToRelative(3.0f, 1.73f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(3.27f)
                lineToRelative(3.0f, -1.73f)
                lineToRelative(1.0f, 1.73f)
                lineTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _emergencyRecording!!
    }

private var _emergencyRecording: ImageVector? = null
