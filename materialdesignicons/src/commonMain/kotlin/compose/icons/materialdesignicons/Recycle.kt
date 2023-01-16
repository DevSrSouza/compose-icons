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

public val MaterialDesignIcons.Recycle: ImageVector
    get() {
        if (_recycle != null) {
            return _recycle!!
        }
        _recycle = Builder(name = "Recycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.82f, 15.42f)
                lineTo(19.32f, 19.75f)
                curveTo(18.83f, 20.61f, 17.92f, 21.06f, 17.0f, 21.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(23.0f)
                lineTo(12.5f, 18.5f)
                lineTo(15.0f, 14.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(17.82f)
                lineTo(15.6f, 12.15f)
                lineTo(19.93f, 9.65f)
                lineTo(21.73f, 12.77f)
                curveTo(22.25f, 13.54f, 22.32f, 14.57f, 21.82f, 15.42f)
                moveTo(9.21f, 3.06f)
                horizontalLineTo(14.21f)
                curveTo(15.19f, 3.06f, 16.04f, 3.63f, 16.45f, 4.45f)
                lineTo(17.45f, 6.19f)
                lineTo(19.18f, 5.19f)
                lineTo(16.54f, 9.6f)
                lineTo(11.39f, 9.69f)
                lineTo(13.12f, 8.69f)
                lineTo(11.71f, 6.24f)
                lineTo(9.5f, 10.09f)
                lineTo(5.16f, 7.59f)
                lineTo(6.96f, 4.47f)
                curveTo(7.37f, 3.64f, 8.22f, 3.06f, 9.21f, 3.06f)
                moveTo(5.05f, 19.76f)
                lineTo(2.55f, 15.43f)
                curveTo(2.06f, 14.58f, 2.13f, 13.56f, 2.64f, 12.79f)
                lineTo(3.64f, 11.06f)
                lineTo(1.91f, 10.06f)
                lineTo(7.05f, 10.14f)
                lineTo(9.7f, 14.56f)
                lineTo(7.97f, 13.56f)
                lineTo(6.56f, 16.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(7.4f)
                curveTo(6.47f, 21.07f, 5.55f, 20.61f, 5.05f, 19.76f)
                close()
            }
        }
        .build()
        return _recycle!!
    }

private var _recycle: ImageVector? = null
