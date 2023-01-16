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

public val MaterialDesignIcons.ArchiveAlertOutline: ImageVector
    get() {
        if (_archiveAlertOutline != null) {
            return _archiveAlertOutline!!
        }
        _archiveAlertOutline = Builder(name = "ArchiveAlertOutline", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(2.0f, 4.0f)
                horizontalLineTo(18.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(2.0f)
                verticalLineTo(4.0f)
                moveTo(7.5f, 11.0f)
                horizontalLineTo(12.5f)
                curveTo(12.78f, 11.0f, 13.0f, 11.22f, 13.0f, 11.5f)
                verticalLineTo(13.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(11.5f)
                curveTo(7.0f, 11.22f, 7.22f, 11.0f, 7.5f, 11.0f)
                moveTo(20.0f, 13.0f)
                verticalLineTo(7.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(13.0f)
                horizontalLineTo(20.0f)
                moveTo(20.0f, 17.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(22.0f)
                verticalLineTo(17.0f)
                horizontalLineTo(20.0f)
                moveTo(3.0f, 8.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(18.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(8.0f)
                close()
            }
        }
        .build()
        return _archiveAlertOutline!!
    }

private var _archiveAlertOutline: ImageVector? = null
