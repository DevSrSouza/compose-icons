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

public val Octicons.BellSlash16: ImageVector
    get() {
        if (_bellSlash16 != null) {
            return _bellSlash16!!
        }
        _bellSlash16 = Builder(name = "BellSlash16", defaultWidth = 16.0.dp, defaultHeight =
                16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveToRelative(4.182f, 4.31f)
                lineToRelative(0.016f, 0.011f)
                lineToRelative(10.104f, 7.316f)
                lineToRelative(0.013f, 0.01f)
                lineToRelative(1.375f, 0.996f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, -0.88f, 1.214f)
                lineTo(13.626f, 13.0f)
                lineTo(2.518f, 13.0f)
                arcToRelative(1.516f, 1.516f, 0.0f, false, true, -1.263f, -2.36f)
                lineToRelative(1.703f, -2.554f)
                arcTo(0.255f, 0.255f, 0.0f, false, false, 3.0f, 7.947f)
                lineTo(3.0f, 5.305f)
                lineTo(0.31f, 3.357f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, true, 0.88f, -1.214f)
                close()
                moveTo(11.555f, 11.5f)
                lineTo(4.5f, 6.391f)
                verticalLineToRelative(1.556f)
                curveToRelative(0.0f, 0.346f, -0.102f, 0.683f, -0.294f, 0.97f)
                lineToRelative(-1.703f, 2.556f)
                arcToRelative(0.017f, 0.017f, 0.0f, false, false, -0.003f, 0.01f)
                curveToRelative(0.0f, 0.005f, 0.002f, 0.009f, 0.005f, 0.012f)
                lineToRelative(0.006f, 0.004f)
                lineToRelative(0.007f, 0.001f)
                close()
                moveTo(8.0f, 1.5f)
                curveToRelative(-0.997f, 0.0f, -1.895f, 0.416f, -2.534f, 1.086f)
                arcTo(0.75f, 0.75f, 0.0f, true, true, 4.38f, 1.55f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 5.0f)
                verticalLineToRelative(2.373f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 1.5f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.985f, -1.75f)
                curveToRelative(-0.017f, -0.137f, 0.097f, -0.25f, 0.235f, -0.25f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.138f, 0.0f, 0.252f, 0.113f, 0.235f, 0.25f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bellSlash16!!
    }

private var _bellSlash16: ImageVector? = null
