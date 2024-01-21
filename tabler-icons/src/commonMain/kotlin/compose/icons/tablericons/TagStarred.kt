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

public val TablerIcons.TagStarred: ImageVector
    get() {
        if (_tagStarred != null) {
            return _tagStarred!!
        }
        _tagStarred = Builder(name = "TagStarred", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.5f, 7.5f)
                moveToRelative(-1.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, 2.0f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, true, false, -2.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                verticalLineToRelative(5.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 3.408f, 0.0f)
                lineToRelative(5.592f, -5.592f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 0.0f, -3.408f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.414f, -0.586f)
                horizontalLineToRelative(-5.172f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, -3.0f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 13.847f)
                lineToRelative(-1.5f, 1.153f)
                lineToRelative(0.532f, -1.857f)
                lineToRelative(-1.532f, -1.143f)
                horizontalLineToRelative(1.902f)
                lineToRelative(0.598f, -1.8f)
                lineToRelative(0.598f, 1.8f)
                horizontalLineToRelative(1.902f)
                lineToRelative(-1.532f, 1.143f)
                lineToRelative(0.532f, 1.857f)
                close()
            }
        }
        .build()
        return _tagStarred!!
    }

private var _tagStarred: ImageVector? = null
