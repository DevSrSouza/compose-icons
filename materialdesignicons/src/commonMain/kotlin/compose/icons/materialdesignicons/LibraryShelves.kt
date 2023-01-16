package compose.icons.materialdesignicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.MaterialDesignIcons

public val MaterialDesignIcons.LibraryShelves: ImageVector
    get() {
        if (_libraryShelves != null) {
            return _libraryShelves!!
        }
        _libraryShelves = Builder(name = "LibraryShelves", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.5f, 9.0f)
                verticalLineTo(1.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(1.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(1.5f)
                horizontalLineTo(4.65f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.5f)
                moveTo(19.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(4.65f)
                verticalLineTo(21.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.5f)
                horizontalLineTo(21.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.5f)
                verticalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _libraryShelves!!
    }

private var _libraryShelves: ImageVector? = null
