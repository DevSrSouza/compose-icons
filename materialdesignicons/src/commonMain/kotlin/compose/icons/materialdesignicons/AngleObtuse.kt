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

public val MaterialDesignIcons.AngleObtuse: ImageVector
    get() {
        if (_angleObtuse != null) {
            return _angleObtuse!!
        }
        _angleObtuse = Builder(name = "AngleObtuse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 19.0f)
                horizontalLineTo(9.31f)
                lineTo(4.07f, 5.36f)
                lineTo(5.93f, 4.64f)
                lineTo(8.96f, 12.5f)
                curveTo(9.5f, 12.29f, 10.09f, 12.17f, 10.71f, 12.17f)
                verticalLineTo(12.17f)
                curveTo(13.38f, 12.17f, 15.56f, 14.34f, 15.58f, 17.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(19.0f)
                moveTo(10.69f, 17.0f)
                horizontalLineTo(13.58f)
                curveTo(13.56f, 15.42f, 12.3f, 14.17f, 10.71f, 14.17f)
                curveTo(10.34f, 14.17f, 10.0f, 14.24f, 9.67f, 14.36f)
                lineTo(10.69f, 17.0f)
                close()
            }
        }
        .build()
        return _angleObtuse!!
    }

private var _angleObtuse: ImageVector? = null
