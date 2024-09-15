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

public val TablerIcons.RotateRectangle: ImageVector
    get() {
        if (_rotateRectangle != null) {
            return _rotateRectangle!!
        }
        _rotateRectangle = Builder(name = "RotateRectangle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.091f, 4.01f)
                lineToRelative(0.495f, -0.495f)
                arcToRelative(2.0f, 2.0f, 101.018f, false, true, 2.828f, 0.0f)
                lineToRelative(7.071f, 7.071f)
                arcToRelative(2.0f, 2.0f, 89.714f, false, true, -0.0f, 2.828f)
                lineToRelative(-7.071f, 7.071f)
                arcToRelative(2.0f, 2.0f, 80.394f, false, true, -2.828f, -0.0f)
                lineToRelative(-7.071f, -7.071f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.828f)
                lineToRelative(3.536f, -3.536f)
                lineToRelative(-3.988f, -0.0f)
                moveToRelative(3.988f, 3.988f)
                lineToRelative(0.0f, -3.988f)
            }
        }
        .build()
        return _rotateRectangle!!
    }

private var _rotateRectangle: ImageVector? = null
