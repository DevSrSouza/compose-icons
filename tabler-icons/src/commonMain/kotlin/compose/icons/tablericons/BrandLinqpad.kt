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

public val TablerIcons.BrandLinqpad: ImageVector
    get() {
        if (_brandLinqpad != null) {
            return _brandLinqpad!!
        }
        _brandLinqpad = Builder(name = "BrandLinqpad", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(5.0f, 21.0f)
                horizontalLineToRelative(3.5f)
                lineToRelative(2.5f, -6.0f)
                lineToRelative(2.5f, -1.0f)
                lineToRelative(2.5f, 7.0f)
                horizontalLineToRelative(4.0f)
                lineToRelative(1.0f, -4.5f)
                lineToRelative(-2.0f, -1.0f)
                lineToRelative(-7.0f, -12.0f)
                lineToRelative(-6.0f, -0.5f)
                lineToRelative(1.5f, 4.0f)
                lineToRelative(2.5f, 0.5f)
                lineToRelative(1.0f, 2.5f)
                lineToRelative(-7.0f, 8.0f)
                close()
            }
        }
        .build()
        return _brandLinqpad!!
    }

private var _brandLinqpad: ImageVector? = null
