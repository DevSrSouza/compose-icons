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

public val TablerIcons.BrandRust: ImageVector
    get() {
        if (_brandRust != null) {
            return _brandRust!!
        }
        _brandRust = Builder(name = "BrandRust", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.139f, 3.463f)
                curveToRelative(0.473f, -1.95f, 3.249f, -1.95f, 3.722f, 0.0f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, 2.859f, 1.185f)
                curveToRelative(1.714f, -1.045f, 3.678f, 0.918f, 2.633f, 2.633f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, 1.184f, 2.858f)
                curveToRelative(1.95f, 0.473f, 1.95f, 3.249f, 0.0f, 3.722f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, -1.185f, 2.859f)
                curveToRelative(1.045f, 1.714f, -0.918f, 3.678f, -2.633f, 2.633f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, -2.858f, 1.184f)
                curveToRelative(-0.473f, 1.95f, -3.249f, 1.95f, -3.722f, 0.0f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, -2.859f, -1.185f)
                curveToRelative(-1.714f, 1.045f, -3.678f, -0.918f, -2.633f, -2.633f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, -1.184f, -2.858f)
                curveToRelative(-1.95f, -0.473f, -1.95f, -3.249f, 0.0f, -3.722f)
                arcToRelative(1.916f, 1.916f, 0.0f, false, false, 1.185f, -2.859f)
                curveToRelative(-1.045f, -1.714f, 0.918f, -3.678f, 2.633f, -2.633f)
                arcToRelative(1.914f, 1.914f, 0.0f, false, false, 2.858f, -1.184f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(8.0f, 12.0f)
                horizontalLineToRelative(6.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 0.0f, -4.0f)
                horizontalLineToRelative(-6.0f)
                verticalLineToRelative(8.0f)
                verticalLineToRelative(-4.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.0f, 16.0f)
                horizontalLineToRelative(-2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, false, -2.0f, -2.0f)
                horizontalLineToRelative(-1.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.0f, 8.0f)
                horizontalLineToRelative(-4.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 16.0f)
                horizontalLineToRelative(4.0f)
            }
        }
        .build()
        return _brandRust!!
    }

private var _brandRust: ImageVector? = null
