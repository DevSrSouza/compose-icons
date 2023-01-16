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

public val MaterialDesignIcons.ArrowUDownLeftBold: ImageVector
    get() {
        if (_arrowUDownLeftBold != null) {
            return _arrowUDownLeftBold!!
        }
        _arrowUDownLeftBold = Builder(name = "ArrowUDownLeftBold", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 10.5f)
                verticalLineTo(18.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(10.5f)
                curveTo(17.0f, 8.57f, 15.43f, 7.0f, 13.5f, 7.0f)
                reflectiveCurveTo(10.0f, 8.57f, 10.0f, 10.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(14.0f)
                lineTo(8.0f, 20.0f)
                lineTo(2.0f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.5f)
                curveTo(6.0f, 6.36f, 9.36f, 3.0f, 13.5f, 3.0f)
                reflectiveCurveTo(21.0f, 6.36f, 21.0f, 10.5f)
                close()
            }
        }
        .build()
        return _arrowUDownLeftBold!!
    }

private var _arrowUDownLeftBold: ImageVector? = null
