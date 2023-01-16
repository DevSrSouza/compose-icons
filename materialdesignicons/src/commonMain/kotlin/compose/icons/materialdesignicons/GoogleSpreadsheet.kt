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

public val MaterialDesignIcons.GoogleSpreadsheet: ImageVector
    get() {
        if (_googleSpreadsheet != null) {
            return _googleSpreadsheet!!
        }
        _googleSpreadsheet = Builder(name = "GoogleSpreadsheet", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 11.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                moveTo(19.0f, 3.0f)
                curveTo(19.5f, 3.0f, 20.0f, 3.2f, 20.39f, 3.61f)
                curveTo(20.8f, 4.0f, 21.0f, 4.5f, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(21.0f, 19.5f, 20.8f, 20.0f, 20.39f, 20.39f)
                curveTo(20.0f, 20.8f, 19.5f, 21.0f, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                curveTo(4.5f, 21.0f, 4.0f, 20.8f, 3.61f, 20.39f)
                curveTo(3.2f, 20.0f, 3.0f, 19.5f, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 4.5f, 3.2f, 4.0f, 3.61f, 3.61f)
                curveTo(4.0f, 3.2f, 4.5f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                close()
            }
        }
        .build()
        return _googleSpreadsheet!!
    }

private var _googleSpreadsheet: ImageVector? = null
