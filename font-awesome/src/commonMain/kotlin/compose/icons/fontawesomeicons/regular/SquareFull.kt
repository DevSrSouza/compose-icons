package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.SquareFull: ImageVector
    get() {
        if (_squareFull != null) {
            return _squareFull!!
        }
        _squareFull = Builder(name = "SquareFull", defaultWidth = 512.0.dp, defaultHeight =
                512.0.dp, viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(464.0f, 48.0f)
                verticalLineTo(464.0f)
                horizontalLineTo(48.0f)
                verticalLineTo(48.0f)
                horizontalLineTo(464.0f)
                close()
                moveTo(48.0f, 0.0f)
                horizontalLineTo(0.0f)
                verticalLineTo(48.0f)
                verticalLineTo(464.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(48.0f)
                horizontalLineTo(464.0f)
                horizontalLineToRelative(48.0f)
                verticalLineTo(464.0f)
                verticalLineTo(48.0f)
                verticalLineTo(0.0f)
                horizontalLineTo(464.0f)
                horizontalLineTo(48.0f)
                close()
            }
        }
        .build()
        return _squareFull!!
    }

private var _squareFull: ImageVector? = null
