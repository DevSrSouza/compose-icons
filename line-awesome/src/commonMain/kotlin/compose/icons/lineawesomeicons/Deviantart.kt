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

public val LineAwesomeIcons.Deviantart: ImageVector
    get() {
        if (_deviantart != null) {
            return _deviantart!!
        }
        _deviantart = Builder(name = "Deviantart", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.375f, 4.0f)
                lineTo(18.094f, 4.313f)
                lineTo(17.688f, 4.688f)
                lineTo(17.594f, 4.813f)
                lineTo(17.531f, 4.938f)
                lineTo(15.75f, 8.313f)
                lineTo(15.594f, 8.406f)
                lineTo(8.188f, 8.406f)
                lineTo(8.188f, 15.906f)
                lineTo(11.781f, 15.906f)
                lineTo(8.313f, 22.531f)
                lineTo(8.188f, 22.75f)
                lineTo(8.188f, 28.0f)
                lineTo(13.625f, 28.0f)
                lineTo(13.906f, 27.688f)
                lineTo(14.313f, 27.313f)
                lineTo(14.406f, 27.188f)
                lineTo(14.469f, 27.063f)
                lineTo(16.25f, 23.688f)
                lineTo(16.406f, 23.594f)
                lineTo(23.813f, 23.594f)
                lineTo(23.813f, 16.094f)
                lineTo(20.219f, 16.094f)
                lineTo(23.688f, 9.469f)
                lineTo(23.813f, 9.25f)
                lineTo(23.813f, 4.0f)
                close()
                moveTo(19.219f, 6.0f)
                lineTo(21.813f, 6.0f)
                lineTo(21.813f, 8.781f)
                lineTo(17.875f, 16.25f)
                lineTo(17.594f, 16.844f)
                lineTo(18.0f, 17.344f)
                lineTo(18.344f, 17.75f)
                lineTo(18.625f, 18.094f)
                lineTo(21.813f, 18.094f)
                lineTo(21.813f, 21.594f)
                lineTo(15.781f, 21.594f)
                lineTo(15.5f, 21.781f)
                lineTo(14.906f, 22.156f)
                lineTo(14.719f, 22.313f)
                lineTo(14.594f, 22.531f)
                lineTo(12.781f, 26.0f)
                lineTo(10.188f, 26.0f)
                lineTo(10.188f, 23.219f)
                lineTo(14.094f, 15.75f)
                lineTo(14.406f, 15.188f)
                lineTo(14.0f, 14.656f)
                lineTo(13.656f, 14.25f)
                lineTo(13.375f, 13.906f)
                lineTo(10.188f, 13.906f)
                lineTo(10.188f, 10.406f)
                lineTo(16.219f, 10.406f)
                lineTo(16.469f, 10.219f)
                lineTo(17.063f, 9.844f)
                lineTo(17.281f, 9.688f)
                lineTo(17.406f, 9.469f)
                close()
            }
        }
        .build()
        return _deviantart!!
    }

private var _deviantart: ImageVector? = null
