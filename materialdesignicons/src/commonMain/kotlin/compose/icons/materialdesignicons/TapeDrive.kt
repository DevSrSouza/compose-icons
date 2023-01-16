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

public val MaterialDesignIcons.TapeDrive: ImageVector
    get() {
        if (_tapeDrive != null) {
            return _tapeDrive!!
        }
        _tapeDrive = Builder(name = "TapeDrive", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(13.11f, 10.0f, 14.0f, 10.9f, 14.0f, 12.0f)
                curveTo(14.0f, 13.11f, 13.11f, 14.0f, 12.0f, 14.0f)
                curveTo(10.9f, 14.0f, 10.0f, 13.11f, 10.0f, 12.0f)
                curveTo(10.0f, 10.9f, 10.9f, 10.0f, 12.0f, 10.0f)
                moveTo(5.0f, 3.0f)
                horizontalLineTo(19.0f)
                curveTo(20.11f, 3.0f, 21.0f, 3.9f, 21.0f, 5.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(16.9f)
                curveTo(18.2f, 15.73f, 19.0f, 13.96f, 19.0f, 12.0f)
                curveTo(19.0f, 8.13f, 15.87f, 5.0f, 12.0f, 5.0f)
                curveTo(8.13f, 5.0f, 5.0f, 8.13f, 5.0f, 12.0f)
                curveTo(5.0f, 15.87f, 8.13f, 19.0f, 12.0f, 19.0f)
                horizontalLineTo(21.0f)
                curveTo(21.0f, 20.11f, 20.11f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(3.9f, 21.0f, 3.0f, 20.11f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.9f, 3.9f, 3.0f, 5.0f, 3.0f)
                close()
            }
        }
        .build()
        return _tapeDrive!!
    }

private var _tapeDrive: ImageVector? = null
