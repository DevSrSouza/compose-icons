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

public val MaterialDesignIcons.HandHeartOutline: ImageVector
    get() {
        if (_handHeartOutline != null) {
            return _handHeartOutline!!
        }
        _handHeartOutline = Builder(name = "HandHeartOutline", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 3.23f)
                curveTo(16.71f, 2.41f, 17.61f, 2.0f, 18.7f, 2.0f)
                curveTo(19.61f, 2.0f, 20.37f, 2.33f, 21.0f, 3.0f)
                curveTo(21.63f, 3.67f, 21.96f, 4.43f, 22.0f, 5.3f)
                curveTo(22.0f, 6.0f, 21.67f, 6.81f, 21.0f, 7.76f)
                reflectiveCurveTo(19.68f, 9.5f, 19.03f, 10.15f)
                curveTo(18.38f, 10.79f, 17.37f, 11.74f, 16.0f, 13.0f)
                curveTo(14.61f, 11.74f, 13.59f, 10.79f, 12.94f, 10.15f)
                reflectiveCurveTo(11.63f, 8.71f, 10.97f, 7.76f)
                curveTo(10.31f, 6.81f, 10.0f, 6.0f, 10.0f, 5.3f)
                curveTo(10.0f, 4.39f, 10.32f, 3.63f, 10.97f, 3.0f)
                curveTo(11.62f, 2.37f, 12.4f, 2.04f, 13.31f, 2.0f)
                curveTo(14.38f, 2.0f, 15.27f, 2.41f, 16.0f, 3.23f)
                moveTo(22.0f, 19.0f)
                verticalLineTo(20.0f)
                lineTo(14.0f, 22.5f)
                lineTo(7.0f, 20.56f)
                verticalLineTo(22.0f)
                horizontalLineTo(1.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(8.97f)
                lineTo(15.13f, 13.3f)
                curveTo(16.25f, 13.72f, 17.0f, 14.8f, 17.0f, 16.0f)
                horizontalLineTo(19.0f)
                curveTo(20.66f, 16.0f, 22.0f, 17.34f, 22.0f, 19.0f)
                moveTo(5.0f, 20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(5.0f)
                moveTo(19.9f, 18.57f)
                curveTo(19.74f, 18.24f, 19.39f, 18.0f, 19.0f, 18.0f)
                horizontalLineTo(13.65f)
                curveTo(13.11f, 18.0f, 12.58f, 17.92f, 12.07f, 17.75f)
                lineTo(9.69f, 16.96f)
                lineTo(10.32f, 15.06f)
                lineTo(12.7f, 15.85f)
                curveTo(13.0f, 15.95f, 15.0f, 16.0f, 15.0f, 16.0f)
                curveTo(15.0f, 15.63f, 14.77f, 15.3f, 14.43f, 15.17f)
                lineTo(8.61f, 13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(18.5f)
                lineTo(13.97f, 20.41f)
                lineTo(19.9f, 18.57f)
                close()
            }
        }
        .build()
        return _handHeartOutline!!
    }

private var _handHeartOutline: ImageVector? = null
