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

public val MaterialDesignIcons.Ssh: ImageVector
    get() {
        if (_ssh != null) {
            return _ssh!!
        }
        _ssh = Builder(name = "Ssh", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.5f, 9.0f)
                curveTo(3.9f, 9.0f, 3.5f, 9.5f, 3.5f, 10.0f)
                verticalLineTo(11.75f)
                curveTo(3.5f, 12.25f, 3.9f, 12.75f, 4.5f, 12.75f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.5f)
                curveTo(8.1f, 15.0f, 8.5f, 14.5f, 8.5f, 14.0f)
                verticalLineTo(12.25f)
                curveTo(8.5f, 11.75f, 8.1f, 11.25f, 7.5f, 11.25f)
                horizontalLineTo(5.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.5f)
                moveTo(10.5f, 9.0f)
                curveTo(9.9f, 9.0f, 9.5f, 9.5f, 9.5f, 10.0f)
                verticalLineTo(11.75f)
                curveTo(9.5f, 12.25f, 9.9f, 12.75f, 10.5f, 12.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.5f)
                curveTo(14.1f, 15.0f, 14.5f, 14.5f, 14.5f, 14.0f)
                verticalLineTo(12.25f)
                curveTo(14.5f, 11.75f, 14.1f, 11.25f, 13.5f, 11.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.5f)
                moveTo(15.5f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.5f)
                horizontalLineTo(19.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _ssh!!
    }

private var _ssh: ImageVector? = null
