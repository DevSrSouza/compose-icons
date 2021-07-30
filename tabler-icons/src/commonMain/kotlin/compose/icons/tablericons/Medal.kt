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

public val TablerIcons.Medal: ImageVector
    get() {
        if (_medal != null) {
            return _medal!!
        }
        _medal = Builder(name = "Medal", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 4.0f)
                verticalLineToRelative(3.0f)
                moveToRelative(-4.0f, -3.0f)
                verticalLineToRelative(6.0f)
                moveToRelative(8.0f, -6.0f)
                verticalLineToRelative(6.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 18.5f)
                lineToRelative(-3.0f, 1.5f)
                lineToRelative(0.5f, -3.5f)
                lineToRelative(-2.0f, -2.0f)
                lineToRelative(3.0f, -0.5f)
                lineToRelative(1.5f, -3.0f)
                lineToRelative(1.5f, 3.0f)
                lineToRelative(3.0f, 0.5f)
                lineToRelative(-2.0f, 2.0f)
                lineToRelative(0.5f, 3.5f)
                close()
            }
        }
        .build()
        return _medal!!
    }

private var _medal: ImageVector? = null
