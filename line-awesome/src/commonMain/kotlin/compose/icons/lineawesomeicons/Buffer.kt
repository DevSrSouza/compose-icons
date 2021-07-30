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

public val LineAwesomeIcons.Buffer: ImageVector
    get() {
        if (_buffer != null) {
            return _buffer!!
        }
        _buffer = Builder(name = "Buffer", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 5.0f)
                curveTo(15.844f, 5.0f, 15.6879f, 5.0298f, 15.5449f, 5.0898f)
                lineTo(3.1953f, 10.7852f)
                curveTo(2.9353f, 10.9052f, 2.9353f, 11.0929f, 3.1953f, 11.2129f)
                lineTo(15.5449f, 16.9102f)
                curveTo(15.6879f, 16.9702f, 15.844f, 17.0f, 16.0f, 17.0f)
                curveTo(16.156f, 17.0f, 16.3121f, 16.9702f, 16.4551f, 16.9102f)
                lineTo(28.8047f, 11.2129f)
                curveTo(29.0647f, 11.0929f, 29.0647f, 10.9052f, 28.8047f, 10.7852f)
                lineTo(16.4551f, 5.0898f)
                curveTo(16.3121f, 5.0298f, 16.156f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(16.0f, 7.082f)
                lineTo(24.4922f, 11.0f)
                lineTo(16.0f, 14.918f)
                lineTo(7.5078f, 11.0f)
                lineTo(16.0f, 7.082f)
                close()
                moveTo(4.8398f, 14.4473f)
                lineTo(3.1953f, 15.2695f)
                curveTo(2.9353f, 15.3995f, 2.9353f, 15.6005f, 3.1953f, 15.7305f)
                lineTo(15.5449f, 21.9023f)
                curveTo(15.6879f, 21.9673f, 15.844f, 22.0f, 16.0f, 22.0f)
                curveTo(16.156f, 22.0f, 16.3121f, 21.9673f, 16.4551f, 21.9023f)
                lineTo(28.8047f, 15.7305f)
                curveTo(29.0647f, 15.6005f, 29.0647f, 15.3995f, 28.8047f, 15.2695f)
                lineTo(27.1602f, 14.4473f)
                lineTo(16.4551f, 19.7969f)
                curveTo(16.3121f, 19.8619f, 16.156f, 19.8945f, 16.0f, 19.8945f)
                curveTo(15.844f, 19.8945f, 15.6879f, 19.8619f, 15.5449f, 19.7969f)
                lineTo(4.8398f, 14.4473f)
                close()
                moveTo(4.8398f, 19.4473f)
                lineTo(3.1953f, 20.2695f)
                curveTo(2.9353f, 20.3995f, 2.9353f, 20.6005f, 3.1953f, 20.7305f)
                lineTo(15.5449f, 26.9023f)
                curveTo(15.6879f, 26.9673f, 15.844f, 27.0f, 16.0f, 27.0f)
                curveTo(16.156f, 27.0f, 16.3121f, 26.9673f, 16.4551f, 26.9023f)
                lineTo(28.8047f, 20.7305f)
                curveTo(29.0647f, 20.6005f, 29.0647f, 20.3995f, 28.8047f, 20.2695f)
                lineTo(27.1602f, 19.4473f)
                lineTo(16.4551f, 24.7969f)
                curveTo(16.3121f, 24.8619f, 16.156f, 24.8945f, 16.0f, 24.8945f)
                curveTo(15.844f, 24.8945f, 15.6879f, 24.8619f, 15.5449f, 24.7969f)
                lineTo(4.8398f, 19.4473f)
                close()
            }
        }
        .build()
        return _buffer!!
    }

private var _buffer: ImageVector? = null
