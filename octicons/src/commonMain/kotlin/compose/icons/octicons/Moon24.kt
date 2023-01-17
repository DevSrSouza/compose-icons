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

public val Octicons.Moon24: ImageVector
    get() {
        if (_moon24 != null) {
            return _moon24!!
        }
        _moon24 = Builder(name = "Moon24", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.768f, 3.96f)
                verticalLineToRelative(0.001f)
                lineToRelative(-0.002f, -0.005f)
                arcToRelative(9.08f, 9.08f, 0.0f, false, false, -0.218f, -0.779f)
                curveToRelative(-0.13f, -0.394f, 0.21f, -0.8f, 0.602f, -0.67f)
                curveToRelative(0.29f, 0.096f, 0.575f, 0.205f, 0.855f, 0.328f)
                lineToRelative(0.01f, 0.005f)
                arcTo(10.002f, 10.002f, 0.0f, false, true, 12.0f, 22.0f)
                arcToRelative(10.002f, 10.002f, 0.0f, false, true, -9.162f, -5.985f)
                lineToRelative(-0.004f, -0.01f)
                arcToRelative(9.722f, 9.722f, 0.0f, false, true, -0.329f, -0.855f)
                curveToRelative(-0.13f, -0.392f, 0.277f, -0.732f, 0.67f, -0.602f)
                curveToRelative(0.257f, 0.084f, 0.517f, 0.157f, 0.78f, 0.218f)
                lineToRelative(0.004f, 0.002f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 14.999f, 6.0f)
                arcToRelative(9.09f, 9.09f, 0.0f, false, false, -0.231f, -2.04f)
                close()
                moveTo(16.5f, 6.0f)
                curveToRelative(0.0f, 5.799f, -4.701f, 10.5f, -10.5f, 10.5f)
                curveToRelative(-0.426f, 0.0f, -0.847f, -0.026f, -1.26f, -0.075f)
                arcTo(8.5f, 8.5f, 0.0f, true, false, 16.425f, 4.74f)
                curveToRelative(0.05f, 0.413f, 0.075f, 0.833f, 0.075f, 1.259f)
                close()
            }
        }
        .build()
        return _moon24!!
    }

private var _moon24: ImageVector? = null
