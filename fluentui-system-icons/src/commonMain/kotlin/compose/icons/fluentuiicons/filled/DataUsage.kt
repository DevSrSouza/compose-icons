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

public val FilledGroup.DataUsage: ImageVector
    get() {
        if (_dataUsage != null) {
            return _dataUsage!!
        }
        _dataUsage = Builder(name = "DataUsage", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.25f, 2.9961f)
                curveTo(19.7688f, 2.9961f, 21.0f, 4.2273f, 21.0f, 5.7461f)
                verticalLineTo(18.2461f)
                curveTo(21.0f, 19.7649f, 19.7688f, 20.9961f, 18.25f, 20.9961f)
                horizontalLineTo(5.75f)
                curveTo(4.2312f, 20.9961f, 3.0f, 19.7649f, 3.0f, 18.2461f)
                verticalLineTo(5.7461f)
                curveTo(3.0f, 4.2273f, 4.2312f, 2.9961f, 5.75f, 2.9961f)
                horizontalLineTo(18.25f)
                close()
                moveTo(7.75f, 8.9994f)
                curveTo(7.3358f, 8.9994f, 7.0f, 9.3337f, 7.0f, 9.7462f)
                verticalLineTo(16.2526f)
                curveTo(7.0f, 16.6651f, 7.3358f, 16.9994f, 7.75f, 16.9994f)
                curveTo(8.1642f, 16.9994f, 8.5f, 16.6651f, 8.5f, 16.2526f)
                verticalLineTo(9.7462f)
                curveTo(8.5f, 9.3337f, 8.1642f, 8.9994f, 7.75f, 8.9994f)
                close()
                moveTo(16.25f, 6.9994f)
                curveTo(15.8358f, 6.9994f, 15.5f, 7.326f, 15.5f, 7.7288f)
                verticalLineTo(16.27f)
                curveTo(15.5f, 16.6728f, 15.8358f, 16.9994f, 16.25f, 16.9994f)
                curveTo(16.6642f, 16.9994f, 17.0f, 16.6728f, 17.0f, 16.27f)
                verticalLineTo(7.7288f)
                curveTo(17.0f, 7.326f, 16.6642f, 6.9994f, 16.25f, 6.9994f)
                close()
                moveTo(11.9751f, 11.9961f)
                curveTo(11.5707f, 12.0001f, 11.246f, 12.3285f, 11.25f, 12.7296f)
                lineTo(11.2854f, 16.277f)
                curveTo(11.2894f, 16.6781f, 11.6205f, 17.0001f, 12.0249f, 16.9962f)
                curveTo(12.4293f, 16.9921f, 12.754f, 16.6637f, 12.75f, 16.2626f)
                lineTo(12.7146f, 12.7153f)
                curveTo(12.7106f, 12.3142f, 12.3795f, 11.9922f, 11.9751f, 11.9961f)
                close()
            }
        }
        .build()
        return _dataUsage!!
    }

private var _dataUsage: ImageVector? = null
