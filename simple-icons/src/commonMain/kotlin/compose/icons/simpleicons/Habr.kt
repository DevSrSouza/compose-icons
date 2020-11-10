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

public val SimpleIcons.Habr: VectorAsset
    get() {
        if (_habr != null) {
            return _habr!!
        }
        _habr = VectorAssetBuilder(name = "Habr", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 0.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(24.0f, 0.0f)
                close()
                moveTo(7.025f, 4.0f)
                horizontalLineToRelative(1.633f)
                curveToRelative(1.219f, 0.0f, 1.64f, 0.029f, 1.668f, 0.113f)
                curveToRelative(0.019f, 0.066f, 0.028f, 1.369f, 0.028f, 2.897f)
                lineToRelative(-0.008f, 2.783f)
                lineToRelative(0.476f, -0.422f)
                curveToRelative(0.657f, -0.581f, 1.212f, -0.787f, 2.262f, -0.824f)
                curveToRelative(0.694f, -0.019f, 0.973f, 0.009f, 1.46f, 0.178f)
                curveToRelative(1.06f, 0.356f, 1.81f, 1.087f, 2.204f, 2.166f)
                curveToRelative(0.15f, 0.421f, 0.17f, 0.863f, 0.197f, 4.285f)
                lineToRelative(0.03f, 3.824f)
                horizontalLineToRelative(-3.338f)
                verticalLineToRelative(-3.121f)
                curveToRelative(0.0f, -3.075f, -0.01f, -3.113f, -0.217f, -3.488f)
                curveToRelative(-0.29f, -0.497f, -0.609f, -0.722f, -1.106f, -0.778f)
                curveToRelative(-0.853f, -0.093f, -1.443f, 0.197f, -1.78f, 0.89f)
                curveToRelative(-0.16f, 0.32f, -0.179f, 0.656f, -0.188f, 3.356f)
                curveToRelative(-0.01f, 1.65f, -0.03f, 3.03f, -0.03f, 3.067f)
                curveToRelative(-0.008f, 0.047f, -0.75f, 0.074f, -1.65f, 0.074f)
                horizontalLineToRelative(-1.64f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }
        .build()
        return _habr!!
    }

private var _habr: VectorAsset? = null
