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

public val MaterialDesignIcons.FormTextboxLock: ImageVector
    get() {
        if (_formTextboxLock != null) {
            return _formTextboxLock!!
        }
        _formTextboxLock = Builder(name = "FormTextboxLock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(7.0f)
                moveTo(10.0f, 7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(12.0f)
                curveTo(21.42f, 11.56f, 20.74f, 11.25f, 20.0f, 11.1f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.25f)
                curveTo(13.56f, 15.0f, 13.0f, 15.56f, 13.0f, 16.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                curveTo(10.0f, 19.55f, 10.45f, 20.0f, 11.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(10.5f)
                curveTo(9.95f, 22.0f, 9.0f, 21.55f, 9.0f, 21.0f)
                curveTo(9.0f, 21.55f, 8.05f, 22.0f, 7.5f, 22.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                curveTo(7.55f, 20.0f, 8.0f, 19.55f, 8.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(8.0f, 4.45f, 7.55f, 4.0f, 7.0f, 4.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(7.5f)
                curveTo(8.05f, 2.0f, 9.0f, 2.45f, 9.0f, 3.0f)
                curveTo(9.0f, 2.45f, 9.95f, 2.0f, 10.5f, 2.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(11.0f)
                curveTo(10.45f, 4.0f, 10.0f, 4.45f, 10.0f, 5.0f)
                verticalLineTo(7.0f)
                moveTo(21.8f, 17.0f)
                curveTo(22.4f, 17.0f, 23.0f, 17.6f, 23.0f, 18.3f)
                verticalLineTo(21.8f)
                curveTo(23.0f, 22.4f, 22.4f, 23.0f, 21.7f, 23.0f)
                horizontalLineTo(16.2f)
                curveTo(15.6f, 23.0f, 15.0f, 22.4f, 15.0f, 21.7f)
                verticalLineTo(18.2f)
                curveTo(15.0f, 17.6f, 15.6f, 17.0f, 16.2f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(16.2f, 14.1f, 17.6f, 13.0f, 19.0f, 13.0f)
                curveTo(20.4f, 13.0f, 21.8f, 14.1f, 21.8f, 15.5f)
                verticalLineTo(17.0f)
                moveTo(20.5f, 17.0f)
                verticalLineTo(15.5f)
                curveTo(20.5f, 14.7f, 19.8f, 14.2f, 19.0f, 14.2f)
                curveTo(18.2f, 14.2f, 17.5f, 14.7f, 17.5f, 15.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.5f)
                close()
            }
        }
        .build()
        return _formTextboxLock!!
    }

private var _formTextboxLock: ImageVector? = null
