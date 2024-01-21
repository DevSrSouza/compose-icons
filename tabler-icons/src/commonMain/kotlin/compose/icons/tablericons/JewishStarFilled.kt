package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.TablerIcons

public val TablerIcons.JewishStarFilled: ImageVector
    get() {
        if (_jewishStarFilled != null) {
            return _jewishStarFilled!!
        }
        _jewishStarFilled = Builder(name = "JewishStarFilled", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.433f, 6.0f)
                horizontalLineToRelative(-5.433f)
                lineToRelative(-0.114f, 0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.743f, 1.508f)
                lineToRelative(2.69f, 4.486f)
                lineToRelative(-2.69f, 4.486f)
                lineToRelative(-0.054f, 0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.911f, 1.414f)
                horizontalLineToRelative(5.434f)
                lineToRelative(2.709f, 4.514f)
                lineToRelative(0.074f, 0.108f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.64f, -0.108f)
                lineToRelative(2.708f, -4.514f)
                horizontalLineToRelative(5.435f)
                lineToRelative(0.114f, -0.006f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.743f, -1.508f)
                lineToRelative(-2.691f, -4.486f)
                lineToRelative(2.691f, -4.486f)
                lineToRelative(0.054f, -0.1f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -0.911f, -1.414f)
                horizontalLineToRelative(-5.434f)
                lineToRelative(-2.709f, -4.514f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, -1.714f, 0.0f)
                lineToRelative(-2.71f, 4.514f)
                close()
            }
        }
        .build()
        return _jewishStarFilled!!
    }

private var _jewishStarFilled: ImageVector? = null
