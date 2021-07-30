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
                moveTo(10.0908f, 4.0097f)
                lineToRelative(0.495f, -0.495f)
                arcToRelative(2.0f, 2.0f, 101.0181f, false, true, 2.8284f, 0.0f)
                lineToRelative(7.0711f, 7.0711f)
                arcToRelative(2.0f, 2.0f, 89.7135f, false, true, -0.0f, 2.8284f)
                lineToRelative(-7.0711f, 7.0711f)
                arcToRelative(2.0f, 2.0f, 80.3937f, false, true, -2.8284f, -0.0f)
                lineToRelative(-7.0711f, -7.0711f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.0f, -2.8284f)
                lineToRelative(3.5355f, -3.5355f)
                lineToRelative(-3.9881f, -0.0f)
                moveToRelative(3.9881f, 3.9881f)
                lineToRelative(0.0f, -3.9881f)
            }
        }
        .build()
        return _rotateRectangle!!
    }

private var _rotateRectangle: ImageVector? = null
