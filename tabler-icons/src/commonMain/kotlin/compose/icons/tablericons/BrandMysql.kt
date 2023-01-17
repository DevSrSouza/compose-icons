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

public val TablerIcons.BrandMysql: ImageVector
    get() {
        if (_brandMysql != null) {
            return _brandMysql!!
        }
        _brandMysql = Builder(name = "BrandMysql", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(13.0f, 21.0f)
                curveToRelative(-1.427f, -1.026f, -3.59f, -3.854f, -4.0f, -6.0f)
                curveToRelative(-0.486f, 0.77f, -1.501f, 2.0f, -2.0f, 2.0f)
                curveToRelative(-1.499f, -0.888f, -0.574f, -3.973f, 0.0f, -6.0f)
                curveToRelative(-1.596f, -1.433f, -2.468f, -2.458f, -2.5f, -4.0f)
                curveToRelative(-3.35f, -3.44f, -0.444f, -5.27f, 2.5f, -3.0f)
                horizontalLineToRelative(1.0f)
                curveToRelative(8.482f, 0.5f, 6.421f, 8.07f, 9.0f, 11.5f)
                curveToRelative(2.295f, 0.522f, 3.665f, 2.254f, 5.0f, 3.5f)
                curveToRelative(-2.086f, -0.2f, -2.784f, -0.344f, -3.5f, 0.0f)
                curveToRelative(0.478f, 1.64f, 2.123f, 2.2f, 3.5f, 3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                horizontalLineToRelative(0.01f)
            }
        }
        .build()
        return _brandMysql!!
    }

private var _brandMysql: ImageVector? = null
