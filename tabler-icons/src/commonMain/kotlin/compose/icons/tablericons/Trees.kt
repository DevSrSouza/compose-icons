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

public val TablerIcons.Trees: ImageVector
    get() {
        if (_trees != null) {
            return _trees!!
        }
        _trees = Builder(name = "Trees", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                lineToRelative(3.0f, 3.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(4.0f, 4.0f)
                lineToRelative(-3.0f, 1.0f)
                lineToRelative(4.0f, 4.0f)
                horizontalLineToRelative(-9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 21.0f)
                lineToRelative(0.0f, -3.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 13.0f)
                lineToRelative(-2.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                lineToRelative(2.0f, -2.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 21.0f)
                verticalLineToRelative(-13.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.824f, 16.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.743f, -3.69f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.304f, -4.833f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.615f, -3.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 4.614f, 3.707f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, 0.305f, 4.833f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -2.919f, 3.695f)
                horizontalLineToRelative(-4.0f)
                close()
            }
        }
        .build()
        return _trees!!
    }

private var _trees: ImageVector? = null
