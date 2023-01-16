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

public val MaterialDesignIcons.School: ImageVector
    get() {
        if (_school != null) {
            return _school!!
        }
        _school = Builder(name = "School", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                lineTo(1.0f, 9.0f)
                lineTo(12.0f, 15.0f)
                lineTo(21.0f, 10.09f)
                verticalLineTo(17.0f)
                horizontalLineTo(23.0f)
                verticalLineTo(9.0f)
                moveTo(5.0f, 13.18f)
                verticalLineTo(17.18f)
                lineTo(12.0f, 21.0f)
                lineTo(19.0f, 17.18f)
                verticalLineTo(13.18f)
                lineTo(12.0f, 17.0f)
                lineTo(5.0f, 13.18f)
                close()
            }
        }
        .build()
        return _school!!
    }

private var _school: ImageVector? = null
