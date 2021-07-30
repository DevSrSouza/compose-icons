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

public val BrandsGroup.Megaport: ImageVector
    get() {
        if (_megaport != null) {
            return _megaport!!
        }
        _megaport = Builder(name = "Megaport", defaultWidth = 496.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 496.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(214.5f, 209.6f)
                verticalLineToRelative(66.2f)
                lineToRelative(33.5f, 33.5f)
                lineToRelative(33.3f, -33.3f)
                verticalLineToRelative(-66.4f)
                lineToRelative(-33.4f, -33.4f)
                close()
                moveTo(248.0f, 8.0f)
                curveTo(111.0f, 8.0f, 0.0f, 119.0f, 0.0f, 256.0f)
                reflectiveCurveToRelative(111.0f, 248.0f, 248.0f, 248.0f)
                reflectiveCurveToRelative(248.0f, -111.0f, 248.0f, -248.0f)
                reflectiveCurveTo(385.0f, 8.0f, 248.0f, 8.0f)
                close()
                moveTo(393.1f, 422.4f)
                lineTo(367.0f, 441.6f)
                lineToRelative(-26.0f, -19.2f)
                verticalLineToRelative(-65.5f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.4f, 33.4f)
                verticalLineToRelative(65.5f)
                lineTo(248.0f, 441.6f)
                lineToRelative(-26.1f, -19.2f)
                verticalLineToRelative(-65.5f)
                lineToRelative(-33.4f, -33.4f)
                lineToRelative(-33.5f, 33.4f)
                verticalLineToRelative(65.5f)
                lineToRelative(-26.1f, 19.2f)
                lineToRelative(-26.1f, -19.2f)
                verticalLineToRelative(-87.0f)
                lineToRelative(59.5f, -59.5f)
                lineTo(162.3f, 188.0f)
                lineToRelative(59.5f, -59.5f)
                lineTo(221.8f, 52.9f)
                lineToRelative(26.1f, -19.2f)
                lineTo(274.0f, 52.9f)
                verticalLineToRelative(75.6f)
                lineToRelative(59.5f, 59.5f)
                verticalLineToRelative(87.6f)
                lineToRelative(59.7f, 59.7f)
                verticalLineToRelative(87.1f)
                close()
            }
        }
        .build()
        return _megaport!!
    }

private var _megaport: ImageVector? = null
