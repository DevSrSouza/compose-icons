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

public val MaterialDesignIcons.Midi: ImageVector
    get() {
        if (_midi != null) {
            return _midi!!
        }
        _midi = Builder(name = "Midi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(20.15f, 8.26f)
                horizontalLineTo(22.0f)
                verticalLineTo(15.74f)
                horizontalLineTo(20.15f)
                moveTo(13.0f, 8.26f)
                horizontalLineTo(18.43f)
                curveTo(19.0f, 8.26f, 19.3f, 8.74f, 19.3f, 9.3f)
                verticalLineTo(14.81f)
                curveTo(19.3f, 15.5f, 19.0f, 15.74f, 18.38f, 15.74f)
                horizontalLineTo(13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(14.87f)
                verticalLineTo(13.91f)
                horizontalLineTo(17.5f)
                verticalLineTo(9.95f)
                horizontalLineTo(13.0f)
                moveTo(10.32f, 8.26f)
                horizontalLineTo(12.14f)
                verticalLineTo(15.74f)
                horizontalLineTo(10.32f)
                moveTo(2.0f, 8.26f)
                horizontalLineTo(8.55f)
                curveTo(9.1f, 8.26f, 9.41f, 8.74f, 9.41f, 9.3f)
                verticalLineTo(15.74f)
                horizontalLineTo(7.59f)
                verticalLineTo(10.15f)
                horizontalLineTo(6.5f)
                verticalLineTo(15.74f)
                horizontalLineTo(4.87f)
                verticalLineTo(10.15f)
                horizontalLineTo(3.83f)
                verticalLineTo(15.74f)
                horizontalLineTo(2.0f)
                close()
            }
        }
        .build()
        return _midi!!
    }

private var _midi: ImageVector? = null
