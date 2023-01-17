package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.BrandZwift: ImageVector
    get() {
        if (_brandZwift != null) {
            return _brandZwift!!
        }
        _brandZwift = Builder(name = "BrandZwift", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.5f, 4.0f)
                curveToRelative(-1.465f, 0.0f, -2.5f, 1.101f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.035f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.5f)
                lineToRelative(-4.637f, 7.19f)
                arcToRelative(2.434f, 2.434f, 0.0f, false, false, -0.011f, 2.538f)
                curveToRelative(0.473f, 0.787f, 1.35f, 1.272f, 2.3f, 1.272f)
                horizontalLineToRelative(10.848f)
                curveToRelative(1.465f, 0.0f, 2.5f, -1.101f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.035f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineToRelative(7.0f, -11.0f)
                horizontalLineToRelative(-15.5f)
                close()
            }
        }
        .build()
        return _brandZwift!!
    }

private var _brandZwift: ImageVector? = null
