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

public val MaterialDesignIcons.Video4kBox: ImageVector
    get() {
        if (_video4kBox != null) {
            return _video4kBox!!
        }
        _video4kBox = Builder(name = "Video4kBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                moveTo(12.0f, 13.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(6.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(13.5f)
                moveTo(18.0f, 15.0f)
                horizontalLineTo(16.2f)
                lineTo(14.4f, 12.8f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(14.5f)
                verticalLineTo(11.2f)
                lineTo(16.2f, 9.0f)
                horizontalLineTo(18.0f)
                lineTo(15.8f, 12.0f)
                lineTo(18.0f, 15.0f)
                close()
            }
        }
        .build()
        return _video4kBox!!
    }

private var _video4kBox: ImageVector? = null
