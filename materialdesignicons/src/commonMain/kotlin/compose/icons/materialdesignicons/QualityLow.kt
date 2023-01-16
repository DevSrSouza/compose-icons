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

public val MaterialDesignIcons.QualityLow: ImageVector
    get() {
        if (_qualityLow != null) {
            return _qualityLow!!
        }
        _qualityLow = Builder(name = "QualityLow", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 13.5f)
                horizontalLineTo(16.5f)
                verticalLineTo(10.5f)
                horizontalLineTo(14.5f)
                moveTo(18.0f, 14.0f)
                curveTo(18.0f, 14.6f, 17.6f, 15.0f, 17.0f, 15.0f)
                horizontalLineTo(16.25f)
                verticalLineTo(16.5f)
                horizontalLineTo(14.75f)
                verticalLineTo(15.0f)
                horizontalLineTo(14.0f)
                curveTo(13.4f, 15.0f, 13.0f, 14.6f, 13.0f, 14.0f)
                verticalLineTo(10.0f)
                curveTo(13.0f, 9.4f, 13.4f, 9.0f, 14.0f, 9.0f)
                horizontalLineTo(17.0f)
                curveTo(17.6f, 9.0f, 18.0f, 9.4f, 18.0f, 10.0f)
                moveTo(19.0f, 4.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 6.0f)
                verticalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 20.0f)
                horizontalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 21.0f, 18.0f)
                verticalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 4.0f)
                moveTo(11.0f, 13.5f)
                verticalLineTo(15.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.5f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.0f)
                close()
            }
        }
        .build()
        return _qualityLow!!
    }

private var _qualityLow: ImageVector? = null
