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

public val TablerIcons.SunOff: ImageVector
    get() {
        if (_sunOff != null) {
            return _sunOff!!
        }
        _sunOff = Builder(name = "SunOff", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 12.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                moveToRelative(-2.834f, 1.177f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.654f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(8.0f, -9.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(8.0f, 8.0f)
                horizontalLineToRelative(1.0f)
                moveToRelative(-9.0f, 8.0f)
                verticalLineToRelative(1.0f)
                moveToRelative(-6.4f, -15.4f)
                lineToRelative(0.7f, 0.7f)
                moveToRelative(12.1f, -0.7f)
                lineToRelative(-0.7f, 0.7f)
                moveToRelative(0.0f, 11.4f)
                lineToRelative(0.7f, 0.7f)
                moveToRelative(-12.1f, -0.7f)
                lineToRelative(-0.7f, 0.7f)
            }
        }
        .build()
        return _sunOff!!
    }

private var _sunOff: ImageVector? = null
