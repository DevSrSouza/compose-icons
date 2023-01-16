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

public val MaterialDesignIcons.ScrewMachineRoundTop: ImageVector
    get() {
        if (_screwMachineRoundTop != null) {
            return _screwMachineRoundTop!!
        }
        _screwMachineRoundTop = Builder(name = "ScrewMachineRoundTop", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 7.3f)
                lineTo(13.5f, 8.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(10.0f)
                lineTo(9.5f, 10.7f)
                verticalLineTo(11.7f)
                lineTo(14.5f, 8.4f)
                verticalLineTo(7.3f)
                moveTo(14.5f, 11.3f)
                lineTo(13.5f, 12.0f)
                verticalLineTo(10.0f)
                lineTo(10.5f, 12.0f)
                verticalLineTo(14.0f)
                lineTo(9.5f, 14.7f)
                verticalLineTo(15.7f)
                lineTo(14.5f, 12.4f)
                verticalLineTo(11.3f)
                moveTo(14.5f, 15.3f)
                lineTo(13.5f, 16.0f)
                verticalLineTo(14.0f)
                lineTo(10.5f, 16.0f)
                verticalLineTo(18.0f)
                lineTo(9.5f, 18.7f)
                verticalLineTo(19.7f)
                lineTo(14.5f, 16.4f)
                verticalLineTo(15.3f)
                moveTo(7.0f, 6.0f)
                horizontalLineTo(17.0f)
                curveTo(17.0f, 6.0f, 16.0f, 3.0f, 12.0f, 3.0f)
                curveTo(8.0f, 3.0f, 7.0f, 6.0f, 7.0f, 6.0f)
                moveTo(13.5f, 18.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(10.5f)
                verticalLineTo(20.0f)
                lineTo(13.5f, 18.0f)
                close()
            }
        }
        .build()
        return _screwMachineRoundTop!!
    }

private var _screwMachineRoundTop: ImageVector? = null
