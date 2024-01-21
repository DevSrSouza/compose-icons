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

public val TablerIcons.BrandVisualStudio: ImageVector
    get() {
        if (_brandVisualStudio != null) {
            return _brandVisualStudio!!
        }
        _brandVisualStudio = Builder(name = "BrandVisualStudio", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(4.0f, 8.0f)
                lineToRelative(2.0f, -1.0f)
                lineToRelative(10.0f, 13.0f)
                lineToRelative(4.0f, -2.0f)
                verticalLineToRelative(-12.0f)
                lineToRelative(-4.0f, -2.0f)
                lineToRelative(-10.0f, 13.0f)
                lineToRelative(-2.0f, -1.0f)
                close()
            }
        }
        .build()
        return _brandVisualStudio!!
    }

private var _brandVisualStudio: ImageVector? = null
