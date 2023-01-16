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

public val MaterialDesignIcons.Radioactive: ImageVector
    get() {
        if (_radioactive != null) {
            return _radioactive!!
        }
        _radioactive = Builder(name = "Radioactive", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 12.0f, 10.0f)
                moveTo(12.0f, 22.0f)
                curveTo(10.05f, 22.0f, 8.22f, 21.44f, 6.69f, 20.47f)
                lineTo(10.0f, 15.47f)
                curveTo(10.6f, 15.81f, 11.28f, 16.0f, 12.0f, 16.0f)
                curveTo(12.72f, 16.0f, 13.4f, 15.81f, 14.0f, 15.47f)
                lineTo(17.31f, 20.47f)
                curveTo(15.78f, 21.44f, 13.95f, 22.0f, 12.0f, 22.0f)
                moveTo(2.0f, 12.0f)
                curveTo(2.0f, 7.86f, 4.5f, 4.3f, 8.11f, 2.78f)
                lineTo(10.34f, 8.36f)
                curveTo(8.96f, 9.0f, 8.0f, 10.38f, 8.0f, 12.0f)
                horizontalLineTo(2.0f)
                moveTo(16.0f, 12.0f)
                curveTo(16.0f, 10.38f, 15.04f, 9.0f, 13.66f, 8.36f)
                lineTo(15.89f, 2.78f)
                curveTo(19.5f, 4.3f, 22.0f, 7.86f, 22.0f, 12.0f)
                horizontalLineTo(16.0f)
                close()
            }
        }
        .build()
        return _radioactive!!
    }

private var _radioactive: ImageVector? = null
