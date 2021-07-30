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

public val SimpleIcons.Allocine: ImageVector
    get() {
        if (_allocine != null) {
            return _allocine!!
        }
        _allocine = Builder(name = "Allocine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.434f, 0.001f)
                arcToRelative(0.826f, 0.826f, 0.0f, false, false, -0.164f, 0.008f)
                lineToRelative(-3.423f, 0.543f)
                arcToRelative(2.635f, 2.635f, 0.0f, false, true, -2.189f, 3.01f)
                arcToRelative(2.629f, 2.629f, 0.0f, false, true, -3.01f, -2.185f)
                lineToRelative(-3.417f, 0.538f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, -0.677f, 0.931f)
                lineToRelative(3.24f, 20.467f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, 0.931f, 0.677f)
                lineToRelative(3.423f, -0.543f)
                arcToRelative(2.635f, 2.635f, 0.0f, false, true, 2.189f, -3.01f)
                arcToRelative(2.629f, 2.629f, 0.0f, false, true, 3.01f, 2.185f)
                lineToRelative(3.422f, -0.543f)
                arcToRelative(0.818f, 0.818f, 0.0f, false, false, 0.677f, -0.93f)
                lineTo(17.2f, 0.685f)
                arcToRelative(0.816f, 0.816f, 0.0f, false, false, -0.767f, -0.685f)
                close()
                moveTo(13.214f, 6.535f)
                curveToRelative(0.066f, 0.0f, 0.128f, 0.005f, 0.185f, 0.017f)
                curveToRelative(0.423f, 0.09f, 0.975f, 0.6f, 1.315f, 0.955f)
                curveToRelative(0.178f, 0.187f, 0.192f, 0.519f, 0.048f, 0.73f)
                lineToRelative(-1.228f, 1.795f)
                arcToRelative(0.89f, 0.89f, 0.0f, false, true, -0.437f, 0.283f)
                curveToRelative(-0.504f, 0.125f, -1.248f, -0.95f, -1.771f, 1.507f)
                curveToRelative(-0.524f, 2.458f, 0.59f, 1.776f, 1.003f, 2.098f)
                arcToRelative(0.828f, 0.828f, 0.0f, false, true, 0.283f, 0.437f)
                lineToRelative(0.394f, 2.14f)
                arcToRelative(0.613f, 0.613f, 0.0f, false, true, -0.341f, 0.649f)
                curveToRelative(-0.456f, 0.182f, -1.167f, 0.427f, -1.589f, 0.336f)
                curveToRelative(-0.907f, -0.192f, -2.342f, -2.4f, -1.57f, -6.044f)
                curveToRelative(0.725f, -3.415f, 2.71f, -4.89f, 3.708f, -4.903f)
                close()
            }
        }
        .build()
        return _allocine!!
    }

private var _allocine: ImageVector? = null
