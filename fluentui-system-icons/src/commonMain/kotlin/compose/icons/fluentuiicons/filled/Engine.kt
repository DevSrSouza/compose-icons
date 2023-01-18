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

public val FilledGroup.Engine: ImageVector
    get() {
        if (_engine != null) {
            return _engine!!
        }
        _engine = Builder(name = "Engine", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(9.75f, 3.0f)
                curveTo(10.1642f, 3.0f, 10.5f, 3.3358f, 10.5f, 3.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(12.5f)
                verticalLineTo(3.75f)
                curveTo(12.5f, 3.3358f, 12.8358f, 3.0f, 13.25f, 3.0f)
                curveTo(13.6642f, 3.0f, 14.0f, 3.3358f, 14.0f, 3.75f)
                verticalLineTo(5.0f)
                horizontalLineTo(16.75f)
                curveTo(17.0567f, 5.0f, 17.3325f, 5.1867f, 17.4464f, 5.4715f)
                lineTo(18.2578f, 7.5f)
                horizontalLineTo(19.25f)
                curveTo(20.7688f, 7.5f, 22.0f, 8.7312f, 22.0f, 10.25f)
                verticalLineTo(15.75f)
                curveTo(22.0f, 17.2688f, 20.7688f, 18.5f, 19.25f, 18.5f)
                horizontalLineTo(18.2578f)
                lineTo(17.4464f, 20.5285f)
                curveTo(17.3325f, 20.8133f, 17.0567f, 21.0f, 16.75f, 21.0f)
                horizontalLineTo(9.25f)
                curveTo(9.0421f, 21.0f, 8.8435f, 20.9137f, 8.7017f, 20.7617f)
                lineTo(5.7396f, 17.588f)
                curveTo(5.2643f, 17.0788f, 5.0f, 16.4082f, 5.0f, 15.7117f)
                lineTo(5.0f, 12.5f)
                horizontalLineTo(3.5f)
                verticalLineTo(16.25f)
                curveTo(3.5f, 16.6642f, 3.1642f, 17.0f, 2.75f, 17.0f)
                curveTo(2.3358f, 17.0f, 2.0f, 16.6642f, 2.0f, 16.25f)
                verticalLineTo(7.75f)
                curveTo(2.0f, 7.3358f, 2.3358f, 7.0f, 2.75f, 7.0f)
                curveTo(3.1642f, 7.0f, 3.5f, 7.3358f, 3.5f, 7.75f)
                verticalLineTo(11.0f)
                horizontalLineTo(5.0f)
                verticalLineTo(7.75f)
                curveTo(5.0f, 6.2312f, 6.2312f, 5.0f, 7.75f, 5.0f)
                horizontalLineTo(9.0f)
                verticalLineTo(3.75f)
                curveTo(9.0f, 3.3358f, 9.3358f, 3.0f, 9.75f, 3.0f)
                close()
                moveTo(10.5f, 9.75f)
                curveTo(10.5f, 9.3358f, 10.1642f, 9.0f, 9.75f, 9.0f)
                curveTo(9.3358f, 9.0f, 9.0f, 9.3358f, 9.0f, 9.75f)
                verticalLineTo(12.25f)
                curveTo(9.0f, 13.7688f, 10.2312f, 15.0f, 11.75f, 15.0f)
                horizontalLineTo(18.25f)
                curveTo(18.6642f, 15.0f, 19.0f, 14.6642f, 19.0f, 14.25f)
                curveTo(19.0f, 13.8358f, 18.6642f, 13.5f, 18.25f, 13.5f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.75f)
                curveTo(14.0f, 9.3358f, 13.6642f, 9.0f, 13.25f, 9.0f)
                curveTo(12.8358f, 9.0f, 12.5f, 9.3358f, 12.5f, 9.75f)
                verticalLineTo(13.5f)
                horizontalLineTo(11.75f)
                curveTo(11.0596f, 13.5f, 10.5f, 12.9404f, 10.5f, 12.25f)
                verticalLineTo(9.75f)
                close()
            }
        }
        .build()
        return _engine!!
    }

private var _engine: ImageVector? = null
