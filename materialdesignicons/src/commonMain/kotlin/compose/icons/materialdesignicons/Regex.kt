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

public val MaterialDesignIcons.Regex: ImageVector
    get() {
        if (_regex != null) {
            return _regex!!
        }
        _regex = Builder(name = "Regex", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 16.92f)
                curveTo(15.67f, 16.97f, 15.34f, 17.0f, 15.0f, 17.0f)
                curveTo(14.66f, 17.0f, 14.33f, 16.97f, 14.0f, 16.92f)
                verticalLineTo(13.41f)
                lineTo(11.5f, 15.89f)
                curveTo(11.0f, 15.5f, 10.5f, 15.0f, 10.11f, 14.5f)
                lineTo(12.59f, 12.0f)
                horizontalLineTo(9.08f)
                curveTo(9.03f, 11.67f, 9.0f, 11.34f, 9.0f, 11.0f)
                curveTo(9.0f, 10.66f, 9.03f, 10.33f, 9.08f, 10.0f)
                horizontalLineTo(12.59f)
                lineTo(10.11f, 7.5f)
                curveTo(10.3f, 7.25f, 10.5f, 7.0f, 10.76f, 6.76f)
                verticalLineTo(6.76f)
                curveTo(11.0f, 6.5f, 11.25f, 6.3f, 11.5f, 6.11f)
                lineTo(14.0f, 8.59f)
                verticalLineTo(5.08f)
                curveTo(14.33f, 5.03f, 14.66f, 5.0f, 15.0f, 5.0f)
                curveTo(15.34f, 5.0f, 15.67f, 5.03f, 16.0f, 5.08f)
                verticalLineTo(8.59f)
                lineTo(18.5f, 6.11f)
                curveTo(19.0f, 6.5f, 19.5f, 7.0f, 19.89f, 7.5f)
                lineTo(17.41f, 10.0f)
                horizontalLineTo(20.92f)
                curveTo(20.97f, 10.33f, 21.0f, 10.66f, 21.0f, 11.0f)
                curveTo(21.0f, 11.34f, 20.97f, 11.67f, 20.92f, 12.0f)
                horizontalLineTo(17.41f)
                lineTo(19.89f, 14.5f)
                curveTo(19.7f, 14.75f, 19.5f, 15.0f, 19.24f, 15.24f)
                verticalLineTo(15.24f)
                curveTo(19.0f, 15.5f, 18.75f, 15.7f, 18.5f, 15.89f)
                lineTo(16.0f, 13.41f)
                verticalLineTo(16.92f)
                horizontalLineTo(16.0f)
                verticalLineTo(16.92f)
                moveTo(5.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 9.0f, 19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 7.0f, 21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 19.0f)
                horizontalLineTo(5.0f)
                close()
            }
        }
        .build()
        return _regex!!
    }

private var _regex: ImageVector? = null
