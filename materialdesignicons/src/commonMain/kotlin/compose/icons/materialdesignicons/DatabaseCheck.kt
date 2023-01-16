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

public val MaterialDesignIcons.DatabaseCheck: ImageVector
    get() {
        if (_databaseCheck != null) {
            return _databaseCheck!!
        }
        _databaseCheck = Builder(name = "DatabaseCheck", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(16.42f, 3.0f, 20.0f, 4.79f, 20.0f, 7.0f)
                reflectiveCurveTo(16.42f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(4.0f, 9.21f, 4.0f, 7.0f)
                reflectiveCurveTo(7.58f, 3.0f, 12.0f, 3.0f)
                moveTo(4.0f, 9.0f)
                curveTo(4.0f, 11.21f, 7.58f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(20.0f, 11.21f, 20.0f, 9.0f)
                verticalLineTo(12.08f)
                lineTo(19.0f, 12.0f)
                curveTo(16.41f, 12.0f, 14.2f, 13.64f, 13.36f, 15.94f)
                lineTo(12.0f, 16.0f)
                curveTo(7.58f, 16.0f, 4.0f, 14.21f, 4.0f, 12.0f)
                verticalLineTo(9.0f)
                moveTo(4.0f, 14.0f)
                curveTo(4.0f, 16.21f, 7.58f, 18.0f, 12.0f, 18.0f)
                horizontalLineTo(13.0f)
                curveTo(13.0f, 19.05f, 13.27f, 20.04f, 13.75f, 20.9f)
                lineTo(12.0f, 21.0f)
                curveTo(7.58f, 21.0f, 4.0f, 19.21f, 4.0f, 17.0f)
                verticalLineTo(14.0f)
                moveTo(18.0f, 21.08f)
                lineTo(15.25f, 18.08f)
                lineTo(16.41f, 16.92f)
                lineTo(18.0f, 18.5f)
                lineTo(21.59f, 14.92f)
                lineTo(22.75f, 16.33f)
                lineTo(18.0f, 21.08f)
            }
        }
        .build()
        return _databaseCheck!!
    }

private var _databaseCheck: ImageVector? = null
