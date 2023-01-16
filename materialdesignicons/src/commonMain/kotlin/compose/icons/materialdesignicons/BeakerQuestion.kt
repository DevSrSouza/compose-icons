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

public val MaterialDesignIcons.BeakerQuestion: ImageVector
    get() {
        if (_beakerQuestion != null) {
            return _beakerQuestion!!
        }
        _beakerQuestion = Builder(name = "BeakerQuestion", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(0.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                curveTo(16.9f, 5.0f, 16.0f, 5.9f, 16.0f, 7.0f)
                verticalLineTo(19.0f)
                curveTo(16.0f, 20.1f, 15.1f, 21.0f, 14.0f, 21.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 21.0f, 2.0f, 20.1f, 2.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(2.0f, 5.9f, 1.1f, 5.0f, 0.0f, 5.0f)
                verticalLineTo(3.0f)
                moveTo(4.0f, 9.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(4.0f)
                moveTo(4.0f, 11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(4.0f)
                moveTo(7.0f, 16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                moveTo(9.0f, 14.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                moveTo(9.0f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(9.0f)
                moveTo(21.5f, 15.5f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(15.5f)
                horizontalLineTo(21.5f)
                moveTo(19.5f, 10.5f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                curveTo(18.0f, 8.34f, 19.34f, 7.0f, 21.0f, 7.0f)
                curveTo(22.66f, 7.0f, 24.0f, 8.34f, 24.0f, 10.0f)
                curveTo(24.0f, 10.97f, 23.5f, 11.88f, 22.71f, 12.41f)
                lineTo(22.41f, 12.6f)
                curveTo(21.84f, 13.0f, 21.5f, 13.62f, 21.5f, 14.3f)
                verticalLineTo(14.5f)
                horizontalLineTo(20.0f)
                verticalLineTo(14.3f)
                curveTo(20.0f, 13.11f, 20.6f, 12.0f, 21.59f, 11.35f)
                lineTo(21.88f, 11.16f)
                curveTo(22.27f, 10.9f, 22.5f, 10.47f, 22.5f, 10.0f)
                curveTo(22.5f, 9.18f, 21.83f, 8.5f, 21.0f, 8.5f)
                curveTo(20.17f, 8.5f, 19.5f, 9.17f, 19.5f, 10.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _beakerQuestion!!
    }

private var _beakerQuestion: ImageVector? = null
