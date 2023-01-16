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

public val MaterialDesignIcons.Biathlon: ImageVector
    get() {
        if (_biathlon != null) {
            return _biathlon!!
        }
        _biathlon = Builder(name = "Biathlon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.88f, 3.64f)
                curveTo(13.65f, 3.64f, 14.28f, 4.27f, 14.28f, 5.04f)
                curveTo(14.28f, 5.81f, 13.65f, 6.44f, 12.88f, 6.44f)
                curveTo(12.11f, 6.44f, 11.5f, 5.81f, 11.5f, 5.04f)
                curveTo(11.5f, 4.27f, 12.11f, 3.64f, 12.88f, 3.64f)
                moveTo(15.0f, 13.0f)
                horizontalLineTo(16.5f)
                verticalLineTo(19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                moveTo(15.0f, 8.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.5f)
                moveTo(10.04f, 2.6f)
                lineTo(8.0f, 2.04f)
                lineTo(6.06f, 8.58f)
                lineTo(3.9f, 11.42f)
                lineTo(7.17f, 12.37f)
                lineTo(10.04f, 2.6f)
                moveTo(19.67f, 18.55f)
                curveTo(19.31f, 18.93f, 18.88f, 19.5f, 18.4f, 19.7f)
                curveTo(17.91f, 19.92f, 17.54f, 20.0f, 17.0f, 20.0f)
                horizontalLineTo(13.5f)
                lineTo(13.43f, 17.0f)
                curveTo(13.42f, 16.83f, 13.37f, 16.67f, 13.28f, 16.5f)
                lineTo(10.88f, 12.24f)
                lineTo(11.76f, 9.5f)
                curveTo(12.34f, 10.55f, 13.0f, 11.73f, 13.06f, 11.83f)
                curveTo(13.21f, 12.0f, 13.45f, 12.13f, 13.69f, 12.13f)
                horizontalLineTo(15.9f)
                arcTo(0.81f, 0.81f, 0.0f, false, false, 16.71f, 11.32f)
                curveTo(16.71f, 10.9f, 16.38f, 10.56f, 15.96f, 10.53f)
                lineTo(14.29f, 10.4f)
                lineTo(12.4f, 7.0f)
                curveTo(12.4f, 7.0f, 12.0f, 6.42f, 11.14f, 6.42f)
                curveTo(10.27f, 6.42f, 10.0f, 6.84f, 9.83f, 7.42f)
                lineTo(6.0f, 20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(17.0f)
                curveTo(18.37f, 22.0f, 19.53f, 21.34f, 20.5f, 20.37f)
                lineTo(19.67f, 18.55f)
                moveTo(9.75f, 14.39f)
                lineTo(11.62f, 17.39f)
                lineTo(11.75f, 20.0f)
                horizontalLineTo(7.75f)
                lineTo(9.75f, 14.39f)
                close()
            }
        }
        .build()
        return _biathlon!!
    }

private var _biathlon: ImageVector? = null
