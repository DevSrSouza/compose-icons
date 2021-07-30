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

public val BrandsGroup.Envira: ImageVector
    get() {
        if (_envira != null) {
            return _envira!!
        }
        _envira = Builder(name = "Envira", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 32.0f)
                curveToRelative(477.6f, 0.0f, 366.6f, 317.3f, 367.1f, 366.3f)
                lineTo(448.0f, 480.0f)
                horizontalLineToRelative(-26.0f)
                lineToRelative(-70.4f, -71.2f)
                curveToRelative(-39.0f, 4.2f, -124.4f, 34.5f, -214.4f, -37.0f)
                curveTo(47.0f, 300.3f, 52.0f, 214.7f, 0.0f, 32.0f)
                close()
                moveTo(79.7f, 78.0f)
                curveToRelative(-49.7f, -23.5f, -5.2f, 9.2f, -5.2f, 9.2f)
                curveToRelative(45.2f, 31.2f, 66.0f, 73.7f, 90.2f, 119.9f)
                curveToRelative(31.5f, 60.2f, 79.0f, 139.7f, 144.2f, 167.7f)
                curveToRelative(65.0f, 28.0f, 34.2f, 12.5f, 6.0f, -8.5f)
                curveToRelative(-28.2f, -21.2f, -68.2f, -87.0f, -91.0f, -130.2f)
                curveToRelative(-31.7f, -60.0f, -61.0f, -118.6f, -144.2f, -158.1f)
                close()
            }
        }
        .build()
        return _envira!!
    }

private var _envira: ImageVector? = null
