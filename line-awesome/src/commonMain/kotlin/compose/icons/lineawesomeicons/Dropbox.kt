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

public val LineAwesomeIcons.Dropbox: ImageVector
    get() {
        if (_dropbox != null) {
            return _dropbox!!
        }
        _dropbox = Builder(name = "Dropbox", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.781f, 4.469f)
                lineTo(11.156f, 4.875f)
                lineTo(4.469f, 9.188f)
                lineTo(3.25f, 9.969f)
                lineTo(4.406f, 10.844f)
                lineTo(7.906f, 13.5f)
                lineTo(4.406f, 16.156f)
                lineTo(3.188f, 17.063f)
                lineTo(4.5f, 17.813f)
                lineTo(8.125f, 19.938f)
                lineTo(8.125f, 23.281f)
                lineTo(8.563f, 23.563f)
                lineTo(15.438f, 28.094f)
                lineTo(16.0f, 28.469f)
                lineTo(16.563f, 28.094f)
                lineTo(23.438f, 23.625f)
                lineTo(23.875f, 23.313f)
                lineTo(23.875f, 19.969f)
                lineTo(27.5f, 17.813f)
                lineTo(28.719f, 17.094f)
                lineTo(27.656f, 16.188f)
                lineTo(24.313f, 13.344f)
                lineTo(27.625f, 10.625f)
                lineTo(28.719f, 9.75f)
                lineTo(27.531f, 9.0f)
                lineTo(21.031f, 4.875f)
                lineTo(20.406f, 4.5f)
                lineTo(19.844f, 4.969f)
                lineTo(16.0f, 8.125f)
                lineTo(12.344f, 4.969f)
                close()
                moveTo(20.594f, 6.938f)
                lineTo(25.313f, 9.969f)
                lineTo(22.656f, 12.125f)
                lineTo(17.75f, 9.281f)
                close()
                moveTo(11.594f, 6.969f)
                lineTo(14.344f, 9.313f)
                lineTo(9.625f, 12.313f)
                lineTo(6.719f, 10.094f)
                close()
                moveTo(16.0f, 10.625f)
                lineTo(20.813f, 13.375f)
                lineTo(16.0f, 16.375f)
                lineTo(11.469f, 13.531f)
                close()
                moveTo(22.656f, 14.563f)
                lineTo(25.281f, 16.813f)
                lineTo(22.469f, 18.5f)
                curveTo(22.379f, 18.539f, 22.293f, 18.594f, 22.219f, 18.656f)
                lineTo(20.469f, 19.688f)
                lineTo(17.75f, 17.625f)
                close()
                moveTo(9.625f, 14.719f)
                lineTo(14.25f, 17.625f)
                lineTo(11.625f, 19.688f)
                lineTo(6.781f, 16.844f)
                close()
                moveTo(16.031f, 18.813f)
                lineTo(19.781f, 21.688f)
                lineTo(20.344f, 22.094f)
                lineTo(20.906f, 21.75f)
                lineTo(21.875f, 21.156f)
                lineTo(21.875f, 22.219f)
                lineTo(16.0f, 26.063f)
                lineTo(10.125f, 22.188f)
                lineTo(10.125f, 21.125f)
                lineTo(11.188f, 21.75f)
                lineTo(11.781f, 22.094f)
                lineTo(12.313f, 21.688f)
                close()
            }
        }
        .build()
        return _dropbox!!
    }

private var _dropbox: ImageVector? = null
