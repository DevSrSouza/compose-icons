package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Wasmcloud: ImageVector
    get() {
        if (_wasmcloud != null) {
            return _wasmcloud!!
        }
        _wasmcloud = Builder(name = "Wasmcloud", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.805f, 5.477f)
                lineTo(12.797f, 0.215f)
                arcToRelative(1.591f, 1.591f, 0.0f, false, false, -1.6f, 0.0f)
                lineTo(2.19f, 5.477f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, -0.697f, 1.215f)
                verticalLineToRelative(10.604f)
                arcToRelative(1.438f, 1.438f, 0.0f, false, false, 0.715f, 1.243f)
                lineToRelative(9.023f, 5.251f)
                arcToRelative(1.553f, 1.553f, 0.0f, false, false, 1.558f, 0.0f)
                lineToRelative(8.998f, -5.25f)
                arcToRelative(1.438f, 1.438f, 0.0f, false, false, 0.72f, -1.244f)
                lineTo(22.507f, 6.692f)
                arcToRelative(1.41f, 1.41f, 0.0f, false, false, -0.702f, -1.215f)
                close()
                moveTo(19.804f, 15.905f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, -0.139f, 0.238f)
                lineToRelative(-7.527f, 4.388f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, -0.282f, 0.0f)
                lineToRelative(-7.524f, -4.385f)
                arcToRelative(0.29f, 0.29f, 0.0f, false, true, -0.14f, -0.257f)
                verticalLineToRelative(-7.8f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.138f, -0.239f)
                lineToRelative(2.732f, -1.6f)
                arcToRelative(0.284f, 0.284f, 0.0f, false, true, 0.279f, 0.0f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.14f, 0.242f)
                verticalLineToRelative(7.324f)
                lineToRelative(2.469f, -1.432f)
                verticalLineToRelative(-7.65f)
                arcToRelative(0.274f, 0.274f, 0.0f, false, true, 0.138f, -0.241f)
                lineToRelative(1.781f, -1.04f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.282f, 0.0f)
                lineToRelative(1.794f, 1.042f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.136f, 0.241f)
                verticalLineToRelative(7.642f)
                lineToRelative(2.455f, 1.43f)
                lineTo(16.536f, 6.484f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.141f, -0.24f)
                arcToRelative(0.28f, 0.28f, 0.0f, false, true, 0.28f, 0.0f)
                lineToRelative(2.731f, 1.603f)
                arcToRelative(0.277f, 0.277f, 0.0f, false, true, 0.139f, 0.239f)
                close()
            }
        }
        .build()
        return _wasmcloud!!
    }

private var _wasmcloud: ImageVector? = null
