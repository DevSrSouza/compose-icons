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

public val TablerIcons.BrandAlgolia: ImageVector
    get() {
        if (_brandAlgolia != null) {
            return _brandAlgolia!!
        }
        _brandAlgolia = Builder(name = "BrandAlgolia", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 2.0f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.5f, 11.0f)
                curveToRelative(-0.414f, -1.477f, -1.886f, -2.5f, -3.5f, -2.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, -3.5f, 3.5f)
                arcToRelative(3.47f, 3.47f, 0.0f, false, false, 3.5f, 3.5f)
                curveToRelative(0.974f, 0.0f, 1.861f, -0.357f, 2.5f, -1.0f)
                lineToRelative(4.5f, 4.5f)
                verticalLineToRelative(-15.0f)
                horizontalLineToRelative(-7.0f)
                curveToRelative(-4.386f, 0.0f, -8.0f, 3.582f, -8.0f, 8.0f)
                reflectiveCurveToRelative(3.614f, 8.0f, 8.0f, 8.0f)
                arcToRelative(7.577f, 7.577f, 0.0f, false, false, 2.998f, -0.614f)
            }
        }
        .build()
        return _brandAlgolia!!
    }

private var _brandAlgolia: ImageVector? = null
