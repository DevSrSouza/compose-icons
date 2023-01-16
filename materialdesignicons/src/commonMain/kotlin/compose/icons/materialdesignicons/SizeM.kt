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

public val MaterialDesignIcons.SizeM: ImageVector
    get() {
        if (_sizeM != null) {
            return _sizeM!!
        }
        _sizeM = Builder(name = "SizeM", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 7.0f)
                curveTo(7.9f, 7.0f, 7.0f, 7.9f, 7.0f, 9.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(9.0f)
                curveTo(17.0f, 7.9f, 16.11f, 7.0f, 15.0f, 7.0f)
                horizontalLineTo(9.0f)
                close()
            }
        }
        .build()
        return _sizeM!!
    }

private var _sizeM: ImageVector? = null
