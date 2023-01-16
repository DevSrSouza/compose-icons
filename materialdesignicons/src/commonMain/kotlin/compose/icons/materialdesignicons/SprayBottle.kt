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

public val MaterialDesignIcons.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) {
            return _sprayBottle!!
        }
        _sprayBottle = Builder(name = "SprayBottle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.72f, 10.43f)
                curveTo(14.68f, 8.39f, 14.5f, 4.66f, 14.5f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(7.0f)
                curveTo(7.0f, 2.9f, 7.9f, 2.0f, 9.0f, 2.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(3.0f)
                curveTo(16.0f, 3.08f, 16.04f, 7.63f, 17.78f, 9.37f)
                lineTo(16.72f, 10.43f)
                moveTo(17.0f, 2.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(17.0f)
                moveTo(15.0f, 12.0f)
                curveTo(13.0f, 10.0f, 13.0f, 7.0f, 13.0f, 7.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                curveTo(9.0f, 10.0f, 9.0f, 10.0f, 8.0f, 11.0f)
                reflectiveCurveTo(7.0f, 13.0f, 7.0f, 13.0f)
                verticalLineTo(20.0f)
                curveTo(7.0f, 21.1f, 7.9f, 22.0f, 9.0f, 22.0f)
                horizontalLineTo(13.0f)
                curveTo(14.1f, 22.0f, 15.0f, 21.1f, 15.0f, 20.0f)
                verticalLineTo(12.0f)
                close()
            }
        }
        .build()
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
