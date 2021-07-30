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

public val LineAwesomeIcons.CameraRetroSolid: ImageVector
    get() {
        if (_cameraRetroSolid != null) {
            return _cameraRetroSolid!!
        }
        _cameraRetroSolid = Builder(name = "CameraRetroSolid", defaultWidth = 32.0.dp, defaultHeight
                = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.5f, 6.0f)
                lineTo(11.1875f, 6.4063f)
                lineTo(10.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 7.0f)
                lineTo(5.0f, 7.0f)
                lineTo(5.0f, 8.0f)
                lineTo(3.0f, 8.0f)
                lineTo(3.0f, 26.0f)
                lineTo(29.0f, 26.0f)
                lineTo(29.0f, 8.0f)
                lineTo(22.0f, 8.0f)
                lineTo(20.8125f, 6.4063f)
                lineTo(20.5f, 6.0f)
                close()
                moveTo(12.5f, 8.0f)
                lineTo(19.5f, 8.0f)
                lineTo(20.6875f, 9.5938f)
                lineTo(21.0f, 10.0f)
                lineTo(27.0f, 10.0f)
                lineTo(27.0f, 14.0f)
                lineTo(21.1875f, 14.0f)
                curveTo(20.1445f, 12.2148f, 18.207f, 11.0f, 16.0f, 11.0f)
                curveTo(13.793f, 11.0f, 11.8555f, 12.2148f, 10.8125f, 14.0f)
                lineTo(5.0f, 14.0f)
                lineTo(5.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.3125f, 9.5938f)
                close()
                moveTo(23.0f, 11.0f)
                lineTo(23.0f, 13.0f)
                lineTo(25.0f, 13.0f)
                lineTo(25.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(18.2227f, 13.0f, 20.0f, 14.7773f, 20.0f, 17.0f)
                curveTo(20.0f, 19.2227f, 18.2227f, 21.0f, 16.0f, 21.0f)
                curveTo(13.7773f, 21.0f, 12.0f, 19.2227f, 12.0f, 17.0f)
                curveTo(12.0f, 14.7773f, 13.7773f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(5.0f, 16.0f)
                lineTo(10.0938f, 16.0f)
                curveTo(10.0391f, 16.3203f, 10.0f, 16.6641f, 10.0f, 17.0f)
                curveTo(10.0f, 20.3008f, 12.6992f, 23.0f, 16.0f, 23.0f)
                curveTo(19.3008f, 23.0f, 22.0f, 20.3008f, 22.0f, 17.0f)
                curveTo(22.0f, 16.6641f, 21.9609f, 16.3203f, 21.9063f, 16.0f)
                lineTo(27.0f, 16.0f)
                lineTo(27.0f, 24.0f)
                lineTo(5.0f, 24.0f)
                close()
            }
        }
        .build()
        return _cameraRetroSolid!!
    }

private var _cameraRetroSolid: ImageVector? = null
