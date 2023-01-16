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

public val MaterialDesignIcons.ArchiveSettings: ImageVector
    get() {
        if (_archiveSettings != null) {
            return _archiveSettings!!
        }
        _archiveSettings = Builder(name = "ArchiveSettings", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.0f, 2.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(3.0f)
                verticalLineTo(2.0f)
                horizontalLineTo(21.0f)
                moveTo(4.0f, 7.0f)
                horizontalLineTo(20.0f)
                verticalLineTo(20.0f)
                horizontalLineTo(4.0f)
                verticalLineTo(7.0f)
                moveTo(9.0f, 12.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(10.5f)
                curveTo(15.0f, 10.22f, 14.78f, 10.0f, 14.5f, 10.0f)
                horizontalLineTo(9.5f)
                curveTo(9.22f, 10.0f, 9.0f, 10.22f, 9.0f, 10.5f)
                verticalLineTo(12.0f)
                moveTo(7.0f, 24.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(7.0f)
                verticalLineTo(24.0f)
                moveTo(11.0f, 24.0f)
                horizontalLineTo(13.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(11.0f)
                verticalLineTo(24.0f)
                moveTo(15.0f, 24.0f)
                horizontalLineTo(17.0f)
                verticalLineTo(22.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(24.0f)
                close()
            }
        }
        .build()
        return _archiveSettings!!
    }

private var _archiveSettings: ImageVector? = null
