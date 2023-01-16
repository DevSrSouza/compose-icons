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

public val MaterialDesignIcons.HandBackLeft: ImageVector
    get() {
        if (_handBackLeft != null) {
            return _handBackLeft!!
        }
        _handBackLeft = Builder(name = "HandBackLeft", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 16.0f)
                verticalLineTo(5.75f)
                curveTo(3.0f, 5.06f, 3.56f, 4.5f, 4.25f, 4.5f)
                reflectiveCurveTo(5.5f, 5.06f, 5.5f, 5.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.5f)
                verticalLineTo(2.75f)
                curveTo(6.5f, 2.06f, 7.06f, 1.5f, 7.75f, 1.5f)
                curveTo(8.44f, 1.5f, 9.0f, 2.06f, 9.0f, 2.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(1.25f)
                curveTo(10.0f, 0.56f, 10.56f, 0.0f, 11.25f, 0.0f)
                reflectiveCurveTo(12.5f, 0.56f, 12.5f, 1.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(3.25f)
                curveTo(13.5f, 2.56f, 14.06f, 2.0f, 14.75f, 2.0f)
                reflectiveCurveTo(16.0f, 2.56f, 16.0f, 3.25f)
                verticalLineTo(15.0f)
                horizontalLineTo(16.75f)
                lineTo(18.16f, 11.47f)
                curveTo(18.38f, 10.92f, 18.84f, 10.5f, 19.4f, 10.31f)
                lineTo(20.19f, 10.05f)
                curveTo(21.0f, 9.79f, 21.74f, 10.58f, 21.43f, 11.37f)
                lineTo(18.4f, 19.0f)
                curveTo(17.19f, 22.0f, 14.26f, 24.0f, 11.0f, 24.0f)
                curveTo(6.58f, 24.0f, 3.0f, 20.42f, 3.0f, 16.0f)
                close()
            }
        }
        .build()
        return _handBackLeft!!
    }

private var _handBackLeft: ImageVector? = null
