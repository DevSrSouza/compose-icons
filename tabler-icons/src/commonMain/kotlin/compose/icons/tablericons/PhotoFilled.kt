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

public val TablerIcons.PhotoFilled: ImageVector
    get() {
        if (_photoFilled != null) {
            return _photoFilled!!
        }
        _photoFilled = Builder(name = "PhotoFilled", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Round, strokeLineJoin = StrokeJoin.Companion.Round,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.813f, 11.612f)
                curveToRelative(0.457f, -0.38f, 0.918f, -0.38f, 1.386f, 0.011f)
                lineToRelative(0.108f, 0.098f)
                lineToRelative(4.986f, 4.986f)
                lineToRelative(0.094f, 0.083f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 1.403f, -1.403f)
                lineToRelative(-0.083f, -0.094f)
                lineToRelative(-1.292f, -1.293f)
                lineToRelative(0.292f, -0.293f)
                lineToRelative(0.106f, -0.095f)
                curveToRelative(0.457f, -0.38f, 0.918f, -0.38f, 1.386f, 0.011f)
                lineToRelative(0.108f, 0.098f)
                lineToRelative(4.674f, 4.675f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.775f, 3.599f)
                lineToRelative(-0.206f, 0.005f)
                horizontalLineToRelative(-12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.98f, -3.603f)
                lineToRelative(6.687f, -6.69f)
                lineToRelative(0.106f, -0.095f)
                close()
                moveTo(18.0f, 2.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.995f, 3.8f)
                lineToRelative(0.005f, 0.2f)
                verticalLineToRelative(9.585f)
                lineToRelative(-3.293f, -3.292f)
                lineToRelative(-0.15f, -0.137f)
                curveToRelative(-1.256f, -1.095f, -2.85f, -1.097f, -4.096f, -0.017f)
                lineToRelative(-0.154f, 0.14f)
                lineToRelative(-0.307f, 0.306f)
                lineToRelative(-2.293f, -2.292f)
                lineToRelative(-0.15f, -0.137f)
                curveToRelative(-1.256f, -1.095f, -2.85f, -1.097f, -4.096f, -0.017f)
                lineToRelative(-0.154f, 0.14f)
                lineToRelative(-5.307f, 5.306f)
                verticalLineToRelative(-9.585f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.8f, -3.995f)
                lineToRelative(0.2f, -0.005f)
                horizontalLineToRelative(12.0f)
                close()
                moveTo(15.01f, 7.0f)
                lineToRelative(-0.127f, 0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 1.986f)
                lineToRelative(0.117f, 0.007f)
                lineToRelative(0.127f, -0.007f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -1.986f)
                lineToRelative(-0.117f, -0.007f)
                close()
            }
        }
        .build()
        return _photoFilled!!
    }

private var _photoFilled: ImageVector? = null
