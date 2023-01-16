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

public val MaterialDesignIcons.HandWashOutline: ImageVector
    get() {
        if (_handWashOutline != null) {
            return _handWashOutline!!
        }
        _handWashOutline = Builder(name = "HandWashOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 5.0f)
                lineTo(17.62f, 6.37f)
                lineTo(19.0f, 7.0f)
                lineTo(17.62f, 7.63f)
                lineTo(17.0f, 9.0f)
                lineTo(16.36f, 7.63f)
                lineTo(15.0f, 7.0f)
                lineTo(16.36f, 6.37f)
                lineTo(17.0f, 5.0f)
                moveTo(20.0f, 14.0f)
                curveTo(21.1f, 14.0f, 22.0f, 13.1f, 22.0f, 12.0f)
                reflectiveCurveTo(20.0f, 8.0f, 20.0f, 8.0f)
                reflectiveCurveTo(18.0f, 10.9f, 18.0f, 12.0f)
                reflectiveCurveTo(18.9f, 14.0f, 20.0f, 14.0f)
                moveTo(11.0f, 6.1f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.0f)
                curveTo(13.57f, 4.0f, 14.1f, 4.17f, 14.55f, 4.45f)
                lineTo(16.0f, 3.0f)
                curveTo(15.15f, 2.39f, 14.13f, 2.0f, 13.0f, 2.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(4.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(6.11f)
                curveTo(7.22f, 6.5f, 5.8f, 7.79f, 5.25f, 9.5f)
                horizontalLineTo(7.41f)
                curveTo(7.94f, 8.61f, 8.89f, 8.0f, 10.0f, 8.0f)
                curveTo(11.62f, 8.0f, 12.94f, 9.29f, 13.0f, 10.9f)
                lineTo(15.0f, 11.65f)
                verticalLineTo(11.0f)
                curveTo(15.0f, 8.58f, 13.28f, 6.56f, 11.0f, 6.1f)
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
        return _handWashOutline!!
    }

private var _handWashOutline: ImageVector? = null
