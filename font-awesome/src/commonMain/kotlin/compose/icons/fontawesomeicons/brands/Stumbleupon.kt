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

public val BrandsGroup.Stumbleupon: ImageVector
    get() {
        if (_stumbleupon != null) {
            return _stumbleupon!!
        }
        _stumbleupon = Builder(name = "Stumbleupon", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(502.9f, 266.0f)
                verticalLineToRelative(69.7f)
                curveToRelative(0.0f, 62.1f, -50.3f, 112.4f, -112.4f, 112.4f)
                curveToRelative(-61.8f, 0.0f, -112.4f, -49.8f, -112.4f, -111.3f)
                verticalLineToRelative(-70.2f)
                lineToRelative(34.3f, 16.0f)
                lineToRelative(51.1f, -15.2f)
                lineTo(363.5f, 338.0f)
                curveToRelative(0.0f, 14.7f, 12.0f, 26.5f, 26.7f, 26.5f)
                reflectiveCurveTo(417.0f, 352.7f, 417.0f, 338.0f)
                verticalLineToRelative(-72.0f)
                horizontalLineToRelative(85.9f)
                close()
                moveTo(278.2f, 207.8f)
                lineToRelative(34.3f, 16.0f)
                lineToRelative(51.1f, -15.2f)
                lineTo(363.6f, 173.0f)
                curveToRelative(0.0f, -60.5f, -51.1f, -109.0f, -112.1f, -109.0f)
                curveToRelative(-60.8f, 0.0f, -112.1f, 48.2f, -112.1f, 108.2f)
                verticalLineToRelative(162.4f)
                curveToRelative(0.0f, 14.9f, -12.0f, 26.7f, -26.7f, 26.7f)
                reflectiveCurveTo(86.0f, 349.5f, 86.0f, 334.6f)
                lineTo(86.0f, 266.0f)
                lineTo(0.0f, 266.0f)
                verticalLineToRelative(69.7f)
                curveTo(0.0f, 397.7f, 50.3f, 448.0f, 112.4f, 448.0f)
                curveToRelative(61.6f, 0.0f, 112.4f, -49.5f, 112.4f, -110.8f)
                lineTo(224.8f, 176.9f)
                curveToRelative(0.0f, -14.7f, 12.0f, -26.7f, 26.7f, -26.7f)
                reflectiveCurveToRelative(26.7f, 12.0f, 26.7f, 26.7f)
                verticalLineToRelative(30.9f)
                close()
            }
        }
        .build()
        return _stumbleupon!!
    }

private var _stumbleupon: ImageVector? = null
