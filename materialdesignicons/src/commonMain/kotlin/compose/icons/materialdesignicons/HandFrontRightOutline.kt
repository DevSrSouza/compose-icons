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

public val MaterialDesignIcons.HandFrontRightOutline: ImageVector
    get() {
        if (_handFrontRightOutline != null) {
            return _handFrontRightOutline!!
        }
        _handFrontRightOutline = Builder(name = "HandFrontRightOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.5f, 8.0f)
                curveTo(18.33f, 8.0f, 18.16f, 8.0f, 18.0f, 8.05f)
                verticalLineTo(4.5f)
                curveTo(18.0f, 3.12f, 16.88f, 2.0f, 15.5f, 2.0f)
                curveTo(15.31f, 2.0f, 15.13f, 2.0f, 14.96f, 2.06f)
                curveTo(14.75f, 0.89f, 13.73f, 0.0f, 12.5f, 0.0f)
                curveTo(11.44f, 0.0f, 10.54f, 0.66f, 10.17f, 1.59f)
                curveTo(9.96f, 1.53f, 9.73f, 1.5f, 9.5f, 1.5f)
                curveTo(8.12f, 1.5f, 7.0f, 2.62f, 7.0f, 4.0f)
                verticalLineTo(4.55f)
                curveTo(6.84f, 4.5f, 6.67f, 4.5f, 6.5f, 4.5f)
                curveTo(5.12f, 4.5f, 4.0f, 5.62f, 4.0f, 7.0f)
                verticalLineTo(15.5f)
                curveTo(4.0f, 20.19f, 7.81f, 24.0f, 12.5f, 24.0f)
                reflectiveCurveTo(21.0f, 20.19f, 21.0f, 15.5f)
                verticalLineTo(10.5f)
                curveTo(21.0f, 9.12f, 19.88f, 8.0f, 18.5f, 8.0f)
                moveTo(19.0f, 15.5f)
                curveTo(19.0f, 19.09f, 16.09f, 22.0f, 12.5f, 22.0f)
                reflectiveCurveTo(6.0f, 19.09f, 6.0f, 15.5f)
                verticalLineTo(7.0f)
                curveTo(6.0f, 6.72f, 6.22f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveTo(7.0f, 6.72f, 7.0f, 7.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                curveTo(9.0f, 3.72f, 9.22f, 3.5f, 9.5f, 3.5f)
                reflectiveCurveTo(10.0f, 3.72f, 10.0f, 4.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(2.5f)
                curveTo(12.0f, 2.22f, 12.22f, 2.0f, 12.5f, 2.0f)
                reflectiveCurveTo(13.0f, 2.22f, 13.0f, 2.5f)
                verticalLineTo(11.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(4.5f)
                curveTo(15.0f, 4.22f, 15.22f, 4.0f, 15.5f, 4.0f)
                reflectiveCurveTo(16.0f, 4.22f, 16.0f, 4.5f)
                verticalLineTo(13.42f)
                curveTo(14.23f, 14.19f, 13.0f, 15.95f, 13.0f, 18.0f)
                horizontalLineTo(15.0f)
                curveTo(15.0f, 16.34f, 16.34f, 15.0f, 18.0f, 15.0f)
                verticalLineTo(10.5f)
                curveTo(18.0f, 10.22f, 18.22f, 10.0f, 18.5f, 10.0f)
                reflectiveCurveTo(19.0f, 10.22f, 19.0f, 10.5f)
                verticalLineTo(15.5f)
                close()
            }
        }
        .build()
        return _handFrontRightOutline!!
    }

private var _handFrontRightOutline: ImageVector? = null
