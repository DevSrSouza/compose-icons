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

public val TablerIcons.BrandVk: ImageVector
    get() {
        if (_brandVk != null) {
            return _brandVk!!
        }
        _brandVk = Builder(name = "BrandVk", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 19.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(-9.0f)
                horizontalLineToRelative(4.0f)
                verticalLineToRelative(4.5f)
                lineToRelative(0.03f, 0.0f)
                arcToRelative(4.531f, 4.531f, 0.0f, false, false, 3.97f, -4.496f)
                horizontalLineToRelative(4.0f)
                lineToRelative(-0.342f, 1.711f)
                arcToRelative(6.858f, 6.858f, 0.0f, false, true, -3.658f, 4.789f)
                horizontalLineToRelative(0.0f)
                arcToRelative(5.34f, 5.34f, 0.0f, false, true, 3.566f, 4.111f)
                lineToRelative(0.434f, 2.389f)
                horizontalLineToRelative(0.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(4.531f, 4.531f, 0.0f, false, false, -3.97f, -4.496f)
                verticalLineToRelative(4.5f)
                close()
            }
        }
        .build()
        return _brandVk!!
    }

private var _brandVk: ImageVector? = null
