package compose.icons.lineawesomeicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.LineAwesomeIcons

public val LineAwesomeIcons.CartArrowDownSolid: ImageVector
    get() {
        if (_cartArrowDownSolid != null) {
            return _cartArrowDownSolid!!
        }
        _cartArrowDownSolid = Builder(name = "CartArrowDownSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                curveTo(3.449f, 7.0f, 3.0f, 7.449f, 3.0f, 8.0f)
                curveTo(3.0f, 8.551f, 3.449f, 9.0f, 4.0f, 9.0f)
                lineTo(6.219f, 9.0f)
                lineTo(8.844f, 19.5f)
                curveTo(9.066f, 20.391f, 9.863f, 21.0f, 10.781f, 21.0f)
                lineTo(23.25f, 21.0f)
                curveTo(24.152f, 21.0f, 24.918f, 20.402f, 25.156f, 19.531f)
                lineTo(27.75f, 10.0f)
                lineTo(25.656f, 10.0f)
                lineTo(23.25f, 19.0f)
                lineTo(10.781f, 19.0f)
                lineTo(8.156f, 8.5f)
                curveTo(7.934f, 7.609f, 7.137f, 7.0f, 6.219f, 7.0f)
                close()
                moveTo(22.0f, 21.0f)
                curveTo(20.355f, 21.0f, 19.0f, 22.355f, 19.0f, 24.0f)
                curveTo(19.0f, 25.645f, 20.355f, 27.0f, 22.0f, 27.0f)
                curveTo(23.645f, 27.0f, 25.0f, 25.645f, 25.0f, 24.0f)
                curveTo(25.0f, 22.355f, 23.645f, 21.0f, 22.0f, 21.0f)
                close()
                moveTo(13.0f, 21.0f)
                curveTo(11.355f, 21.0f, 10.0f, 22.355f, 10.0f, 24.0f)
                curveTo(10.0f, 25.645f, 11.355f, 27.0f, 13.0f, 27.0f)
                curveTo(14.645f, 27.0f, 16.0f, 25.645f, 16.0f, 24.0f)
                curveTo(16.0f, 22.355f, 14.645f, 21.0f, 13.0f, 21.0f)
                close()
                moveTo(16.0f, 7.0f)
                lineTo(16.0f, 12.0f)
                lineTo(13.0f, 12.0f)
                lineTo(17.0f, 16.0f)
                lineTo(21.0f, 12.0f)
                lineTo(18.0f, 12.0f)
                lineTo(18.0f, 7.0f)
                close()
                moveTo(13.0f, 23.0f)
                curveTo(13.563f, 23.0f, 14.0f, 23.438f, 14.0f, 24.0f)
                curveTo(14.0f, 24.563f, 13.563f, 25.0f, 13.0f, 25.0f)
                curveTo(12.438f, 25.0f, 12.0f, 24.563f, 12.0f, 24.0f)
                curveTo(12.0f, 23.438f, 12.438f, 23.0f, 13.0f, 23.0f)
                close()
                moveTo(22.0f, 23.0f)
                curveTo(22.563f, 23.0f, 23.0f, 23.438f, 23.0f, 24.0f)
                curveTo(23.0f, 24.563f, 22.563f, 25.0f, 22.0f, 25.0f)
                curveTo(21.438f, 25.0f, 21.0f, 24.563f, 21.0f, 24.0f)
                curveTo(21.0f, 23.438f, 21.438f, 23.0f, 22.0f, 23.0f)
                close()
            }
        }
        .build()
        return _cartArrowDownSolid!!
    }

private var _cartArrowDownSolid: ImageVector? = null
