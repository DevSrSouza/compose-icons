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

public val MaterialDesignIcons.VectorCircle: ImageVector
    get() {
        if (_vectorCircle != null) {
            return _vectorCircle!!
        }
        _vectorCircle = Builder(name = "VectorCircle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 2.0f)
                verticalLineTo(4.06f)
                curveTo(6.72f, 4.92f, 4.92f, 6.72f, 4.05f, 9.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(4.06f)
                curveTo(4.92f, 17.28f, 6.72f, 19.09f, 9.0f, 19.95f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(19.94f)
                curveTo(17.28f, 19.08f, 19.09f, 17.28f, 19.95f, 15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.94f)
                curveTo(19.08f, 6.72f, 17.28f, 4.92f, 15.0f, 4.05f)
                verticalLineTo(2.0f)
                moveTo(11.0f, 4.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(11.0f)
                moveTo(9.0f, 6.25f)
                verticalLineTo(8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(6.25f)
                curveTo(16.18f, 6.86f, 17.14f, 7.82f, 17.75f, 9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.75f)
                curveTo(17.14f, 16.18f, 16.18f, 17.14f, 15.0f, 17.75f)
                verticalLineTo(16.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(17.75f)
                curveTo(7.82f, 17.14f, 6.86f, 16.18f, 6.25f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(6.25f)
                curveTo(6.86f, 7.82f, 7.82f, 6.86f, 9.0f, 6.25f)
                moveTo(4.0f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(4.0f)
                moveTo(18.0f, 11.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(18.0f)
                moveTo(11.0f, 18.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(11.0f)
            }
        }
        .build()
        return _vectorCircle!!
    }

private var _vectorCircle: ImageVector? = null
