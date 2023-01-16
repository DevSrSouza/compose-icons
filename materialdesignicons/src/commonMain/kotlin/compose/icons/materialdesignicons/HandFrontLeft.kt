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

public val MaterialDesignIcons.HandFrontLeft: ImageVector
    get() {
        if (_handFrontLeft != null) {
            return _handFrontLeft!!
        }
        _handFrontLeft = Builder(name = "HandFrontLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 9.25f)
                verticalLineTo(15.75f)
                curveTo(3.0f, 20.31f, 6.69f, 24.0f, 11.25f, 24.0f)
                reflectiveCurveTo(19.5f, 20.31f, 19.5f, 15.75f)
                verticalLineTo(5.75f)
                curveTo(19.5f, 5.06f, 18.94f, 4.5f, 18.25f, 4.5f)
                reflectiveCurveTo(17.0f, 5.06f, 17.0f, 5.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(2.75f)
                curveTo(16.0f, 2.06f, 15.44f, 1.5f, 14.75f, 1.5f)
                reflectiveCurveTo(13.5f, 2.06f, 13.5f, 2.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(1.25f)
                curveTo(12.5f, 0.56f, 11.94f, 0.0f, 11.25f, 0.0f)
                reflectiveCurveTo(10.0f, 0.56f, 10.0f, 1.25f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.25f)
                curveTo(9.0f, 2.56f, 8.44f, 2.0f, 7.75f, 2.0f)
                curveTo(7.06f, 2.0f, 6.5f, 2.56f, 6.5f, 3.25f)
                verticalLineTo(14.03f)
                curveTo(8.47f, 14.28f, 10.0f, 15.96f, 10.0f, 18.0f)
                horizontalLineTo(9.0f)
                curveTo(9.0f, 16.35f, 7.65f, 15.0f, 6.0f, 15.0f)
                horizontalLineTo(5.5f)
                verticalLineTo(9.25f)
                curveTo(5.5f, 8.56f, 4.94f, 8.0f, 4.25f, 8.0f)
                reflectiveCurveTo(3.0f, 8.56f, 3.0f, 9.25f)
                close()
            }
        }
        .build()
        return _handFrontLeft!!
    }

private var _handFrontLeft: ImageVector? = null
