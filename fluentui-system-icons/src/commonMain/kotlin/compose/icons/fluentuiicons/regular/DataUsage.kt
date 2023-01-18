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

public val RegularGroup.DataUsage: ImageVector
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
                moveTo(18.25f, 4.4961f)
                horizontalLineTo(5.75f)
                curveTo(5.0596f, 4.4961f, 4.5f, 5.0557f, 4.5f, 5.7461f)
                verticalLineTo(18.2461f)
                curveTo(4.5f, 18.9364f, 5.0596f, 19.4961f, 5.75f, 19.4961f)
                horizontalLineTo(18.25f)
                curveTo(18.9404f, 19.4961f, 19.5f, 18.9364f, 19.5f, 18.2461f)
                verticalLineTo(5.7461f)
                curveTo(19.5f, 5.0557f, 18.9404f, 4.4961f, 18.25f, 4.4961f)
                close()
                moveTo(7.75f, 8.9994f)
                curveTo(8.1297f, 8.9994f, 8.4435f, 9.2803f, 8.4931f, 9.6448f)
                lineTo(8.5f, 9.7462f)
                verticalLineTo(16.2526f)
                curveTo(8.5f, 16.6651f, 8.1642f, 16.9994f, 7.75f, 16.9994f)
                curveTo(7.3703f, 16.9994f, 7.0565f, 16.7185f, 7.0068f, 16.354f)
                lineTo(7.0f, 16.2526f)
                verticalLineTo(9.7462f)
                curveTo(7.0f, 9.3337f, 7.3358f, 8.9994f, 7.75f, 8.9994f)
                close()
                moveTo(16.25f, 6.9994f)
                curveTo(16.6297f, 6.9994f, 16.9435f, 7.2738f, 16.9932f, 7.6298f)
                lineTo(17.0f, 7.7288f)
                verticalLineTo(16.27f)
                curveTo(17.0f, 16.6728f, 16.6642f, 16.9994f, 16.25f, 16.9994f)
                curveTo(15.8703f, 16.9994f, 15.5565f, 16.725f, 15.5068f, 16.369f)
                lineTo(15.5f, 16.27f)
                verticalLineTo(7.7288f)
                curveTo(15.5f, 7.326f, 15.8358f, 6.9994f, 16.25f, 6.9994f)
                close()
                moveTo(11.9751f, 11.9961f)
                curveTo(12.3458f, 11.9925f, 12.6549f, 12.2628f, 12.707f, 12.6168f)
                lineTo(12.7146f, 12.7153f)
                lineTo(12.75f, 16.2626f)
                curveTo(12.754f, 16.6637f, 12.4293f, 16.9921f, 12.0249f, 16.9962f)
                curveTo(11.6542f, 16.9997f, 11.3451f, 16.7295f, 11.293f, 16.3755f)
                lineTo(11.2854f, 16.277f)
                lineTo(11.25f, 12.7296f)
                curveTo(11.246f, 12.3285f, 11.5707f, 12.0001f, 11.9751f, 11.9961f)
                close()
            }
        }
        .build()
        return _dataUsage!!
    }

private var _dataUsage: ImageVector? = null
