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

public val MaterialDesignIcons.VideoMinusOutline: ImageVector
    get() {
        if (_videoMinusOutline != null) {
            return _videoMinusOutline!!
        }
        _videoMinusOutline = Builder(name = "VideoMinusOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 8.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                moveTo(16.0f, 6.0f)
                horizontalLineTo(4.0f)
                curveTo(3.45f, 6.0f, 3.0f, 6.45f, 3.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(3.0f, 17.55f, 3.45f, 18.0f, 4.0f, 18.0f)
                horizontalLineTo(16.0f)
                curveTo(16.55f, 18.0f, 17.0f, 17.55f, 17.0f, 17.0f)
                verticalLineTo(13.5f)
                lineTo(21.0f, 17.5f)
                verticalLineTo(6.5f)
                lineTo(17.0f, 10.5f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.45f, 16.55f, 6.0f, 16.0f, 6.0f)
                moveTo(13.0f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                close()
            }
        }
        .build()
        return _videoMinusOutline!!
    }

private var _videoMinusOutline: ImageVector? = null
