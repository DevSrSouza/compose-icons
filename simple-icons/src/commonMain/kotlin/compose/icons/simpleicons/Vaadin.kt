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

public val SimpleIcons.Vaadin: ImageVector
    get() {
        if (_vaadin != null) {
            return _vaadin!!
        }
        _vaadin = Builder(name = "Vaadin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.166f, 0.521f)
                curveTo(0.506f, 0.521f, 0.0f, 1.055f, 0.0f, 1.715f)
                verticalLineToRelative(1.97f)
                curveToRelative(0.0f, 2.316f, 1.054f, 3.473f, 3.502f, 3.473f)
                horizontalLineToRelative(5.43f)
                curveToRelative(1.623f, 0.0f, 1.783f, 0.685f, 1.783f, 1.35f)
                curveToRelative(0.0f, 0.068f, 0.004f, 0.13f, 0.012f, 0.193f)
                arcToRelative(1.268f, 1.268f, 0.0f, false, false, 2.531f, -0.004f)
                curveToRelative(0.007f, -0.062f, 0.012f, -0.121f, 0.012f, -0.19f)
                curveToRelative(0.0f, -0.664f, 0.16f, -1.349f, 1.783f, -1.349f)
                horizontalLineToRelative(5.43f)
                curveTo(22.93f, 7.158f, 24.0f, 6.001f, 24.0f, 3.686f)
                lineTo(24.0f, 1.715f)
                curveToRelative(0.0f, -0.66f, -0.524f, -1.194f, -1.184f, -1.194f)
                curveToRelative(-0.66f, 0.0f, -1.189f, 0.534f, -1.189f, 1.194f)
                lineToRelative(-0.004f, 0.685f)
                curveToRelative(0.0f, 0.746f, -0.476f, 1.27f, -1.594f, 1.27f)
                horizontalLineToRelative(-5.322f)
                curveToRelative(-2.422f, 0.0f, -2.608f, 1.796f, -2.687f, 2.748f)
                horizontalLineToRelative(-0.055f)
                curveToRelative(-0.08f, -0.952f, -0.266f, -2.748f, -2.688f, -2.748f)
                lineTo(3.955f, 3.67f)
                curveToRelative(-1.118f, 0.0f, -1.629f, -0.544f, -1.629f, -1.29f)
                verticalLineToRelative(-0.665f)
                curveToRelative(0.0f, -0.66f, -0.5f, -1.194f, -1.16f, -1.194f)
                close()
                moveTo(7.041f, 11.074f)
                arcToRelative(1.586f, 1.586f, 0.0f, false, false, -1.375f, 2.371f)
                curveToRelative(1.657f, 3.06f, 3.308f, 6.13f, 4.967f, 9.184f)
                arcToRelative(1.415f, 1.415f, 0.0f, false, false, 2.586f, 0.02f)
                lineToRelative(0.033f, -0.06f)
                lineToRelative(4.945f, -9.142f)
                arcToRelative(1.587f, 1.587f, 0.0f, false, false, -1.377f, -2.373f)
                curveToRelative(-0.702f, 0.0f, -1.179f, 0.345f, -1.502f, 1.082f)
                lineToRelative(-3.386f, 6.313f)
                lineToRelative(-3.383f, -6.305f)
                curveToRelative(-0.326f, -0.745f, -0.805f, -1.09f, -1.508f, -1.09f)
                close()
            }
        }
        .build()
        return _vaadin!!
    }

private var _vaadin: ImageVector? = null
