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
                moveTo(11.4375f, 5.0f)
                lineTo(11.1563f, 5.4688f)
                lineTo(3.1563f, 18.4688f)
                lineTo(2.8438f, 18.9688f)
                lineTo(3.125f, 19.5f)
                lineTo(7.125f, 26.5f)
                lineTo(7.4063f, 27.0f)
                lineTo(24.5938f, 27.0f)
                lineTo(24.875f, 26.5f)
                lineTo(28.875f, 19.5f)
                lineTo(29.1563f, 18.9688f)
                lineTo(28.8438f, 18.4688f)
                lineTo(20.8438f, 5.4688f)
                lineTo(20.5625f, 5.0f)
                close()
                moveTo(13.7813f, 7.0f)
                lineTo(19.4375f, 7.0f)
                lineTo(26.2188f, 18.0f)
                lineTo(20.5625f, 18.0f)
                close()
                moveTo(12.0f, 7.9063f)
                lineTo(14.9688f, 12.75f)
                lineTo(8.0313f, 24.0313f)
                lineTo(5.1563f, 19.0f)
                close()
                moveTo(16.1563f, 14.6563f)
                lineTo(18.2188f, 18.0f)
                lineTo(14.0938f, 18.0f)
                close()
                moveTo(12.875f, 20.0f)
                lineTo(26.2813f, 20.0f)
                lineTo(23.4063f, 25.0f)
                lineTo(9.7813f, 25.0f)
                close()
            }
        }
        .build()
        return _googleDrive!!
    }

private var _googleDrive: ImageVector? = null
