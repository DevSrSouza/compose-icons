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

public val LineAwesomeIcons.Waze: ImageVector
    get() {
        if (_waze != null) {
            return _waze!!
        }
        _waze = Builder(name = "Waze", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.699f, 4.0f)
                curveTo(12.699f, 4.0f, 7.6f, 7.301f, 6.6f, 12.301f)
                curveTo(6.0f, 15.301f, 6.801f, 18.1f, 4.301f, 18.1f)
                curveTo(3.201f, 18.1f, 2.499f, 19.401f, 3.199f, 20.301f)
                curveTo(4.599f, 22.201f, 6.5f, 23.3f, 8.4f, 24.0f)
                lineTo(9.016f, 24.246f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 27.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 13.945f, 25.0f)
                lineTo(17.9f, 25.0f)
                lineTo(18.053f, 25.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 27.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 22.871f, 23.709f)
                curveTo(27.061f, 21.579f, 29.389f, 17.338f, 28.6f, 12.801f)
                curveTo(28.0f, 7.701f, 22.999f, 4.0f, 17.699f, 4.0f)
                close()
                moveTo(17.699f, 6.0f)
                curveTo(22.199f, 6.0f, 26.2f, 9.101f, 26.9f, 13.301f)
                curveTo(27.5f, 16.901f, 25.6f, 20.4f, 22.1f, 22.1f)
                lineTo(21.646f, 22.281f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 20.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 18.502f, 23.0f)
                curveTo(18.501f, 23.0f, 18.501f, 23.0f, 18.5f, 23.0f)
                lineTo(18.1f, 23.0f)
                lineTo(13.9f, 23.0f)
                curveTo(13.778f, 23.0f, 13.621f, 22.984f, 13.48f, 22.979f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 11.5f, 22.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 10.133f, 22.41f)
                curveTo(10.122f, 22.407f, 10.11f, 22.404f, 10.1f, 22.4f)
                lineTo(9.199f, 22.1f)
                curveTo(7.799f, 21.6f, 6.6f, 20.9f, 5.6f, 19.9f)
                curveTo(8.0f, 19.2f, 8.201f, 16.401f, 8.301f, 14.801f)
                curveTo(8.401f, 14.101f, 8.4f, 13.399f, 8.5f, 12.699f)
                curveTo(9.4f, 8.499f, 13.799f, 6.0f, 17.699f, 6.0f)
                close()
                moveTo(14.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 14.5f, 11.0f)
                close()
                moveTo(20.5f, 11.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 14.0f)
                arcTo(1.5f, 1.5f, 0.0f, false, false, 20.5f, 11.0f)
                close()
                moveTo(13.605f, 14.979f)
                curveTo(13.543f, 14.969f, 13.475f, 14.975f, 13.4f, 15.0f)
                curveTo(13.1f, 15.1f, 12.9f, 15.3f, 13.0f, 15.6f)
                curveTo(13.5f, 17.9f, 15.7f, 19.0f, 17.5f, 19.0f)
                curveTo(19.3f, 19.0f, 21.5f, 17.9f, 22.0f, 15.6f)
                curveTo(22.0f, 15.3f, 21.9f, 15.1f, 21.6f, 15.0f)
                curveTo(21.3f, 15.0f, 21.1f, 15.1f, 21.0f, 15.4f)
                curveTo(20.6f, 17.2f, 18.9f, 18.0f, 17.5f, 18.0f)
                curveTo(16.1f, 18.0f, 14.4f, 17.2f, 14.0f, 15.4f)
                curveTo(13.925f, 15.175f, 13.793f, 15.007f, 13.605f, 14.979f)
                close()
            }
        }
        .build()
        return _waze!!
    }

private var _waze: ImageVector? = null
