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

public val BrandsGroup.Openid: ImageVector
    get() {
        if (_openid != null) {
            return _openid!!
        }
        _openid = Builder(name = "Openid", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(271.5f, 432.0f)
                lineToRelative(-68.0f, 32.0f)
                curveTo(88.5f, 453.7f, 0.0f, 392.5f, 0.0f, 318.2f)
                curveToRelative(0.0f, -71.5f, 82.5f, -131.0f, 191.7f, -144.3f)
                verticalLineToRelative(43.0f)
                curveToRelative(-71.5f, 12.5f, -124.0f, 53.0f, -124.0f, 101.3f)
                curveToRelative(0.0f, 51.0f, 58.5f, 93.3f, 135.7f, 103.0f)
                verticalLineToRelative(-340.0f)
                lineToRelative(68.0f, -33.2f)
                verticalLineToRelative(384.0f)
                close()
                moveTo(448.0f, 291.0f)
                lineToRelative(-131.3f, -28.5f)
                lineToRelative(36.8f, -20.7f)
                curveToRelative(-19.5f, -11.5f, -43.5f, -20.0f, -70.0f, -24.8f)
                verticalLineToRelative(-43.0f)
                curveToRelative(46.2f, 5.5f, 87.7f, 19.5f, 120.3f, 39.3f)
                lineToRelative(35.0f, -19.8f)
                lineTo(448.0f, 291.0f)
                close()
            }
        }
        .build()
        return _openid!!
    }

private var _openid: ImageVector? = null
