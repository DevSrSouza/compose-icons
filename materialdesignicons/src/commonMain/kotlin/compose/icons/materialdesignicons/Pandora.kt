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

public val MaterialDesignIcons.Pandora: ImageVector
    get() {
        if (_pandora != null) {
            return _pandora!!
        }
        _pandora = Builder(name = "Pandora", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 20.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 9.0f, 21.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(3.0f)
                horizontalLineTo(13.71f)
                arcTo(6.75f, 6.75f, 0.0f, false, true, 20.46f, 9.75f)
                curveTo(20.46f, 13.5f, 17.44f, 16.5f, 13.71f, 16.5f)
                horizontalLineTo(10.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _pandora!!
    }

private var _pandora: ImageVector? = null
