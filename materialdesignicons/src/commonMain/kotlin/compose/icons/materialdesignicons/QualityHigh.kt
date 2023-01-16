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

public val MaterialDesignIcons.QualityHigh: ImageVector
    get() {
        if (_qualityHigh != null) {
            return _qualityHigh!!
        }
        _qualityHigh = Builder(name = "QualityHigh", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                moveTo(18.0f, 14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 17.0f, 15.0f)
                horizontalLineTo(16.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(14.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 13.0f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 14.0f, 9.0f)
                horizontalLineTo(17.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 18.0f, 10.0f)
                moveTo(11.0f, 15.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(11.5f)
                horizontalLineTo(9.5f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 4.0f, 3.0f, 4.89f, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                curveTo(21.0f, 4.89f, 20.1f, 4.0f, 19.0f, 4.0f)
                close()
            }
        }
        .build()
        return _qualityHigh!!
    }

private var _qualityHigh: ImageVector? = null
