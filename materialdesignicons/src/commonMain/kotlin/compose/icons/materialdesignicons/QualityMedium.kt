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

public val MaterialDesignIcons.QualityMedium: ImageVector
    get() {
        if (_qualityMedium != null) {
            return _qualityMedium!!
        }
        _qualityMedium = Builder(name = "QualityMedium", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 20.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 4.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 6.0f)
                moveTo(12.0f, 10.0f)
                curveTo(12.0f, 9.5f, 11.5f, 9.0f, 11.0f, 9.0f)
                horizontalLineTo(6.5f)
                curveTo(6.0f, 9.0f, 5.5f, 9.5f, 5.5f, 10.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(8.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(9.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(10.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(10.0f)
                moveTo(14.5f, 9.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 13.5f, 10.0f)
                verticalLineTo(14.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.5f, 15.0f)
                horizontalLineTo(15.5f)
                verticalLineTo(16.5f)
                horizontalLineTo(16.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(17.5f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 18.5f, 14.0f)
                verticalLineTo(10.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 17.5f, 9.0f)
                horizontalLineTo(14.5f)
                moveTo(15.0f, 10.5f)
                horizontalLineTo(17.0f)
                verticalLineTo(13.5f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                close()
            }
        }
        .build()
        return _qualityMedium!!
    }

private var _qualityMedium: ImageVector? = null
