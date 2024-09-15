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

public val LineAwesomeIcons.GrinTongueWink: ImageVector
    get() {
        if (_grinTongueWink != null) {
            return _grinTongueWink!!
        }
        _grinTongueWink = Builder(name = "GrinTongueWink", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.065f, 5.0f, 27.0f, 9.935f, 27.0f, 16.0f)
                curveTo(27.0f, 22.065f, 22.065f, 27.0f, 16.0f, 27.0f)
                curveTo(9.935f, 27.0f, 5.0f, 22.065f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.5f, 12.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 15.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 11.5f, 12.0f)
                close()
                moveTo(18.0f, 13.0f)
                lineTo(18.0f, 15.0f)
                lineTo(23.0f, 15.0f)
                lineTo(23.0f, 13.0f)
                lineTo(18.0f, 13.0f)
                close()
                moveTo(11.766f, 17.357f)
                lineTo(10.232f, 18.643f)
                curveTo(11.109f, 19.687f, 12.451f, 20.426f, 14.0f, 20.773f)
                lineTo(14.0f, 22.0f)
                curveTo(14.0f, 23.1f, 14.9f, 24.0f, 16.0f, 24.0f)
                curveTo(17.1f, 24.0f, 18.0f, 23.1f, 18.0f, 22.0f)
                lineTo(18.0f, 20.773f)
                curveTo(19.549f, 20.426f, 20.89f, 19.688f, 21.766f, 18.643f)
                lineTo(20.232f, 17.357f)
                curveTo(19.384f, 18.371f, 17.763f, 19.0f, 16.0f, 19.0f)
                curveTo(14.237f, 19.0f, 12.615f, 18.37f, 11.766f, 17.357f)
                close()
            }
        }
        .build()
        return _grinTongueWink!!
    }

private var _grinTongueWink: ImageVector? = null
