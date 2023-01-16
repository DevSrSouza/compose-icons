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

public val MaterialDesignIcons.RobotVacuumVariant: ImageVector
    get() {
        if (_robotVacuumVariant != null) {
            return _robotVacuumVariant!!
        }
        _robotVacuumVariant = Builder(name = "RobotVacuumVariant", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 3.0f, 5.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 19.0f, 3.0f)
                horizontalLineTo(5.0f)
                moveTo(8.0f, 7.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(16.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(8.0f)
                moveTo(3.0f, 9.0f)
                verticalLineTo(12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 5.0f, 12.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(3.0f)
                moveTo(12.0f, 12.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 9.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 17.0f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 14.5f, 14.5f)
                arcTo(2.5f, 2.5f, 0.0f, false, false, 12.0f, 12.0f)
                close()
            }
        }
        .build()
        return _robotVacuumVariant!!
    }

private var _robotVacuumVariant: ImageVector? = null
