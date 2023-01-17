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

public val SimpleIcons.Fsecure: ImageVector
    get() {
        if (_fsecure != null) {
            return _fsecure!!
        }
        _fsecure = Builder(name = "Fsecure", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.928f, 2.946f)
                arcToRelative(35.921f, 35.921f, 0.0f, false, false, -22.228f, -0.6f)
                arcTo(2.219f, 2.219f, 0.0f, false, false, 0.08f, 5.094f)
                curveToRelative(0.4f, 1.6f, 0.98f, 3.439f, 1.68f, 5.108f)
                curveToRelative(0.01f, 0.04f, 0.03f, 0.02f, 0.03f, -0.02f)
                curveToRelative(-0.1f, -0.78f, 0.5f, -1.77f, 1.679f, -2.13f)
                arcToRelative(27.546f, 27.546f, 0.0f, false, true, 17.381f, 0.23f)
                curveToRelative(0.86f, 0.3f, 1.82f, -0.17f, 2.099f, -1.059f)
                curveToRelative(0.7f, -2.248f, 0.98f, -3.778f, 1.05f, -4.157f)
                curveToRelative(0.01f, -0.07f, -0.05f, -0.1f, -0.07f, -0.12f)
                close()
                moveTo(6.658f, 7.893f)
                curveToRelative(-0.86f, 0.18f, -2.05f, 0.46f, -2.94f, 0.76f)
                curveToRelative(-1.778f, 0.61f, -1.698f, 2.778f, -0.749f, 3.468f)
                curveToRelative(0.07f, -0.4f, 0.5f, -0.95f, 0.98f, -1.13f)
                curveToRelative(1.779f, -0.7f, 3.688f, -1.119f, 5.617f, -1.289f)
                curveToRelative(-0.98f, -0.4f, -1.94f, -0.97f, -2.899f, -1.809f)
                moveToRelative(14.163f, 4.338f)
                arcToRelative(21.15f, 21.15f, 0.0f, false, false, -16.441f, -0.65f)
                curveToRelative(-0.85f, 0.32f, -1.38f, 1.35f, -0.85f, 2.329f)
                arcToRelative(38.14f, 38.14f, 0.0f, false, false, 3.148f, 4.797f)
                curveToRelative(-0.17f, -0.58f, 0.13f, -1.659f, 1.27f, -2.009f)
                curveToRelative(3.148f, -0.969f, 6.456f, -0.56f, 8.655f, 0.33f)
                curveToRelative(0.62f, 0.25f, 1.5f, 0.1f, 1.99f, -0.64f)
                arcToRelative(38.6f, 38.6f, 0.0f, false, false, 2.288f, -4.017f)
                curveToRelative(0.03f, -0.06f, 0.0f, -0.11f, -0.06f, -0.14f)
                moveToRelative(-5.107f, 7.766f)
                arcToRelative(9.915f, 9.915f, 0.0f, false, true, -2.499f, -1.8f)
                curveToRelative(-0.34f, -0.34f, -0.84f, -0.829f, -1.37f, -1.409f)
                curveToRelative(-1.199f, 0.0f, -2.368f, 0.12f, -3.617f, 0.52f)
                curveToRelative(-1.16f, 0.36f, -1.27f, 1.7f, -0.76f, 2.399f)
                curveToRelative(0.86f, 1.07f, 1.46f, 1.65f, 2.419f, 2.639f)
                arcToRelative(2.739f, 2.739f, 0.0f, false, false, 3.818f, 0.02f)
                arcToRelative(43.3f, 43.3f, 0.0f, false, false, 2.059f, -2.21f)
                curveToRelative(0.05f, -0.05f, 0.03f, -0.14f, -0.05f, -0.16f)
            }
        }
        .build()
        return _fsecure!!
    }

private var _fsecure: ImageVector? = null
