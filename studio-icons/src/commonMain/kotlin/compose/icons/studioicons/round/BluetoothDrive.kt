package compose.icons.studioicons.round

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
import compose.icons.studioicons.RoundGroup

public val RoundGroup.BluetoothDrive: ImageVector
    get() {
        if (_bluetoothDrive != null) {
            return _bluetoothDrive!!
        }
        _bluetoothDrive = Builder(name = "BluetoothDrive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.85f, 6.0f)
                lineToRelative(1.8f, -1.8f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0.0f, -0.71f)
                lineTo(19.5f, 1.36f)
                curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                verticalLineToRelative(3.08f)
                lineTo(16.7f, 2.85f)
                curveToRelative(-0.19f, -0.19f, -0.51f, -0.19f, -0.7f, 0.0f)
                curveToRelative(-0.19f, 0.19f, -0.19f, 0.51f, 0.0f, 0.7f)
                lineTo(18.44f, 6.0f)
                lineTo(16.0f, 8.44f)
                curveToRelative(-0.19f, 0.19f, -0.19f, 0.5f, 0.0f, 0.7f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.0f)
                lineToRelative(1.95f, -1.95f)
                verticalLineToRelative(3.09f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.14f, -2.15f)
                curveToRelative(0.2f, -0.2f, 0.19f, -0.51f, 0.0f, -0.71f)
                lineTo(19.85f, 6.0f)
                close()
                moveTo(19.65f, 2.91f)
                lineToRelative(0.94f, 0.94f)
                lineToRelative(-0.94f, 0.94f)
                verticalLineTo(2.91f)
                close()
                moveTo(19.65f, 9.08f)
                verticalLineTo(7.2f)
                lineToRelative(0.94f, 0.94f)
                lineTo(19.65f, 9.08f)
                close()
            }
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
                verticalLineToRelative(7.5f)
                curveTo(2.0f, 20.33f, 2.67f, 21.0f, 3.5f, 21.0f)
                reflectiveCurveTo(5.0f, 20.33f, 5.0f, 19.5f)
                verticalLineTo(19.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(12.0f)
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
        }
        .build()
        return _bluetoothDrive!!
    }

private var _bluetoothDrive: ImageVector? = null
