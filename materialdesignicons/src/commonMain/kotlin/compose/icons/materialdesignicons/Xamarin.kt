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

public val MaterialDesignIcons.Xamarin: ImageVector
    get() {
        if (_xamarin != null) {
            return _xamarin!!
        }
        _xamarin = Builder(name = "Xamarin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(22.75f, 11.07f)
                curveTo(22.91f, 11.35f, 23.0f, 11.67f, 23.0f, 12.0f)
                curveTo(23.0f, 12.33f, 22.91f, 12.65f, 22.75f, 12.93f)
                lineTo(18.08f, 21.0f)
                curveTo(17.72f, 21.62f, 17.06f, 22.0f, 16.35f, 22.0f)
                horizontalLineTo(7.65f)
                curveTo(6.94f, 22.0f, 6.28f, 21.62f, 5.92f, 21.0f)
                lineTo(1.25f, 12.93f)
                curveTo(1.09f, 12.65f, 1.0f, 12.33f, 1.0f, 12.0f)
                curveTo(1.0f, 11.67f, 1.09f, 11.35f, 1.25f, 11.07f)
                lineTo(5.92f, 3.0f)
                curveTo(6.28f, 2.38f, 6.94f, 2.0f, 7.65f, 2.0f)
                horizontalLineTo(16.35f)
                curveTo(17.06f, 2.0f, 17.72f, 2.38f, 18.08f, 3.0f)
                lineTo(22.75f, 11.07f)
                moveTo(12.0f, 12.0f)
                verticalLineTo(11.9f)
                lineTo(9.42f, 7.1f)
                lineTo(9.25f, 7.0f)
                horizontalLineTo(7.66f)
                lineTo(7.5f, 7.1f)
                verticalLineTo(7.3f)
                lineTo(10.0f, 12.0f)
                lineTo(7.5f, 16.7f)
                verticalLineTo(16.9f)
                lineTo(7.66f, 17.0f)
                horizontalLineTo(9.25f)
                lineTo(9.42f, 16.9f)
                lineTo(12.0f, 12.1f)
                verticalLineTo(12.0f)
                lineTo(12.03f, 12.1f)
                lineTo(14.58f, 16.9f)
                lineTo(14.75f, 17.0f)
                horizontalLineTo(16.34f)
                lineTo(16.5f, 16.9f)
                verticalLineTo(16.7f)
                lineTo(14.0f, 12.0f)
                lineTo(16.5f, 7.3f)
                verticalLineTo(7.1f)
                lineTo(16.34f, 7.0f)
                horizontalLineTo(14.75f)
                lineTo(14.58f, 7.1f)
                lineTo(12.03f, 11.9f)
                lineTo(12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _xamarin!!
    }

private var _xamarin: ImageVector? = null
