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

public val TablerIcons.BrandFoursquare: ImageVector
    get() {
        if (_brandFoursquare != null) {
            return _brandFoursquare!!
        }
        _brandFoursquare = Builder(name = "BrandFoursquare", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 3.0f)
                horizontalLineToRelative(10.0f)
                curveToRelative(0.644f, 0.0f, 1.11f, 0.696f, 0.978f, 1.33f)
                lineToRelative(-1.984f, 9.859f)
                arcToRelative(1.014f, 1.014f, 0.0f, false, true, -1.0f, 0.811f)
                horizontalLineToRelative(-2.254f)
                curveToRelative(-0.308f, 0.0f, -0.6f, 0.141f, -0.793f, 0.382f)
                lineToRelative(-4.144f, 5.25f)
                curveToRelative(-0.599f, 0.752f, -1.809f, 0.331f, -1.809f, -0.632f)
                verticalLineToRelative(-16.0f)
                curveToRelative(0.0f, -0.564f, 0.44f, -1.0f, 1.0f, -1.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 9.0f)
                lineToRelative(5.0f, 0.0f)
            }
        }
        .build()
        return _brandFoursquare!!
    }

private var _brandFoursquare: ImageVector? = null
