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

public val LineAwesomeIcons.SadCrySolid: ImageVector
    get() {
        if (_sadCrySolid != null) {
            return _sadCrySolid!!
        }
        _sadCrySolid = Builder(name = "SadCrySolid", defaultWidth = 32.0.dp, defaultHeight =
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
                curveTo(27.0f, 19.4076f, 25.4408f, 22.4572f, 23.0f, 24.4766f)
                lineTo(23.0f, 16.0f)
                curveTo(23.0f, 15.448f, 22.553f, 15.0f, 22.0f, 15.0f)
                curveTo(21.447f, 15.0f, 21.0f, 15.448f, 21.0f, 16.0f)
                lineTo(21.0f, 25.7852f)
                curveTo(19.4977f, 26.5561f, 17.8013f, 27.0f, 16.0f, 27.0f)
                curveTo(14.1987f, 27.0f, 12.5023f, 26.5561f, 11.0f, 25.7852f)
                lineTo(11.0f, 16.0f)
                curveTo(11.0f, 15.448f, 10.553f, 15.0f, 10.0f, 15.0f)
                curveTo(9.447f, 15.0f, 9.0f, 15.448f, 9.0f, 16.0f)
                lineTo(9.0f, 24.4766f)
                curveTo(6.5592f, 22.4572f, 5.0f, 19.4076f, 5.0f, 16.0f)
                curveTo(5.0f, 9.935f, 9.935f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(12.0f, 10.0f)
                curveTo(10.76f, 10.0f, 9.8195f, 10.6893f, 9.1895f, 11.2793f)
                curveTo(8.5495f, 11.8693f, 8.1602f, 12.4395f, 8.1602f, 12.4395f)
                lineTo(9.8398f, 13.5605f)
                curveTo(9.8398f, 13.5605f, 10.0893f, 13.1307f, 10.5293f, 12.7207f)
                curveTo(10.9693f, 12.3107f, 11.55f, 12.0f, 12.0f, 12.0f)
                lineTo(15.0f, 12.0f)
                lineTo(15.0f, 10.0f)
                lineTo(12.0f, 10.0f)
                close()
                moveTo(17.0f, 10.0f)
                lineTo(17.0f, 12.0f)
                lineTo(20.0f, 12.0f)
                curveTo(20.45f, 12.0f, 21.0307f, 12.3107f, 21.4707f, 12.7207f)
                curveTo(21.9107f, 13.1307f, 22.1602f, 13.5605f, 22.1602f, 13.5605f)
                lineTo(23.8398f, 12.4395f)
                curveTo(23.8398f, 12.4395f, 23.4505f, 11.8693f, 22.8105f, 11.2793f)
                curveTo(22.1805f, 10.6893f, 21.24f, 10.0f, 20.0f, 10.0f)
                lineTo(17.0f, 10.0f)
                close()
                moveTo(16.0f, 16.0f)
                curveTo(14.346f, 16.0f, 13.0f, 17.57f, 13.0f, 19.5f)
                curveTo(13.0f, 21.43f, 14.346f, 23.0f, 16.0f, 23.0f)
                curveTo(17.654f, 23.0f, 19.0f, 21.43f, 19.0f, 19.5f)
                curveTo(19.0f, 17.57f, 17.654f, 16.0f, 16.0f, 16.0f)
                close()
                moveTo(16.0f, 18.0f)
                curveTo(16.532f, 18.0f, 17.0f, 18.701f, 17.0f, 19.5f)
                curveTo(17.0f, 20.299f, 16.532f, 21.0f, 16.0f, 21.0f)
                curveTo(15.468f, 21.0f, 15.0f, 20.299f, 15.0f, 19.5f)
                curveTo(15.0f, 18.701f, 15.468f, 18.0f, 16.0f, 18.0f)
                close()
            }
        }
        .build()
        return _sadCrySolid!!
    }

private var _sadCrySolid: ImageVector? = null
