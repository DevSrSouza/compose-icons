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

public val MaterialDesignIcons.YoutubeSubscription: ImageVector
    get() {
        if (_youtubeSubscription != null) {
            return _youtubeSubscription!!
        }
        _youtubeSubscription = Builder(name = "YoutubeSubscription", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 8.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(8.0f)
                moveTo(18.0f, 2.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                moveTo(22.0f, 12.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 20.0f, 22.0f)
                horizontalLineTo(4.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 2.0f, 20.0f)
                verticalLineTo(12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 10.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 12.0f)
                moveTo(16.0f, 16.0f)
                lineTo(10.0f, 12.73f)
                verticalLineTo(19.26f)
                lineTo(16.0f, 16.0f)
                close()
            }
        }
        .build()
        return _youtubeSubscription!!
    }

private var _youtubeSubscription: ImageVector? = null
