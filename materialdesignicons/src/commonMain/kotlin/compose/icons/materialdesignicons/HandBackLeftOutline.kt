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

public val MaterialDesignIcons.HandBackLeftOutline: ImageVector
    get() {
        if (_handBackLeftOutline != null) {
            return _handBackLeftOutline!!
        }
        _handBackLeftOutline = Builder(name = "HandBackLeftOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                curveTo(3.0f, 20.42f, 6.58f, 24.0f, 11.0f, 24.0f)
                curveTo(14.43f, 24.0f, 17.5f, 21.91f, 18.77f, 18.73f)
                lineTo(21.33f, 12.3f)
                curveTo(21.58f, 11.66f, 21.56f, 10.92f, 21.18f, 10.35f)
                curveTo(20.69f, 9.61f, 19.82f, 9.29f, 19.0f, 9.5f)
                lineTo(18.22f, 9.73f)
                curveTo(17.76f, 9.85f, 17.34f, 10.08f, 17.0f, 10.39f)
                verticalLineTo(4.5f)
                curveTo(17.0f, 3.12f, 15.88f, 2.0f, 14.5f, 2.0f)
                curveTo(14.31f, 2.0f, 14.13f, 2.0f, 13.96f, 2.06f)
                curveTo(13.75f, 0.89f, 12.73f, 0.0f, 11.5f, 0.0f)
                curveTo(10.44f, 0.0f, 9.54f, 0.66f, 9.17f, 1.59f)
                curveTo(8.96f, 1.53f, 8.73f, 1.5f, 8.5f, 1.5f)
                curveTo(7.12f, 1.5f, 6.0f, 2.62f, 6.0f, 4.0f)
                verticalLineTo(4.55f)
                curveTo(5.84f, 4.5f, 5.67f, 4.5f, 5.5f, 4.5f)
                curveTo(4.12f, 4.5f, 3.0f, 5.62f, 3.0f, 7.0f)
                verticalLineTo(16.0f)
                moveTo(5.0f, 7.0f)
                curveTo(5.0f, 6.72f, 5.22f, 6.5f, 5.5f, 6.5f)
                reflectiveCurveTo(6.0f, 6.72f, 6.0f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(4.0f)
                curveTo(8.0f, 3.72f, 8.22f, 3.5f, 8.5f, 3.5f)
                reflectiveCurveTo(9.0f, 3.72f, 9.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.5f)
                curveTo(11.0f, 2.22f, 11.22f, 2.0f, 11.5f, 2.0f)
                reflectiveCurveTo(12.0f, 2.22f, 12.0f, 2.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.5f)
                curveTo(14.0f, 4.22f, 14.22f, 4.0f, 14.5f, 4.0f)
                reflectiveCurveTo(15.0f, 4.22f, 15.0f, 4.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.0f)
                lineTo(18.0f, 12.5f)
                curveTo(18.15f, 12.05f, 18.5f, 11.71f, 19.0f, 11.59f)
                lineTo(19.5f, 11.45f)
                lineTo(16.91f, 18.0f)
                curveTo(15.95f, 20.41f, 13.61f, 22.0f, 11.0f, 22.0f)
                curveTo(7.69f, 22.0f, 5.0f, 19.31f, 5.0f, 16.0f)
                verticalLineTo(7.0f)
                close()
            }
        }
        .build()
        return _handBackLeftOutline!!
    }

private var _handBackLeftOutline: ImageVector? = null
