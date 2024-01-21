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

public val TablerIcons.SchoolOff: ImageVector
    get() {
        if (_schoolOff != null) {
            return _schoolOff!!
        }
        _schoolOff = Builder(name = "SchoolOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 9.0f)
                lineToRelative(-10.0f, -4.0f)
                lineToRelative(-2.136f, 0.854f)
                moveToRelative(-2.864f, 1.146f)
                lineToRelative(-5.0f, 2.0f)
                lineToRelative(10.0f, 4.0f)
                lineToRelative(0.697f, -0.279f)
                moveToRelative(2.878f, -1.151f)
                lineToRelative(6.425f, -2.57f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.0f, 10.6f)
                verticalLineToRelative(5.4f)
                curveToRelative(0.0f, 1.657f, 2.686f, 3.0f, 6.0f, 3.0f)
                curveToRelative(2.334f, 0.0f, 4.357f, -0.666f, 5.35f, -1.64f)
                moveToRelative(0.65f, -3.36f)
                verticalLineToRelative(-3.4f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _schoolOff!!
    }

private var _schoolOff: ImageVector? = null
