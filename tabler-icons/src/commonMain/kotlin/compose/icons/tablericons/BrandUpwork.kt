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

public val TablerIcons.BrandUpwork: ImageVector
    get() {
        if (_brandUpwork != null) {
            return _brandUpwork!!
        }
        _brandUpwork = Builder(name = "BrandUpwork", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 7.0f)
                verticalLineToRelative(5.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, false, 6.0f, 0.0f)
                verticalLineToRelative(-5.0f)
                horizontalLineToRelative(1.0f)
                lineToRelative(4.0f, 6.0f)
                curveToRelative(0.824f, 1.319f, 1.945f, 2.0f, 3.5f, 2.0f)
                arcToRelative(3.5f, 3.5f, 0.0f, false, false, 0.0f, -7.0f)
                curveToRelative(-2.027f, 0.0f, -3.137f, 1.0f, -3.5f, 3.0f)
                curveToRelative(-0.242f, 1.33f, -0.908f, 4.0f, -2.0f, 8.0f)
            }
        }
        .build()
        return _brandUpwork!!
    }

private var _brandUpwork: ImageVector? = null
