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

public val BrandsGroup.Dashcube: ImageVector
    get() {
        if (_dashcube != null) {
            return _dashcube!!
        }
        _dashcube = Builder(name = "Dashcube", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(326.6f, 104.0f)
                horizontalLineTo(110.4f)
                curveToRelative(-51.1f, 0.0f, -91.2f, 43.3f, -91.2f, 93.5f)
                verticalLineTo(427.0f)
                curveToRelative(0.0f, 50.5f, 40.1f, 85.0f, 91.2f, 85.0f)
                horizontalLineToRelative(227.2f)
                curveToRelative(51.1f, 0.0f, 91.2f, -34.5f, 91.2f, -85.0f)
                verticalLineTo(0.0f)
                lineTo(326.6f, 104.0f)
                close()
                moveTo(153.9f, 416.5f)
                curveToRelative(-17.7f, 0.0f, -32.4f, -15.1f, -32.4f, -32.8f)
                verticalLineTo(240.8f)
                curveToRelative(0.0f, -17.7f, 14.7f, -32.5f, 32.4f, -32.5f)
                horizontalLineToRelative(140.7f)
                curveToRelative(17.7f, 0.0f, 32.0f, 14.8f, 32.0f, 32.5f)
                verticalLineToRelative(123.5f)
                lineToRelative(51.1f, 52.3f)
                horizontalLineTo(153.9f)
                close()
            }
        }
        .build()
        return _dashcube!!
    }

private var _dashcube: ImageVector? = null
