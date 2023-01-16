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

public val MaterialDesignIcons.MedicalCottonSwab: ImageVector
    get() {
        if (_medicalCottonSwab != null) {
            return _medicalCottonSwab!!
        }
        _medicalCottonSwab = Builder(name = "MedicalCottonSwab", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(3.0f, 3.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(3.0f)
                moveTo(2.0f, 21.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(21.0f)
                moveTo(5.0f, 12.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(9.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(12.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(17.5f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(12.0f)
                moveTo(20.0f, 6.0f)
                curveTo(18.3f, 6.0f, 17.0f, 7.8f, 17.0f, 10.0f)
                curveTo(17.0f, 11.8f, 17.8f, 13.2f, 19.0f, 13.8f)
                verticalLineTo(21.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(13.8f)
                curveTo(22.2f, 13.3f, 23.0f, 11.8f, 23.0f, 10.0f)
                curveTo(23.0f, 7.8f, 21.7f, 6.0f, 20.0f, 6.0f)
                close()
            }
        }
        .build()
        return _medicalCottonSwab!!
    }

private var _medicalCottonSwab: ImageVector? = null
