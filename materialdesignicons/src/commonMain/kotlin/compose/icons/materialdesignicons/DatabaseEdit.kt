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

public val MaterialDesignIcons.DatabaseEdit: ImageVector
    get() {
        if (_databaseEdit != null) {
            return _databaseEdit!!
        }
        _databaseEdit = Builder(name = "DatabaseEdit", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.0f, 7.05f, 20.72f, 11.0f, 21.0f)
                verticalLineTo(18.11f)
                lineTo(11.13f, 18.0f)
                curveTo(7.12f, 17.76f, 4.0f, 16.06f, 4.0f, 14.0f)
                moveTo(12.0f, 13.0f)
                curveTo(7.58f, 13.0f, 4.0f, 11.21f, 4.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 14.21f, 7.58f, 16.0f, 12.0f, 16.0f)
                curveTo(12.39f, 16.0f, 12.77f, 16.0f, 13.16f, 16.0f)
                lineTo(17.0f, 12.12f)
                curveTo(15.4f, 12.72f, 13.71f, 13.0f, 12.0f, 13.0f)
                moveTo(12.0f, 3.0f)
                curveTo(7.58f, 3.0f, 4.0f, 4.79f, 4.0f, 7.0f)
                curveTo(4.0f, 9.21f, 7.58f, 11.0f, 12.0f, 11.0f)
                curveTo(16.42f, 11.0f, 20.0f, 9.21f, 20.0f, 7.0f)
                curveTo(20.0f, 4.79f, 16.42f, 3.0f, 12.0f, 3.0f)
                moveTo(21.0f, 11.13f)
                curveTo(20.85f, 11.13f, 20.71f, 11.19f, 20.61f, 11.3f)
                lineTo(19.61f, 12.3f)
                lineTo(21.66f, 14.3f)
                lineTo(22.66f, 13.3f)
                curveTo(22.87f, 13.1f, 22.88f, 12.76f, 22.66f, 12.53f)
                lineTo(21.42f, 11.3f)
                curveTo(21.32f, 11.19f, 21.18f, 11.13f, 21.04f, 11.13f)
                moveTo(19.04f, 12.88f)
                lineTo(13.0f, 18.94f)
                verticalLineTo(21.0f)
                horizontalLineTo(15.06f)
                lineTo(21.12f, 14.93f)
                lineTo(19.04f, 12.88f)
                close()
            }
        }
        .build()
        return _databaseEdit!!
    }

private var _databaseEdit: ImageVector? = null
