package compose.icons.tablericons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Round
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
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.105f, 9.0f)
                lineTo(12.895f, 9.0f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 14.0f, 10.105f)
                lineTo(14.0f, 19.895f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 12.895f, 21.0f)
                lineTo(11.105f, 21.0f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 10.0f, 19.895f)
                lineTo(10.0f, 10.105f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 11.105f, 9.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.105f, 3.0f)
                lineTo(19.895f, 3.0f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 21.0f, 4.105f)
                lineTo(21.0f, 19.895f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 19.895f, 21.0f)
                lineTo(18.105f, 21.0f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 17.0f, 19.895f)
                lineTo(17.0f, 4.105f)
                arcTo(1.105f, 1.105f, 0.0f, false, true, 18.105f, 3.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 19.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
        .build()
        return _brandGoogleAnalytics!!
    }

private var _brandGoogleAnalytics: ImageVector? = null
