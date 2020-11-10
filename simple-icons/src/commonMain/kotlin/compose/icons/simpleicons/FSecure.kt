package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.VectorAsset
import androidx.compose.ui.graphics.vector.VectorAssetBuilder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.FSecure: VectorAsset
    get() {
        if (_fSecure != null) {
            return _fSecure!!
        }
        _fSecure = VectorAssetBuilder(name = "FSecure", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.93f, 2.94f)
                arcToRelative(35.94f, 35.94f, 0.0f, false, false, -22.24f, -0.6f)
                arcTo(2.22f, 2.22f, 0.0f, false, false, 0.07f, 5.09f)
                curveToRelative(0.4f, 1.6f, 0.98f, 3.44f, 1.68f, 5.11f)
                curveToRelative(0.01f, 0.04f, 0.03f, 0.02f, 0.03f, -0.02f)
                curveToRelative(-0.1f, -0.78f, 0.5f, -1.77f, 1.68f, -2.13f)
                arcToRelative(27.56f, 27.56f, 0.0f, false, true, 17.39f, 0.23f)
                curveToRelative(0.86f, 0.3f, 1.82f, -0.17f, 2.1f, -1.06f)
                curveToRelative(0.7f, -2.25f, 0.98f, -3.78f, 1.05f, -4.16f)
                curveToRelative(0.01f, -0.07f, -0.05f, -0.1f, -0.07f, -0.12f)
                close()
                moveTo(6.65f, 7.89f)
                curveToRelative(-0.86f, 0.18f, -2.05f, 0.46f, -2.94f, 0.76f)
                curveToRelative(-1.78f, 0.61f, -1.7f, 2.78f, -0.75f, 3.47f)
                curveToRelative(0.07f, -0.4f, 0.5f, -0.95f, 0.98f, -1.13f)
                curveToRelative(1.78f, -0.7f, 3.69f, -1.12f, 5.62f, -1.29f)
                curveToRelative(-0.98f, -0.4f, -1.94f, -0.97f, -2.9f, -1.81f)
                moveTo(20.83f, 12.23f)
                arcToRelative(21.16f, 21.16f, 0.0f, false, false, -16.45f, -0.65f)
                curveToRelative(-0.85f, 0.32f, -1.38f, 1.35f, -0.85f, 2.33f)
                arcToRelative(38.16f, 38.16f, 0.0f, false, false, 3.15f, 4.8f)
                curveToRelative(-0.17f, -0.58f, 0.13f, -1.66f, 1.27f, -2.01f)
                curveToRelative(3.15f, -0.97f, 6.46f, -0.56f, 8.66f, 0.33f)
                curveToRelative(0.62f, 0.25f, 1.5f, 0.1f, 1.99f, -0.64f)
                arcToRelative(38.62f, 38.62f, 0.0f, false, false, 2.29f, -4.02f)
                curveToRelative(0.03f, -0.06f, 0.0f, -0.11f, -0.06f, -0.14f)
                moveTo(15.72f, 20.0f)
                arcToRelative(9.92f, 9.92f, 0.0f, false, true, -2.5f, -1.8f)
                curveToRelative(-0.34f, -0.34f, -0.84f, -0.83f, -1.37f, -1.41f)
                curveToRelative(-1.2f, 0.0f, -2.37f, 0.12f, -3.62f, 0.52f)
                curveToRelative(-1.16f, 0.36f, -1.27f, 1.7f, -0.76f, 2.4f)
                curveToRelative(0.86f, 1.07f, 1.46f, 1.65f, 2.42f, 2.64f)
                arcToRelative(2.74f, 2.74f, 0.0f, false, false, 3.82f, 0.02f)
                curveToRelative(0.75f, -0.75f, 1.21f, -1.25f, 2.06f, -2.21f)
                curveToRelative(0.05f, -0.05f, 0.03f, -0.14f, -0.05f, -0.16f)
            }
        }
        .build()
        return _fSecure!!
    }

private var _fSecure: VectorAsset? = null
