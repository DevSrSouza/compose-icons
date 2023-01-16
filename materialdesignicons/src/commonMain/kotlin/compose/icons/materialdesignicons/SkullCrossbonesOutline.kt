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

public val MaterialDesignIcons.SkullCrossbonesOutline: ImageVector
    get() {
        if (_skullCrossbonesOutline != null) {
            return _skullCrossbonesOutline!!
        }
        _skullCrossbonesOutline = Builder(name = "SkullCrossbonesOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                moveTo(9.5f, 6.0f)
                curveTo(8.7f, 6.0f, 8.0f, 6.7f, 8.0f, 7.5f)
                curveTo(8.0f, 8.3f, 8.7f, 9.0f, 9.5f, 9.0f)
                curveTo(10.3f, 9.0f, 11.0f, 8.3f, 11.0f, 7.5f)
                curveTo(11.0f, 6.7f, 10.3f, 6.0f, 9.5f, 6.0f)
                moveTo(14.5f, 6.0f)
                curveTo(13.7f, 6.0f, 13.0f, 6.7f, 13.0f, 7.5f)
                curveTo(13.0f, 8.3f, 13.7f, 9.0f, 14.5f, 9.0f)
                curveTo(15.3f, 9.0f, 16.0f, 8.3f, 16.0f, 7.5f)
                curveTo(16.0f, 6.7f, 15.3f, 6.0f, 14.5f, 6.0f)
                moveTo(13.0f, 11.0f)
                lineTo(12.0f, 9.0f)
                lineTo(11.0f, 11.0f)
                horizontalLineTo(13.0f)
                moveTo(12.0f, 1.0f)
                curveTo(8.1f, 1.0f, 5.0f, 4.1f, 5.0f, 8.0f)
                curveTo(5.0f, 9.9f, 5.8f, 11.6f, 7.0f, 12.9f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(12.9f)
                curveTo(18.2f, 11.6f, 19.0f, 9.9f, 19.0f, 8.0f)
                curveTo(19.0f, 4.1f, 15.9f, 1.0f, 12.0f, 1.0f)
                moveTo(15.0f, 12.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                curveTo(7.8f, 11.1f, 7.0f, 9.7f, 7.0f, 8.0f)
                curveTo(7.0f, 5.2f, 9.2f, 3.0f, 12.0f, 3.0f)
                curveTo(14.8f, 3.0f, 17.0f, 5.2f, 17.0f, 8.0f)
                curveTo(17.0f, 9.6f, 16.2f, 11.1f, 15.0f, 12.0f)
                close()
            }
        }
        .build()
        return _skullCrossbonesOutline!!
    }

private var _skullCrossbonesOutline: ImageVector? = null
