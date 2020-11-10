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

public val SimpleIcons.Udemy: VectorAsset
    get() {
        if (_udemy != null) {
            return _udemy!!
        }
        _udemy = VectorAssetBuilder(name = "Udemy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.58f, 13.38f)
                arcToRelative(0.66f, 0.66f, 0.0f, false, false, -0.28f, -0.14f)
                curveToRelative(-0.6f, 0.61f, -1.35f, 1.25f, -2.0f, 1.68f)
                curveToRelative(-0.31f, 0.2f, -0.7f, 0.3f, -0.95f, 0.3f)
                curveToRelative(-0.59f, 0.0f, -0.84f, -0.55f, -0.91f, -1.44f)
                arcToRelative(54.8f, 54.8f, 0.0f, false, true, -0.17f, -4.83f)
                curveToRelative(0.0f, -2.26f, -0.52f, -3.8f, -1.88f, -3.92f)
                lineToRelative(-0.18f, -0.01f)
                curveToRelative(-0.83f, 0.0f, -1.24f, 0.43f, -1.77f, 1.52f)
                curveToRelative(-0.46f, 0.94f, -1.17f, 2.3f, -2.48f, 4.9f)
                arcToRelative(34.72f, 34.72f, 0.0f, false, true, -3.5f, 5.58f)
                curveToRelative(-0.31f, 0.38f, -0.55f, 0.64f, -0.78f, 0.8f)
                arcToRelative(0.8f, 0.8f, 0.0f, false, true, -0.44f, 0.14f)
                curveToRelative(-0.43f, 0.0f, -0.75f, -0.36f, -0.85f, -1.21f)
                arcToRelative(5.46f, 5.46f, 0.0f, false, true, -0.04f, -0.69f)
                curveToRelative(0.0f, -1.75f, 0.66f, -4.6f, 1.8f, -8.78f)
                curveToRelative(0.83f, -3.05f, 0.48f, -5.13f, -1.34f, -5.13f)
                horizontalLineToRelative(-0.03f)
                curveToRelative(-0.41f, 0.0f, -0.75f, 0.16f, -1.08f, 0.42f)
                curveToRelative(-0.33f, 0.25f, -0.65f, 0.81f, -0.96f, 1.56f)
                curveToRelative(-0.34f, 0.84f, -2.42f, 5.03f, -5.74f, 7.2f)
                curveToRelative(-0.04f, 0.81f, 0.42f, 1.63f, 1.37f, 1.73f)
                curveToRelative(0.85f, 0.08f, 1.46f, -0.28f, 2.24f, -0.81f)
                lineToRelative(-0.16f, 0.73f)
                arcToRelative(31.56f, 31.56f, 0.0f, false, false, -0.5f, 2.6f)
                curveToRelative(-0.46f, 4.2f, 1.47f, 6.27f, 3.74f, 6.27f)
                curveToRelative(0.38f, 0.0f, 0.76f, -0.05f, 1.13f, -0.15f)
                curveToRelative(2.5f, -0.63f, 4.9f, -3.51f, 7.75f, -10.13f)
                arcToRelative(18.8f, 18.8f, 0.0f, false, false, -0.01f, 2.02f)
                curveToRelative(0.19f, 3.8f, 1.68f, 4.93f, 3.8f, 4.93f)
                curveToRelative(1.6f, 0.0f, 3.09f, -0.83f, 3.85f, -1.87f)
                arcToRelative(3.7f, 3.7f, 0.0f, false, false, 0.79f, -2.19f)
                curveToRelative(-0.02f, -0.49f, -0.17f, -0.88f, -0.42f, -1.08f)
                close()
            }
        }
        .build()
        return _udemy!!
    }

private var _udemy: VectorAsset? = null
