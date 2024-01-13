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

public val TablerIcons.BrandAuth0: ImageVector
    get() {
        if (_brandAuth0 != null) {
            return _brandAuth0!!
        }
        _brandAuth0 = Builder(name = "BrandAuth0", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 14.5f)
                lineToRelative(-5.5f, 3.5f)
                lineToRelative(2.0f, -6.0f)
                lineToRelative(-4.5f, -4.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(2.0f, -5.0f)
                lineToRelative(2.0f, 5.0f)
                horizontalLineToRelative(6.0f)
                lineToRelative(-4.5f, 4.0f)
                lineToRelative(2.0f, 6.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.507f, 8.872f)
                lineToRelative(-2.01f, -5.872f)
                horizontalLineToRelative(-12.994f)
                lineToRelative(-2.009f, 5.872f)
                curveToRelative(-1.242f, 3.593f, -0.135f, 7.094f, 3.249f, 9.407f)
                lineToRelative(5.257f, 3.721f)
                lineToRelative(5.257f, -3.721f)
                curveToRelative(3.385f, -2.313f, 4.49f, -5.814f, 3.25f, -9.407f)
                close()
            }
        }
        .build()
        return _brandAuth0!!
    }

private var _brandAuth0: ImageVector? = null
