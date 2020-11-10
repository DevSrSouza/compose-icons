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

public val SimpleIcons.Sonarsource: VectorAsset
    get() {
        if (_sonarsource != null) {
            return _sonarsource!!
        }
        _sonarsource = VectorAssetBuilder(name = "Sonarsource", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.71f, 0.4f)
                lineToRelative(-0.467f, 0.737f)
                curveToRelative(3.476f, 2.14f, 6.284f, 5.28f, 7.955f, 8.89f)
                lineTo(24.0f, 9.694f)
                curveToRelative(-1.671f, -3.81f, -4.68f, -7.086f, -8.29f, -9.292f)
                close()
                moveTo(8.49f, 0.87f)
                lineToRelative(-0.333f, 1.069f)
                curveToRelative(6.952f, 2.006f, 12.434f, 7.62f, 14.039f, 14.44f)
                lineToRelative(1.069f, -0.268f)
                curveTo(21.527f, 8.958f, 15.778f, 2.942f, 8.49f, 0.87f)
                close()
                moveTo(0.0f, 2.607f)
                verticalLineToRelative(1.338f)
                curveToRelative(10.964f, 0.0f, 19.922f, 8.824f, 19.922f, 19.654f)
                horizontalLineToRelative(1.337f)
                curveTo(21.26f, 12.034f, 11.7f, 2.607f, 0.0f, 2.607f)
                close()
            }
        }
        .build()
        return _sonarsource!!
    }

private var _sonarsource: VectorAsset? = null
