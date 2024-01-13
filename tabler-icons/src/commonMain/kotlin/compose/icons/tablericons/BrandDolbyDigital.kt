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

public val TablerIcons.BrandDolbyDigital: ImageVector
    get() {
        if (_brandDolbyDigital != null) {
            return _brandDolbyDigital!!
        }
        _brandDolbyDigital = Builder(name = "BrandDolbyDigital", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(-0.89f)
                curveToRelative(-3.34f, 0.0f, -6.047f, -2.686f, -6.047f, -6.0f)
                reflectiveCurveToRelative(2.707f, -6.0f, 6.046f, -6.0f)
                horizontalLineToRelative(0.891f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.063f, 6.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(0.891f)
                curveToRelative(3.34f, 0.0f, 6.046f, -2.686f, 6.046f, -6.0f)
                reflectiveCurveToRelative(-2.707f, -6.0f, -6.046f, -6.0f)
                horizontalLineToRelative(-0.89f)
                close()
            }
        }
        .build()
        return _brandDolbyDigital!!
    }

private var _brandDolbyDigital: ImageVector? = null
