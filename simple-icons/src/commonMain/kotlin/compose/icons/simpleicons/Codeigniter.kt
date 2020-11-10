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

public val SimpleIcons.Codeigniter: VectorAsset
    get() {
        if (_codeigniter != null) {
            return _codeigniter!!
        }
        _codeigniter = VectorAssetBuilder(name = "Codeigniter", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.49f, 24.0f)
                curveToRelative(-1.54f, -0.68f, -2.586f, -2.146f, -2.723f, -3.824f)
                curveToRelative(0.09f, -1.727f, 1.002f, -3.305f, 2.45f, -4.246f)
                curveToRelative(-0.238f, 0.58f, -0.18f, 1.24f, 0.15f, 1.77f)
                curveToRelative(0.376f, 0.525f, 1.022f, 0.777f, 1.655f, 0.646f)
                curveToRelative(0.902f, -0.254f, 1.43f, -1.19f, 1.176f, -2.092f)
                curveToRelative(-0.09f, -0.316f, -0.27f, -0.602f, -0.516f, -0.818f)
                curveToRelative(-1.02f, -0.83f, -1.532f, -2.133f, -1.35f, -3.436f)
                curveToRelative(0.175f, -0.69f, 0.557f, -1.314f, 1.096f, -1.785f)
                curveToRelative(-0.405f, 1.08f, 0.737f, 2.146f, 1.504f, 2.67f)
                curveToRelative(1.36f, 0.816f, 2.67f, 1.713f, 3.924f, 2.686f)
                curveToRelative(1.37f, 1.08f, 2.117f, 2.77f, 2.0f, 4.5f)
                curveToRelative(-0.308f, 1.84f, -1.61f, 3.36f, -3.385f, 3.93f)
                curveToRelative(3.55f, -0.79f, 7.21f, -3.61f, 7.28f, -7.61f)
                curveToRelative(-0.07f, -3.2f, -1.98f, -6.072f, -4.9f, -7.38f)
                horizontalLineToRelative(-0.13f)
                curveToRelative(0.065f, 0.157f, 0.096f, 0.326f, 0.09f, 0.496f)
                curveToRelative(0.01f, -0.11f, 0.01f, -0.22f, 0.0f, -0.33f)
                curveToRelative(0.016f, 0.13f, 0.016f, 0.26f, 0.0f, 0.39f)
                curveToRelative(-0.222f, 0.91f, -1.14f, 1.47f, -2.052f, 1.248f)
                curveToRelative(-0.364f, -0.09f, -0.69f, -0.295f, -0.924f, -0.59f)
                curveToRelative(-1.17f, -1.5f, 0.0f, -3.207f, 0.196f, -4.857f)
                curveToRelative(0.12f, -2.11f, -0.844f, -4.127f, -2.554f, -5.36f)
                curveToRelative(0.856f, 1.427f, -0.284f, 3.3f, -1.113f, 4.366f)
                curveToRelative(-0.83f, 1.066f, -2.03f, 1.86f, -3.008f, 2.79f)
                curveToRelative(-1.054f, 0.98f, -2.02f, 2.058f, -2.887f, 3.21f)
                curveToRelative(-1.874f, 2.29f, -2.61f, 5.31f, -2.0f, 8.205f)
                curveToRelative(0.836f, 2.79f, 3.155f, 4.886f, 6.015f, 5.43f)
                horizontalLineTo(8.5f)
                close()
            }
        }
        .build()
        return _codeigniter!!
    }

private var _codeigniter: VectorAsset? = null
