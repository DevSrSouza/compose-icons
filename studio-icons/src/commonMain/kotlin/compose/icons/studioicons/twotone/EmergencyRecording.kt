package compose.icons.studioicons.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.TwotoneGroup

public val TwotoneGroup.EmergencyRecording: ImageVector
    get() {
        if (_emergencyRecording != null) {
            return _emergencyRecording!!
        }
        _emergencyRecording = Builder(name = "EmergencyRecording", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.3f, strokeAlpha
                    = 0.3f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(4.0f)
                close()
                moveTo(15.0f, 13.73f)
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
                lineTo(15.0f, 13.73f)
                close()
            }
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
                lineToRelative(4.0f, 3.98f)
                verticalLineToRelative(-11.0f)
                lineTo(18.0f, 10.48f)
                close()
                moveTo(16.0f, 18.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(12.0f)
                verticalLineTo(18.0f)
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
