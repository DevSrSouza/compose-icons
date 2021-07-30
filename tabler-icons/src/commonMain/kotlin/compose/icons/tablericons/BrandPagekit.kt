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

public val TablerIcons.BrandPagekit: ImageVector
    get() {
        if (_brandPagekit != null) {
            return _brandPagekit!!
        }
        _brandPagekit = Builder(name = "BrandPagekit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.077f, 20.0f)
                horizontalLineToRelative(-5.077f)
                verticalLineToRelative(-16.0f)
                horizontalLineToRelative(11.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(-5.077f)
            }
        }
        .build()
        return _brandPagekit!!
    }

private var _brandPagekit: ImageVector? = null
