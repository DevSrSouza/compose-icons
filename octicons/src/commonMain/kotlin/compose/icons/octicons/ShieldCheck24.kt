package compose.icons.octicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.EvenOdd
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.Octicons

public val Octicons.ShieldCheck24: ImageVector
    get() {
        if (_shieldCheck24 != null) {
            return _shieldCheck24!!
        }
        _shieldCheck24 = Builder(name = "ShieldCheck24", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.53f, 9.78f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, -1.06f)
                lineTo(11.0f, 13.19f)
                lineToRelative(-1.97f, -1.97f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, -1.06f, 1.06f)
                lineToRelative(2.5f, 2.5f)
                arcToRelative(0.75f, 0.75f, 0.0f, false, false, 1.06f, 0.0f)
                lineToRelative(5.0f, -5.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.54f, 0.637f)
                arcToRelative(1.75f, 1.75f, 0.0f, false, false, -1.08f, 0.0f)
                lineTo(3.21f, 3.312f)
                arcTo(1.75f, 1.75f, 0.0f, false, false, 2.0f, 4.976f)
                lineTo(2.0f, 10.0f)
                curveToRelative(0.0f, 6.19f, 3.77f, 10.705f, 9.401f, 12.83f)
                curveToRelative(0.386f, 0.145f, 0.812f, 0.145f, 1.198f, 0.0f)
                curveTo(18.229f, 20.704f, 22.0f, 16.19f, 22.0f, 10.0f)
                lineTo(22.0f, 4.976f)
                curveToRelative(0.0f, -0.759f, -0.49f, -1.43f, -1.21f, -1.664f)
                lineTo(12.54f, 0.637f)
                close()
                moveTo(11.923f, 2.063f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.154f, 0.0f)
                lineToRelative(8.25f, 2.676f)
                arcToRelative(0.25f, 0.25f, 0.0f, false, true, 0.173f, 0.237f)
                lineTo(20.5f, 10.0f)
                curveToRelative(0.0f, 5.461f, -3.28f, 9.483f, -8.43f, 11.426f)
                arcToRelative(0.2f, 0.2f, 0.0f, false, true, -0.14f, 0.0f)
                curveTo(6.78f, 19.483f, 3.5f, 15.46f, 3.5f, 10.0f)
                lineTo(3.5f, 4.976f)
                curveToRelative(0.0f, -0.108f, 0.069f, -0.203f, 0.173f, -0.237f)
                lineToRelative(8.25f, -2.676f)
                close()
            }
        }
        .build()
        return _shieldCheck24!!
    }

private var _shieldCheck24: ImageVector? = null
