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

public val TablerIcons.BrandYoutubeKids: ImageVector
    get() {
        if (_brandYoutubeKids != null) {
            return _brandYoutubeKids!!
        }
        _brandYoutubeKids = Builder(name = "BrandYoutubeKids", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.608f, 17.75f)
                lineToRelative(-3.9f, 0.268f)
                horizontalLineToRelative(-0.027f)
                arcToRelative(13.83f, 13.83f, 0.0f, false, false, -3.722f, 0.828f)
                lineToRelative(-2.511f, 0.908f)
                arcToRelative(4.111f, 4.111f, 0.0f, false, true, -3.287f, -0.216f)
                arcToRelative(3.82f, 3.82f, 0.0f, false, true, -1.98f, -2.527f)
                lineToRelative(-1.376f, -6.05f)
                arcToRelative(3.669f, 3.669f, 0.0f, false, true, 0.536f, -2.86f)
                arcToRelative(3.964f, 3.964f, 0.0f, false, true, 2.489f, -1.661f)
                lineToRelative(11.25f, -2.354f)
                curveToRelative(2.137f, -0.448f, 4.247f, 0.85f, 4.713f, 2.9f)
                lineToRelative(1.403f, 6.162f)
                arcToRelative(3.677f, 3.677f, 0.0f, false, true, -0.697f, 3.086f)
                arcToRelative(4.007f, 4.007f, 0.0f, false, true, -2.89f, 1.512f)
                verticalLineToRelative(0.002f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 10.0f)
                lineToRelative(1.208f, 5.0f)
                lineToRelative(4.292f, -4.0f)
                close()
            }
        }
        .build()
        return _brandYoutubeKids!!
    }

private var _brandYoutubeKids: ImageVector? = null
