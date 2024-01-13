package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.Bell16: ImageVector
    get() {
        if (_bell16 != null) {
            return _bell16!!
        }
        _bell16 = Builder(name = "Bell16", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp,
                viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.985f, -1.75f)
                curveToRelative(0.017f, -0.137f, -0.097f, -0.25f, -0.235f, -0.25f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.138f, 0.0f, -0.252f, 0.113f, -0.235f, 0.25f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 16.0f)
                close()
                moveTo(3.0f, 5.0f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 10.0f, 0.0f)
                verticalLineToRelative(2.947f)
                curveToRelative(0.0f, 0.05f, 0.015f, 0.098f, 0.042f, 0.139f)
                lineToRelative(1.703f, 2.555f)
                arcTo(1.519f, 1.519f, 0.0f, false, true, 13.482f, 13.0f)
                lineTo(2.518f, 13.0f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, true, -1.263f, -2.36f)
                lineToRelative(1.703f, -2.554f)
                arcTo(0.255f, 0.255f, 0.0f, false, false, 3.0f, 7.947f)
                close()
                moveTo(8.0f, 1.5f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 4.5f, 5.0f)
                verticalLineToRelative(2.947f)
                curveToRelative(0.0f, 0.346f, -0.102f, 0.683f, -0.294f, 0.97f)
                lineToRelative(-1.703f, 2.556f)
                arcToRelative(0.017f, 0.017f, 0.0f, false, false, -0.003f, 0.01f)
                lineToRelative(0.001f, 0.006f)
                curveToRelative(0.0f, 0.002f, 0.002f, 0.004f, 0.004f, 0.006f)
                lineToRelative(0.006f, 0.004f)
                lineToRelative(0.007f, 0.001f)
                horizontalLineToRelative(10.964f)
                lineToRelative(0.007f, -0.001f)
                lineToRelative(0.006f, -0.004f)
                lineToRelative(0.004f, -0.006f)
                lineToRelative(0.001f, -0.007f)
                arcToRelative(0.017f, 0.017f, 0.0f, false, false, -0.003f, -0.01f)
                lineToRelative(-1.703f, -2.554f)
                arcToRelative(1.745f, 1.745f, 0.0f, false, true, -0.294f, -0.97f)
                lineTo(11.5f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 1.5f)
                close()
            }
        }
        .build()
        return _bell16!!
    }

private var _bell16: ImageVector? = null
