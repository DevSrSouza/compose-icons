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

public val MaterialDesignIcons.CurrentAc: ImageVector
    get() {
        if (_currentAc != null) {
            return _currentAc!!
        }
        _currentAc = Builder(name = "CurrentAc", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.43f, 11.0f)
                curveTo(12.28f, 10.84f, 10.0f, 7.0f, 7.0f, 7.0f)
                reflectiveCurveTo(2.32f, 10.18f, 2.0f, 11.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(11.57f)
                curveTo(11.72f, 13.16f, 14.0f, 17.0f, 17.0f, 17.0f)
                reflectiveCurveTo(21.68f, 13.82f, 22.0f, 13.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(12.43f)
                moveTo(7.0f, 9.0f)
                curveTo(8.17f, 9.0f, 9.18f, 9.85f, 10.0f, 11.0f)
                horizontalLineTo(4.31f)
                curveTo(4.78f, 10.17f, 5.54f, 9.0f, 7.0f, 9.0f)
                moveTo(17.0f, 15.0f)
                curveTo(15.83f, 15.0f, 14.82f, 14.15f, 14.0f, 13.0f)
                horizontalLineTo(19.69f)
                curveTo(19.22f, 13.83f, 18.46f, 15.0f, 17.0f, 15.0f)
                close()
            }
        }
        .build()
        return _currentAc!!
    }

private var _currentAc: ImageVector? = null
