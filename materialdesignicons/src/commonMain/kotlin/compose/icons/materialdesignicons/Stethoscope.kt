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

public val MaterialDesignIcons.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) {
            return _stethoscope!!
        }
        _stethoscope = Builder(name = "Stethoscope", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 8.0f)
                curveTo(19.56f, 8.0f, 20.0f, 8.43f, 20.0f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 10.0f)
                curveTo(18.43f, 10.0f, 18.0f, 9.55f, 18.0f, 9.0f)
                curveTo(18.0f, 8.43f, 18.43f, 8.0f, 19.0f, 8.0f)
                moveTo(2.0f, 2.0f)
                verticalLineTo(11.0f)
                curveTo(2.0f, 13.96f, 4.19f, 16.5f, 7.14f, 16.91f)
                curveTo(7.76f, 19.92f, 10.42f, 22.0f, 13.5f, 22.0f)
                arcTo(6.5f, 6.5f, 0.0f, false, false, 20.0f, 15.5f)
                verticalLineTo(11.81f)
                curveTo(21.16f, 11.39f, 22.0f, 10.29f, 22.0f, 9.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 19.0f, 6.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.0f, 9.0f)
                curveTo(16.0f, 10.29f, 16.84f, 11.4f, 18.0f, 11.81f)
                verticalLineTo(15.41f)
                curveTo(18.0f, 17.91f, 16.0f, 19.91f, 13.5f, 19.91f)
                curveTo(11.5f, 19.91f, 9.82f, 18.7f, 9.22f, 16.9f)
                curveTo(12.0f, 16.3f, 14.0f, 13.8f, 14.0f, 11.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(11.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 8.0f, 15.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 4.0f, 11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
