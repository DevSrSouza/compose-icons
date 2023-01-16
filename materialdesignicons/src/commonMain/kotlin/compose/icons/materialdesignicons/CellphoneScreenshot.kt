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

public val MaterialDesignIcons.CellphoneScreenshot: ImageVector
    get() {
        if (_cellphoneScreenshot != null) {
            return _cellphoneScreenshot!!
        }
        _cellphoneScreenshot = Builder(name = "CellphoneScreenshot", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.0f, 1.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 5.0f, 3.0f)
                verticalLineTo(21.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 7.0f, 23.0f)
                horizontalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 21.0f)
                verticalLineTo(3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 17.0f, 1.0f)
                horizontalLineTo(7.0f)
                moveTo(7.0f, 4.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                moveTo(9.0f, 6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(7.5f)
                horizontalLineTo(13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.0f)
                moveTo(13.5f, 14.0f)
                verticalLineTo(16.5f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                horizontalLineTo(13.5f)
                close()
            }
        }
        .build()
        return _cellphoneScreenshot!!
    }

private var _cellphoneScreenshot: ImageVector? = null
