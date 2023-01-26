package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.MediaBluetoothOff: ImageVector
    get() {
        if (_mediaBluetoothOff != null) {
            return _mediaBluetoothOff!!
        }
        _mediaBluetoothOff = Builder(name = "MediaBluetoothOff", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 6.17f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(6.0f)
                verticalLineToRelative(4.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(1.17f)
                lineTo(9.0f, 6.17f)
                close()
                moveTo(19.42f, 15.0f)
                lineTo(22.0f, 17.57f)
                lineToRelative(-0.8f, 0.8f)
                lineToRelative(-6.78f, -6.78f)
                lineToRelative(0.8f, -0.8f)
                lineToRelative(2.75f, 2.75f)
                verticalLineTo(9.0f)
                horizontalLineToRelative(0.6f)
                lineTo(22.0f, 12.43f)
                lineTo(19.42f, 15.0f)
                close()
                moveTo(19.17f, 13.55f)
                lineToRelative(1.13f, -1.13f)
                lineToRelative(-1.13f, -1.13f)
                verticalLineTo(13.55f)
                close()
                moveTo(21.19f, 21.19f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(-3.98f, -3.98f)
                lineToRelative(-0.58f, 0.58f)
                lineToRelative(-0.85f, -0.85f)
                lineToRelative(0.58f, -0.58f)
                lineTo(11.0f, 13.83f)
                verticalLineTo(17.0f)
                curveToRelative(0.0f, 2.21f, -1.78f, 4.0f, -3.99f, 4.0f)
                reflectiveCurveTo(3.0f, 19.21f, 3.0f, 17.0f)
                reflectiveCurveToRelative(1.79f, -4.0f, 4.01f, -4.0f)
                curveToRelative(0.73f, 0.0f, 1.41f, 0.21f, 2.0f, 0.55f)
                verticalLineToRelative(-1.72f)
                lineTo(1.39f, 4.22f)
                lineTo(2.8f, 2.81f)
                lineTo(21.19f, 21.19f)
                close()
            }
        }
        .build()
        return _mediaBluetoothOff!!
    }

private var _mediaBluetoothOff: ImageVector? = null
