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

public val TablerIcons.BrandGoogleAnalytics: ImageVector
    get() {
        if (_brandGoogleAnalytics != null) {
            return _brandGoogleAnalytics!!
        }
        _brandGoogleAnalytics = Builder(name = "BrandGoogleAnalytics", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 9.0f)
                moveToRelative(0.0f, 1.105f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, 1.105f, -1.105f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, 1.105f, 1.105f)
                verticalLineToRelative(9.79f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, -1.105f, 1.105f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, -1.105f, -1.105f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                moveToRelative(0.0f, 1.105f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, 1.105f, -1.105f)
                horizontalLineToRelative(1.79f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, 1.105f, 1.105f)
                verticalLineToRelative(15.79f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, -1.105f, 1.105f)
                horizontalLineToRelative(-1.79f)
                arcToRelative(1.105f, 1.105f, 0.0f, false, true, -1.105f, -1.105f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, false, -4.0f, 0.0f)
            }
        }
        .build()
        return _brandGoogleAnalytics!!
    }

private var _brandGoogleAnalytics: ImageVector? = null
