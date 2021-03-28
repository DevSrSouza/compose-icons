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

public val Octicons.Moon24: ImageVector
    get() {
        if (_moon24 != null) {
            return _moon24!!
        }
        _moon24 = Builder(name = "Moon24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.5f, 6.0f)
                curveToRelative(0.0f, 5.799f, -4.701f, 10.5f, -10.5f, 10.5f)
                curveToRelative(-0.426f, 0.0f, -0.847f, -0.026f, -1.26f, -0.075f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 16.425f, 4.74f)
                curveToRelative(0.05f, 0.413f, 0.075f, 0.833f, 0.075f, 1.259f)
                close()
                moveTo(14.768f, 3.96f)
                arcTo(9.08f, 9.08f, 0.0f, false, true, 14.999f, 6.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, true, -11.04f, 8.768f)
                lineToRelative(-0.004f, -0.002f)
                arcToRelative(9.367f, 9.367f, 0.0f, false, true, -0.78f, -0.218f)
                curveToRelative(-0.393f, -0.13f, -0.8f, 0.21f, -0.67f, 0.602f)
                arcToRelative(9.938f, 9.938f, 0.0f, false, false, 0.329f, 0.855f)
                lineToRelative(0.004f, 0.01f)
                arcTo(10.002f, 10.002f, 0.0f, false, false, 12.0f, 22.0f)
                arcToRelative(10.002f, 10.002f, 0.0f, false, false, 4.015f, -19.16f)
                lineToRelative(-0.01f, -0.005f)
                arcToRelative(9.745f, 9.745f, 0.0f, false, false, -0.855f, -0.328f)
                curveToRelative(-0.392f, -0.13f, -0.732f, 0.276f, -0.602f, 0.67f)
                arcToRelative(8.934f, 8.934f, 0.0f, false, true, 0.218f, 0.779f)
                lineToRelative(0.002f, 0.005f)
                close()
            }
        }
        .build()
        return _moon24!!
    }

private var _moon24: ImageVector? = null
