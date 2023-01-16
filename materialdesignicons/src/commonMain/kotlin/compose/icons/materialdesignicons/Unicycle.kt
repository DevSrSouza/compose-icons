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

public val MaterialDesignIcons.Unicycle: ImageVector
    get() {
        if (_unicycle != null) {
            return _unicycle!!
        }
        _unicycle = Builder(name = "Unicycle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 9.09f)
                verticalLineTo(5.0f)
                horizontalLineTo(14.0f)
                curveTo(14.55f, 5.0f, 15.0f, 4.55f, 15.0f, 4.0f)
                reflectiveCurveTo(14.55f, 3.0f, 14.0f, 3.0f)
                horizontalLineTo(10.0f)
                curveTo(9.45f, 3.0f, 9.0f, 3.45f, 9.0f, 4.0f)
                reflectiveCurveTo(9.45f, 5.0f, 10.0f, 5.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(9.09f)
                curveTo(8.16f, 9.57f, 6.0f, 12.03f, 6.0f, 15.0f)
                curveTo(6.0f, 18.31f, 8.69f, 21.0f, 12.0f, 21.0f)
                reflectiveCurveTo(18.0f, 18.31f, 18.0f, 15.0f)
                curveTo(18.0f, 12.03f, 15.84f, 9.57f, 13.0f, 9.09f)
                moveTo(12.0f, 19.0f)
                curveTo(9.79f, 19.0f, 8.0f, 17.21f, 8.0f, 15.0f)
                curveTo(8.0f, 13.14f, 9.28f, 11.59f, 11.0f, 11.14f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.14f)
                curveTo(14.72f, 11.59f, 16.0f, 13.14f, 16.0f, 15.0f)
                curveTo(16.0f, 17.21f, 14.21f, 19.0f, 12.0f, 19.0f)
                close()
            }
        }
        .build()
        return _unicycle!!
    }

private var _unicycle: ImageVector? = null
