package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
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
                    pathFillType = EvenOdd) {
                moveTo(8.0f, 1.5f)
                curveToRelative(-0.997f, 0.0f, -1.895f, 0.416f, -2.534f, 1.086f)
                arcTo(0.75f, 0.75f, 0.0f, false, true, 4.38f, 1.55f)
                arcTo(5.0f, 5.0f, 0.0f, false, true, 13.0f, 5.0f)
                verticalLineToRelative(2.373f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, true, -1.5f, 0.0f)
                lineTo(11.5f, 5.0f)
                arcTo(3.5f, 3.5f, 0.0f, false, false, 8.0f, 1.5f)
                close()
                moveTo(4.182f, 4.31f)
                lineTo(1.19f, 2.143f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, -0.88f, 1.214f)
                lineTo(3.0f, 5.305f)
                verticalLineToRelative(2.642f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, -0.042f, 0.139f)
                lineTo(1.255f, 10.64f)
                arcTo(1.518f, 1.518f, 0.0f, false, false, 2.518f, 13.0f)
                horizontalLineToRelative(11.108f)
                lineToRelative(1.184f, 0.857f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.88f, -1.214f)
                lineToRelative(-1.375f, -0.996f)
                arcToRelative(1.196f, 1.196f, 0.0f, false, false, -0.013f, -0.01f)
                lineTo(4.198f, 4.321f)
                arcToRelative(0.733f, 0.733f, 0.0f, false, false, -0.016f, -0.011f)
                close()
                moveTo(11.555f, 11.5f)
                lineTo(4.5f, 6.391f)
                verticalLineToRelative(1.556f)
                curveToRelative(0.0f, 0.346f, -0.102f, 0.683f, -0.294f, 0.97f)
                lineToRelative(-1.703f, 2.556f)
                arcToRelative(0.018f, 0.018f, 0.0f, false, false, -0.003f, 0.01f)
                arcToRelative(0.015f, 0.015f, 0.0f, false, false, 0.005f, 0.012f)
                arcToRelative(0.017f, 0.017f, 0.0f, false, false, 0.006f, 0.004f)
                lineToRelative(0.007f, 0.001f)
                horizontalLineToRelative(9.037f)
                close()
                moveTo(8.0f, 16.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 1.985f, -1.75f)
                curveToRelative(0.017f, -0.137f, -0.097f, -0.25f, -0.235f, -0.25f)
                horizontalLineToRelative(-3.5f)
                curveToRelative(-0.138f, 0.0f, -0.252f, 0.113f, -0.235f, 0.25f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 16.0f)
                close()
            }
        }
        .build()
        return _bellSlash16!!
    }

private var _bellSlash16: ImageVector? = null
