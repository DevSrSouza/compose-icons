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

public val LineAwesomeIcons.Gofore: ImageVector
    get() {
        if (_gofore != null) {
            return _gofore!!
        }
        _gofore = Builder(name = "Gofore", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                curveTo(10.373f, 4.0f, 5.0f, 9.373f, 5.0f, 16.0f)
                curveTo(5.0f, 22.627f, 10.373f, 28.0f, 17.0f, 28.0f)
                curveTo(20.585f, 28.0f, 23.782f, 26.408f, 25.979f, 23.914f)
                curveTo(25.863f, 22.119f, 24.49f, 20.077f, 22.0f, 20.012f)
                lineTo(22.0f, 20.865f)
                curveTo(20.729f, 22.174f, 18.964f, 23.0f, 17.0f, 23.0f)
                curveTo(13.14f, 23.0f, 10.0f, 19.86f, 10.0f, 16.0f)
                curveTo(10.0f, 12.14f, 13.14f, 9.0f, 17.0f, 9.0f)
                curveTo(18.692f, 9.0f, 20.245f, 9.604f, 21.457f, 10.607f)
                lineTo(24.963f, 7.039f)
                curveTo(22.843f, 5.154f, 20.059f, 4.0f, 17.0f, 4.0f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(16.0f, 18.0f)
                lineTo(22.0f, 18.0f)
                curveTo(24.21f, 18.0f, 25.418f, 18.796f, 26.0f, 20.0f)
                curveTo(26.0f, 17.369f, 26.002f, 13.0f, 22.0f, 13.0f)
                lineTo(16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _gofore!!
    }

private var _gofore: ImageVector? = null
