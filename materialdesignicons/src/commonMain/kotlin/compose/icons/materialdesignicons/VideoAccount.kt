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

public val MaterialDesignIcons.VideoAccount: ImageVector
    get() {
        if (_videoAccount != null) {
            return _videoAccount!!
        }
        _videoAccount = Builder(name = "VideoAccount", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 10.5f)
                lineTo(21.0f, 6.5f)
                verticalLineTo(17.5f)
                lineTo(17.0f, 13.5f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 16.0f, 18.0f)
                horizontalLineTo(4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 3.0f, 17.0f)
                verticalLineTo(7.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 4.0f, 6.0f)
                horizontalLineTo(16.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 7.0f)
                verticalLineTo(10.5f)
                moveTo(14.0f, 16.0f)
                verticalLineTo(15.0f)
                curveTo(14.0f, 13.67f, 11.33f, 13.0f, 10.0f, 13.0f)
                curveTo(8.67f, 13.0f, 6.0f, 13.67f, 6.0f, 15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                moveTo(10.0f, 8.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 8.0f)
                close()
            }
        }
        .build()
        return _videoAccount!!
    }

private var _videoAccount: ImageVector? = null
