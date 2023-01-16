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

public val MaterialDesignIcons.PlusLockOpen: ImageVector
    get() {
        if (_plusLockOpen != null) {
            return _plusLockOpen!!
        }
        _plusLockOpen = Builder(name = "PlusLockOpen", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
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
                moveTo(19.0f, 15.0f)
                curveTo(17.95f, 15.0f, 16.9f, 15.8f, 16.9f, 16.82f)
                verticalLineTo(18.64f)
                curveTo(16.45f, 18.64f, 16.0f, 19.07f, 16.0f, 19.5f)
                verticalLineTo(22.05f)
                curveTo(16.0f, 22.56f, 16.45f, 23.0f, 16.9f, 23.0f)
                horizontalLineTo(21.03f)
                curveTo(21.55f, 23.0f, 22.0f, 22.56f, 22.0f, 22.13f)
                verticalLineTo(19.58f)
                curveTo(22.0f, 19.07f, 21.55f, 18.64f, 21.1f, 18.64f)
                horizontalLineTo(17.88f)
                verticalLineTo(16.82f)
                curveTo(17.88f, 16.24f, 18.4f, 15.87f, 19.0f, 15.87f)
                reflectiveCurveTo(20.13f, 16.24f, 20.13f, 16.82f)
                verticalLineTo(17.18f)
                horizontalLineTo(21.1f)
                verticalLineTo(16.82f)
                curveTo(21.1f, 15.8f, 20.05f, 15.0f, 19.0f, 15.0f)
                close()
            }
        }
        .build()
        return _plusLockOpen!!
    }

private var _plusLockOpen: ImageVector? = null
