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

public val LineAwesomeIcons.GoogleDrive: ImageVector
    get() {
        if (_googleDrive != null) {
            return _googleDrive!!
        }
        _googleDrive = Builder(name = "GoogleDrive", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.438f, 5.0f)
                lineTo(11.156f, 5.469f)
                lineTo(3.156f, 18.469f)
                lineTo(2.844f, 18.969f)
                lineTo(3.125f, 19.5f)
                lineTo(7.125f, 26.5f)
                lineTo(7.406f, 27.0f)
                lineTo(24.594f, 27.0f)
                lineTo(24.875f, 26.5f)
                lineTo(28.875f, 19.5f)
                lineTo(29.156f, 18.969f)
                lineTo(28.844f, 18.469f)
                lineTo(20.844f, 5.469f)
                lineTo(20.563f, 5.0f)
                close()
                moveTo(13.781f, 7.0f)
                lineTo(19.438f, 7.0f)
                lineTo(26.219f, 18.0f)
                lineTo(20.563f, 18.0f)
                close()
                moveTo(12.0f, 7.906f)
                lineTo(14.969f, 12.75f)
                lineTo(8.031f, 24.031f)
                lineTo(5.156f, 19.0f)
                close()
                moveTo(16.156f, 14.656f)
                lineTo(18.219f, 18.0f)
                lineTo(14.094f, 18.0f)
                close()
                moveTo(12.875f, 20.0f)
                lineTo(26.281f, 20.0f)
                lineTo(23.406f, 25.0f)
                lineTo(9.781f, 25.0f)
                close()
            }
        }
        .build()
        return _googleDrive!!
    }

private var _googleDrive: ImageVector? = null
