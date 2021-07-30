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

public val LineAwesomeIcons.Autoprefixer: ImageVector
    get() {
        if (_autoprefixer != null) {
            return _autoprefixer!!
        }
        _autoprefixer = Builder(name = "Autoprefixer", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.9277f, 5.0f)
                lineTo(8.668f, 27.0f)
                lineTo(12.1641f, 27.0f)
                lineTo(13.4004f, 23.0f)
                lineTo(18.6055f, 23.0f)
                lineTo(19.8379f, 27.0f)
                lineTo(23.334f, 27.0f)
                lineTo(15.9277f, 5.0f)
                close()
                moveTo(15.9688f, 14.6895f)
                lineTo(16.041f, 14.6895f)
                lineTo(17.9863f, 21.0f)
                lineTo(14.0176f, 21.0f)
                lineTo(15.9688f, 14.6895f)
                close()
                moveTo(9.2656f, 21.0f)
                lineTo(1.4707f, 21.5586f)
                lineTo(1.0f, 22.668f)
                lineTo(8.5586f, 23.0f)
                lineTo(9.2656f, 21.0f)
                close()
                moveTo(22.6973f, 21.0f)
                lineTo(23.418f, 23.0f)
                lineTo(31.0f, 22.668f)
                lineTo(30.5293f, 21.5586f)
                lineTo(22.6973f, 21.0f)
                close()
            }
        }
        .build()
        return _autoprefixer!!
    }

private var _autoprefixer: ImageVector? = null
