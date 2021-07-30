package compose.icons.fontawesomeicons.brands

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.BrandsGroup

public val BrandsGroup.Dyalog: ImageVector
    get() {
        if (_dyalog != null) {
            return _dyalog!!
        }
        _dyalog = Builder(name = "Dyalog", defaultWidth = 416.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 416.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                verticalLineToRelative(119.2f)
                horizontalLineToRelative(64.0f)
                verticalLineTo(96.0f)
                horizontalLineToRelative(107.2f)
                curveTo(284.6f, 96.0f, 352.0f, 176.2f, 352.0f, 255.9f)
                curveTo(352.0f, 332.0f, 293.4f, 416.0f, 171.2f, 416.0f)
                horizontalLineTo(0.0f)
                verticalLineToRelative(64.0f)
                horizontalLineToRelative(171.2f)
                curveTo(331.9f, 480.0f, 416.0f, 367.3f, 416.0f, 255.9f)
                curveToRelative(0.0f, -58.7f, -22.1f, -113.4f, -62.3f, -154.3f)
                curveTo(308.9f, 56.0f, 245.7f, 32.0f, 171.2f, 32.0f)
                horizontalLineTo(0.0f)
                close()
            }
        }
        .build()
        return _dyalog!!
    }

private var _dyalog: ImageVector? = null
