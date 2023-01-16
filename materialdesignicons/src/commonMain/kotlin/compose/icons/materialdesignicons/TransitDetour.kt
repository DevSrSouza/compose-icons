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

public val MaterialDesignIcons.TransitDetour: ImageVector
    get() {
        if (_transitDetour != null) {
            return _transitDetour!!
        }
        _transitDetour = Builder(name = "TransitDetour", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, false, 16.61f, 4.21f)
                arcTo(11.5f, 11.5f, 0.0f, false, false, 13.75f, 4.0f)
                lineTo(13.88f, 6.0f)
                arcTo(9.47f, 9.47f, 0.0f, false, true, 16.0f, 6.13f)
                arcTo(3.0f, 3.0f, 0.0f, true, false, 19.0f, 3.0f)
                moveTo(19.0f, 7.0f)
                arcTo(1.0f, 1.0f, 0.0f, true, true, 20.0f, 6.0f)
                arcTo(1.0f, 1.0f, 0.0f, false, true, 19.0f, 7.0f)
                moveTo(8.86f, 7.86f)
                lineTo(7.67f, 6.25f)
                arcTo(11.5f, 11.5f, 0.0f, false, true, 11.6f, 4.37f)
                lineTo(12.1f, 6.31f)
                arcTo(9.5f, 9.5f, 0.0f, false, false, 8.86f, 7.86f)
                moveTo(21.0f, 18.0f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 15.69f, 16.11f)
                arcTo(9.47f, 9.47f, 0.0f, false, false, 8.59f, 13.46f)
                curveTo(8.37f, 13.47f, 8.16f, 13.5f, 7.94f, 13.54f)
                arcTo(3.0f, 3.0f, 0.0f, true, true, 4.39f, 10.06f)
                arcTo(11.54f, 11.54f, 0.0f, false, true, 6.04f, 7.7f)
                lineTo(7.5f, 9.06f)
                arcTo(9.34f, 9.34f, 0.0f, false, false, 6.5f, 10.41f)
                arcTo(3.04f, 3.04f, 0.0f, false, true, 7.62f, 11.56f)
                curveTo(7.91f, 11.5f, 8.19f, 11.5f, 8.5f, 11.46f)
                arcTo(11.47f, 11.47f, 0.0f, false, true, 17.46f, 15.05f)
                arcTo(2.96f, 2.96f, 0.0f, false, true, 18.0f, 15.0f)
                arcTo(3.0f, 3.0f, 0.0f, false, true, 21.0f, 18.0f)
                close()
            }
        }
        .build()
        return _transitDetour!!
    }

private var _transitDetour: ImageVector? = null
