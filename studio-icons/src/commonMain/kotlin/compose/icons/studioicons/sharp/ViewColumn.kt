package compose.icons.studioicons.sharp

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.SharpGroup

public val SharpGroup.ViewColumn: ImageVector
    get() {
        if (_viewColumn != null) {
            return _viewColumn!!
        }
        _viewColumn = Builder(name = "ViewColumn", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.67f, 5.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(9.33f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.67f)
                close()
                moveTo(15.67f, 19.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                horizontalLineToRelative(-5.33f)
                verticalLineTo(19.0f)
                close()
                moveTo(8.33f, 19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineToRelative(14.0f)
                horizontalLineTo(8.33f)
                close()
            }
        }
        .build()
        return _viewColumn!!
    }

private var _viewColumn: ImageVector? = null
