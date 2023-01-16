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

public val MaterialDesignIcons.MagazinePistol: ImageVector
    get() {
        if (_magazinePistol != null) {
            return _magazinePistol!!
        }
        _magazinePistol = Builder(name = "MagazinePistol", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 1.0f)
                lineTo(12.0f, 3.0f)
                horizontalLineTo(7.0f)
                lineTo(9.0f, 21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(23.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(21.0f)
                lineTo(16.0f, 1.0f)
                moveTo(9.0f, 5.0f)
                horizontalLineTo(12.0f)
                lineTo(12.24f, 7.0f)
                horizontalLineTo(9.24f)
                moveTo(9.47f, 9.0f)
                horizontalLineTo(12.47f)
                lineTo(12.71f, 11.0f)
                horizontalLineTo(9.71f)
                moveTo(9.94f, 13.0f)
                horizontalLineTo(12.94f)
                lineTo(13.18f, 15.0f)
                horizontalLineTo(10.18f)
                moveTo(10.41f, 17.0f)
                horizontalLineTo(13.41f)
                lineTo(13.65f, 19.0f)
                horizontalLineTo(10.65f)
                close()
            }
        }
        .build()
        return _magazinePistol!!
    }

private var _magazinePistol: ImageVector? = null
