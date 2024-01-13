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

public val TablerIcons.Tags: ImageVector
    get() {
        if (_tags != null) {
            return _tags!!
        }
        _tags = Builder(name = "Tags", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 8.0f)
                verticalLineToRelative(4.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                lineToRelative(5.71f, 5.71f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 3.408f, 0.0f)
                lineToRelative(3.592f, -3.592f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 0.0f, -3.408f)
                lineToRelative(-5.71f, -5.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, -0.586f)
                horizontalLineToRelative(-4.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, 2.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 19.0f)
                lineToRelative(1.592f, -1.592f)
                arcToRelative(4.82f, 4.82f, 0.0f, false, false, 0.0f, -6.816f)
                lineToRelative(-4.592f, -4.592f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 10.0f)
                horizontalLineToRelative(-0.01f)
            }
        }
        .build()
        return _tags!!
    }

private var _tags: ImageVector? = null
