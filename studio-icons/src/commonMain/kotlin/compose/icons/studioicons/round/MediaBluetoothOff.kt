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

public val RoundGroup.MediaBluetoothOff: ImageVector
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
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f)
                horizontalLineToRelative(2.0f)
                curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(1.17f)
                lineTo(9.0f, 6.17f)
                close()
                moveTo(19.42f, 15.0f)
                lineToRelative(2.18f, 2.17f)
                curveToRelative(0.22f, 0.22f, 0.22f, 0.58f, 0.0f, 0.8f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.22f, 0.22f, -0.58f, 0.22f, -0.8f, 0.0f)
                lineToRelative(-5.98f, -5.98f)
                curveToRelative(-0.22f, -0.22f, -0.22f, -0.58f, 0.0f, -0.8f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.22f, -0.22f, 0.58f, -0.22f, 0.8f, 0.0f)
                lineToRelative(2.35f, 2.35f)
                verticalLineTo(9.61f)
                curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f)
                lineToRelative(2.82f, 2.82f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f)
                lineTo(19.42f, 15.0f)
                close()
                moveTo(19.17f, 13.55f)
                lineToRelative(1.13f, -1.13f)
                lineToRelative(-1.13f, -1.13f)
                verticalLineTo(13.55f)
                close()
                moveTo(20.49f, 20.49f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f)
                lineToRelative(-3.28f, -3.28f)
                lineToRelative(-0.16f, 0.16f)
                curveToRelative(-0.23f, 0.23f, -0.62f, 0.23f, -0.85f, 0.0f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(-0.23f, -0.23f, -0.23f, -0.62f, 0.0f, -0.85f)
                lineToRelative(0.16f, -0.16f)
                lineTo(11.0f, 13.83f)
                lineToRelative(0.0f, 3.02f)
                curveToRelative(0.0f, 2.07f, -1.68f, 4.01f, -3.74f, 4.14f)
                curveTo(4.94f, 21.13f, 3.0f, 19.29f, 3.0f, 17.0f)
                curveToRelative(0.0f, -2.21f, 1.79f, -4.0f, 4.01f, -4.0f)
                curveToRelative(0.73f, 0.0f, 1.41f, 0.21f, 2.0f, 0.55f)
                verticalLineToRelative(-1.72f)
                lineTo(2.1f, 4.92f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f)
                lineToRelative(0.0f, 0.0f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f)
                lineTo(20.49f, 20.49f)
                close()
            }
        }
        .build()
        return _mediaBluetoothOff!!
    }

private var _mediaBluetoothOff: ImageVector? = null
