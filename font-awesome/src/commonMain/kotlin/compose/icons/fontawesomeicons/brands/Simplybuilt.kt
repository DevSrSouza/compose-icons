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

public val BrandsGroup.Simplybuilt: ImageVector
    get() {
        if (_simplybuilt != null) {
            return _simplybuilt!!
        }
        _simplybuilt = Builder(name = "Simplybuilt", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(481.2f, 64.0f)
                horizontalLineToRelative(-106.0f)
                curveToRelative(-14.5f, 0.0f, -26.6f, 11.8f, -26.6f, 26.3f)
                verticalLineToRelative(39.6f)
                lineTo(163.3f, 129.9f)
                lineTo(163.3f, 90.3f)
                curveToRelative(0.0f, -14.5f, -12.0f, -26.3f, -26.6f, -26.3f)
                horizontalLineToRelative(-106.0f)
                curveTo(16.1f, 64.0f, 4.3f, 75.8f, 4.3f, 90.3f)
                verticalLineToRelative(331.4f)
                curveToRelative(0.0f, 14.5f, 11.8f, 26.3f, 26.6f, 26.3f)
                horizontalLineToRelative(450.4f)
                curveToRelative(14.8f, 0.0f, 26.6f, -11.8f, 26.6f, -26.3f)
                lineTo(507.9f, 90.3f)
                curveToRelative(-0.2f, -14.5f, -12.0f, -26.3f, -26.7f, -26.3f)
                close()
                moveTo(149.8f, 355.8f)
                curveToRelative(-36.6f, 0.0f, -66.4f, -29.7f, -66.4f, -66.4f)
                curveToRelative(0.0f, -36.9f, 29.7f, -66.6f, 66.4f, -66.6f)
                curveToRelative(36.9f, 0.0f, 66.6f, 29.7f, 66.6f, 66.6f)
                curveToRelative(0.0f, 36.7f, -29.7f, 66.4f, -66.6f, 66.4f)
                close()
                moveTo(362.2f, 355.8f)
                curveToRelative(-36.9f, 0.0f, -66.6f, -29.7f, -66.6f, -66.6f)
                curveToRelative(0.0f, -36.6f, 29.7f, -66.4f, 66.6f, -66.4f)
                curveToRelative(36.6f, 0.0f, 66.4f, 29.7f, 66.4f, 66.4f)
                curveToRelative(0.0f, 36.9f, -29.8f, 66.6f, -66.4f, 66.6f)
                close()
            }
        }
        .build()
        return _simplybuilt!!
    }

private var _simplybuilt: ImageVector? = null
