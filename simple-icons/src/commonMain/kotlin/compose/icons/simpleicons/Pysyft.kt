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

public val SimpleIcons.Pysyft: ImageVector
    get() {
        if (_pysyft != null) {
            return _pysyft!!
        }
        _pysyft = Builder(name = "Pysyft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(16.524f, 17.985f)
                lineToRelative(1.413f, -0.46f)
                lineTo(17.937f, 13.64f)
                close()
                moveTo(23.009f, 12.353f)
                lineTo(24.0f, 9.305f)
                lineToRelative(-6.786f, -4.93f)
                close()
                moveTo(18.663f, 7.838f)
                lineTo(21.077f, 15.26f)
                lineTo(22.566f, 13.208f)
                close()
                moveTo(18.799f, 11.038f)
                lineTo(20.389f, 15.936f)
                lineTo(18.799f, 17.092f)
                close()
                moveTo(9.732f, 20.19f)
                lineToRelative(3.688f, -1.198f)
                lineTo(8.863f, 18.992f)
                close()
                moveTo(12.0f, 22.03f)
                lineToRelative(4.159f, -3.023f)
                lineToRelative(-5.747f, 1.87f)
                close()
                moveTo(15.266f, 23.255f)
                lineTo(19.16f, 17.892f)
                lineTo(12.855f, 22.473f)
                close()
                moveTo(19.415f, 23.413f)
                horizontalLineToRelative(-3.2f)
                lineToRelative(5.788f, -7.967f)
                close()
                moveTo(9.758f, 21.466f)
                lineTo(3.453f, 16.885f)
                verticalLineToRelative(2.532f)
                close()
                moveTo(4.583f, 23.413f)
                horizontalLineToRelative(8.377f)
                lineToRelative(-9.365f, -3.045f)
                close()
                moveTo(4.218f, 14.067f)
                lineTo(3.611f, 15.937f)
                lineTo(7.771f, 18.958f)
                close()
                moveTo(6.94f, 16.351f)
                lineTo(4.662f, 13.211f)
                lineTo(5.532f, 12.014f)
                close()
                moveTo(0.0f, 9.305f)
                lineToRelative(2.592f, 7.98f)
                lineTo(2.592f, 7.422f)
                close()
                moveTo(5.865f, 6.214f)
                lineTo(3.455f, 6.998f)
                verticalLineToRelative(6.635f)
                close()
                moveTo(6.817f, 6.074f)
                lineTo(5.224f, 10.972f)
                lineTo(8.785f, 6.075f)
                close()
                moveTo(9.732f, 6.233f)
                lineTo(11.145f, 6.693f)
                lineTo(7.449f, 9.378f)
                close()
                moveTo(14.595f, 2.472f)
                lineTo(11.998f, 0.587f)
                lineTo(5.206f, 5.52f)
                close()
                moveTo(8.946f, 5.213f)
                horizontalLineToRelative(7.81f)
                lineTo(15.267f, 3.16f)
                close()
                moveTo(12.029f, 6.075f)
                lineTo(17.794f, 7.947f)
                lineTo(17.184f, 6.075f)
                close()
                moveTo(17.937f, 8.898f)
                verticalLineToRelative(1.488f)
                lineToRelative(-3.702f, -2.688f)
                close()
            }
        }
        .build()
        return _pysyft!!
    }

private var _pysyft: ImageVector? = null
