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

public val MaterialDesignIcons.SetLeftRight: ImageVector
    get() {
        if (_setLeftRight != null) {
            return _setLeftRight!!
        }
        _setLeftRight = Builder(name = "SetLeftRight", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 5.0f)
                curveTo(10.04f, 5.0f, 11.06f, 5.24f, 12.0f, 5.68f)
                curveTo(12.94f, 5.24f, 13.96f, 5.0f, 15.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 22.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 15.0f, 19.0f)
                curveTo(13.96f, 19.0f, 12.94f, 18.76f, 12.0f, 18.32f)
                curveTo(11.06f, 18.76f, 10.04f, 19.0f, 9.0f, 19.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 2.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 9.0f, 5.0f)
                moveTo(9.0f, 12.0f)
                curveTo(9.0f, 14.22f, 10.21f, 16.16f, 12.0f, 17.2f)
                curveTo(13.79f, 16.16f, 15.0f, 14.22f, 15.0f, 12.0f)
                curveTo(15.0f, 9.78f, 13.79f, 7.84f, 12.0f, 6.8f)
                curveTo(10.21f, 7.84f, 9.0f, 9.78f, 9.0f, 12.0f)
                close()
            }
        }
        .build()
        return _setLeftRight!!
    }

private var _setLeftRight: ImageVector? = null
