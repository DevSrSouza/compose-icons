package compose.icons.remixicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.RemixIcons

public val RemixIcons.SliceLine: ImageVector
    get() {
        if (_sliceLine != null) {
            return _sliceLine!!
        }
        _sliceLine = Builder(name = "SliceLine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.69f, 12.918f)
                lineToRelative(1.769f, 1.768f)
                curveToRelative(-6.01f, 6.01f, -10.96f, 6.01f, -15.203f, 4.596f)
                lineTo(17.812f, 3.726f)
                lineToRelative(3.536f, 3.535f)
                lineToRelative(-5.657f, 5.657f)
                close()
                moveTo(12.862f, 12.918f)
                lineToRelative(5.657f, -5.657f)
                lineToRelative(-0.707f, -0.707f)
                lineTo(6.314f, 18.052f)
                curveToRelative(2.732f, 0.107f, 5.358f, -0.907f, 8.267f, -3.416f)
                lineToRelative(-1.719f, -1.718f)
                close()
            }
        }
        .build()
        return _sliceLine!!
    }

private var _sliceLine: ImageVector? = null
