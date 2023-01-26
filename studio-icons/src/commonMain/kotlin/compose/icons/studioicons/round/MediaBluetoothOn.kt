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

public val RoundGroup.MediaBluetoothOn: ImageVector
    get() {
        if (_mediaBluetoothOn != null) {
            return _mediaBluetoothOn!!
        }
        _mediaBluetoothOn = Builder(name = "MediaBluetoothOn", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                lineToRelative(0.01f, 8.55f)
                curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2.0f, -0.55f)
                curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f)
                reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f)
                horizontalLineToRelative(-2.0f)
                curveTo(9.9f, 3.0f, 9.0f, 3.9f, 9.0f, 5.0f)
                close()
                moveTo(20.29f, 11.72f)
                lineToRelative(-2.47f, -2.47f)
                curveToRelative(-0.32f, -0.31f, -0.85f, -0.09f, -0.85f, 0.35f)
                verticalLineToRelative(3.94f)
                lineToRelative(-2.33f, -2.33f)
                curveToRelative(-0.23f, -0.23f, -0.61f, -0.23f, -0.85f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.23f, 0.23f, -0.23f, 0.62f, 0.0f, 0.85f)
                lineTo(16.73f, 15.0f)
                lineToRelative(-2.93f, 2.93f)
                curveToRelative(-0.23f, 0.23f, -0.23f, 0.61f, 0.0f, 0.85f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.23f, 0.23f, 0.61f, 0.23f, 0.85f, 0.0f)
                lineToRelative(2.33f, -2.33f)
                verticalLineToRelative(3.94f)
                curveToRelative(0.0f, 0.45f, 0.54f, 0.67f, 0.85f, 0.35f)
                lineToRelative(2.46f, -2.46f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f)
                lineTo(18.42f, 15.0f)
                lineToRelative(1.87f, -1.86f)
                curveTo(20.68f, 12.75f, 20.68f, 12.11f, 20.29f, 11.72f)
                close()
                moveTo(18.17f, 11.3f)
                lineToRelative(1.13f, 1.13f)
                lineToRelative(-1.13f, 1.13f)
                verticalLineTo(11.3f)
                close()
                moveTo(19.3f, 17.57f)
                lineToRelative(-1.13f, 1.13f)
                verticalLineToRelative(-2.26f)
                lineTo(19.3f, 17.57f)
                close()
            }
        }
        .build()
        return _mediaBluetoothOn!!
    }

private var _mediaBluetoothOn: ImageVector? = null
