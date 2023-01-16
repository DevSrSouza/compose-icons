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

public val MaterialDesignIcons.BackupRestore: ImageVector
    get() {
        if (_backupRestore != null) {
            return _backupRestore!!
        }
        _backupRestore = Builder(name = "BackupRestore", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 3.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 3.0f, 12.0f)
                horizontalLineTo(0.0f)
                lineTo(4.0f, 16.0f)
                lineTo(8.0f, 12.0f)
                horizontalLineTo(5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 5.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 19.0f, 12.0f)
                arcTo(7.0f, 7.0f, 0.0f, false, true, 12.0f, 19.0f)
                curveTo(10.5f, 19.0f, 9.09f, 18.5f, 7.94f, 17.7f)
                lineTo(6.5f, 19.14f)
                curveTo(8.04f, 20.3f, 9.94f, 21.0f, 12.0f, 21.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 21.0f, 12.0f)
                arcTo(9.0f, 9.0f, 0.0f, false, false, 12.0f, 3.0f)
                moveTo(14.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 10.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 10.0f, 12.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 12.0f, 14.0f)
                arcTo(2.0f, 2.0f, 0.0f, false, false, 14.0f, 12.0f)
                close()
            }
        }
        .build()
        return _backupRestore!!
    }

private var _backupRestore: ImageVector? = null
