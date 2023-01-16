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

public val MaterialDesignIcons.BeakerRemoveOutline: ImageVector
    get() {
        if (_beakerRemoveOutline != null) {
            return _beakerRemoveOutline!!
        }
        _beakerRemoveOutline = Builder(name = "BeakerRemoveOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.46f, 15.88f)
                lineTo(16.88f, 14.46f)
                lineTo(19.0f, 16.59f)
                lineTo(21.12f, 14.47f)
                lineTo(22.53f, 15.88f)
                lineTo(20.41f, 18.0f)
                lineTo(22.54f, 20.12f)
                lineTo(21.12f, 21.54f)
                lineTo(19.0f, 19.41f)
                lineTo(16.88f, 21.53f)
                lineTo(15.47f, 20.12f)
                lineTo(17.59f, 18.0f)
                lineTo(15.46f, 15.88f)
                moveTo(3.0f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                curveTo(19.9f, 5.0f, 19.0f, 5.9f, 19.0f, 7.0f)
                verticalLineTo(12.0f)
                curveTo(18.3f, 12.0f, 17.63f, 12.12f, 17.0f, 12.34f)
                verticalLineTo(5.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.08f)
                curveTo(13.2f, 19.72f, 13.45f, 20.39f, 13.8f, 21.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 21.0f, 5.0f, 20.11f, 5.0f, 19.0f)
                verticalLineTo(7.0f)
                curveTo(5.0f, 5.9f, 4.11f, 5.0f, 3.0f, 5.0f)
                verticalLineTo(3.0f)
                close()
            }
        }
        .build()
        return _beakerRemoveOutline!!
    }

private var _beakerRemoveOutline: ImageVector? = null
