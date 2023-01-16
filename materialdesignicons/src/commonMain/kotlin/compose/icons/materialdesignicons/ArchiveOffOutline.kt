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

public val MaterialDesignIcons.ArchiveOffOutline: ImageVector
    get() {
        if (_archiveOffOutline != null) {
            return _archiveOffOutline!!
        }
        _archiveOffOutline = Builder(name = "ArchiveOffOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(8.2f, 5.0f)
                lineTo(6.2f, 3.0f)
                horizontalLineTo(21.0f)
                verticalLineTo(9.0f)
                horizontalLineTo(12.2f)
                lineTo(10.2f, 7.0f)
                horizontalLineTo(19.0f)
                verticalLineTo(5.0f)
                horizontalLineTo(8.2f)
                moveTo(20.0f, 16.8f)
                verticalLineTo(10.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(14.8f)
                lineTo(20.0f, 16.8f)
                moveTo(20.0f, 19.35f)
                verticalLineTo(19.34f)
                lineTo(18.0f, 17.34f)
                verticalLineTo(17.35f)
                lineTo(9.66f, 9.0f)
                horizontalLineTo(9.66f)
                lineTo(7.66f, 7.0f)
                horizontalLineTo(7.66f)
                lineTo(6.13f, 5.47f)
                lineTo(2.39f, 1.73f)
                lineTo(1.11f, 3.0f)
                lineTo(3.0f, 4.89f)
                verticalLineTo(9.0f)
                horizontalLineTo(7.11f)
                lineTo(17.11f, 19.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(21.0f)
                horizontalLineTo(19.11f)
                lineTo(20.84f, 22.73f)
                lineTo(22.11f, 21.46f)
                lineTo(20.0f, 19.35f)
                close()
            }
        }
        .build()
        return _archiveOffOutline!!
    }

private var _archiveOffOutline: ImageVector? = null
