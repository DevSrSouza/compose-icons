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

public val LineAwesomeIcons.CopyrightSolid: ImageVector
    get() {
        if (_copyrightSolid != null) {
            return _copyrightSolid!!
        }
        _copyrightSolid = Builder(name = "CopyrightSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.0f)
                curveTo(8.832f, 3.0f, 3.0f, 8.832f, 3.0f, 16.0f)
                curveTo(3.0f, 23.168f, 8.832f, 29.0f, 16.0f, 29.0f)
                curveTo(23.168f, 29.0f, 29.0f, 23.168f, 29.0f, 16.0f)
                curveTo(29.0f, 8.832f, 23.168f, 3.0f, 16.0f, 3.0f)
                close()
                moveTo(16.0f, 5.0f)
                curveTo(22.086f, 5.0f, 27.0f, 9.914f, 27.0f, 16.0f)
                curveTo(27.0f, 22.086f, 22.086f, 27.0f, 16.0f, 27.0f)
                curveTo(9.914f, 27.0f, 5.0f, 22.086f, 5.0f, 16.0f)
                curveTo(5.0f, 9.914f, 9.914f, 5.0f, 16.0f, 5.0f)
                close()
                moveTo(15.906f, 10.0f)
                curveTo(12.582f, 10.0f, 9.906f, 12.676f, 9.906f, 16.0f)
                curveTo(9.906f, 19.324f, 12.582f, 22.0f, 15.906f, 22.0f)
                curveTo(18.305f, 22.0f, 20.355f, 20.563f, 21.313f, 18.531f)
                lineTo(19.5f, 17.688f)
                curveTo(18.855f, 19.059f, 17.508f, 20.0f, 15.906f, 20.0f)
                curveTo(13.629f, 20.0f, 11.906f, 18.277f, 11.906f, 16.0f)
                curveTo(11.906f, 13.723f, 13.629f, 12.0f, 15.906f, 12.0f)
                curveTo(17.508f, 12.0f, 18.855f, 12.941f, 19.5f, 14.313f)
                lineTo(21.313f, 13.469f)
                curveTo(20.355f, 11.438f, 18.305f, 10.0f, 15.906f, 10.0f)
                close()
            }
        }
        .build()
        return _copyrightSolid!!
    }

private var _copyrightSolid: ImageVector? = null
