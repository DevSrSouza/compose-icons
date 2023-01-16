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

public val MaterialDesignIcons.AccountTie: ImageVector
    get() {
        if (_accountTie != null) {
            return _accountTie!!
        }
        _accountTie = Builder(name = "AccountTie", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                curveTo(14.21f, 3.0f, 16.0f, 4.79f, 16.0f, 7.0f)
                reflectiveCurveTo(14.21f, 11.0f, 12.0f, 11.0f)
                reflectiveCurveTo(8.0f, 9.21f, 8.0f, 7.0f)
                reflectiveCurveTo(9.79f, 3.0f, 12.0f, 3.0f)
                moveTo(16.0f, 13.54f)
                curveTo(16.0f, 14.6f, 15.72f, 17.07f, 13.81f, 19.83f)
                lineTo(13.0f, 15.0f)
                lineTo(13.94f, 13.12f)
                curveTo(13.32f, 13.05f, 12.67f, 13.0f, 12.0f, 13.0f)
                reflectiveCurveTo(10.68f, 13.05f, 10.06f, 13.12f)
                lineTo(11.0f, 15.0f)
                lineTo(10.19f, 19.83f)
                curveTo(8.28f, 17.07f, 8.0f, 14.6f, 8.0f, 13.54f)
                curveTo(5.61f, 14.24f, 4.0f, 15.5f, 4.0f, 17.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(17.0f)
                curveTo(20.0f, 15.5f, 18.4f, 14.24f, 16.0f, 13.54f)
                close()
            }
        }
        .build()
        return _accountTie!!
    }

private var _accountTie: ImageVector? = null
