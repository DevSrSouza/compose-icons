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
                lineTo(11.188f, 6.406f)
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
                lineTo(20.813f, 6.406f)
                lineTo(20.5f, 6.0f)
                close()
                moveTo(12.5f, 8.0f)
                lineTo(19.5f, 8.0f)
                lineTo(20.688f, 9.594f)
                lineTo(21.0f, 10.0f)
                lineTo(27.0f, 10.0f)
                lineTo(27.0f, 14.0f)
                lineTo(21.188f, 14.0f)
                curveTo(20.145f, 12.215f, 18.207f, 11.0f, 16.0f, 11.0f)
                curveTo(13.793f, 11.0f, 11.855f, 12.215f, 10.813f, 14.0f)
                lineTo(5.0f, 14.0f)
                lineTo(5.0f, 10.0f)
                lineTo(11.0f, 10.0f)
                lineTo(11.313f, 9.594f)
                close()
                moveTo(23.0f, 11.0f)
                lineTo(23.0f, 13.0f)
                lineTo(25.0f, 13.0f)
                lineTo(25.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                curveTo(18.223f, 13.0f, 20.0f, 14.777f, 20.0f, 17.0f)
                curveTo(20.0f, 19.223f, 18.223f, 21.0f, 16.0f, 21.0f)
                curveTo(13.777f, 21.0f, 12.0f, 19.223f, 12.0f, 17.0f)
                curveTo(12.0f, 14.777f, 13.777f, 13.0f, 16.0f, 13.0f)
                close()
                moveTo(5.0f, 16.0f)
                lineTo(10.094f, 16.0f)
                curveTo(10.039f, 16.32f, 10.0f, 16.664f, 10.0f, 17.0f)
                curveTo(10.0f, 20.301f, 12.699f, 23.0f, 16.0f, 23.0f)
                curveTo(19.301f, 23.0f, 22.0f, 20.301f, 22.0f, 17.0f)
                curveTo(22.0f, 16.664f, 21.961f, 16.32f, 21.906f, 16.0f)
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
