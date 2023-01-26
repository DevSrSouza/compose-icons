package compose.icons.studioicons.baseline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.BaselineGroup

public val BaselineGroup.Sell: ImageVector
    get() {
        if (_sell != null) {
            return _sell!!
        }
        _sell = Builder(name = "Sell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.41f)
                lineToRelative(-8.83f, -8.83f)
                curveTo(12.21f, 2.21f, 11.7f, 2.0f, 11.17f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineToRelative(7.17f)
                curveToRelative(0.0f, 0.53f, 0.21f, 1.04f, 0.59f, 1.41f)
                lineToRelative(8.83f, 8.83f)
                curveToRelative(0.78f, 0.78f, 2.05f, 0.78f, 2.83f, 0.0f)
                lineToRelative(7.17f, -7.17f)
                curveTo(22.2f, 13.46f, 22.2f, 12.2f, 21.41f, 11.41f)
                close()
                moveTo(6.5f, 8.0f)
                curveTo(5.67f, 8.0f, 5.0f, 7.33f, 5.0f, 6.5f)
                reflectiveCurveTo(5.67f, 5.0f, 6.5f, 5.0f)
                reflectiveCurveTo(8.0f, 5.67f, 8.0f, 6.5f)
                reflectiveCurveTo(7.33f, 8.0f, 6.5f, 8.0f)
                close()
            }
        }
        .build()
        return _sell!!
    }

private var _sell: ImageVector? = null
