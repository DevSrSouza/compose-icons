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

public val MaterialDesignIcons.DatabaseOff: ImageVector
    get() {
        if (_databaseOff != null) {
            return _databaseOff!!
        }
        _databaseOff = Builder(name = "DatabaseOff", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.07f, 15.87f)
                curveTo(19.66f, 15.31f, 20.0f, 14.68f, 20.0f, 14.0f)
                verticalLineTo(16.8f)
                lineTo(19.07f, 15.87f)
                moveTo(20.0f, 9.0f)
                curveTo(20.0f, 10.54f, 18.27f, 11.86f, 15.73f, 12.53f)
                lineTo(17.89f, 14.69f)
                curveTo(19.19f, 14.0f, 20.0f, 13.04f, 20.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(20.0f, 7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                curveTo(10.13f, 3.0f, 8.42f, 3.33f, 7.06f, 3.86f)
                lineTo(14.06f, 10.86f)
                curveTo(17.5f, 10.41f, 20.0f, 8.85f, 20.0f, 7.0f)
                moveTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(4.21f, 6.1f)
                curveTo(4.08f, 6.39f, 4.0f, 6.69f, 4.0f, 7.0f)
                curveTo(4.0f, 8.63f, 5.96f, 10.04f, 8.77f, 10.66f)
                lineTo(11.08f, 12.97f)
                curveTo(7.1f, 12.74f, 4.0f, 11.06f, 4.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 14.21f, 7.58f, 16.0f, 12.0f, 16.0f)
                curveTo(12.69f, 16.0f, 13.35f, 15.95f, 14.0f, 15.87f)
                lineTo(15.66f, 17.55f)
                curveTo(14.57f, 17.84f, 13.32f, 18.0f, 12.0f, 18.0f)
                curveTo(7.58f, 18.0f, 4.0f, 16.21f, 4.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveTo(14.31f, 21.0f, 16.38f, 20.5f, 17.84f, 19.73f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(2.39f, 1.73f)
                close()
            }
        }
        .build()
        return _databaseOff!!
    }

private var _databaseOff: ImageVector? = null
