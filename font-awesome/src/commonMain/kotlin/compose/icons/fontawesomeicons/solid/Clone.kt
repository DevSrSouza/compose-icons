package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Clone: ImageVector
    get() {
        if (_clone != null) {
            return _clone!!
        }
        _clone = Builder(name = "Clone", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 0.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, 21.49f, 48.0f, 48.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, -21.49f, 48.0f, -48.0f, 48.0f)
                horizontalLineTo(176.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, -21.49f, -48.0f, -48.0f)
                verticalLineTo(48.0f)
                curveToRelative(0.0f, -26.51f, 21.49f, -48.0f, 48.0f, -48.0f)
                horizontalLineToRelative(288.0f)
                moveTo(176.0f, 416.0f)
                curveToRelative(-44.112f, 0.0f, -80.0f, -35.888f, -80.0f, -80.0f)
                verticalLineTo(128.0f)
                horizontalLineTo(48.0f)
                curveToRelative(-26.51f, 0.0f, -48.0f, 21.49f, -48.0f, 48.0f)
                verticalLineToRelative(288.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                verticalLineToRelative(-48.0f)
                horizontalLineTo(176.0f)
                close()
            }
        }
        .build()
        return _clone!!
    }

private var _clone: ImageVector? = null
