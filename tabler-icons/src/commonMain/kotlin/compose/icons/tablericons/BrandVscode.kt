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

public val TablerIcons.BrandVscode: ImageVector
    get() {
        if (_brandVscode != null) {
            return _brandVscode!!
        }
        _brandVscode = Builder(name = "BrandVscode", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                verticalLineToRelative(18.0f)
                lineToRelative(4.0f, -2.5f)
                verticalLineToRelative(-13.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.165f, 13.903f)
                lineToRelative(-4.165f, 3.597f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(4.333f, -4.5f)
                moveToRelative(1.735f, -1.802f)
                lineToRelative(6.932f, -7.198f)
                verticalLineToRelative(5.0f)
                lineToRelative(-4.795f, 4.141f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.0f, 16.5f)
                lineToRelative(-11.0f, -10.0f)
                lineToRelative(-2.0f, 1.0f)
                lineToRelative(13.0f, 13.5f)
            }
        }
        .build()
        return _brandVscode!!
    }

private var _brandVscode: ImageVector? = null
