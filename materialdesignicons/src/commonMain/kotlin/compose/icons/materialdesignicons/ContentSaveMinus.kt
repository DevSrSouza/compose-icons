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

public val MaterialDesignIcons.ContentSaveMinus: ImageVector
    get() {
        if (_contentSaveMinus != null) {
            return _contentSaveMinus!!
        }
        _contentSaveMinus = Builder(name = "ContentSaveMinus", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(17.0f, 3.0f)
                horizontalLineTo(5.0f)
                curveTo(3.89f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.11f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(12.81f)
                curveTo(12.45f, 20.38f, 12.2f, 19.7f, 12.08f, 19.0f)
                lineTo(12.0f, 19.0f)
                curveTo(10.34f, 19.0f, 9.0f, 17.66f, 9.0f, 16.0f)
                reflectiveCurveTo(10.34f, 13.0f, 12.0f, 13.0f)
                curveTo(12.68f, 13.0f, 13.34f, 13.23f, 13.87f, 13.65f)
                curveTo(15.0f, 12.59f, 16.46f, 12.0f, 18.0f, 12.0f)
                curveTo(19.05f, 12.0f, 20.09f, 12.28f, 21.0f, 12.81f)
                verticalLineTo(7.0f)
                lineTo(17.0f, 3.0f)
                moveTo(15.0f, 9.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(9.0f)
                moveTo(14.0f, 17.0f)
                verticalLineTo(19.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(14.0f)
                close()
            }
        }
        .build()
        return _contentSaveMinus!!
    }

private var _contentSaveMinus: ImageVector? = null
