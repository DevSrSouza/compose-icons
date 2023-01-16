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

public val MaterialDesignIcons.Radiator: ImageVector
    get() {
        if (_radiator != null) {
            return _radiator!!
        }
        _radiator = Builder(name = "Radiator", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.95f, 3.0f)
                lineTo(6.53f, 5.19f)
                lineTo(7.95f, 7.4f)
                horizontalLineTo(7.94f)
                lineTo(5.95f, 10.5f)
                lineTo(4.22f, 9.6f)
                lineTo(5.64f, 7.39f)
                lineTo(4.22f, 5.19f)
                lineTo(6.22f, 2.09f)
                lineTo(7.95f, 3.0f)
                moveTo(13.95f, 2.89f)
                lineTo(12.53f, 5.1f)
                lineTo(13.95f, 7.3f)
                lineTo(13.94f, 7.31f)
                lineTo(11.95f, 10.4f)
                lineTo(10.22f, 9.5f)
                lineTo(11.64f, 7.3f)
                lineTo(10.22f, 5.1f)
                lineTo(12.22f, 2.0f)
                lineTo(13.95f, 2.89f)
                moveTo(20.0f, 2.89f)
                lineTo(18.56f, 5.1f)
                lineTo(20.0f, 7.3f)
                verticalLineTo(7.31f)
                lineTo(18.0f, 10.4f)
                lineTo(16.25f, 9.5f)
                lineTo(17.67f, 7.3f)
                lineTo(16.25f, 5.1f)
                lineTo(18.25f, 2.0f)
                lineTo(20.0f, 2.89f)
                moveTo(2.0f, 22.0f)
                verticalLineTo(14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 4.0f, 12.0f)
                horizontalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 22.0f, 14.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(2.0f)
                moveTo(6.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 5.0f, 15.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 7.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 6.0f, 14.0f)
                moveTo(10.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 9.0f, 15.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 11.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 10.0f, 14.0f)
                moveTo(14.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.0f, 15.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 14.0f)
                moveTo(18.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.0f, 15.0f)
                verticalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 18.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 17.0f)
                verticalLineTo(15.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 14.0f)
                close()
            }
        }
        .build()
        return _radiator!!
    }

private var _radiator: ImageVector? = null
