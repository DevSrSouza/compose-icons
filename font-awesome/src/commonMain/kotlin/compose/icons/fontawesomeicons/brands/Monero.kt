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

public val BrandsGroup.Monero: ImageVector
    get() {
        if (_monero != null) {
            return _monero!!
        }
        _monero = Builder(name = "Monero", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 384.0f)
                horizontalLineToRelative(108.4f)
                curveTo(417.0f, 455.9f, 338.1f, 504.0f, 248.0f, 504.0f)
                reflectiveCurveTo(79.0f, 455.9f, 35.6f, 384.0f)
                horizontalLineTo(144.0f)
                verticalLineTo(256.2f)
                lineTo(248.0f, 361.0f)
                lineToRelative(104.0f, -105.0f)
                verticalLineToRelative(128.0f)
                close()
                moveTo(88.0f, 336.0f)
                verticalLineTo(128.0f)
                lineToRelative(159.4f, 159.4f)
                lineTo(408.0f, 128.0f)
                verticalLineToRelative(208.0f)
                horizontalLineToRelative(74.8f)
                curveToRelative(8.5f, -25.1f, 13.2f, -52.0f, 13.2f, -80.0f)
                curveTo(496.0f, 119.0f, 385.0f, 8.0f, 248.0f, 8.0f)
                reflectiveCurveTo(0.0f, 119.0f, 0.0f, 256.0f)
                curveToRelative(0.0f, 28.0f, 4.6f, 54.9f, 13.2f, 80.0f)
                horizontalLineTo(88.0f)
                close()
            }
        }
        .build()
        return _monero!!
    }

private var _monero: ImageVector? = null
