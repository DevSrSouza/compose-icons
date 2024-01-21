package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandStorybook: ImageVector
    get() {
        if (_brandStorybook != null) {
            return _brandStorybook!!
        }
        _brandStorybook = Builder(name = "BrandStorybook", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 4.0f)
                lineToRelative(0.5f, 16.5f)
                lineToRelative(13.5f, 0.5f)
                verticalLineToRelative(-18.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 15.0f)
                curveToRelative(0.6f, 1.5f, 1.639f, 2.0f, 3.283f, 2.0f)
                horizontalLineToRelative(-0.283f)
                curveToRelative(1.8f, 0.0f, 3.0f, -0.974f, 3.0f, -2.435f)
                curveToRelative(0.0f, -1.194f, -0.831f, -1.799f, -2.147f, -2.333f)
                lineToRelative(-1.975f, -0.802f)
                curveToRelative(-1.15f, -0.467f, -1.878f, -1.422f, -1.878f, -2.467f)
                curveToRelative(0.0f, -0.97f, 0.899f, -1.786f, 2.087f, -1.893f)
                lineToRelative(0.613f, -0.055f)
                curveToRelative(1.528f, -0.138f, 3.0f, 0.762f, 3.3f, 1.985f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.5f)
                verticalLineToRelative(1.0f)
            }
        }
        .build()
        return _brandStorybook!!
    }

private var _brandStorybook: ImageVector? = null
