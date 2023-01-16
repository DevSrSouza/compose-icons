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

public val MaterialDesignIcons.TowerBeach: ImageVector
    get() {
        if (_towerBeach != null) {
            return _towerBeach!!
        }
        _towerBeach = Builder(name = "TowerBeach", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 4.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(17.64f)
                lineTo(21.0f, 23.0f)
                horizontalLineTo(18.93f)
                lineTo(18.37f, 20.83f)
                lineTo(12.0f, 17.15f)
                lineTo(5.63f, 20.83f)
                lineTo(5.07f, 23.0f)
                horizontalLineTo(3.0f)
                lineTo(6.36f, 10.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(3.0f)
                lineTo(18.0f, 1.0f)
                verticalLineTo(4.0f)
                horizontalLineTo(17.0f)
                moveTo(7.28f, 14.43f)
                lineTo(6.33f, 18.12f)
                lineTo(10.0f, 16.0f)
                lineTo(7.28f, 14.43f)
                moveTo(15.57f, 10.0f)
                horizontalLineTo(8.43f)
                lineTo(7.8f, 12.42f)
                lineTo(12.0f, 14.85f)
                lineTo(16.2f, 12.42f)
                lineTo(15.57f, 10.0f)
                moveTo(17.67f, 18.12f)
                lineTo(16.72f, 14.43f)
                lineTo(14.0f, 16.0f)
                lineTo(17.67f, 18.12f)
                close()
            }
        }
        .build()
        return _towerBeach!!
    }

private var _towerBeach: ImageVector? = null
