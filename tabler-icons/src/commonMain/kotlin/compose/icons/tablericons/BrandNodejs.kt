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

public val TablerIcons.BrandNodejs: ImageVector
    get() {
        if (_brandNodejs != null) {
            return _brandNodejs!!
        }
        _brandNodejs = Builder(name = "BrandNodejs", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 9.0f)
                verticalLineToRelative(8.044f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.996f, 1.734f)
                lineToRelative(-1.568f, -0.9f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.436f, -2.561f)
                verticalLineToRelative(-6.635f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.436f, -2.56f)
                lineToRelative(6.0f, -3.667f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 3.128f, 0.0f)
                lineToRelative(6.0f, 3.667f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 1.436f, 2.561f)
                verticalLineToRelative(6.634f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -1.436f, 2.56f)
                lineToRelative(-6.0f, 3.667f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -3.128f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 9.0f)
                horizontalLineToRelative(-3.5f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, false, 0.0f, 3.0f)
                horizontalLineToRelative(2.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, false, true, 0.0f, 3.0f)
                horizontalLineToRelative(-3.5f)
            }
        }
        .build()
        return _brandNodejs!!
    }

private var _brandNodejs: ImageVector? = null
