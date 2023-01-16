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

public val MaterialDesignIcons.Linkedin: ImageVector
    get() {
        if (_linkedin != null) {
            return _linkedin!!
        }
        _linkedin = Builder(name = "Linkedin", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(18.5f, 18.5f)
                verticalLineTo(13.2f)
                arcTo(3.26f, 3.26f, 0.0f, false, false, 15.24f, 9.94f)
                curveTo(14.39f, 9.94f, 13.4f, 10.46f, 12.92f, 11.24f)
                verticalLineTo(10.13f)
                horizontalLineTo(10.13f)
                verticalLineTo(18.5f)
                horizontalLineTo(12.92f)
                verticalLineTo(13.57f)
                curveTo(12.92f, 12.8f, 13.54f, 12.17f, 14.31f, 12.17f)
                arcTo(1.4f, 1.4f, 0.0f, false, true, 15.71f, 13.57f)
                verticalLineTo(18.5f)
                horizontalLineTo(18.5f)
                moveTo(6.88f, 8.56f)
                arcTo(1.68f, 1.68f, 0.0f, false, false, 8.56f, 6.88f)
                curveTo(8.56f, 5.95f, 7.81f, 5.19f, 6.88f, 5.19f)
                arcTo(1.69f, 1.69f, 0.0f, false, false, 5.19f, 6.88f)
                curveTo(5.19f, 7.81f, 5.95f, 8.56f, 6.88f, 8.56f)
                moveTo(8.27f, 18.5f)
                verticalLineTo(10.13f)
                horizontalLineTo(5.5f)
                verticalLineTo(18.5f)
                horizontalLineTo(8.27f)
                close()
            }
        }
        .build()
        return _linkedin!!
    }

private var _linkedin: ImageVector? = null
