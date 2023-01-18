package compose.icons.fluentuiicons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.FilledGroup

public val FilledGroup.ClipboardMonth: ImageVector
    get() {
        if (_clipboardMonth != null) {
            return _clipboardMonth!!
        }
        _clipboardMonth = Builder(name = "ClipboardMonth", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                horizontalLineTo(10.25f)
                curveTo(9.092f, 2.0f, 8.1384f, 2.8747f, 8.0138f, 3.9994f)
                lineTo(6.25f, 4.0f)
                curveTo(5.0074f, 4.0f, 4.0f, 5.0074f, 4.0f, 6.25f)
                verticalLineTo(19.75f)
                curveTo(4.0f, 20.9926f, 5.0074f, 22.0f, 6.25f, 22.0f)
                horizontalLineTo(17.75f)
                curveTo(18.9926f, 22.0f, 20.0f, 20.9926f, 20.0f, 19.75f)
                verticalLineTo(6.25f)
                curveTo(20.0f, 5.0074f, 18.9926f, 4.0f, 17.75f, 4.0f)
                lineTo(15.9862f, 3.9994f)
                curveTo(15.8616f, 2.8747f, 14.9079f, 2.0f, 13.75f, 2.0f)
                close()
                moveTo(10.25f, 3.5f)
                horizontalLineTo(13.75f)
                curveTo(14.1642f, 3.5f, 14.5f, 3.8358f, 14.5f, 4.25f)
                curveTo(14.5f, 4.6642f, 14.1642f, 5.0f, 13.75f, 5.0f)
                horizontalLineTo(10.25f)
                curveTo(9.8358f, 5.0f, 9.5f, 4.6642f, 9.5f, 4.25f)
                curveTo(9.5f, 3.8358f, 9.8358f, 3.5f, 10.25f, 3.5f)
                close()
                moveTo(8.25f, 12.5f)
                curveTo(7.5596f, 12.5f, 7.0f, 11.9404f, 7.0f, 11.25f)
                curveTo(7.0f, 10.5596f, 7.5596f, 10.0f, 8.25f, 10.0f)
                curveTo(8.9404f, 10.0f, 9.5f, 10.5596f, 9.5f, 11.25f)
                curveTo(9.5f, 11.9404f, 8.9404f, 12.5f, 8.25f, 12.5f)
                close()
                moveTo(8.25f, 16.5f)
                curveTo(7.5596f, 16.5f, 7.0f, 15.9404f, 7.0f, 15.25f)
                curveTo(7.0f, 14.5596f, 7.5596f, 14.0f, 8.25f, 14.0f)
                curveTo(8.9404f, 14.0f, 9.5f, 14.5596f, 9.5f, 15.25f)
                curveTo(9.5f, 15.9404f, 8.9404f, 16.5f, 8.25f, 16.5f)
                close()
                moveTo(17.5f, 11.25f)
                curveTo(17.5f, 11.9404f, 16.9404f, 12.5f, 16.25f, 12.5f)
                curveTo(15.5596f, 12.5f, 15.0f, 11.9404f, 15.0f, 11.25f)
                curveTo(15.0f, 10.5596f, 15.5596f, 10.0f, 16.25f, 10.0f)
                curveTo(16.9404f, 10.0f, 17.5f, 10.5596f, 17.5f, 11.25f)
                close()
                moveTo(12.25f, 12.5f)
                curveTo(11.5596f, 12.5f, 11.0f, 11.9404f, 11.0f, 11.25f)
                curveTo(11.0f, 10.5596f, 11.5596f, 10.0f, 12.25f, 10.0f)
                curveTo(12.9404f, 10.0f, 13.5f, 10.5596f, 13.5f, 11.25f)
                curveTo(13.5f, 11.9404f, 12.9404f, 12.5f, 12.25f, 12.5f)
                close()
                moveTo(13.5f, 15.25f)
                curveTo(13.5f, 15.9404f, 12.9404f, 16.5f, 12.25f, 16.5f)
                curveTo(11.5596f, 16.5f, 11.0f, 15.9404f, 11.0f, 15.25f)
                curveTo(11.0f, 14.5596f, 11.5596f, 14.0f, 12.25f, 14.0f)
                curveTo(12.9404f, 14.0f, 13.5f, 14.5596f, 13.5f, 15.25f)
                close()
            }
        }
        .build()
        return _clipboardMonth!!
    }

private var _clipboardMonth: ImageVector? = null
