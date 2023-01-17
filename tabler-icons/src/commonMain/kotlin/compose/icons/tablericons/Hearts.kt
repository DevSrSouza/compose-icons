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

public val TablerIcons.Hearts: ImageVector
    get() {
        if (_hearts != null) {
            return _hearts!!
        }
        _hearts = Builder(name = "Hearts", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.017f, 18.001f)
                lineToRelative(-2.017f, 1.999f)
                lineToRelative(-7.5f, -7.428f)
                arcToRelative(5.0f, 5.0f, 0.0f, true, true, 7.5f, -6.566f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, 8.153f, 5.784f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.99f, 20.0f)
                lineToRelative(4.197f, -4.223f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, 0.006f, -3.948f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, false, -3.91f, -0.007f)
                lineToRelative(-0.28f, 0.282f)
                lineToRelative(-0.279f, -0.283f)
                arcToRelative(2.747f, 2.747f, 0.0f, false, false, -3.91f, -0.007f)
                arcToRelative(2.81f, 2.81f, 0.0f, false, false, -0.007f, 3.948f)
                lineToRelative(4.182f, 4.238f)
                close()
            }
        }
        .build()
        return _hearts!!
    }

private var _hearts: ImageVector? = null
