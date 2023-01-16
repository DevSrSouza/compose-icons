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

public val MaterialDesignIcons.PlusLock: ImageVector
    get() {
        if (_plusLock != null) {
            return _plusLock!!
        }
        _plusLock = Builder(name = "PlusLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.14f, 17.67f)
                verticalLineTo(17.22f)
                curveTo(21.14f, 16.0f, 20.2f, 15.0f, 19.0f, 15.0f)
                reflectiveCurveTo(16.86f, 16.0f, 16.86f, 17.22f)
                verticalLineTo(17.67f)
                curveTo(16.34f, 17.67f, 16.0f, 18.0f, 16.0f, 18.56f)
                verticalLineTo(22.11f)
                curveTo(16.0f, 22.65f, 16.34f, 23.0f, 16.86f, 23.0f)
                horizontalLineTo(21.14f)
                curveTo(21.66f, 23.0f, 22.0f, 22.65f, 22.0f, 22.11f)
                verticalLineTo(18.55f)
                curveTo(22.0f, 18.0f, 21.66f, 17.67f, 21.14f, 17.67f)
                moveTo(20.29f, 17.67f)
                horizontalLineTo(17.72f)
                verticalLineTo(17.22f)
                curveTo(17.72f, 16.5f, 18.31f, 15.89f, 19.0f, 15.89f)
                curveTo(19.69f, 15.89f, 20.29f, 16.5f, 20.29f, 17.22f)
                verticalLineTo(17.67f)
                moveTo(11.0f, 5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _plusLock!!
    }

private var _plusLock: ImageVector? = null
