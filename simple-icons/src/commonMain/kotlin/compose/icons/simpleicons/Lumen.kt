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

public val SimpleIcons.Lumen: ImageVector
    get() {
        if (_lumen != null) {
            return _lumen!!
        }
        _lumen = Builder(name = "Lumen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.649f, 0.0f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.342f, 0.072f)
                lineToRelative(-4.878f, 2.23f)
                arcToRelative(0.75f, 0.751f, 0.0f, true, false, 0.624f, 1.366f)
                lineToRelative(4.878f, -2.23f)
                arcTo(0.75f, 0.75f, 0.0f, false, false, 11.649f, 0.0f)
                close()
                moveTo(17.273f, 0.354f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.341f, 0.074f)
                lineTo(6.425f, 5.306f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.632f, 1.362f)
                lineTo(17.563f, 1.79f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.29f, -1.436f)
                close()
                moveTo(17.273f, 3.356f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.341f, 0.074f)
                lineTo(6.425f, 8.31f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.632f, 1.362f)
                lineToRelative(10.506f, -4.88f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.29f, -1.436f)
                close()
                moveTo(17.273f, 6.358f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.341f, 0.074f)
                lineTo(6.425f, 11.311f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.632f, 1.361f)
                lineToRelative(10.506f, -4.878f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.29f, -1.436f)
                close()
                moveTo(17.282f, 9.361f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.342f, 0.07f)
                lineToRelative(-3.753f, 1.688f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.442f, 0.685f)
                verticalLineToRelative(3.518f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.001f, 0.047f)
                horizontalLineToRelative(-1.503f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.0f, -0.047f)
                verticalLineToRelative(-2.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.761f, -0.761f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.74f, 0.761f)
                verticalLineToRelative(2.58f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.002f, 0.047f)
                horizontalLineToRelative(-0.94f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, -0.47f, 0.555f)
                lineToRelative(0.19f, 1.14f)
                arcToRelative(0.687f, 0.687f, 0.0f, false, false, 0.656f, 0.557f)
                horizontalLineToRelative(2.28f)
                lineToRelative(-2.537f, 0.476f)
                arcToRelative(0.375f, 0.375f, 0.0f, true, false, 0.139f, 0.737f)
                lineToRelative(6.003f, -1.126f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, 0.307f, -0.41f)
                arcToRelative(0.625f, 0.625f, 0.0f, false, false, 0.092f, -0.232f)
                lineToRelative(0.19f, -1.142f)
                arcToRelative(0.461f, 0.461f, 0.0f, false, false, -0.47f, -0.555f)
                horizontalLineToRelative(-0.94f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 0.002f, -0.047f)
                lineTo(14.246f, 12.29f)
                lineToRelative(3.31f, -1.49f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -0.274f, -1.438f)
                close()
                moveTo(14.99f, 18.746f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.063f, 0.007f)
                lineToRelative(-6.004f, 1.126f)
                arcToRelative(0.375f, 0.375f, 0.0f, true, false, 0.139f, 0.737f)
                lineToRelative(6.003f, -1.125f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.075f, -0.745f)
                close()
                moveTo(14.99f, 20.622f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.063f, 0.008f)
                lineToRelative(-6.004f, 1.125f)
                arcToRelative(0.375f, 0.375f, 0.0f, true, false, 0.139f, 0.737f)
                lineToRelative(6.003f, -1.125f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.075f, -0.745f)
                close()
                moveTo(14.247f, 22.498f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.064f, 0.006f)
                lineToRelative(-4.471f, 0.751f)
                arcToRelative(0.375f, 0.375f, 0.0f, true, false, 0.124f, 0.74f)
                lineToRelative(4.472f, -0.75f)
                arcToRelative(0.375f, 0.375f, 0.0f, false, false, -0.061f, -0.747f)
                close()
            }
        }
        .build()
        return _lumen!!
    }

private var _lumen: ImageVector? = null
