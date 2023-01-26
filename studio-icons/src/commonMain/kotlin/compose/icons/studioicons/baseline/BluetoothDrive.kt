package compose.icons.studioicons.baseline

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
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.BluetoothDrive: ImageVector
    get() {
        if (_bluetoothDrive != null) {
            return _bluetoothDrive!!
        }
        _bluetoothDrive = Builder(name = "BluetoothDrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 10.0f)
                horizontalLineTo(4.81f)
                lineToRelative(1.04f, -3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.5f)
                curveTo(4.84f, 5.0f, 4.29f, 5.42f, 4.08f, 6.01f)
                lineTo(2.0f, 12.0f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-1.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(1.0f)
                curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(-3.0f)
                curveTo(15.9f, 12.0f, 15.0f, 11.1f, 15.0f, 10.0f)
                close()
                moveTo(6.5f, 16.0f)
                curveTo(5.67f, 16.0f, 5.0f, 15.33f, 5.0f, 14.5f)
                reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f)
                reflectiveCurveTo(8.0f, 13.67f, 8.0f, 14.5f)
                reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f)
                close()
                moveTo(15.5f, 16.0f)
                curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.0f, 3.85f)
                lineTo(19.15f, 1.0f)
                horizontalLineToRelative(-0.5f)
                verticalLineToRelative(3.79f)
                lineToRelative(-2.3f, -2.29f)
                lineToRelative(-0.7f, 0.7f)
                lineTo(18.44f, 6.0f)
                lineToRelative(-2.79f, 2.79f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(2.3f, -2.3f)
                verticalLineTo(11.0f)
                horizontalLineToRelative(0.5f)
                lineTo(22.0f, 8.14f)
                lineTo(19.85f, 6.0f)
                lineTo(22.0f, 3.85f)
                close()
                moveTo(19.65f, 2.91f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(2.91f)
                close()
                moveTo(20.59f, 8.14f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(7.2f)
                lineTo(20.59f, 8.14f)
                close()
            }
        }
        .build()
        return _bluetoothDrive!!
    }

private var _bluetoothDrive: ImageVector? = null
