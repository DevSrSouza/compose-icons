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

public val TablerIcons.Rotate360: ImageVector
    get() {
        if (_rotate360 != null) {
            return _rotate360!!
        }
        _rotate360 = Builder(name = "Rotate360", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.458f, 11.042f)
                curveToRelative(0.86f, -2.366f, 0.722f, -4.58f, -0.6f, -5.9f)
                curveToRelative(-2.272f, -2.274f, -7.185f, -1.045f, -10.973f, 2.743f)
                curveToRelative(-3.788f, 3.788f, -5.017f, 8.701f, -2.744f, 10.974f)
                curveToRelative(2.227f, 2.226f, 6.987f, 1.093f, 10.74f, -2.515f)
            }
        }
        .build()
        return _rotate360!!
    }

private var _rotate360: ImageVector? = null
