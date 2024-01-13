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

public val TablerIcons.FilterHeart: ImageVector
    get() {
        if (_filterHeart != null) {
            return _filterHeart!!
        }
        _filterHeart = Builder(name = "FilterHeart", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.888f, 20.37f)
                lineToRelative(-1.888f, 0.63f)
                verticalLineToRelative(-8.5f)
                lineToRelative(-4.48f, -4.928f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.52f, -1.345f)
                verticalLineToRelative(-2.227f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(2.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -0.586f, 1.414f)
                lineToRelative(-3.503f, 3.503f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                lineToRelative(3.35f, -3.284f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, 0.005f, -3.071f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.129f, -0.006f)
                lineToRelative(-0.224f, 0.22f)
                lineToRelative(-0.223f, -0.22f)
                arcToRelative(2.242f, 2.242f, 0.0f, false, false, -3.128f, -0.006f)
                arcToRelative(2.143f, 2.143f, 0.0f, false, false, -0.006f, 3.071f)
                lineToRelative(3.355f, 3.296f)
                close()
            }
        }
        .build()
        return _filterHeart!!
    }

private var _filterHeart: ImageVector? = null
