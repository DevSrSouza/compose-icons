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

public val MaterialDesignIcons.SkullCrossbones: ImageVector
    get() {
        if (_skullCrossbones != null) {
            return _skullCrossbones!!
        }
        _skullCrossbones = Builder(name = "SkullCrossbones", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.8f, 18.5f)
                lineTo(21.8f, 20.1f)
                lineTo(21.4f, 22.0f)
                lineTo(12.0f, 19.5f)
                lineTo(2.6f, 22.0f)
                lineTo(2.1f, 20.1f)
                lineTo(8.1f, 18.5f)
                lineTo(2.0f, 16.9f)
                lineTo(2.5f, 15.0f)
                lineTo(11.9f, 17.5f)
                lineTo(21.3f, 15.0f)
                lineTo(21.8f, 16.9f)
                lineTo(15.8f, 18.5f)
                moveTo(18.0f, 8.0f)
                curveTo(18.0f, 9.8f, 17.2f, 11.3f, 16.0f, 12.4f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(13.7f)
                lineTo(14.0f, 13.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(13.7f)
                lineTo(10.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.4f)
                curveTo(6.8f, 11.3f, 6.0f, 9.8f, 6.0f, 8.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 12.0f, 2.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 18.0f, 8.0f)
                moveTo(11.0f, 7.5f)
                curveTo(11.0f, 6.7f, 10.3f, 6.0f, 9.5f, 6.0f)
                curveTo(8.7f, 6.0f, 8.0f, 6.7f, 8.0f, 7.5f)
                curveTo(8.0f, 8.3f, 8.7f, 9.0f, 9.5f, 9.0f)
                curveTo(10.3f, 9.0f, 11.0f, 8.3f, 11.0f, 7.5f)
                moveTo(13.0f, 11.0f)
                lineTo(12.0f, 9.0f)
                lineTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                moveTo(16.0f, 7.5f)
                curveTo(16.0f, 6.7f, 15.3f, 6.0f, 14.5f, 6.0f)
                curveTo(13.7f, 6.0f, 13.0f, 6.7f, 13.0f, 7.5f)
                curveTo(13.0f, 8.3f, 13.7f, 9.0f, 14.5f, 9.0f)
                curveTo(15.3f, 9.0f, 16.0f, 8.3f, 16.0f, 7.5f)
                close()
            }
        }
        .build()
        return _skullCrossbones!!
    }

private var _skullCrossbones: ImageVector? = null
