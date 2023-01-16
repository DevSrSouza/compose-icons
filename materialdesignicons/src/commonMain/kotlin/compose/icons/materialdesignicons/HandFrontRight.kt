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

public val MaterialDesignIcons.HandFrontRight: ImageVector
    get() {
        if (_handFrontRight != null) {
            return _handFrontRight!!
        }
        _handFrontRight = Builder(name = "HandFrontRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.75f, 8.0f)
                curveTo(19.06f, 8.0f, 18.5f, 8.56f, 18.5f, 9.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.0f)
                curveTo(16.35f, 15.0f, 15.0f, 16.35f, 15.0f, 18.0f)
                horizontalLineTo(14.0f)
                curveTo(14.0f, 15.96f, 15.53f, 14.28f, 17.5f, 14.03f)
                verticalLineTo(3.25f)
                curveTo(17.5f, 2.56f, 16.94f, 2.0f, 16.25f, 2.0f)
                curveTo(15.56f, 2.0f, 15.0f, 2.56f, 15.0f, 3.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(1.25f)
                curveTo(14.0f, 0.56f, 13.44f, 0.0f, 12.75f, 0.0f)
                reflectiveCurveTo(11.5f, 0.56f, 11.5f, 1.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(2.75f)
                curveTo(10.5f, 2.06f, 9.94f, 1.5f, 9.25f, 1.5f)
                reflectiveCurveTo(8.0f, 2.06f, 8.0f, 2.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(5.75f)
                curveTo(7.0f, 5.06f, 6.44f, 4.5f, 5.75f, 4.5f)
                reflectiveCurveTo(4.5f, 5.06f, 4.5f, 5.75f)
                verticalLineTo(15.75f)
                curveTo(4.5f, 20.31f, 8.19f, 24.0f, 12.75f, 24.0f)
                reflectiveCurveTo(21.0f, 20.31f, 21.0f, 15.75f)
                verticalLineTo(9.25f)
                curveTo(21.0f, 8.56f, 20.44f, 8.0f, 19.75f, 8.0f)
                close()
            }
        }
        .build()
        return _handFrontRight!!
    }

private var _handFrontRight: ImageVector? = null
