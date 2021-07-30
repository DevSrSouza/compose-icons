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

public val LineAwesomeIcons.Firstdraft: ImageVector
    get() {
        if (_firstdraft != null) {
            return _firstdraft!!
        }
        _firstdraft = Builder(name = "Firstdraft", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 4.0f)
                lineTo(7.0f, 22.0f)
                lineTo(13.0f, 22.0f)
                lineTo(13.0f, 16.0f)
                lineTo(19.0f, 16.0f)
                lineTo(19.0f, 10.0f)
                lineTo(25.0f, 10.0f)
                lineTo(25.0f, 4.0f)
                lineTo(7.0f, 4.0f)
                close()
                moveTo(21.0f, 12.0f)
                lineTo(21.0f, 18.0f)
                lineTo(15.0f, 18.0f)
                lineTo(15.0f, 24.0f)
                lineTo(7.0f, 24.0f)
                lineTo(7.0f, 25.0f)
                lineTo(15.0f, 25.0f)
                lineTo(16.0f, 25.0f)
                lineTo(16.0f, 19.0f)
                lineTo(21.0f, 19.0f)
                lineTo(22.0f, 19.0f)
                lineTo(22.0f, 13.0f)
                lineTo(25.0f, 13.0f)
                lineTo(25.0f, 12.0f)
                lineTo(21.0f, 12.0f)
                close()
                moveTo(24.0f, 15.0f)
                lineTo(24.0f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 27.0f)
                lineTo(10.0f, 27.0f)
                lineTo(10.0f, 28.0f)
                lineTo(18.0f, 28.0f)
                lineTo(19.0f, 28.0f)
                lineTo(19.0f, 22.0f)
                lineTo(24.0f, 22.0f)
                lineTo(25.0f, 22.0f)
                lineTo(25.0f, 15.0f)
                lineTo(24.0f, 15.0f)
                close()
                moveTo(21.0f, 24.0f)
                lineTo(21.0f, 28.0f)
                lineTo(22.0f, 28.0f)
                lineTo(22.0f, 25.0f)
                lineTo(25.0f, 25.0f)
                lineTo(25.0f, 24.0f)
                lineTo(21.0f, 24.0f)
                close()
            }
        }
        .build()
        return _firstdraft!!
    }

private var _firstdraft: ImageVector? = null
