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

public val MaterialDesignIcons.DatabaseArrowLeft: ImageVector
    get() {
        if (_databaseArrowLeft != null) {
            return _databaseArrowLeft!!
        }
        _databaseArrowLeft = Builder(name = "DatabaseArrowLeft", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(4.0f, 7.0f)
                curveTo(4.0f, 4.79f, 7.58f, 3.0f, 12.0f, 3.0f)
                reflectiveCurveTo(20.0f, 4.79f, 20.0f, 7.0f)
                reflectiveCurveTo(16.42f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(4.0f, 9.21f, 4.0f, 7.0f)
                moveTo(19.72f, 13.05f)
                curveTo(19.9f, 12.71f, 20.0f, 12.36f, 20.0f, 12.0f)
                verticalLineTo(9.0f)
                curveTo(20.0f, 11.21f, 16.42f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(4.0f, 11.21f, 4.0f, 9.0f)
                verticalLineTo(12.0f)
                curveTo(4.0f, 14.21f, 7.58f, 16.0f, 12.0f, 16.0f)
                curveTo(12.65f, 16.0f, 13.28f, 15.96f, 13.88f, 15.89f)
                curveTo(14.93f, 14.16f, 16.83f, 13.0f, 19.0f, 13.0f)
                curveTo(19.24f, 13.0f, 19.5f, 13.0f, 19.72f, 13.05f)
                moveTo(13.1f, 17.96f)
                curveTo(12.74f, 18.0f, 12.37f, 18.0f, 12.0f, 18.0f)
                curveTo(7.58f, 18.0f, 4.0f, 16.21f, 4.0f, 14.0f)
                verticalLineTo(17.0f)
                curveTo(4.0f, 19.21f, 7.58f, 21.0f, 12.0f, 21.0f)
                curveTo(12.46f, 21.0f, 12.9f, 21.0f, 13.33f, 20.94f)
                curveTo(13.12f, 20.33f, 13.0f, 19.68f, 13.0f, 19.0f)
                curveTo(13.0f, 18.64f, 13.04f, 18.3f, 13.1f, 17.96f)
                moveTo(18.0f, 18.0f)
                verticalLineTo(16.0f)
                lineTo(15.0f, 19.0f)
                lineTo(18.0f, 22.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(18.0f)
                close()
            }
        }
        .build()
        return _databaseArrowLeft!!
    }

private var _databaseArrowLeft: ImageVector? = null
