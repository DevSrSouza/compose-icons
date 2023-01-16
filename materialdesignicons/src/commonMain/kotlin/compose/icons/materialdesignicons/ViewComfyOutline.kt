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

public val MaterialDesignIcons.ViewComfyOutline: ImageVector
    get() {
        if (_viewComfyOutline != null) {
            return _viewComfyOutline!!
        }
        _viewComfyOutline = Builder(name = "ViewComfyOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 5.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                moveTo(20.0f, 9.0f)
                horizontalLineTo(17.75f)
                verticalLineTo(7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(9.0f)
                moveTo(9.25f, 11.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(11.0f)
                moveTo(7.25f, 13.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(7.25f)
                verticalLineTo(13.0f)
                moveTo(11.5f, 9.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(7.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(9.0f)
                moveTo(13.5f, 7.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(9.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(7.0f)
                moveTo(11.5f, 15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.5f)
                moveTo(13.5f, 15.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(17.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.0f)
                moveTo(13.5f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.75f)
                verticalLineTo(13.0f)
                horizontalLineTo(13.5f)
                moveTo(17.75f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(17.75f)
                verticalLineTo(11.0f)
                moveTo(7.25f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(7.25f)
                moveTo(5.0f, 15.0f)
                horizontalLineTo(7.25f)
                verticalLineTo(17.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(15.0f)
                moveTo(17.75f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.75f)
                close()
            }
        }
        .build()
        return _viewComfyOutline!!
    }

private var _viewComfyOutline: ImageVector? = null
