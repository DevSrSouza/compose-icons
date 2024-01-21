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

public val TablerIcons.Swipe: ImageVector
    get() {
        if (_swipe != null) {
            return _swipe!!
        }
        _swipe = Builder(name = "Swipe", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 16.572f)
                verticalLineToRelative(2.42f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -2.009f, 2.008f)
                horizontalLineToRelative(-7.981f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, -2.01f, -2.009f)
                verticalLineToRelative(-7.981f)
                arcToRelative(2.01f, 2.01f, 0.0f, false, true, 2.009f, -2.01f)
                horizontalLineToRelative(2.954f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.167f, 4.511f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 2.496f, -1.441f)
                lineToRelative(7.826f, 2.097f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, 1.441f, 2.496f)
                lineToRelative(-2.097f, 7.826f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, -2.496f, 1.441f)
                lineToRelative(-7.827f, -2.097f)
                arcToRelative(2.04f, 2.04f, 0.0f, false, true, -1.441f, -2.496f)
                lineToRelative(2.098f, -7.827f)
                close()
            }
        }
        .build()
        return _swipe!!
    }

private var _swipe: ImageVector? = null
