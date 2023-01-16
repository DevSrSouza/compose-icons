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

public val MaterialDesignIcons.FilePowerpointBox: ImageVector
    get() {
        if (_filePowerpointBox != null) {
            return _filePowerpointBox!!
        }
        _filePowerpointBox = Builder(name = "FilePowerpointBox", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.8f, 13.4f)
                horizontalLineTo(12.3f)
                curveTo(13.8f, 13.4f, 14.46f, 13.12f, 15.1f, 12.58f)
                curveTo(15.74f, 12.03f, 16.0f, 11.25f, 16.0f, 10.23f)
                curveTo(16.0f, 9.26f, 15.75f, 8.5f, 15.1f, 7.88f)
                curveTo(14.45f, 7.29f, 13.83f, 7.0f, 12.3f, 7.0f)
                horizontalLineTo(8.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(9.8f)
                verticalLineTo(13.4f)
                moveTo(19.0f, 3.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 21.0f, 5.0f)
                verticalLineTo(19.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 19.0f, 21.0f)
                horizontalLineTo(5.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 3.0f, 19.0f)
                verticalLineTo(5.0f)
                curveTo(3.0f, 3.89f, 3.9f, 3.0f, 5.0f, 3.0f)
                horizontalLineTo(19.0f)
                moveTo(9.8f, 12.0f)
                verticalLineTo(8.4f)
                horizontalLineTo(12.1f)
                curveTo(12.76f, 8.4f, 13.27f, 8.65f, 13.6f, 9.0f)
                curveTo(13.93f, 9.35f, 14.1f, 9.72f, 14.1f, 10.24f)
                curveTo(14.1f, 10.8f, 13.92f, 11.19f, 13.6f, 11.5f)
                curveTo(13.28f, 11.81f, 12.9f, 12.0f, 12.22f, 12.0f)
                horizontalLineTo(9.8f)
                close()
            }
        }
        .build()
        return _filePowerpointBox!!
    }

private var _filePowerpointBox: ImageVector? = null
