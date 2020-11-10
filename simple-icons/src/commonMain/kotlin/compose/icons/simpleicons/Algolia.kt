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

public val SimpleIcons.Algolia: VectorAsset
    get() {
        if (_algolia != null) {
            return _algolia!!
        }
        _algolia = VectorAssetBuilder(name = "Algolia", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.16f, 0.0f)
                arcTo(3.156f, 3.156f, 0.0f, false, false, 0.0f, 3.152f)
                verticalLineToRelative(17.69f)
                arcTo(3.161f, 3.161f, 0.0f, false, false, 3.16f, 24.0f)
                horizontalLineToRelative(17.68f)
                curveToRelative(1.747f, 0.0f, 3.16f, -1.42f, 3.16f, -3.16f)
                lineTo(24.0f, 3.16f)
                curveTo(24.0f, 1.413f, 22.58f, 0.0f, 20.84f, 0.0f)
                lineTo(3.16f, 0.0f)
                close()
                moveTo(11.03f, 3.494f)
                horizontalLineToRelative(2.429f)
                arcTo(1.04f, 1.04f, 0.0f, false, true, 14.5f, 4.535f)
                verticalLineToRelative(0.822f)
                arcToRelative(0.14f, 0.14f, 0.0f, false, true, -0.174f, 0.14f)
                arcToRelative(7.679f, 7.647f, 0.0f, false, false, -2.043f, -0.276f)
                arcToRelative(7.564f, 7.533f, 0.0f, false, false, -2.113f, 0.297f)
                curveToRelative(-0.095f, 0.021f, -0.182f, -0.045f, -0.182f, -0.14f)
                verticalLineToRelative(-0.843f)
                arcToRelative(1.044f, 1.04f, 0.0f, false, true, 1.041f, -1.04f)
                close()
                moveTo(6.68f, 5.714f)
                arcToRelative(1.04f, 1.035f, 0.0f, false, true, 0.75f, 0.306f)
                lineToRelative(0.414f, 0.416f)
                curveToRelative(0.058f, 0.065f, 0.051f, 0.167f, -0.022f, 0.21f)
                arcToRelative(7.544f, 7.513f, 0.0f, false, false, -0.941f, 0.801f)
                arcToRelative(8.0f, 7.967f, 0.0f, false, false, -0.793f, 0.932f)
                curveToRelative(-0.058f, 0.065f, -0.153f, 0.08f, -0.219f, 0.016f)
                lineToRelative(-0.408f, -0.409f)
                arcToRelative(1.043f, 1.04f, 0.0f, false, true, 0.0f, -1.472f)
                lineToRelative(0.496f, -0.494f)
                arcToRelative(1.04f, 1.035f, 0.0f, false, true, 0.723f, -0.305f)
                close()
                moveTo(12.277f, 6.064f)
                arcToRelative(6.774f, 6.774f, 0.0f, false, true, 6.787f, 6.778f)
                arcToRelative(6.784f, 6.784f, 0.0f, false, true, -6.787f, 6.783f)
                curveToRelative(-3.748f, 0.0f, -6.789f, -3.028f, -6.789f, -6.777f)
                arcToRelative(6.786f, 6.786f, 0.0f, false, true, 6.79f, -6.784f)
                close()
                moveTo(12.277f, 8.072f)
                arcToRelative(4.783f, 4.783f, 0.0f, false, false, -4.783f, 4.776f)
                arcToRelative(4.783f, 4.783f, 0.0f, false, false, 4.783f, 4.775f)
                arcToRelative(4.777f, 4.777f, 0.0f, false, false, 4.784f, -4.775f)
                arcToRelative(4.782f, 4.782f, 0.0f, false, false, -4.784f, -4.776f)
                close()
                moveTo(12.422f, 8.91f)
                arcToRelative(3.935f, 3.919f, 0.0f, false, true, 3.281f, 1.988f)
                curveToRelative(0.036f, 0.073f, 0.015f, 0.16f, -0.057f, 0.196f)
                lineToRelative(-3.166f, 1.638f)
                curveToRelative(-0.093f, 0.052f, -0.205f, -0.023f, -0.205f, -0.125f)
                lineTo(12.275f, 9.05f)
                horizontalLineToRelative(0.002f)
                curveToRelative(0.0f, -0.08f, 0.072f, -0.139f, 0.145f, -0.139f)
                close()
            }
        }
        .build()
        return _algolia!!
    }

private var _algolia: VectorAsset? = null
