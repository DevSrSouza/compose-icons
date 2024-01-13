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

public val TablerIcons.TagOff: ImageVector
    get() {
        if (_tagOff != null) {
            return _tagOff!!
        }
        _tagOff = Builder(name = "TagOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.149f, 7.144f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, false, 0.351f, 0.856f)
                arcToRelative(0.498f, 0.498f, 0.0f, false, false, 0.341f, -0.135f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.883f, 3.875f)
                arcToRelative(2.99f, 2.99f, 0.0f, false, false, -0.883f, 2.125f)
                verticalLineToRelative(5.172f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, 0.586f, 1.414f)
                lineToRelative(7.71f, 7.71f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 3.408f, 0.0f)
                lineToRelative(2.796f, -2.796f)
                moveToRelative(2.005f, -2.005f)
                lineToRelative(0.79f, -0.79f)
                arcToRelative(2.41f, 2.41f, 0.0f, false, false, 0.0f, -3.41f)
                lineToRelative(-7.71f, -7.71f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -1.412f, -0.585f)
                horizontalLineToRelative(-4.173f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _tagOff!!
    }

private var _tagOff: ImageVector? = null
