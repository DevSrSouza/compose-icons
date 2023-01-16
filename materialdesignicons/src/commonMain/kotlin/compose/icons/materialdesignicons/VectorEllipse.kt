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

public val MaterialDesignIcons.VectorEllipse: ImageVector
    get() {
        if (_vectorEllipse != null) {
            return _vectorEllipse!!
        }
        _vectorEllipse = Builder(name = "VectorEllipse", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(23.0f, 9.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.35f)
                curveTo(19.38f, 17.12f, 17.43f, 18.78f, 15.0f, 19.54f)
                verticalLineTo(22.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(19.54f)
                curveTo(5.5f, 18.45f, 3.0f, 15.5f, 3.0f, 12.0f)
                curveTo(3.0f, 7.58f, 7.03f, 4.0f, 12.0f, 4.0f)
                curveTo(15.78f, 4.0f, 19.0f, 6.07f, 20.35f, 9.0f)
                horizontalLineTo(23.0f)
                moveTo(17.0f, 15.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(18.06f)
                curveTo(16.85f, 7.21f, 14.59f, 6.0f, 12.0f, 6.0f)
                curveTo(8.13f, 6.0f, 5.0f, 8.69f, 5.0f, 12.0f)
                curveTo(5.0f, 14.39f, 6.64f, 16.46f, 9.0f, 17.42f)
                verticalLineTo(16.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(17.42f)
                curveTo(16.29f, 16.9f, 17.35f, 16.05f, 18.06f, 15.0f)
                horizontalLineTo(17.0f)
                moveTo(19.0f, 13.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(11.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(13.0f)
                moveTo(11.0f, 20.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(20.0f)
                close()
            }
        }
        .build()
        return _vectorEllipse!!
    }

private var _vectorEllipse: ImageVector? = null
