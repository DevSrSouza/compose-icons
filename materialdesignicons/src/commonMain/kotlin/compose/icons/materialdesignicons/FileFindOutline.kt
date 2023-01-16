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

public val MaterialDesignIcons.FileFindOutline: ImageVector
    get() {
        if (_fileFindOutline != null) {
            return _fileFindOutline!!
        }
        _fileFindOutline = Builder(name = "FileFindOutline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.0f, 2.0f)
                horizontalLineTo(6.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 4.0f, 4.0f)
                verticalLineTo(20.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 6.0f, 22.0f)
                horizontalLineTo(18.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 20.0f, 20.0f)
                verticalLineTo(8.0f)
                lineTo(14.0f, 2.0f)
                moveTo(6.0f, 4.0f)
                horizontalLineTo(13.0f)
                lineTo(18.0f, 9.0f)
                verticalLineTo(17.58f)
                lineTo(16.16f, 15.74f)
                curveTo(17.44f, 13.8f, 17.23f, 11.17f, 15.5f, 9.46f)
                curveTo(14.55f, 8.5f, 13.28f, 8.0f, 12.0f, 8.0f)
                curveTo(10.72f, 8.0f, 9.45f, 8.5f, 8.47f, 9.46f)
                curveTo(6.5f, 11.41f, 6.5f, 14.57f, 8.47f, 16.5f)
                curveTo(9.44f, 17.5f, 10.72f, 17.97f, 12.0f, 17.97f)
                curveTo(12.96f, 17.97f, 13.92f, 17.69f, 14.75f, 17.14f)
                lineTo(17.6f, 20.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(4.0f)
                moveTo(14.11f, 15.1f)
                curveTo(13.55f, 15.66f, 12.8f, 16.0f, 12.0f, 16.0f)
                curveTo(11.2f, 16.0f, 10.45f, 15.67f, 9.89f, 15.1f)
                curveTo(9.33f, 14.54f, 9.0f, 13.79f, 9.0f, 13.0f)
                curveTo(9.0f, 12.19f, 9.32f, 11.44f, 9.89f, 10.88f)
                curveTo(10.45f, 10.31f, 11.2f, 10.0f, 12.0f, 10.0f)
                curveTo(12.8f, 10.0f, 13.55f, 10.31f, 14.11f, 10.88f)
                curveTo(14.67f, 11.44f, 15.0f, 12.19f, 15.0f, 13.0f)
                curveTo(15.0f, 13.79f, 14.68f, 14.54f, 14.11f, 15.1f)
                close()
            }
        }
        .build()
        return _fileFindOutline!!
    }

private var _fileFindOutline: ImageVector? = null
