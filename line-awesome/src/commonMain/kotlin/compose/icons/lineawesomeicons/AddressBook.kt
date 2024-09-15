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

public val LineAwesomeIcons.AddressBook: ImageVector
    get() {
        if (_addressBook != null) {
            return _addressBook!!
        }
        _addressBook = Builder(name = "AddressBook", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 4.0f)
                lineTo(6.0f, 9.0f)
                lineTo(5.0f, 9.0f)
                lineTo(5.0f, 11.0f)
                lineTo(8.0f, 11.0f)
                lineTo(8.0f, 6.0f)
                lineTo(24.0f, 6.0f)
                lineTo(24.0f, 26.0f)
                lineTo(8.0f, 26.0f)
                lineTo(8.0f, 23.0f)
                lineTo(6.0f, 23.0f)
                lineTo(6.0f, 28.0f)
                lineTo(26.0f, 28.0f)
                lineTo(26.0f, 4.0f)
                close()
                moveTo(16.0f, 10.0f)
                curveTo(13.801f, 10.0f, 12.0f, 11.801f, 12.0f, 14.0f)
                curveTo(12.0f, 15.113f, 12.477f, 16.117f, 13.219f, 16.844f)
                curveTo(11.887f, 17.746f, 11.0f, 19.285f, 11.0f, 21.0f)
                lineTo(13.0f, 21.0f)
                curveTo(13.0f, 19.344f, 14.344f, 18.0f, 16.0f, 18.0f)
                curveTo(17.656f, 18.0f, 19.0f, 19.344f, 19.0f, 21.0f)
                lineTo(21.0f, 21.0f)
                curveTo(21.0f, 19.285f, 20.113f, 17.746f, 18.781f, 16.844f)
                curveTo(19.523f, 16.117f, 20.0f, 15.113f, 20.0f, 14.0f)
                curveTo(20.0f, 11.801f, 18.199f, 10.0f, 16.0f, 10.0f)
                close()
                moveTo(6.0f, 12.0f)
                lineTo(6.0f, 14.0f)
                lineTo(5.0f, 14.0f)
                lineTo(5.0f, 16.0f)
                lineTo(8.0f, 16.0f)
                lineTo(8.0f, 12.0f)
                close()
                moveTo(16.0f, 12.0f)
                curveTo(17.117f, 12.0f, 18.0f, 12.883f, 18.0f, 14.0f)
                curveTo(18.0f, 15.117f, 17.117f, 16.0f, 16.0f, 16.0f)
                curveTo(14.883f, 16.0f, 14.0f, 15.117f, 14.0f, 14.0f)
                curveTo(14.0f, 12.883f, 14.883f, 12.0f, 16.0f, 12.0f)
                close()
                moveTo(6.0f, 17.0f)
                lineTo(6.0f, 19.0f)
                lineTo(5.0f, 19.0f)
                lineTo(5.0f, 21.0f)
                lineTo(8.0f, 21.0f)
                lineTo(8.0f, 17.0f)
                close()
            }
        }
        .build()
        return _addressBook!!
    }

private var _addressBook: ImageVector? = null
