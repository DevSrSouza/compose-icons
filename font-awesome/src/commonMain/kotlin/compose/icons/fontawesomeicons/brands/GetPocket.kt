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

public val BrandsGroup.GetPocket: ImageVector
    get() {
        if (_getPocket != null) {
            return _getPocket!!
        }
        _getPocket = Builder(name = "GetPocket", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(407.6f, 64.0f)
                horizontalLineToRelative(-367.0f)
                curveTo(18.5f, 64.0f, 0.0f, 82.5f, 0.0f, 104.6f)
                verticalLineToRelative(135.2f)
                curveTo(0.0f, 364.5f, 99.7f, 464.0f, 224.2f, 464.0f)
                curveToRelative(124.0f, 0.0f, 223.8f, -99.5f, 223.8f, -224.2f)
                lineTo(448.0f, 104.6f)
                curveToRelative(0.0f, -22.4f, -17.7f, -40.6f, -40.4f, -40.6f)
                close()
                moveTo(245.6f, 332.5f)
                curveToRelative(-12.4f, 11.8f, -31.4f, 11.1f, -42.4f, 0.0f)
                curveTo(89.5f, 223.6f, 88.3f, 227.4f, 88.3f, 209.3f)
                curveToRelative(0.0f, -16.9f, 13.8f, -30.7f, 30.7f, -30.7f)
                curveToRelative(17.0f, 0.0f, 16.1f, 3.8f, 105.2f, 89.3f)
                curveToRelative(90.6f, -86.9f, 88.6f, -89.3f, 105.5f, -89.3f)
                curveToRelative(16.9f, 0.0f, 30.7f, 13.8f, 30.7f, 30.7f)
                curveToRelative(0.0f, 17.8f, -2.9f, 15.7f, -114.8f, 123.2f)
                close()
            }
        }
        .build()
        return _getPocket!!
    }

private var _getPocket: ImageVector? = null
