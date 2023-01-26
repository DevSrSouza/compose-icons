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

public val SharpGroup.TableView: ImageVector
    get() {
        if (_tableView != null) {
            return _tableView!!
        }
        _tableView = Builder(name = "TableView", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 7.0f)
                horizontalLineTo(7.0f)
                verticalLineToRelative(14.0f)
                horizontalLineToRelative(14.0f)
                verticalLineTo(7.0f)
                close()
                moveTo(19.0f, 9.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                close()
                moveTo(13.0f, 15.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(13.0f)
                close()
                moveTo(15.0f, 17.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineTo(15.0f)
                close()
                moveTo(11.0f, 15.0f)
                horizontalLineTo(9.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineTo(15.0f)
                close()
                moveTo(17.0f, 13.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(13.0f)
                close()
                moveTo(9.0f, 17.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.0f)
                close()
                moveTo(17.0f, 19.0f)
                verticalLineToRelative(-2.0f)
                horizontalLineToRelative(2.0f)
                verticalLineToRelative(2.0f)
                horizontalLineTo(17.0f)
                close()
                moveTo(6.0f, 17.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                horizontalLineToRelative(14.0f)
                verticalLineToRelative(3.0f)
                horizontalLineToRelative(-2.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(5.0f)
                verticalLineToRelative(10.0f)
                horizontalLineToRelative(1.0f)
                verticalLineTo(17.0f)
                close()
            }
        }
        .build()
        return _tableView!!
    }

private var _tableView: ImageVector? = null