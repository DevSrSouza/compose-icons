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

public val SharpGroup.MediaBluetoothOn: ImageVector
    get() {
        if (_mediaBluetoothOn != null) {
            return _mediaBluetoothOn!!
        }
        _mediaBluetoothOn = Builder(name = "MediaBluetoothOn", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 3.0f)
                lineToRelative(0.01f, 10.55f)
                curveToRelative(-0.6f, -0.34f, -1.28f, -0.55f, -2.0f, -0.55f)
                curveTo(4.79f, 13.0f, 3.0f, 14.79f, 3.0f, 17.0f)
                reflectiveCurveToRelative(1.79f, 4.0f, 4.01f, 4.0f)
                reflectiveCurveTo(11.0f, 19.21f, 11.0f, 17.0f)
                verticalLineTo(7.0f)
                horizontalLineToRelative(4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(9.0f)
                close()
                moveTo(21.0f, 12.43f)
                lineTo(17.57f, 9.0f)
                horizontalLineToRelative(-0.6f)
                verticalLineToRelative(4.55f)
                lineToRelative(-2.75f, -2.75f)
                lineToRelative(-0.85f, 0.85f)
                lineTo(16.73f, 15.0f)
                lineToRelative(-3.35f, 3.35f)
                lineToRelative(0.85f, 0.85f)
                lineToRelative(2.75f, -2.75f)
                verticalLineTo(21.0f)
                horizontalLineToRelative(0.6f)
                lineTo(21.0f, 17.57f)
                lineTo(18.42f, 15.0f)
                lineTo(21.0f, 12.43f)
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
