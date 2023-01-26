package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.Sell: ImageVector
    get() {
        if (_sell != null) {
            return _sell!!
        }
        _sell = Builder(name = "Sell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.83f, 12.83f)
                lineTo(12.0f, 2.0f)
                horizontalLineTo(2.0f)
                verticalLineToRelative(10.0f)
                lineToRelative(10.83f, 10.83f)
                lineTo(22.83f, 12.83f)
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
