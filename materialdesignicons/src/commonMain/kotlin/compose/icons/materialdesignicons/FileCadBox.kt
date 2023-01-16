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

public val MaterialDesignIcons.FileCadBox: ImageVector
    get() {
        if (_fileCadBox != null) {
            return _fileCadBox!!
        }
        _fileCadBox = Builder(name = "FileCadBox", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(5.0f, 3.0f)
                curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f)
                verticalLineTo(19.0f)
                curveTo(3.0f, 20.1f, 3.9f, 21.0f, 5.0f, 21.0f)
                horizontalLineTo(19.0f)
                curveTo(20.1f, 21.0f, 21.0f, 20.1f, 21.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f)
                moveTo(11.25f, 5.25f)
                horizontalLineTo(12.75f)
                verticalLineTo(6.38f)
                curveTo(13.58f, 6.38f, 14.25f, 7.05f, 14.25f, 7.88f)
                verticalLineTo(10.37f)
                lineTo(14.11f, 10.5f)
                lineTo(15.18f, 12.36f)
                curveTo(15.55f, 11.76f, 15.75f, 11.07f, 15.75f, 10.36f)
                horizontalLineTo(17.25f)
                curveTo(17.26f, 11.61f, 16.81f, 12.82f, 16.0f, 13.77f)
                lineTo(18.0f, 17.25f)
                verticalLineTo(18.75f)
                lineTo(16.7f, 18.0f)
                lineTo(14.84f, 14.78f)
                curveTo(13.12f, 15.91f, 10.89f, 15.91f, 9.16f, 14.78f)
                lineTo(7.3f, 18.0f)
                lineTo(6.0f, 18.75f)
                verticalLineTo(17.25f)
                lineTo(9.89f, 10.5f)
                lineTo(9.75f, 10.37f)
                verticalLineTo(7.88f)
                curveTo(9.75f, 7.05f, 10.42f, 6.38f, 11.25f, 6.38f)
                moveTo(12.0f, 7.88f)
                curveTo(11.16f, 7.88f, 10.74f, 8.9f, 11.34f, 9.5f)
                curveTo(11.94f, 10.08f, 12.95f, 9.65f, 12.94f, 8.81f)
                curveTo(12.94f, 8.29f, 12.5f, 7.88f, 12.0f, 7.88f)
                moveTo(11.0f, 11.6f)
                lineTo(9.91f, 13.5f)
                curveTo(11.17f, 14.36f, 12.83f, 14.36f, 14.09f, 13.5f)
                lineTo(13.0f, 11.6f)
                curveTo(12.43f, 12.11f, 11.57f, 12.11f, 11.0f, 11.6f)
                close()
            }
        }
        .build()
        return _fileCadBox!!
    }

private var _fileCadBox: ImageVector? = null
