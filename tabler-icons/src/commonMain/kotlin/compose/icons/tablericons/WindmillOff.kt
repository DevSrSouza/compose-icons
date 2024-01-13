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

public val TablerIcons.WindmillOff: ImageVector
    get() {
        if (_windmillOff != null) {
            return _windmillOff!!
        }
        _windmillOff = Builder(name = "WindmillOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.061f, 11.06f)
                curveToRelative(1.18f, -0.824f, 1.939f, -2.11f, 1.939f, -3.56f)
                curveToRelative(0.0f, -2.49f, -2.24f, -4.5f, -5.0f, -4.5f)
                verticalLineToRelative(5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(0.0f, 2.76f, 2.01f, 5.0f, 4.5f, 5.0f)
                curveToRelative(0.166f, 0.0f, 0.33f, -0.01f, 0.49f, -0.03f)
                moveToRelative(2.624f, -1.36f)
                curveToRelative(0.856f, -0.91f, 1.386f, -2.19f, 1.386f, -3.61f)
                horizontalLineToRelative(-5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                curveToRelative(-2.76f, 0.0f, -5.0f, 2.01f, -5.0f, 4.5f)
                reflectiveCurveToRelative(2.24f, 4.5f, 5.0f, 4.5f)
                verticalLineToRelative(-9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(6.981f, 7.033f)
                curveToRelative(-2.244f, 0.285f, -3.981f, 2.402f, -3.981f, 4.967f)
                horizontalLineToRelative(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                lineToRelative(18.0f, 18.0f)
            }
        }
        .build()
        return _windmillOff!!
    }

private var _windmillOff: ImageVector? = null
