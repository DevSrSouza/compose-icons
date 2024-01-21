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

public val TablerIcons.BrandGoogleOne: ImageVector
    get() {
        if (_brandGoogleOne != null) {
            return _brandGoogleOne!!
        }
        _brandGoogleOne = Builder(name = "BrandGoogleOne", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 5.0f)
                verticalLineToRelative(13.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 4.0f, 0.0f)
                verticalLineToRelative(-13.982f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.63f, 8.407f)
                arcToRelative(2.125f, 2.125f, 0.0f, false, false, -0.074f, 2.944f)
                curveToRelative(0.77f, 0.834f, 2.051f, 0.869f, 2.862f, 0.077f)
                lineToRelative(4.95f, -4.834f)
                curveToRelative(0.812f, -0.792f, 0.846f, -2.11f, 0.076f, -2.945f)
                arcToRelative(1.984f, 1.984f, 0.0f, false, false, -2.861f, -0.077f)
                lineToRelative(-4.953f, 4.835f)
                close()
            }
        }
        .build()
        return _brandGoogleOne!!
    }

private var _brandGoogleOne: ImageVector? = null
