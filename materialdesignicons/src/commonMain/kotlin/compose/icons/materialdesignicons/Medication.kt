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

public val MaterialDesignIcons.Medication: ImageVector
    get() {
        if (_medication != null) {
            return _medication!!
        }
        _medication = Builder(name = "Medication", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.0f, 3.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                moveTo(17.0f, 6.0f)
                horizontalLineTo(7.0f)
                curveTo(5.9f, 6.0f, 5.0f, 6.9f, 5.0f, 8.0f)
                verticalLineTo(19.0f)
                curveTo(5.0f, 20.1f, 5.9f, 21.0f, 7.0f, 21.0f)
                horizontalLineTo(17.0f)
                curveTo(18.1f, 21.0f, 19.0f, 20.1f, 19.0f, 19.0f)
                verticalLineTo(8.0f)
                curveTo(19.0f, 6.9f, 18.1f, 6.0f, 17.0f, 6.0f)
                moveTo(16.0f, 15.0f)
                horizontalLineTo(13.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                close()
            }
        }
        .build()
        return _medication!!
    }

private var _medication: ImageVector? = null
