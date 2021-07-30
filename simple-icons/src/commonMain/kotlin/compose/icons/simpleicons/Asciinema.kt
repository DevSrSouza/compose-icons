package compose.icons.simpleicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.SimpleIcons

public val SimpleIcons.Asciinema: ImageVector
    get() {
        if (_asciinema != null) {
            return _asciinema!!
        }
        _asciinema = Builder(name = "Asciinema", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(1.61f, 0.0f)
                verticalLineTo(24.0f)
                lineTo(22.39f, 12.0f)
                lineTo(1.61f, 0.0f)
                moveTo(5.76f, 7.2f)
                lineTo(10.06f, 9.68f)
                lineTo(5.76f, 12.16f)
                verticalLineTo(7.2f)
                moveTo(12.55f, 11.12f)
                lineTo(14.08f, 12.0f)
                lineTo(5.76f, 16.8f)
                verticalLineTo(15.04f)
                lineTo(12.55f, 11.12f)
                close()
            }
        }
        .build()
        return _asciinema!!
    }

private var _asciinema: ImageVector? = null
