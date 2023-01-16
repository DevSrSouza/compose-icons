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

public val MaterialDesignIcons.EarthBoxPlus: ImageVector
    get() {
        if (_earthBoxPlus != null) {
            return _earthBoxPlus!!
        }
        _earthBoxPlus = Builder(name = "EarthBoxPlus", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 14.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(14.0f)
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 3.0f, 21.0f, 3.89f, 21.0f, 5.0f)
                verticalLineTo(12.8f)
                curveTo(20.39f, 12.45f, 19.72f, 12.2f, 19.0f, 12.08f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.78f)
                curveTo(15.67f, 6.0f, 14.83f, 6.79f, 13.8f, 6.79f)
                horizontalLineTo(11.8f)
                verticalLineTo(8.79f)
                curveTo(11.8f, 9.35f, 11.35f, 9.79f, 10.8f, 9.79f)
                horizontalLineTo(8.8f)
                verticalLineTo(11.79f)
                horizontalLineTo(14.8f)
                curveTo(15.23f, 11.79f, 15.6f, 12.06f, 15.74f, 12.44f)
                curveTo(13.6f, 13.31f, 12.07f, 15.39f, 12.0f, 17.83f)
                curveTo(10.7f, 17.79f, 9.8f, 16.9f, 9.8f, 15.79f)
                verticalLineTo(14.79f)
                lineTo(5.0f, 10.29f)
                verticalLineTo(19.0f)
                horizontalLineTo(12.08f)
                curveTo(12.2f, 19.72f, 12.45f, 20.39f, 12.8f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.89f, 3.0f, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _earthBoxPlus!!
    }

private var _earthBoxPlus: ImageVector? = null
