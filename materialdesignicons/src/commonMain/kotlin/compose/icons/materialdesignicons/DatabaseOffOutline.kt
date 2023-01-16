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

public val MaterialDesignIcons.DatabaseOffOutline: ImageVector
    get() {
        if (_databaseOffOutline != null) {
            return _databaseOffOutline!!
        }
        _databaseOffOutline = Builder(name = "DatabaseOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.21f, 6.1f)
                curveTo(4.08f, 6.39f, 4.0f, 6.69f, 4.0f, 7.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.59f, 21.0f, 12.0f, 21.0f)
                curveTo(14.3f, 21.0f, 16.38f, 20.5f, 17.84f, 19.73f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                moveTo(6.0f, 9.64f)
                curveTo(6.76f, 10.07f, 7.7f, 10.42f, 8.76f, 10.65f)
                lineTo(12.11f, 14.0f)
                curveTo(12.07f, 14.0f, 12.04f, 14.0f, 12.0f, 14.0f)
                curveTo(9.58f, 14.0f, 7.3f, 13.4f, 6.0f, 12.45f)
                verticalLineTo(9.64f)
                moveTo(12.0f, 19.0f)
                curveTo(8.13f, 19.0f, 6.0f, 17.5f, 6.0f, 17.0f)
                verticalLineTo(14.77f)
                curveTo(7.61f, 15.55f, 9.72f, 16.0f, 12.0f, 16.0f)
                curveTo(12.68f, 16.0f, 13.34f, 15.95f, 14.0f, 15.87f)
                lineTo(16.34f, 18.23f)
                curveTo(15.33f, 18.65f, 13.87f, 19.0f, 12.0f, 19.0f)
                moveTo(8.64f, 5.44f)
                lineTo(7.06f, 3.86f)
                curveTo(8.42f, 3.33f, 10.13f, 3.0f, 12.0f, 3.0f)
                curveTo(16.42f, 3.0f, 20.0f, 4.79f, 20.0f, 7.0f)
                verticalLineTo(16.8f)
                lineTo(18.0f, 14.8f)
                verticalLineTo(14.77f)
                lineTo(18.0f, 14.78f)
                lineTo(16.45f, 13.25f)
                curveTo(17.05f, 13.03f, 17.58f, 12.76f, 18.0f, 12.45f)
                verticalLineTo(9.64f)
                curveTo(16.97f, 10.22f, 15.61f, 10.65f, 14.06f, 10.86f)
                lineTo(12.19f, 9.0f)
                curveTo(15.94f, 8.94f, 18.0f, 7.5f, 18.0f, 7.0f)
                curveTo(18.0f, 6.5f, 15.87f, 5.0f, 12.0f, 5.0f)
                curveTo(10.66f, 5.0f, 9.54f, 5.18f, 8.64f, 5.44f)
                close()
            }
        }
        .build()
        return _databaseOffOutline!!
    }

private var _databaseOffOutline: ImageVector? = null
