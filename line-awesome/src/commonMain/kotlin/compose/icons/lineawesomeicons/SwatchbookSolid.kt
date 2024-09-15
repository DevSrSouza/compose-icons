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

public val LineAwesomeIcons.SwatchbookSolid: ImageVector
    get() {
        if (_swatchbookSolid != null) {
            return _swatchbookSolid!!
        }
        _swatchbookSolid = Builder(name = "SwatchbookSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 5.0f)
                lineTo(5.0f, 23.0f)
                curveTo(5.0f, 25.206f, 6.794f, 27.0f, 9.0f, 27.0f)
                curveTo(11.206f, 27.0f, 13.0f, 25.206f, 13.0f, 23.0f)
                lineTo(13.0f, 5.0f)
                lineTo(5.0f, 5.0f)
                close()
                moveTo(7.0f, 7.0f)
                lineTo(11.0f, 7.0f)
                lineTo(11.0f, 11.0f)
                lineTo(7.0f, 11.0f)
                lineTo(7.0f, 7.0f)
                close()
                moveTo(18.9f, 7.443f)
                lineTo(14.502f, 11.844f)
                lineTo(14.502f, 14.67f)
                lineTo(18.898f, 10.271f)
                lineTo(21.729f, 13.1f)
                lineTo(14.5f, 20.328f)
                lineTo(14.5f, 23.0f)
                curveTo(14.5f, 23.056f, 14.493f, 23.108f, 14.492f, 23.164f)
                lineTo(24.557f, 13.102f)
                lineTo(18.9f, 7.443f)
                close()
                moveTo(7.0f, 13.0f)
                lineTo(11.0f, 13.0f)
                lineTo(11.0f, 17.0f)
                lineTo(7.0f, 17.0f)
                lineTo(7.0f, 13.0f)
                close()
                moveTo(7.0f, 19.0f)
                lineTo(11.0f, 19.0f)
                lineTo(11.0f, 23.0f)
                curveTo(11.0f, 24.103f, 10.103f, 25.0f, 9.0f, 25.0f)
                curveTo(7.897f, 25.0f, 7.0f, 24.103f, 7.0f, 23.0f)
                lineTo(7.0f, 19.0f)
                close()
                moveTo(20.777f, 19.0f)
                lineTo(18.777f, 21.0f)
                lineTo(25.0f, 21.0f)
                lineTo(25.0f, 25.0f)
                lineTo(14.777f, 25.0f)
                lineTo(12.889f, 26.889f)
                curveTo(12.847f, 26.931f, 12.797f, 26.96f, 12.754f, 27.0f)
                lineTo(27.0f, 27.0f)
                lineTo(27.0f, 19.0f)
                lineTo(20.777f, 19.0f)
                close()
            }
        }
        .build()
        return _swatchbookSolid!!
    }

private var _swatchbookSolid: ImageVector? = null
