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

public val TablerIcons.BrandAppleArcade: ImageVector
    get() {
        if (_brandAppleArcade != null) {
            return _brandAppleArcade!!
        }
        _brandAppleArcade = Builder(name = "BrandAppleArcade", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 5.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 12.5f)
                verticalLineToRelative(4.75f)
                arcToRelative(0.734f, 0.734f, 0.0f, false, true, -0.055f, 0.325f)
                arcToRelative(0.704f, 0.704f, 0.0f, false, true, -0.348f, 0.366f)
                lineToRelative(-5.462f, 2.58f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -4.27f, 0.0f)
                lineToRelative(-5.462f, -2.58f)
                arcToRelative(0.705f, 0.705f, 0.0f, false, true, -0.401f, -0.691f)
                lineToRelative(0.0f, -4.75f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.431f, 12.216f)
                lineToRelative(5.634f, -2.332f)
                arcToRelative(5.065f, 5.065f, 0.0f, false, true, 3.87f, 0.0f)
                lineToRelative(5.634f, 2.332f)
                arcToRelative(0.692f, 0.692f, 0.0f, false, true, 0.028f, 1.269f)
                lineToRelative(-5.462f, 2.543f)
                arcToRelative(5.064f, 5.064f, 0.0f, false, true, -4.27f, 0.0f)
                lineToRelative(-5.462f, -2.543f)
                arcToRelative(0.691f, 0.691f, 0.0f, false, true, 0.028f, -1.27f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 7.0f)
                lineToRelative(0.0f, 6.0f)
            }
        }
        .build()
        return _brandAppleArcade!!
    }

private var _brandAppleArcade: ImageVector? = null
