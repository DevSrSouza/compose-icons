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

public val MaterialDesignIcons.CellphoneBasic: ImageVector
    get() {
        if (_cellphoneBasic != null) {
            return _cellphoneBasic!!
        }
        _cellphoneBasic = Builder(name = "CellphoneBasic", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 2.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 14.0f, 3.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(10.0f)
                curveTo(8.89f, 6.0f, 8.0f, 6.89f, 8.0f, 8.0f)
                verticalLineTo(20.0f)
                curveTo(8.0f, 21.11f, 8.89f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(15.0f)
                curveTo(16.11f, 22.0f, 17.0f, 21.11f, 17.0f, 20.0f)
                verticalLineTo(8.0f)
                curveTo(17.0f, 7.26f, 16.6f, 6.62f, 16.0f, 6.28f)
                verticalLineTo(3.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, false, 15.0f, 2.0f)
                moveTo(10.0f, 8.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(8.0f)
                moveTo(10.0f, 15.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(15.0f)
                moveTo(12.0f, 15.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(15.0f)
                moveTo(14.0f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(16.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(15.0f)
                moveTo(10.0f, 17.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(17.0f)
                moveTo(12.0f, 17.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(17.0f)
                moveTo(14.0f, 17.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(17.0f)
                moveTo(10.0f, 19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(10.0f)
                verticalLineTo(19.0f)
                moveTo(12.0f, 19.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(12.0f)
                verticalLineTo(19.0f)
                moveTo(14.0f, 19.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _cellphoneBasic!!
    }

private var _cellphoneBasic: ImageVector? = null
