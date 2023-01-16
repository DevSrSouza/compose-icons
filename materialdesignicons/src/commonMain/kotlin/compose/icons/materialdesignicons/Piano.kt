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

public val MaterialDesignIcons.Piano: ImageVector
    get() {
        if (_piano != null) {
            return _piano!!
        }
        _piano = Builder(name = "Piano", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.0f, 2.0f)
                horizontalLineTo(4.0f)
                curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f)
                verticalLineTo(20.0f)
                curveTo(2.0f, 21.11f, 2.9f, 22.0f, 4.0f, 22.0f)
                horizontalLineTo(20.0f)
                curveTo(21.11f, 22.0f, 22.0f, 21.11f, 22.0f, 20.0f)
                verticalLineTo(4.0f)
                curveTo(22.0f, 2.9f, 21.11f, 2.0f, 20.0f, 2.0f)
                moveTo(14.74f, 14.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.31f)
                curveTo(9.86f, 14.0f, 10.3f, 13.56f, 10.3f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(13.75f)
                verticalLineTo(13.0f)
                curveTo(13.75f, 13.56f, 14.19f, 14.0f, 14.74f, 14.0f)
                moveTo(4.0f, 4.0f)
                horizontalLineTo(6.8f)
                verticalLineTo(13.0f)
                curveTo(6.8f, 13.56f, 7.24f, 14.0f, 7.79f, 14.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(4.0f)
                moveTo(20.0f, 20.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(16.26f)
                curveTo(16.81f, 14.0f, 17.25f, 13.56f, 17.25f, 13.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _piano!!
    }

private var _piano: ImageVector? = null
