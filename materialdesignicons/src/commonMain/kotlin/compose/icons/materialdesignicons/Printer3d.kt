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

public val MaterialDesignIcons.Printer3d: ImageVector
    get() {
        if (_printer3d != null) {
            return _printer3d!!
        }
        _printer3d = Builder(name = "Printer3d", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 20.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 4.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.0f, 5.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 19.0f, 6.0f)
                moveTo(19.0f, 2.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 22.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(5.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 5.0f, 2.0f)
                horizontalLineTo(19.0f)
                moveTo(18.0f, 18.25f)
                curveTo(18.0f, 18.63f, 17.79f, 18.96f, 17.47f, 19.13f)
                lineTo(12.57f, 21.82f)
                curveTo(12.4f, 21.94f, 12.21f, 22.0f, 12.0f, 22.0f)
                curveTo(11.79f, 22.0f, 11.59f, 21.94f, 11.43f, 21.82f)
                lineTo(6.53f, 19.13f)
                curveTo(6.21f, 18.96f, 6.0f, 18.63f, 6.0f, 18.25f)
                verticalLineTo(13.0f)
                curveTo(6.0f, 12.62f, 6.21f, 12.29f, 6.53f, 12.12f)
                lineTo(11.43f, 9.68f)
                curveTo(11.59f, 9.56f, 11.79f, 9.5f, 12.0f, 9.5f)
                curveTo(12.21f, 9.5f, 12.4f, 9.56f, 12.57f, 9.68f)
                lineTo(17.47f, 12.12f)
                curveTo(17.79f, 12.29f, 18.0f, 12.62f, 18.0f, 13.0f)
                verticalLineTo(18.25f)
                moveTo(12.0f, 11.65f)
                lineTo(9.04f, 13.0f)
                lineTo(12.0f, 14.6f)
                lineTo(14.96f, 13.0f)
                lineTo(12.0f, 11.65f)
                moveTo(8.0f, 17.66f)
                lineTo(11.0f, 19.29f)
                verticalLineTo(16.33f)
                lineTo(8.0f, 14.71f)
                verticalLineTo(17.66f)
                moveTo(16.0f, 17.66f)
                verticalLineTo(14.71f)
                lineTo(13.0f, 16.33f)
                verticalLineTo(19.29f)
                lineTo(16.0f, 17.66f)
                close()
            }
        }
        .build()
        return _printer3d!!
    }

private var _printer3d: ImageVector? = null
