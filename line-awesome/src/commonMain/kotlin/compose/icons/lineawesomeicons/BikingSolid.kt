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

public val LineAwesomeIcons.BikingSolid: ImageVector
    get() {
        if (_bikingSolid != null) {
            return _bikingSolid!!
        }
        _bikingSolid = Builder(name = "BikingSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 5.0f)
                curveTo(17.578f, 5.0f, 16.0f, 6.578f, 16.0f, 8.5f)
                curveTo(16.0f, 10.422f, 17.578f, 12.0f, 19.5f, 12.0f)
                curveTo(21.422f, 12.0f, 23.0f, 10.422f, 23.0f, 8.5f)
                curveTo(23.0f, 6.578f, 21.422f, 5.0f, 19.5f, 5.0f)
                close()
                moveTo(19.5f, 7.0f)
                curveTo(20.34f, 7.0f, 21.0f, 7.66f, 21.0f, 8.5f)
                curveTo(21.0f, 9.34f, 20.34f, 10.0f, 19.5f, 10.0f)
                curveTo(18.66f, 10.0f, 18.0f, 9.34f, 18.0f, 8.5f)
                curveTo(18.0f, 7.66f, 18.66f, 7.0f, 19.5f, 7.0f)
                close()
                moveTo(15.094f, 10.531f)
                curveTo(14.586f, 10.582f, 14.094f, 10.832f, 13.75f, 11.25f)
                lineTo(11.406f, 14.094f)
                curveTo(10.598f, 15.078f, 10.949f, 16.633f, 12.094f, 17.188f)
                lineTo(15.531f, 18.875f)
                lineTo(14.625f, 23.875f)
                lineTo(16.594f, 24.219f)
                lineTo(17.656f, 18.469f)
                lineTo(17.781f, 17.719f)
                lineTo(17.094f, 17.375f)
                lineTo(12.938f, 15.375f)
                lineTo(15.313f, 12.5f)
                lineTo(19.375f, 15.781f)
                lineTo(19.656f, 16.0f)
                lineTo(25.0f, 16.0f)
                lineTo(25.0f, 14.0f)
                lineTo(20.344f, 14.0f)
                lineTo(16.563f, 10.969f)
                curveTo(16.141f, 10.629f, 15.602f, 10.48f, 15.094f, 10.531f)
                close()
                moveTo(8.5f, 18.0f)
                curveTo(6.031f, 18.0f, 4.0f, 20.031f, 4.0f, 22.5f)
                curveTo(4.0f, 24.969f, 6.031f, 27.0f, 8.5f, 27.0f)
                curveTo(10.969f, 27.0f, 13.0f, 24.969f, 13.0f, 22.5f)
                curveTo(13.0f, 20.031f, 10.969f, 18.0f, 8.5f, 18.0f)
                close()
                moveTo(23.5f, 18.0f)
                curveTo(21.031f, 18.0f, 19.0f, 20.031f, 19.0f, 22.5f)
                curveTo(19.0f, 24.969f, 21.031f, 27.0f, 23.5f, 27.0f)
                curveTo(25.969f, 27.0f, 28.0f, 24.969f, 28.0f, 22.5f)
                curveTo(28.0f, 20.031f, 25.969f, 18.0f, 23.5f, 18.0f)
                close()
                moveTo(8.5f, 20.0f)
                curveTo(9.879f, 20.0f, 11.0f, 21.121f, 11.0f, 22.5f)
                curveTo(11.0f, 23.879f, 9.879f, 25.0f, 8.5f, 25.0f)
                curveTo(7.121f, 25.0f, 6.0f, 23.879f, 6.0f, 22.5f)
                curveTo(6.0f, 21.121f, 7.121f, 20.0f, 8.5f, 20.0f)
                close()
                moveTo(23.5f, 20.0f)
                curveTo(24.879f, 20.0f, 26.0f, 21.121f, 26.0f, 22.5f)
                curveTo(26.0f, 23.879f, 24.879f, 25.0f, 23.5f, 25.0f)
                curveTo(22.121f, 25.0f, 21.0f, 23.879f, 21.0f, 22.5f)
                curveTo(21.0f, 21.121f, 22.121f, 20.0f, 23.5f, 20.0f)
                close()
            }
        }
        .build()
        return _bikingSolid!!
    }

private var _bikingSolid: ImageVector? = null
