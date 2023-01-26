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

public val SharpGroup.EditCalendar: ImageVector
    get() {
        if (_editCalendar != null) {
            return _editCalendar!!
        }
        _editCalendar = Builder(name = "EditCalendar", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 22.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(4.0f)
                horizontalLineToRelative(3.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(8.0f)
                verticalLineTo(2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(7.0f)
                verticalLineTo(22.0f)
                close()
                moveTo(22.13f, 16.99f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(22.13f, 16.99f)
                close()
                moveTo(21.42f, 17.7f)
                lineToRelative(-5.3f, 5.3f)
                horizontalLineTo(14.0f)
                verticalLineToRelative(-2.12f)
                lineToRelative(5.3f, -5.3f)
                lineTo(21.42f, 17.7f)
                close()
            }
        }
        .build()
        return _editCalendar!!
    }

private var _editCalendar: ImageVector? = null
