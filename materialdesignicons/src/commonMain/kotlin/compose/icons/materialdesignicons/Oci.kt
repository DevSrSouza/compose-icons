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

public val MaterialDesignIcons.Oci: ImageVector
    get() {
        if (_oci != null) {
            return _oci!!
        }
        _oci = Builder(name = "Oci", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 2.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(2.0f)
                moveTo(19.12f, 19.03f)
                horizontalLineTo(4.87f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.13f)
                verticalLineTo(19.03f)
                moveTo(14.83f, 10.71f)
                horizontalLineTo(17.69f)
                verticalLineTo(17.59f)
                horizontalLineTo(14.83f)
                moveTo(14.83f, 6.41f)
                horizontalLineTo(17.69f)
                verticalLineTo(9.27f)
                horizontalLineTo(14.83f)
                moveTo(6.3f, 6.41f)
                verticalLineTo(17.59f)
                horizontalLineTo(13.4f)
                verticalLineTo(14.72f)
                horizontalLineTo(9.17f)
                verticalLineTo(9.28f)
                horizontalLineTo(13.4f)
                verticalLineTo(6.41f)
                close()
            }
        }
        .build()
        return _oci!!
    }

private var _oci: ImageVector? = null
