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

public val SimpleIcons.Opslevel: ImageVector
    get() {
        if (_opslevel != null) {
            return _opslevel!!
        }
        _opslevel = Builder(name = "Opslevel", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.998f, 0.0f)
                lineTo(7.303f, 2.717f)
                verticalLineToRelative(2.045f)
                lineToRelative(-4.875f, 2.793f)
                verticalLineToRelative(5.01f)
                lineTo(0.338f, 13.774f)
                verticalLineToRelative(5.436f)
                lineToRelative(4.697f, 2.719f)
                lineToRelative(1.662f, -0.963f)
                lineTo(12.0f, 24.0f)
                lineToRelative(5.301f, -3.035f)
                lineToRelative(1.664f, 0.963f)
                lineToRelative(4.697f, -2.719f)
                verticalLineToRelative(-5.436f)
                lineToRelative(-2.09f, -1.207f)
                lineTo(21.572f, 7.555f)
                lineToRelative(-4.877f, -2.793f)
                lineTo(16.695f, 2.717f)
                lineTo(11.998f, 0.0f)
                close()
                moveTo(11.998f, 1.195f)
                lineToRelative(3.127f, 1.813f)
                lineTo(12.0f, 4.803f)
                lineToRelative(-3.125f, -1.797f)
                lineToRelative(3.123f, -1.811f)
                close()
                moveTo(8.34f, 3.895f)
                lineToRelative(3.143f, 1.807f)
                lineTo(11.482f, 9.377f)
                lineTo(8.34f, 7.555f)
                lineTo(8.34f, 3.895f)
                close()
                moveTo(15.658f, 3.895f)
                verticalLineToRelative(3.66f)
                lineTo(12.519f, 9.373f)
                lineTo(12.519f, 5.699f)
                lineToRelative(3.139f, -1.805f)
                close()
                moveTo(16.695f, 5.957f)
                lineToRelative(3.842f, 2.197f)
                verticalLineToRelative(3.813f)
                lineToRelative(-1.572f, -0.91f)
                lineToRelative(-4.697f, 2.717f)
                verticalLineToRelative(5.436f)
                lineToRelative(1.998f, 1.156f)
                lineTo(12.0f, 22.805f)
                lineToRelative(-4.264f, -2.44f)
                lineToRelative(1.996f, -1.156f)
                verticalLineToRelative(-5.436f)
                lineToRelative(-4.697f, -2.717f)
                lineToRelative(-1.57f, 0.908f)
                lineTo(3.465f, 8.154f)
                lineToRelative(3.838f, -2.195f)
                verticalLineToRelative(2.195f)
                horizontalLineToRelative(0.002f)
                lineTo(12.0f, 10.871f)
                lineToRelative(4.695f, -2.717f)
                lineTo(16.695f, 5.957f)
                close()
                moveTo(5.035f, 12.254f)
                lineToRelative(3.125f, 1.809f)
                lineToRelative(-3.125f, 1.797f)
                lineToRelative(-3.125f, -1.797f)
                lineToRelative(0.517f, -0.301f)
                lineToRelative(2.608f, -1.508f)
                close()
                moveTo(18.965f, 12.254f)
                lineToRelative(2.608f, 1.51f)
                lineToRelative(0.516f, 0.299f)
                lineToRelative(-3.123f, 1.797f)
                lineToRelative(-3.125f, -1.797f)
                lineToRelative(3.125f, -1.809f)
                close()
                moveTo(1.377f, 14.949f)
                lineToRelative(3.142f, 1.809f)
                verticalLineToRelative(3.676f)
                lineTo(1.377f, 18.611f)
                verticalLineToRelative(-3.662f)
                close()
                moveTo(8.695f, 14.949f)
                verticalLineToRelative(3.662f)
                lineToRelative(-3.037f, 1.758f)
                lineToRelative(-0.102f, 0.061f)
                verticalLineToRelative(-3.674f)
                lineToRelative(3.139f, -1.807f)
                close()
                moveTo(15.305f, 14.949f)
                lineToRelative(3.145f, 1.809f)
                verticalLineToRelative(3.676f)
                lineToRelative(-0.107f, -0.064f)
                lineToRelative(-3.037f, -1.758f)
                verticalLineToRelative(-3.662f)
                close()
                moveTo(22.623f, 14.949f)
                verticalLineToRelative(3.662f)
                lineToRelative(-3.139f, 1.818f)
                verticalLineToRelative(-3.672f)
                lineToRelative(3.139f, -1.809f)
                close()
            }
        }
        .build()
        return _opslevel!!
    }

private var _opslevel: ImageVector? = null
