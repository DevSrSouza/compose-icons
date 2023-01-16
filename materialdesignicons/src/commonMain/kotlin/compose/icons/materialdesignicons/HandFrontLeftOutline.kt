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

public val MaterialDesignIcons.HandFrontLeftOutline: ImageVector
    get() {
        if (_handFrontLeftOutline != null) {
            return _handFrontLeftOutline!!
        }
        _handFrontLeftOutline = Builder(name = "HandFrontLeftOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 10.5f)
                verticalLineTo(15.5f)
                curveTo(3.0f, 20.19f, 6.81f, 24.0f, 11.5f, 24.0f)
                reflectiveCurveTo(20.0f, 20.19f, 20.0f, 15.5f)
                verticalLineTo(7.0f)
                curveTo(20.0f, 5.62f, 18.88f, 4.5f, 17.5f, 4.5f)
                curveTo(17.33f, 4.5f, 17.16f, 4.5f, 17.0f, 4.55f)
                verticalLineTo(4.0f)
                curveTo(17.0f, 2.62f, 15.88f, 1.5f, 14.5f, 1.5f)
                curveTo(14.27f, 1.5f, 14.04f, 1.53f, 13.83f, 1.59f)
                curveTo(13.46f, 0.66f, 12.56f, 0.0f, 11.5f, 0.0f)
                curveTo(10.27f, 0.0f, 9.25f, 0.89f, 9.04f, 2.06f)
                curveTo(8.87f, 2.0f, 8.69f, 2.0f, 8.5f, 2.0f)
                curveTo(7.12f, 2.0f, 6.0f, 3.12f, 6.0f, 4.5f)
                verticalLineTo(8.05f)
                curveTo(5.84f, 8.0f, 5.67f, 8.0f, 5.5f, 8.0f)
                curveTo(4.12f, 8.0f, 3.0f, 9.12f, 3.0f, 10.5f)
                moveTo(5.0f, 10.5f)
                curveTo(5.0f, 10.22f, 5.22f, 10.0f, 5.5f, 10.0f)
                reflectiveCurveTo(6.0f, 10.22f, 6.0f, 10.5f)
                verticalLineTo(15.0f)
                curveTo(7.66f, 15.0f, 9.0f, 16.34f, 9.0f, 18.0f)
                horizontalLineTo(11.0f)
                curveTo(11.0f, 15.95f, 9.77f, 14.19f, 8.0f, 13.42f)
                verticalLineTo(4.5f)
                curveTo(8.0f, 4.22f, 8.22f, 4.0f, 8.5f, 4.0f)
                reflectiveCurveTo(9.0f, 4.22f, 9.0f, 4.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.5f)
                curveTo(11.0f, 2.22f, 11.22f, 2.0f, 11.5f, 2.0f)
                reflectiveCurveTo(12.0f, 2.22f, 12.0f, 2.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(4.0f)
                curveTo(14.0f, 3.72f, 14.22f, 3.5f, 14.5f, 3.5f)
                reflectiveCurveTo(15.0f, 3.72f, 15.0f, 4.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(7.0f)
                curveTo(17.0f, 6.72f, 17.22f, 6.5f, 17.5f, 6.5f)
                reflectiveCurveTo(18.0f, 6.72f, 18.0f, 7.0f)
                verticalLineTo(15.5f)
                curveTo(18.0f, 19.09f, 15.09f, 22.0f, 11.5f, 22.0f)
                reflectiveCurveTo(5.0f, 19.09f, 5.0f, 15.5f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _handFrontLeftOutline!!
    }

private var _handFrontLeftOutline: ImageVector? = null
