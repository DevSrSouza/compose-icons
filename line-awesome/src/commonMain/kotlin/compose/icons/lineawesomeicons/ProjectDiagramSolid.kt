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

public val LineAwesomeIcons.ProjectDiagramSolid: ImageVector
    get() {
        if (_projectDiagramSolid != null) {
            return _projectDiagramSolid!!
        }
        _projectDiagramSolid = Builder(name = "ProjectDiagramSolid", defaultWidth = 32.0.dp,
                defaultHeight = 32.0.dp, viewportWidth = 32.0f, viewportHeight = 32.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 6.0f)
                lineTo(3.0f, 14.0f)
                lineTo(8.6348f, 14.0f)
                lineTo(12.0f, 19.9082f)
                lineTo(12.0f, 27.0f)
                lineTo(20.0f, 27.0f)
                lineTo(20.0f, 19.0f)
                lineTo(13.7832f, 19.0f)
                lineTo(10.9375f, 14.0f)
                lineTo(11.0f, 14.0f)
                lineTo(11.0f, 11.0f)
                lineTo(21.0f, 11.0f)
                lineTo(21.0f, 14.0f)
                lineTo(29.0f, 14.0f)
                lineTo(29.0f, 6.0f)
                lineTo(21.0f, 6.0f)
                lineTo(21.0f, 9.0f)
                lineTo(11.0f, 9.0f)
                lineTo(11.0f, 6.0f)
                lineTo(3.0f, 6.0f)
                close()
                moveTo(5.0f, 8.0f)
                lineTo(9.0f, 8.0f)
                lineTo(9.0f, 12.0f)
                lineTo(5.0f, 12.0f)
                lineTo(5.0f, 8.0f)
                close()
                moveTo(23.0f, 8.0f)
                lineTo(27.0f, 8.0f)
                lineTo(27.0f, 12.0f)
                lineTo(23.0f, 12.0f)
                lineTo(23.0f, 8.0f)
                close()
                moveTo(14.418f, 21.0f)
                lineTo(18.0f, 21.0f)
                lineTo(18.0f, 25.0f)
                lineTo(14.0f, 25.0f)
                lineTo(14.0f, 21.2383f)
                lineTo(14.418f, 21.0f)
                close()
            }
        }
        .build()
        return _projectDiagramSolid!!
    }

private var _projectDiagramSolid: ImageVector? = null
