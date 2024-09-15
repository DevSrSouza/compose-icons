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

public val LineAwesomeIcons.Ups: ImageVector
    get() {
        if (_ups != null) {
            return _ups!!
        }
        _ups = Builder(name = "Ups", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp, viewportWidth
                = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.512f, 2.988f)
                curveTo(11.549f, 3.076f, 7.75f, 4.0f, 5.0f, 5.5f)
                lineTo(5.0f, 18.301f)
                curveTo(5.0f, 24.401f, 9.4f, 26.2f, 16.0f, 29.1f)
                curveTo(22.6f, 26.2f, 27.0f, 24.401f, 27.0f, 18.301f)
                lineTo(27.0f, 5.5f)
                curveTo(23.6f, 3.65f, 19.474f, 2.901f, 15.512f, 2.988f)
                close()
                moveTo(21.02f, 5.502f)
                curveTo(22.726f, 5.463f, 24.4f, 5.549f, 26.0f, 5.699f)
                lineTo(26.0f, 18.199f)
                curveTo(26.0f, 23.299f, 22.9f, 24.9f, 16.0f, 27.9f)
                curveTo(9.1f, 24.9f, 6.0f, 23.299f, 6.0f, 18.199f)
                lineTo(6.0f, 11.0f)
                curveTo(10.5f, 6.875f, 15.901f, 5.619f, 21.02f, 5.502f)
                close()
                moveTo(16.17f, 11.031f)
                curveTo(15.153f, 11.026f, 14.187f, 11.362f, 13.699f, 11.699f)
                lineTo(13.699f, 24.0f)
                lineTo(15.6f, 24.0f)
                lineTo(15.6f, 20.0f)
                curveTo(17.0f, 20.4f, 19.699f, 19.9f, 19.699f, 15.5f)
                curveTo(19.699f, 12.0f, 17.864f, 11.04f, 16.17f, 11.031f)
                close()
                moveTo(22.541f, 11.064f)
                curveTo(21.271f, 11.163f, 20.1f, 12.0f, 20.1f, 13.5f)
                curveTo(20.1f, 16.3f, 23.1f, 16.0f, 23.1f, 17.6f)
                curveTo(23.2f, 19.0f, 21.399f, 18.9f, 20.199f, 17.9f)
                lineTo(20.199f, 19.6f)
                curveTo(22.299f, 20.9f, 24.9f, 20.099f, 25.0f, 17.699f)
                curveTo(25.1f, 14.699f, 21.9f, 15.0f, 21.9f, 13.4f)
                curveTo(21.9f, 12.3f, 23.699f, 12.201f, 24.699f, 13.301f)
                lineTo(24.699f, 11.699f)
                curveTo(24.099f, 11.212f, 23.303f, 11.005f, 22.541f, 11.064f)
                close()
                moveTo(7.0f, 11.199f)
                lineTo(7.0f, 17.1f)
                curveTo(7.0f, 21.5f, 11.699f, 20.1f, 12.699f, 19.4f)
                lineTo(12.699f, 11.199f)
                lineTo(10.801f, 11.199f)
                lineTo(10.801f, 18.301f)
                curveTo(10.501f, 18.501f, 8.9f, 18.999f, 8.9f, 17.199f)
                lineTo(8.9f, 11.199f)
                lineTo(7.0f, 11.199f)
                close()
                moveTo(16.055f, 12.561f)
                curveTo(16.744f, 12.5f, 17.699f, 12.875f, 17.699f, 15.5f)
                curveTo(17.799f, 19.5f, 15.7f, 18.5f, 15.5f, 18.5f)
                lineTo(15.5f, 12.699f)
                curveTo(15.625f, 12.649f, 15.825f, 12.581f, 16.055f, 12.561f)
                close()
            }
        }
        .build()
        return _ups!!
    }

private var _ups: ImageVector? = null
