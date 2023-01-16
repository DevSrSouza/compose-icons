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

public val MaterialDesignIcons.HandBackRight: ImageVector
    get() {
        if (_handBackRight != null) {
            return _handBackRight!!
        }
        _handBackRight = Builder(name = "HandBackRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 24.0f)
                curveTo(9.74f, 24.0f, 6.81f, 22.0f, 5.6f, 19.0f)
                lineTo(2.57f, 11.37f)
                curveTo(2.26f, 10.58f, 3.0f, 9.79f, 3.81f, 10.05f)
                lineTo(4.6f, 10.31f)
                curveTo(5.16f, 10.5f, 5.62f, 10.92f, 5.84f, 11.47f)
                lineTo(7.25f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(3.25f)
                curveTo(8.0f, 2.56f, 8.56f, 2.0f, 9.25f, 2.0f)
                reflectiveCurveTo(10.5f, 2.56f, 10.5f, 3.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(11.5f)
                verticalLineTo(1.25f)
                curveTo(11.5f, 0.56f, 12.06f, 0.0f, 12.75f, 0.0f)
                reflectiveCurveTo(14.0f, 0.56f, 14.0f, 1.25f)
                verticalLineTo(12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(2.75f)
                curveTo(15.0f, 2.06f, 15.56f, 1.5f, 16.25f, 1.5f)
                curveTo(16.94f, 1.5f, 17.5f, 2.06f, 17.5f, 2.75f)
                verticalLineTo(12.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(5.75f)
                curveTo(18.5f, 5.06f, 19.06f, 4.5f, 19.75f, 4.5f)
                reflectiveCurveTo(21.0f, 5.06f, 21.0f, 5.75f)
                verticalLineTo(16.0f)
                curveTo(21.0f, 20.42f, 17.42f, 24.0f, 13.0f, 24.0f)
                close()
            }
        }
        .build()
        return _handBackRight!!
    }

private var _handBackRight: ImageVector? = null
