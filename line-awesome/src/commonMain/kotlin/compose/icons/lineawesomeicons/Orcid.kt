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

public val LineAwesomeIcons.Orcid: ImageVector
    get() {
        if (_orcid != null) {
            return _orcid!!
        }
        _orcid = Builder(name = "Orcid", defaultWidth = 32.0.dp, defaultHeight = 32.0.dp,
                viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.8321f, 3.0f, 3.0f, 8.8321f, 3.0f, 16.0f)
                curveTo(3.0f, 23.1679f, 8.8321f, 29.0f, 16.0f, 29.0f)
                curveTo(23.1679f, 29.0f, 29.0f, 23.1679f, 29.0f, 16.0f)
                curveTo(29.0f, 8.8321f, 23.1679f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.087f, 5.0f, 27.0f, 9.913f, 27.0f, 16.0f)
                curveTo(27.0f, 22.087f, 22.087f, 27.0f, 16.0f, 27.0f)
                curveTo(9.913f, 27.0f, 5.0f, 22.087f, 5.0f, 16.0f)
                curveTo(5.0f, 9.913f, 9.913f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(11.0f, 8.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 8.0f)
                close()
                moveTo(10.0f, 11.0f)
                lineTo(10.0f, 22.0f)
                lineTo(12.0f, 22.0f)
                lineTo(12.0f, 11.0f)
                lineTo(10.0f, 11.0f)
                close()
                moveTo(14.0f, 11.0f)
                lineTo(14.0f, 12.0f)
                lineTo(14.0f, 22.0f)
                lineTo(18.5f, 22.0f)
                curveTo(21.5256f, 22.0f, 24.0f, 19.5256f, 24.0f, 16.5f)
                curveTo(24.0f, 13.4744f, 21.5256f, 11.0f, 18.5f, 11.0f)
                lineTo(14.0f, 11.0f)
                close()
                moveTo(16.0f, 13.0f)
                lineTo(18.5f, 13.0f)
                curveTo(20.4444f, 13.0f, 22.0f, 14.5556f, 22.0f, 16.5f)
                curveTo(22.0f, 18.4444f, 20.4444f, 20.0f, 18.5f, 20.0f)
                lineTo(16.0f, 20.0f)
                lineTo(16.0f, 13.0f)
                close()
            }
        }
        .build()
        return _orcid!!
    }

private var _orcid: ImageVector? = null
