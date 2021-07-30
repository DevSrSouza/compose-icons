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

public val LineAwesomeIcons.ToolboxSolid: ImageVector
    get() {
        if (_toolboxSolid != null) {
            return _toolboxSolid!!
        }
        _toolboxSolid = Builder(name = "ToolboxSolid", defaultWidth = 32.0.dp, defaultHeight =
                32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 5.0f)
                curveTo(11.9063f, 5.0f, 11.0f, 5.9063f, 11.0f, 7.0f)
                lineTo(11.0f, 9.0f)
                lineTo(2.0f, 9.0f)
                lineTo(2.0f, 27.0f)
                lineTo(30.0f, 27.0f)
                lineTo(30.0f, 9.0f)
                lineTo(21.0f, 9.0f)
                lineTo(21.0f, 7.0f)
                curveTo(21.0f, 5.9063f, 20.0938f, 5.0f, 19.0f, 5.0f)
                close()
                moveTo(13.0f, 7.0f)
                lineTo(19.0f, 7.0f)
                lineTo(19.0f, 9.0f)
                lineTo(13.0f, 9.0f)
                close()
                moveTo(4.0f, 11.0f)
                lineTo(28.0f, 11.0f)
                lineTo(28.0f, 16.0f)
                lineTo(24.0f, 16.0f)
                lineTo(24.0f, 15.0f)
                lineTo(20.0f, 15.0f)
                lineTo(20.0f, 16.0f)
                lineTo(12.0f, 16.0f)
                lineTo(12.0f, 15.0f)
                lineTo(8.0f, 15.0f)
                lineTo(8.0f, 16.0f)
                lineTo(4.0f, 16.0f)
                close()
                moveTo(4.0f, 18.0f)
                lineTo(8.0f, 18.0f)
                lineTo(8.0f, 19.0f)
                lineTo(12.0f, 19.0f)
                lineTo(12.0f, 18.0f)
                lineTo(20.0f, 18.0f)
                lineTo(20.0f, 19.0f)
                lineTo(24.0f, 19.0f)
                lineTo(24.0f, 18.0f)
                lineTo(28.0f, 18.0f)
                lineTo(28.0f, 25.0f)
                lineTo(4.0f, 25.0f)
                close()
            }
        }
        .build()
        return _toolboxSolid!!
    }

private var _toolboxSolid: ImageVector? = null
