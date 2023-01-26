package compose.icons.studioicons.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.studioicons.OutlineGroup

public val OutlineGroup.FilterListOff: ImageVector
    get() {
        if (_filterListOff != null) {
            return _filterListOff!!
        }
        _filterListOff = Builder(name = "FilterListOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.83f, 8.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(8.83f)
                lineTo(10.83f, 8.0f)
                close()
                moveTo(15.83f, 13.0f)
                horizontalLineTo(18.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(-4.17f)
                lineTo(15.83f, 13.0f)
                close()
                moveTo(14.0f, 16.83f)
                verticalLineTo(18.0f)
                horizontalLineToRelative(-4.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(3.17f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineTo(6.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.17f)
                lineToRelative(-3.0f, -3.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(6.0f)
                horizontalLineToRelative(0.17f)
                lineTo(1.39f, 4.22f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(18.38f, 18.38f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(14.0f, 16.83f)
                close()
            }
        }
        .build()
        return _filterListOff!!
    }

private var _filterListOff: ImageVector? = null
