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

public val LineAwesomeIcons.BusinessTimeSolid: ImageVector
    get() {
        if (_businessTimeSolid != null) {
            return _businessTimeSolid!!
        }
        _businessTimeSolid = Builder(name = "BusinessTimeSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 3.0f)
                curveTo(13.48f, 3.0f, 12.9405f, 3.1805f, 12.5605f, 3.5605f)
                curveTo(12.1805f, 3.9405f, 12.0f, 4.48f, 12.0f, 5.0f)
                lineTo(12.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                lineTo(3.0f, 26.0f)
                lineTo(14.1992f, 26.0f)
                curveTo(14.0692f, 25.36f, 14.0f, 24.69f, 14.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                lineTo(5.0f, 17.4395f)
                curveTo(5.59f, 17.7795f, 6.27f, 18.0f, 7.0f, 18.0f)
                lineTo(16.0098f, 18.0f)
                curveTo(16.5698f, 17.24f, 17.2498f, 16.56f, 18.0098f, 16.0f)
                lineTo(7.0f, 16.0f)
                curveTo(5.81f, 16.0f, 5.0f, 15.19f, 5.0f, 14.0f)
                lineTo(5.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 14.0f)
                curveTo(27.0f, 14.16f, 26.9909f, 14.3092f, 26.9609f, 14.4492f)
                curveTo(27.6809f, 14.6692f, 28.36f, 14.9698f, 29.0f, 15.3398f)
                lineTo(29.0f, 6.0f)
                lineTo(20.0f, 6.0f)
                lineTo(20.0f, 5.0f)
                curveTo(20.0f, 4.48f, 19.8195f, 3.9405f, 19.4395f, 3.5605f)
                curveTo(19.0595f, 3.1805f, 18.52f, 3.0f, 18.0f, 3.0f)
                lineTo(14.0f, 3.0f)
                close()
                moveTo(14.0f, 5.0f)
                lineTo(18.0f, 5.0f)
                lineTo(18.0f, 6.0f)
                lineTo(14.0f, 6.0f)
                lineTo(14.0f, 5.0f)
                close()
                moveTo(9.0f, 12.0f)
                lineTo(9.0f, 15.0f)
                lineTo(11.0f, 15.0f)
                lineTo(11.0f, 12.0f)
                lineTo(9.0f, 12.0f)
                close()
                moveTo(21.0f, 12.0f)
                lineTo(21.0f, 14.4609f)
                curveTo(21.32f, 14.3609f, 21.6467f, 14.2758f, 21.9805f, 14.207f)
                curveTo(22.3142f, 14.1383f, 22.655f, 14.0858f, 23.0f, 14.0508f)
                lineTo(23.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(24.0f, 16.0f)
                curveTo(19.59f, 16.0f, 16.0f, 19.59f, 16.0f, 24.0f)
                curveTo(16.0f, 28.41f, 19.59f, 32.0f, 24.0f, 32.0f)
                curveTo(28.41f, 32.0f, 32.0f, 28.41f, 32.0f, 24.0f)
                curveTo(32.0f, 19.59f, 28.41f, 16.0f, 24.0f, 16.0f)
                close()
                moveTo(24.0f, 18.0f)
                curveTo(27.32f, 18.0f, 30.0f, 20.68f, 30.0f, 24.0f)
                curveTo(30.0f, 27.32f, 27.32f, 30.0f, 24.0f, 30.0f)
                curveTo(20.68f, 30.0f, 18.0f, 27.32f, 18.0f, 24.0f)
                curveTo(18.0f, 20.68f, 20.68f, 18.0f, 24.0f, 18.0f)
                close()
                moveTo(23.0f, 19.0f)
                lineTo(23.0f, 25.0f)
                lineTo(28.0f, 25.0f)
                lineTo(28.0f, 23.0f)
                lineTo(25.0f, 23.0f)
                lineTo(25.0f, 19.0f)
                lineTo(23.0f, 19.0f)
                close()
            }
        }
        .build()
        return _businessTimeSolid!!
    }

private var _businessTimeSolid: ImageVector? = null
