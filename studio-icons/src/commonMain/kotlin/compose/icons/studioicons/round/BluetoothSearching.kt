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

public val RoundGroup.BluetoothSearching: ImageVector
    get() {
        if (_bluetoothSearching != null) {
            return _bluetoothSearching!!
        }
        _bluetoothSearching = Builder(name = "BluetoothSearching", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.98f, 10.28f)
                lineToRelative(-1.38f, 1.38f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0.0f, 0.71f)
                lineToRelative(1.38f, 1.38f)
                curveToRelative(0.28f, 0.28f, 0.75f, 0.15f, 0.85f, -0.23f)
                curveToRelative(0.11f, -0.5f, 0.17f, -1.0f, 0.17f, -1.52f)
                curveToRelative(0.0f, -0.51f, -0.06f, -1.01f, -0.18f, -1.48f)
                curveToRelative(-0.09f, -0.38f, -0.56f, -0.52f, -0.84f, -0.24f)
                close()
                moveTo(20.1f, 7.78f)
                curveToRelative(-0.25f, -0.55f, -0.98f, -0.67f, -1.4f, -0.24f)
                curveToRelative(-0.26f, 0.26f, -0.31f, 0.64f, -0.17f, 0.98f)
                curveToRelative(0.46f, 1.07f, 0.72f, 2.24f, 0.72f, 3.47f)
                curveToRelative(0.0f, 1.24f, -0.26f, 2.42f, -0.73f, 3.49f)
                curveToRelative(-0.14f, 0.32f, -0.09f, 0.69f, 0.16f, 0.94f)
                curveToRelative(0.41f, 0.41f, 1.1f, 0.29f, 1.35f, -0.23f)
                curveToRelative(0.63f, -1.3f, 0.98f, -2.76f, 0.98f, -4.3f)
                curveToRelative(-0.01f, -1.45f, -0.33f, -2.85f, -0.91f, -4.11f)
                close()
                moveTo(11.41f, 12.0f)
                lineTo(15.0f, 8.42f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineToRelative(-4.29f, -4.29f)
                curveToRelative(-0.63f, -0.63f, -1.71f, -0.19f, -1.71f, 0.7f)
                verticalLineToRelative(6.18f)
                lineTo(5.11f, 5.7f)
                curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                lineTo(8.59f, 12.0f)
                lineTo(3.7f, 16.89f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f)
                lineTo(9.0f, 14.41f)
                verticalLineToRelative(6.18f)
                curveToRelative(0.0f, 0.89f, 1.08f, 1.34f, 1.71f, 0.71f)
                lineTo(15.0f, 17.0f)
                curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.42f)
                lineTo(11.41f, 12.0f)
                close()
                moveTo(11.0f, 5.83f)
                lineToRelative(1.88f, 1.88f)
                lineTo(11.0f, 9.59f)
                lineTo(11.0f, 5.83f)
                close()
                moveTo(11.0f, 18.17f)
                verticalLineToRelative(-3.76f)
                lineToRelative(1.88f, 1.88f)
                lineTo(11.0f, 18.17f)
                close()
            }
        }
        .build()
        return _bluetoothSearching!!
    }

private var _bluetoothSearching: ImageVector? = null
