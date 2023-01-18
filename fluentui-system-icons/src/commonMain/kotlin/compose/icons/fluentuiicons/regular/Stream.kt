package compose.icons.fluentuiicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fluentuiicons.RegularGroup

public val RegularGroup.Stream: ImageVector
    get() {
        if (_stream != null) {
            return _stream!!
        }
        _stream = Builder(name = "Stream", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.0f, 11.0f)
                curveTo(9.0f, 6.8579f, 12.3579f, 3.5f, 16.5f, 3.5f)
                horizontalLineTo(16.5948f)
                curveTo(17.009f, 3.5f, 17.3448f, 3.1642f, 17.3448f, 2.75f)
                curveTo(17.3448f, 2.3358f, 17.009f, 2.0f, 16.5948f, 2.0f)
                horizontalLineTo(16.5f)
                curveTo(11.5294f, 2.0f, 7.5f, 6.0294f, 7.5f, 11.0f)
                verticalLineTo(12.25f)
                curveTo(7.5f, 12.9404f, 6.9404f, 13.5f, 6.25f, 13.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 13.5f, 2.0f, 13.8358f, 2.0f, 14.25f)
                curveTo(2.0f, 14.6642f, 2.3358f, 15.0f, 2.75f, 15.0f)
                horizontalLineTo(6.25f)
                curveTo(7.7688f, 15.0f, 9.0f, 13.7688f, 9.0f, 12.25f)
                verticalLineTo(11.0f)
                close()
                moveTo(16.75f, 7.0f)
                curveTo(14.4028f, 7.0f, 12.5f, 8.9028f, 12.5f, 11.25f)
                verticalLineTo(12.75f)
                curveTo(12.5f, 15.9256f, 9.9256f, 18.5f, 6.75f, 18.5f)
                horizontalLineTo(2.75f)
                curveTo(2.3358f, 18.5f, 2.0f, 18.1642f, 2.0f, 17.75f)
                curveTo(2.0f, 17.3358f, 2.3358f, 17.0f, 2.75f, 17.0f)
                horizontalLineTo(6.75f)
                curveTo(9.0972f, 17.0f, 11.0f, 15.0972f, 11.0f, 12.75f)
                verticalLineTo(11.25f)
                curveTo(11.0f, 8.0744f, 13.5744f, 5.5f, 16.75f, 5.5f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 5.5f, 22.0f, 5.8358f, 22.0f, 6.25f)
                curveTo(22.0f, 6.6642f, 21.6642f, 7.0f, 21.25f, 7.0f)
                horizontalLineTo(16.75f)
                close()
                moveTo(17.25f, 10.5f)
                curveTo(16.5596f, 10.5f, 16.0f, 11.0596f, 16.0f, 11.75f)
                verticalLineTo(13.0f)
                curveTo(16.0f, 17.9706f, 11.9706f, 22.0f, 7.0f, 22.0f)
                horizontalLineTo(6.75f)
                curveTo(6.3358f, 22.0f, 6.0f, 21.6642f, 6.0f, 21.25f)
                curveTo(6.0f, 20.8358f, 6.3358f, 20.5f, 6.75f, 20.5f)
                horizontalLineTo(7.0f)
                curveTo(11.1421f, 20.5f, 14.5f, 17.1421f, 14.5f, 13.0f)
                verticalLineTo(11.75f)
                curveTo(14.5f, 10.2312f, 15.7312f, 9.0f, 17.25f, 9.0f)
                horizontalLineTo(21.25f)
                curveTo(21.6642f, 9.0f, 22.0f, 9.3358f, 22.0f, 9.75f)
                curveTo(22.0f, 10.1642f, 21.6642f, 10.5f, 21.25f, 10.5f)
                horizontalLineTo(17.25f)
                close()
            }
        }
        .build()
        return _stream!!
    }

private var _stream: ImageVector? = null
