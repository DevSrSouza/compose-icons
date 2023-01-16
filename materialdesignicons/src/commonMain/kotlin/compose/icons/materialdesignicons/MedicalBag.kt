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

public val MaterialDesignIcons.MedicalBag: ImageVector
    get() {
        if (_medicalBag != null) {
            return _medicalBag!!
        }
        _medicalBag = Builder(name = "MedicalBag", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(10.0f, 3.0f)
                lineTo(8.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                curveTo(3.85f, 7.0f, 3.12f, 8.0f, 3.0f, 9.0f)
                lineTo(2.0f, 19.0f)
                curveTo(1.88f, 20.0f, 2.54f, 21.0f, 4.0f, 21.0f)
                horizontalLineTo(20.0f)
                curveTo(21.46f, 21.0f, 22.12f, 20.0f, 22.0f, 19.0f)
                lineTo(21.0f, 9.0f)
                curveTo(20.88f, 8.0f, 20.06f, 7.0f, 19.0f, 7.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(5.0f)
                lineTo(14.0f, 3.0f)
                horizontalLineTo(10.0f)
                moveTo(10.0f, 5.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(5.0f)
                moveTo(11.0f, 10.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(10.0f)
                close()
            }
        }
        .build()
        return _medicalBag!!
    }

private var _medicalBag: ImageVector? = null
