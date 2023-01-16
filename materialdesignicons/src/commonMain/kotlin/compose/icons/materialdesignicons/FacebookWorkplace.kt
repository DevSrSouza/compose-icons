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

public val MaterialDesignIcons.FacebookWorkplace: ImageVector
    get() {
        if (_facebookWorkplace != null) {
            return _facebookWorkplace!!
        }
        _facebookWorkplace = Builder(name = "FacebookWorkplace", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.69f, 16.12f)
                curveTo(19.42f, 16.43f, 18.95f, 16.92f, 18.19f, 16.92f)
                curveTo(17.13f, 16.92f, 16.78f, 16.15f, 16.46f, 15.34f)
                lineTo(14.86f, 11.41f)
                lineTo(13.26f, 15.34f)
                curveTo(13.0f, 16.0f, 12.7f, 16.92f, 11.53f, 16.92f)
                curveTo(10.36f, 16.92f, 10.07f, 16.0f, 9.79f, 15.34f)
                lineTo(7.11f, 8.72f)
                horizontalLineTo(9.37f)
                lineTo(11.53f, 14.17f)
                lineTo(13.14f, 10.2f)
                curveTo(13.39f, 9.57f, 13.69f, 8.62f, 14.86f, 8.62f)
                curveTo(16.0f, 8.62f, 16.32f, 9.57f, 16.58f, 10.2f)
                lineTo(18.33f, 14.5f)
                curveTo(19.22f, 13.14f, 19.6f, 11.5f, 19.38f, 9.89f)
                curveTo(19.16f, 8.28f, 18.37f, 6.8f, 17.14f, 5.73f)
                curveTo(15.92f, 4.66f, 14.34f, 4.06f, 12.72f, 4.06f)
                curveTo(11.03f, 4.05f, 9.39f, 4.58f, 8.0f, 5.56f)
                curveTo(6.66f, 6.55f, 5.64f, 7.94f, 5.12f, 9.54f)
                curveTo(4.6f, 11.14f, 4.6f, 12.87f, 5.12f, 14.47f)
                curveTo(5.64f, 16.07f, 6.66f, 17.46f, 8.03f, 18.44f)
                curveTo(9.4f, 19.43f, 11.04f, 19.95f, 12.72f, 19.94f)
                curveTo(13.45f, 19.94f, 14.17f, 19.84f, 14.87f, 19.64f)
                verticalLineTo(21.75f)
                curveTo(14.16f, 21.91f, 13.44f, 22.0f, 12.72f, 22.0f)
                curveTo(10.61f, 22.0f, 8.54f, 21.34f, 6.82f, 20.1f)
                curveTo(5.1f, 18.86f, 3.82f, 17.11f, 3.17f, 15.1f)
                curveTo(2.5f, 13.09f, 2.5f, 10.92f, 3.16f, 8.9f)
                curveTo(3.82f, 6.89f, 5.1f, 5.14f, 6.82f, 3.9f)
                curveTo(8.53f, 2.66f, 10.6f, 2.0f, 12.72f, 2.0f)
                curveTo(17.56f, 2.0f, 21.5f, 5.94f, 21.5f, 10.79f)
                curveTo(21.5f, 12.71f, 20.86f, 14.59f, 19.69f, 16.12f)
                verticalLineTo(16.12f)
                close()
            }
        }
        .build()
        return _facebookWorkplace!!
    }

private var _facebookWorkplace: ImageVector? = null
