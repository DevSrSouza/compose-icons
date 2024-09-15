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

public val LineAwesomeIcons.AddressCardSolid: ImageVector
    get() {
        if (_addressCardSolid != null) {
            return _addressCardSolid!!
        }
        _addressCardSolid = Builder(name = "AddressCardSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 24.0f)
                lineTo(23.594f, 24.0f)
                curveTo(23.516f, 23.863f, 23.551f, 23.676f, 23.438f, 23.563f)
                curveTo(23.059f, 23.184f, 22.523f, 23.0f, 22.0f, 23.0f)
                curveTo(21.477f, 23.0f, 20.941f, 23.184f, 20.563f, 23.563f)
                curveTo(20.449f, 23.676f, 20.484f, 23.863f, 20.406f, 24.0f)
                lineTo(11.594f, 24.0f)
                curveTo(11.516f, 23.863f, 11.551f, 23.676f, 11.438f, 23.563f)
                curveTo(11.059f, 23.184f, 10.523f, 23.0f, 10.0f, 23.0f)
                curveTo(9.477f, 23.0f, 8.941f, 23.184f, 8.563f, 23.563f)
                curveTo(8.449f, 23.676f, 8.484f, 23.863f, 8.406f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(9.801f, 10.0f, 8.0f, 11.801f, 8.0f, 14.0f)
                curveTo(8.0f, 15.113f, 8.477f, 16.117f, 9.219f, 16.844f)
                curveTo(7.887f, 17.746f, 7.0f, 19.285f, 7.0f, 21.0f)
                lineTo(9.0f, 21.0f)
                curveTo(9.0f, 19.344f, 10.344f, 18.0f, 12.0f, 18.0f)
                curveTo(13.656f, 18.0f, 15.0f, 19.344f, 15.0f, 21.0f)
                lineTo(17.0f, 21.0f)
                curveTo(17.0f, 19.285f, 16.113f, 17.746f, 14.781f, 16.844f)
                curveTo(15.523f, 16.117f, 16.0f, 15.113f, 16.0f, 14.0f)
                curveTo(16.0f, 11.801f, 14.199f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(12.0f, 12.0f)
                curveTo(13.117f, 12.0f, 14.0f, 12.883f, 14.0f, 14.0f)
                curveTo(14.0f, 15.117f, 13.117f, 16.0f, 12.0f, 16.0f)
                curveTo(10.883f, 16.0f, 10.0f, 15.117f, 10.0f, 14.0f)
                curveTo(10.0f, 12.883f, 10.883f, 12.0f, 12.0f, 12.0f)
                close()
                moveTo(19.0f, 13.0f)
                lineTo(19.0f, 15.0f)
                lineTo(25.0f, 15.0f)
                lineTo(25.0f, 13.0f)
                close()
                moveTo(19.0f, 17.0f)
                lineTo(19.0f, 19.0f)
                lineTo(25.0f, 19.0f)
                lineTo(25.0f, 17.0f)
                close()
            }
        }
        .build()
        return _addressCardSolid!!
    }

private var _addressCardSolid: ImageVector? = null
