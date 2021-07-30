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

public val SimpleIcons.Googletagmanager: ImageVector
    get() {
        if (_googletagmanager != null) {
            return _googletagmanager!!
        }
        _googletagmanager = Builder(name = "Googletagmanager", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.003f, 0.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -2.121f, 5.121f)
                lineToRelative(6.865f, 6.865f)
                lineToRelative(-4.446f, 4.541f)
                lineToRelative(1.745f, 1.836f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, true, 0.7f, 0.739f)
                lineToRelative(0.012f, 0.011f)
                lineToRelative(-0.001f, 0.002f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, true, 0.609f, 1.953f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, true, -0.09f, 0.78f)
                lineToRelative(7.75f, -7.647f)
                curveToRelative(0.031f, -0.029f, 0.067f, -0.05f, 0.098f, -0.08f)
                curveToRelative(0.023f, -0.023f, 0.038f, -0.052f, 0.06f, -0.076f)
                arcToRelative(2.994f, 2.994f, 0.0f, false, false, -0.06f, -4.166f)
                lineToRelative(-9.0f, -9.0f)
                arcTo(2.99f, 2.99f, 0.0f, false, false, 12.003f, 0.0f)
                close()
                moveTo(8.63f, 2.133f)
                lineTo(0.88f, 9.809f)
                arcToRelative(2.998f, 2.998f, 0.0f, false, false, 0.0f, 4.238f)
                lineToRelative(7.7f, 7.75f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, true, -0.077f, -0.729f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, true, 3.431f, -3.431f)
                arcToRelative(3.432f, 3.432f, 0.0f, false, true, 0.826f, 0.101f)
                lineToRelative(-5.523f, -5.81f)
                lineToRelative(4.371f, -4.373f)
                lineToRelative(-2.08f, -2.08f)
                curveToRelative(-0.903f, -0.904f, -1.193f, -2.183f, -0.898f, -3.342f)
                close()
                moveTo(11.934f, 18.137f)
                arcToRelative(2.932f, 2.932f, 0.0f, false, false, -2.931f, 2.931f)
                arcTo(2.932f, 2.932f, 0.0f, false, false, 11.934f, 24.0f)
                arcToRelative(2.932f, 2.932f, 0.0f, false, false, 2.932f, -2.932f)
                arcToRelative(2.932f, 2.932f, 0.0f, false, false, -2.932f, -2.931f)
                close()
            }
        }
        .build()
        return _googletagmanager!!
    }

private var _googletagmanager: ImageVector? = null
