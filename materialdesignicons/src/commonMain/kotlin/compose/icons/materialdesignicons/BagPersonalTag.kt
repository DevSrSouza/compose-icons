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

public val MaterialDesignIcons.BagPersonalTag: ImageVector
    get() {
        if (_bagPersonalTag != null) {
            return _bagPersonalTag!!
        }
        _bagPersonalTag = Builder(name = "BagPersonalTag", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 5.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 2.9f, 13.1f, 2.0f, 12.0f, 2.0f)
                horizontalLineTo(8.0f)
                curveTo(6.9f, 2.0f, 6.0f, 2.9f, 6.0f, 4.0f)
                verticalLineTo(5.0f)
                curveTo(3.8f, 5.0f, 2.0f, 6.8f, 2.0f, 9.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.1f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(15.2f)
                lineTo(12.8f, 19.6f)
                curveTo(12.2f, 19.1f, 11.9f, 18.3f, 11.9f, 17.6f)
                verticalLineTo(16.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(14.8f)
                curveTo(12.0f, 13.3f, 13.2f, 12.0f, 14.8f, 12.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(9.0f)
                curveTo(18.0f, 6.8f, 16.2f, 5.0f, 14.0f, 5.0f)
                moveTo(10.0f, 13.0f)
                lineTo(8.0f, 11.0f)
                lineTo(10.0f, 9.0f)
                lineTo(12.0f, 11.0f)
                lineTo(10.0f, 13.0f)
                moveTo(12.0f, 5.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(5.0f)
                moveTo(21.8f, 17.8f)
                lineTo(18.2f, 14.2f)
                curveTo(18.0f, 14.1f, 17.8f, 14.0f, 17.6f, 14.0f)
                horizontalLineTo(14.8f)
                curveTo(14.4f, 14.0f, 14.0f, 14.4f, 14.0f, 14.8f)
                verticalLineTo(17.6f)
                curveTo(14.0f, 17.8f, 14.1f, 18.0f, 14.2f, 18.2f)
                lineTo(17.8f, 21.8f)
                curveTo(17.9f, 21.9f, 18.1f, 22.0f, 18.4f, 22.0f)
                curveTo(18.6f, 22.0f, 18.8f, 21.9f, 19.0f, 21.8f)
                lineTo(21.8f, 19.0f)
                curveTo(21.9f, 18.9f, 22.0f, 18.7f, 22.0f, 18.4f)
                curveTo(22.0f, 18.2f, 21.9f, 18.0f, 21.8f, 17.8f)
                moveTo(15.4f, 16.0f)
                curveTo(15.1f, 16.0f, 14.8f, 15.7f, 14.8f, 15.4f)
                curveTo(14.8f, 15.1f, 15.1f, 14.8f, 15.4f, 14.8f)
                curveTo(15.7f, 14.8f, 16.0f, 15.1f, 16.0f, 15.4f)
                curveTo(16.0f, 15.7f, 15.7f, 16.0f, 15.4f, 16.0f)
                close()
            }
        }
        .build()
        return _bagPersonalTag!!
    }

private var _bagPersonalTag: ImageVector? = null
