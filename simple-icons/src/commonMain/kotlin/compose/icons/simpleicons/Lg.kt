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

public val SimpleIcons.Lg: VectorAsset
    get() {
        if (_lg != null) {
            return _lg!!
        }
        _lg = VectorAssetBuilder(name = "Lg", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.286f, 6.714f)
                arcToRelative(5.286f, 5.286f, 0.0f, true, false, 0.0f, 10.572f)
                arcToRelative(5.287f, 5.287f, 0.0f, false, false, 0.0f, -10.572f)
                close()
                moveTo(5.286f, 7.574f)
                curveToRelative(0.05f, 0.0f, 0.156f, 0.0f, 0.21f, 0.002f)
                verticalLineToRelative(0.413f)
                arcToRelative(14.622f, 14.621f, 0.0f, false, false, -0.21f, -0.003f)
                arcTo(3.986f, 3.986f, 0.0f, false, false, 2.45f, 9.161f)
                arcToRelative(3.982f, 3.982f, 0.0f, false, false, -1.175f, 2.836f)
                curveToRelative(0.0f, 1.072f, 0.417f, 2.08f, 1.175f, 2.836f)
                arcToRelative(3.986f, 3.986f, 0.0f, false, false, 2.836f, 1.175f)
                arcToRelative(4.02f, 4.019f, 0.0f, false, false, 4.003f, -3.741f)
                verticalLineToRelative(-0.06f)
                lineTo(6.551f, 12.207f)
                verticalLineToRelative(-0.41f)
                horizontalLineToRelative(2.981f)
                lineToRelative(0.177f, -0.001f)
                verticalLineToRelative(0.201f)
                arcToRelative(4.394f, 4.394f, 0.0f, false, true, -1.294f, 3.128f)
                arcToRelative(4.4f, 4.4f, 0.0f, false, true, -3.13f, 1.296f)
                curveToRelative(-1.18f, 0.0f, -2.29f, -0.46f, -3.13f, -1.296f)
                arcToRelative(4.394f, 4.394f, 0.0f, false, true, -1.293f, -3.128f)
                arcToRelative(4.43f, 4.43f, 0.0f, false, true, 4.424f, -4.425f)
                close()
                moveTo(21.349f, 8.452f)
                curveToRelative(-2.21f, 0.0f, -3.372f, 1.207f, -3.372f, 3.508f)
                curveToRelative(0.0f, 2.29f, 1.05f, 3.53f, 3.36f, 3.53f)
                curveToRelative(1.06f, 0.0f, 2.099f, -0.27f, 2.663f, -0.665f)
                verticalLineToRelative(-3.316f)
                horizontalLineToRelative(-2.74f)
                verticalLineToRelative(1.274f)
                horizontalLineToRelative(1.285f)
                verticalLineToRelative(1.195f)
                curveToRelative(-0.237f, 0.09f, -0.7f, 0.181f, -1.14f, 0.181f)
                curveToRelative(-1.42f, 0.0f, -1.894f, -0.722f, -1.894f, -2.188f)
                curveToRelative(0.0f, -1.398f, 0.45f, -2.222f, 1.872f, -2.222f)
                curveToRelative(0.79f, 0.0f, 1.24f, 0.248f, 1.613f, 0.722f)
                lineToRelative(0.982f, -0.902f)
                curveToRelative(-0.598f, -0.857f, -1.647f, -1.117f, -2.63f, -1.117f)
                close()
                moveTo(12.936f, 8.554f)
                verticalLineToRelative(6.834f)
                horizontalLineToRelative(4.85f)
                verticalLineToRelative(-1.33f)
                horizontalLineToRelative(-3.27f)
                lineTo(14.516f, 8.553f)
                close()
                moveTo(3.598f, 9.677f)
                arcToRelative(0.635f, 0.635f, 0.0f, true, true, 0.0f, 1.27f)
                arcToRelative(0.635f, 0.635f, 0.0f, false, true, 0.0f, -1.27f)
                close()
                moveTo(5.076f, 9.679f)
                horizontalLineToRelative(0.42f)
                verticalLineToRelative(4.22f)
                horizontalLineToRelative(1.052f)
                verticalLineToRelative(0.414f)
                lineTo(5.076f, 14.313f)
                close()
            }
        }
        .build()
        return _lg!!
    }

private var _lg: VectorAsset? = null
