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

public val MaterialDesignIcons.ChartPieOutline: ImageVector
    get() {
        if (_chartPieOutline != null) {
            return _chartPieOutline!!
        }
        _chartPieOutline = Builder(name = "ChartPieOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.0f, 11.0f)
                horizontalLineTo(19.95f)
                quadTo(19.58f, 8.25f, 17.66f, 6.34f)
                quadTo(15.75f, 4.43f, 13.0f, 4.05f)
                moveTo(11.0f, 19.95f)
                verticalLineTo(4.05f)
                quadTo(8.0f, 4.43f, 6.0f, 6.69f)
                quadTo(4.0f, 8.95f, 4.0f, 12.0f)
                reflectiveQuadTo(6.0f, 17.31f)
                quadTo(8.0f, 19.58f, 11.0f, 19.95f)
                moveTo(13.0f, 19.95f)
                quadTo(15.75f, 19.6f, 17.68f, 17.68f)
                quadTo(19.6f, 15.75f, 19.95f, 13.0f)
                horizontalLineTo(13.0f)
                moveTo(12.0f, 12.0f)
                moveTo(12.0f, 22.0f)
                quadTo(9.93f, 22.0f, 8.1f, 21.21f)
                quadTo(6.28f, 20.43f, 4.93f, 19.08f)
                quadTo(3.58f, 17.73f, 2.79f, 15.9f)
                quadTo(2.0f, 14.08f, 2.0f, 12.0f)
                reflectiveQuadTo(2.79f, 8.1f)
                quadTo(3.58f, 6.28f, 4.93f, 4.93f)
                quadTo(6.28f, 3.58f, 8.1f, 2.79f)
                quadTo(9.93f, 2.0f, 12.0f, 2.0f)
                reflectiveQuadTo(15.89f, 2.79f)
                quadTo(17.7f, 3.58f, 19.06f, 4.94f)
                quadTo(20.43f, 6.3f, 21.21f, 8.11f)
                quadTo(22.0f, 9.93f, 22.0f, 12.0f)
                quadTo(22.0f, 14.05f, 21.21f, 15.88f)
                quadTo(20.43f, 17.7f, 19.08f, 19.06f)
                quadTo(17.73f, 20.43f, 15.9f, 21.21f)
                quadTo(14.08f, 22.0f, 12.0f, 22.0f)
                close()
            }
        }
        .build()
        return _chartPieOutline!!
    }

private var _chartPieOutline: ImageVector? = null
