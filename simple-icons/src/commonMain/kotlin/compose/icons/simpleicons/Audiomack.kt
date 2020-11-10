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

public val SimpleIcons.Audiomack: VectorAsset
    get() {
        if (_audiomack != null) {
            return _audiomack!!
        }
        _audiomack = VectorAssetBuilder(name = "Audiomack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.33f, 11.39f)
                reflectiveCurveToRelative(0.54f, -0.09f, 0.77f, 0.14f)
                curveToRelative(0.22f, 0.23f, 0.07f, 0.71f, -0.22f, 0.72f)
                curveToRelative(-0.3f, 0.01f, -0.57f, 0.06f, -0.77f, -0.14f)
                arcToRelative(0.443f, 0.443f, 0.0f, false, true, 0.22f, -0.72f)
                close()
                moveTo(6.21f, 14.65f)
                curveToRelative(-0.05f, 0.01f, -0.11f, -0.02f, -0.16f, -0.06f)
                curveToRelative(-0.39f, -0.53f, -0.53f, -2.37f, -0.71f, -2.48f)
                curveToRelative(-0.18f, -0.11f, -0.85f, 1.02f, -2.19f, 0.9f)
                curveToRelative(-0.55f, -0.05f, -1.12f, -0.41f, -1.45f, -0.66f)
                curveToRelative(0.03f, -0.41f, 0.03f, -1.39f, 0.86f, -1.07f)
                curveToRelative(0.51f, 0.19f, 1.37f, 0.72f, 2.13f, -0.23f)
                curveToRelative(0.84f, -1.05f, 1.3f, -0.74f, 1.57f, -0.51f)
                curveToRelative(0.28f, 0.22f, 0.1f, 1.41f, 0.51f, 1.08f)
                curveToRelative(0.41f, -0.33f, 2.08f, -2.39f, 2.08f, -2.39f)
                reflectiveCurveToRelative(1.29f, -1.29f, 1.49f, 0.06f)
                curveToRelative(0.2f, 1.36f, 1.04f, 2.87f, 1.27f, 2.82f)
                curveToRelative(0.22f, -0.04f, 2.82f, -5.27f, 3.19f, -5.61f)
                curveToRelative(0.37f, -0.34f, 1.63f, -0.29f, 1.57f, 0.57f)
                curveToRelative(-0.06f, 0.87f, -0.19f, 6.25f, -0.19f, 6.25f)
                reflectiveCurveToRelative(-0.15f, 1.52f, 0.09f, 0.71f)
                curveToRelative(0.1f, -0.34f, 0.21f, -0.64f, 0.34f, -1.0f)
                curveToRelative(0.64f, -2.03f, 1.73f, -5.51f, 2.28f, -7.3f)
                curveToRelative(0.12f, -0.42f, 0.23f, -0.79f, 0.32f, -1.07f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.03f, -0.13f, 0.06f, -0.23f, 0.09f, -0.32f)
                curveToRelative(0.05f, -0.15f, 0.08f, -0.26f, 0.09f, -0.28f)
                curveToRelative(0.02f, -0.07f, 0.09f, -0.12f, 0.19f, -0.16f)
                curveToRelative(0.09f, -0.06f, 0.2f, -0.06f, 0.31f, -0.06f)
                curveToRelative(0.31f, -0.03f, 0.69f, 0.01f, 1.04f, 0.11f)
                curveToRelative(0.11f, 0.0f, 0.22f, 0.03f, 0.32f, 0.11f)
                curveToRelative(0.0f, 0.0f, 0.01f, 0.0f, 0.02f, 0.01f)
                curveToRelative(0.03f, 0.02f, 0.06f, 0.05f, 0.1f, 0.1f)
                horizontalLineToRelative(0.01f)
                curveToRelative(0.01f, 0.02f, 0.03f, 0.05f, 0.05f, 0.07f)
                curveToRelative(0.19f, 0.29f, 0.31f, 0.81f, 0.19f, 1.74f)
                curveToRelative(-0.3f, 2.31f, -0.53f, 7.07f, -0.53f, 7.07f)
                reflectiveCurveToRelative(-0.05f, 0.23f, 0.44f, -0.77f)
                curveToRelative(0.01f, -0.04f, 0.03f, -0.07f, 0.05f, -0.1f)
                curveToRelative(0.03f, -0.02f, 0.06f, -0.04f, 0.1f, -0.08f)
                curveToRelative(0.29f, -0.36f, 1.09f, -0.56f, 1.65f, -0.56f)
                curveToRelative(0.23f, 0.03f, 0.43f, 0.09f, 0.54f, 0.16f)
                curveToRelative(0.22f, 0.33f, 0.09f, 1.55f, 0.09f, 1.55f)
                curveToRelative(-0.46f, 0.04f, -1.34f, 0.29f, -1.65f, 0.33f)
                curveToRelative(-0.31f, 0.05f, -0.78f, 2.05f, -1.44f, 1.85f)
                curveToRelative(-0.66f, -0.21f, -2.13f, -1.12f, -2.13f, -1.24f)
                curveToRelative(0.0f, -0.11f, 0.12f, -1.44f, 0.15f, -1.79f)
                verticalLineToRelative(-0.07f)
                verticalLineToRelative(-0.01f)
                curveToRelative(0.03f, -0.27f, 0.01f, -0.39f, -0.12f, -0.12f)
                curveToRelative(-0.11f, 0.23f, -0.58f, 1.72f, -1.11f, 3.34f)
                curveToRelative(-0.05f, 0.14f, -1.05f, 3.13f, -1.18f, 3.49f)
                curveToRelative(-0.15f, 0.42f, -0.29f, 0.75f, -0.38f, 0.91f)
                curveToRelative(-0.13f, 0.19f, -0.32f, 0.3f, -0.58f, 0.23f)
                curveToRelative(-0.65f, -0.2f, -1.46f, -1.08f, -1.47f, -1.3f)
                curveToRelative(-0.02f, -1.24f, 0.06f, -7.9f, -0.24f, -7.35f)
                curveToRelative(-0.32f, 0.57f, -2.73f, 4.52f, -2.73f, 4.52f)
                curveToRelative(-0.04f, 0.01f, -0.07f, 0.01f, -0.11f, 0.01f)
                curveToRelative(-0.17f, -0.02f, -0.44f, -0.07f, -0.51f, -0.23f)
                curveToRelative(0.0f, -0.01f, -0.01f, -0.02f, -0.01f, -0.03f)
                curveToRelative(-0.01f, -0.01f, -0.01f, -0.02f, -0.02f, -0.04f)
                curveToRelative(-0.03f, -0.11f, -0.04f, -0.23f, -0.07f, -0.33f)
                curveToRelative(-0.11f, -0.36f, -0.28f, -0.88f, -0.47f, -1.4f)
                curveToRelative(-0.27f, -0.9f, -0.56f, -1.82f, -0.61f, -1.92f)
                curveToRelative(-0.09f, -0.2f, -0.22f, -0.12f, -0.35f, 0.0f)
                curveToRelative(-0.54f, 0.45f, -1.68f, 2.45f, -2.72f, 2.56f)
                close()
            }
        }
        .build()
        return _audiomack!!
    }

private var _audiomack: VectorAsset? = null
