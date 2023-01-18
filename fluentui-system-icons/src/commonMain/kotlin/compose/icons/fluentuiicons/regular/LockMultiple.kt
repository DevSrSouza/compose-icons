package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.LockMultiple: ImageVector
    get() {
        if (_lockMultiple != null) {
            return _lockMultiple!!
        }
        _lockMultiple = Builder(name = "LockMultiple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.75f, 13.75f)
                curveTo(11.4404f, 13.75f, 12.0f, 13.1904f, 12.0f, 12.5f)
                curveTo(12.0f, 11.8096f, 11.4404f, 11.25f, 10.75f, 11.25f)
                curveTo(10.0596f, 11.25f, 9.5f, 11.8096f, 9.5f, 12.5f)
                curveTo(9.5f, 13.1904f, 10.0596f, 13.75f, 10.75f, 13.75f)
                close()
                moveTo(7.25f, 5.5f)
                curveTo(7.25f, 3.567f, 8.817f, 2.0f, 10.75f, 2.0f)
                curveTo(12.683f, 2.0f, 14.25f, 3.567f, 14.25f, 5.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(15.25f)
                curveTo(16.4926f, 6.5f, 17.5f, 7.5074f, 17.5f, 8.75f)
                verticalLineTo(16.25f)
                curveTo(17.5f, 17.4926f, 16.4926f, 18.5f, 15.25f, 18.5f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 18.5f, 4.0f, 17.4926f, 4.0f, 16.25f)
                verticalLineTo(8.75f)
                curveTo(4.0f, 7.5074f, 5.0074f, 6.5f, 6.25f, 6.5f)
                horizontalLineTo(7.25f)
                verticalLineTo(5.5f)
                close()
                moveTo(12.75f, 5.5f)
                curveTo(12.75f, 4.3954f, 11.8546f, 3.5f, 10.75f, 3.5f)
                curveTo(9.6454f, 3.5f, 8.75f, 4.3954f, 8.75f, 5.5f)
                verticalLineTo(6.5f)
                horizontalLineTo(12.75f)
                verticalLineTo(5.5f)
                close()
                moveTo(5.5f, 8.75f)
                verticalLineTo(16.25f)
                curveTo(5.5f, 16.6642f, 5.8358f, 17.0f, 6.25f, 17.0f)
                horizontalLineTo(15.25f)
                curveTo(15.6642f, 17.0f, 16.0f, 16.6642f, 16.0f, 16.25f)
                verticalLineTo(8.75f)
                curveTo(16.0f, 8.3358f, 15.6642f, 8.0f, 15.25f, 8.0f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 8.0f, 5.5f, 8.3358f, 5.5f, 8.75f)
                close()
                moveTo(9.7499f, 21.0f)
                curveTo(8.7702f, 21.0f, 7.9368f, 20.3739f, 7.6279f, 19.5f)
                horizontalLineTo(15.7499f)
                curveTo(17.2687f, 19.5f, 18.4999f, 18.2688f, 18.4999f, 16.75f)
                verticalLineTo(10.1281f)
                curveTo(19.3738f, 10.4369f, 19.9999f, 11.2704f, 19.9999f, 12.25f)
                verticalLineTo(16.75f)
                curveTo(19.9999f, 19.0972f, 18.0971f, 21.0f, 15.7499f, 21.0f)
                horizontalLineTo(9.7499f)
                close()
            }
        }
        .build()
        return _lockMultiple!!
    }

private var _lockMultiple: ImageVector? = null
