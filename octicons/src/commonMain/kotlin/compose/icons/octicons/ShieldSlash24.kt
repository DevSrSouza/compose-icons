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

public val Octicons.ShieldSlash24: ImageVector
    get() {
        if (_shieldSlash24 != null) {
            return _shieldSlash24!!
        }
        _shieldSlash24 = Builder(name = "ShieldSlash24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.54f, 1.137f)
                arcToRelative(1.748f, 1.748f, 0.0f, false, false, -1.08f, 0.0f)
                lineTo(6.018f, 2.905f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 0.464f, 1.427f)
                lineToRelative(5.441f, -1.768f)
                arcToRelative(0.239f, 0.239f, 0.0f, false, true, 0.154f, 0.0f)
                lineToRelative(8.25f, 2.675f)
                arcToRelative(0.249f, 0.249f, 0.0f, false, true, 0.173f, 0.237f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, 1.284f, -0.24f, 2.83f, -0.696f, 3.971f)
                arcToRelative(0.75f, 0.75f, 0.0f, true, false, 1.392f, 0.557f)
                curveTo(21.74f, 13.67f, 22.0f, 11.927f, 22.0f, 10.5f)
                verticalLineTo(5.476f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.21f, -1.664f)
                lineToRelative(-8.25f, -2.675f)
                close()
                moveTo(2.017f, 4.843f)
                lineToRelative(-0.974f, -0.748f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, 0.914f, -1.19f)
                lineToRelative(20.5f, 15.75f)
                arcToRelative(0.751f, 0.751f, 0.0f, false, true, -0.914f, 1.19f)
                lineToRelative(-2.012f, -1.546f)
                lineToRelative(-0.702f, 0.852f)
                lineToRelative(-0.008f, 0.009f)
                arcToRelative(0.07f, 0.07f, 0.0f, false, true, -0.008f, 0.01f)
                curveToRelative(-1.603f, 1.821f, -3.731f, 3.223f, -6.214f, 4.16f)
                arcToRelative(1.699f, 1.699f, 0.0f, false, true, -1.198f, -0.001f)
                curveTo(5.771f, 21.205f, 2.0f, 16.689f, 2.0f, 10.5f)
                verticalLineTo(5.0f)
                curveToRelative(0.0f, -0.054f, 0.006f, -0.107f, 0.017f, -0.157f)
                close()
                moveTo(3.5f, 5.982f)
                verticalLineTo(10.5f)
                curveToRelative(0.0f, 5.461f, 3.281f, 9.483f, 8.431f, 11.426f)
                arcToRelative(0.193f, 0.193f, 0.0f, false, false, 0.138f, 0.0f)
                curveToRelative(2.283f, -0.861f, 4.192f, -2.131f, 5.61f, -3.738f)
                lineToRelative(0.662f, -0.803f)
                close()
            }
        }
        .build()
        return _shieldSlash24!!
    }

private var _shieldSlash24: ImageVector? = null
