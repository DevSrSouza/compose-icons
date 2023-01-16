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

public val MaterialDesignIcons.CellphoneDock: ImageVector
    get() {
        if (_cellphoneDock != null) {
            return _cellphoneDock!!
        }
        _cellphoneDock = Builder(name = "CellphoneDock", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(16.0f, 15.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.0f)
                moveTo(16.0f, 1.0f)
                horizontalLineTo(8.0f)
                curveTo(6.89f, 1.0f, 6.0f, 1.89f, 6.0f, 3.0f)
                verticalLineTo(17.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 8.0f, 19.0f)
                horizontalLineTo(16.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 18.0f, 17.0f)
                verticalLineTo(3.0f)
                curveTo(18.0f, 1.89f, 17.1f, 1.0f, 16.0f, 1.0f)
                moveTo(8.0f, 23.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(23.0f)
                close()
            }
        }
        .build()
        return _cellphoneDock!!
    }

private var _cellphoneDock: ImageVector? = null
