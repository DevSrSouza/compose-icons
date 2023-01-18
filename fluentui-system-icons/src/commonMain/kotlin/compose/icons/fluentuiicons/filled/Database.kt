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

public val FilledGroup.Database: ImageVector
    get() {
        if (_database != null) {
            return _database!!
        }
        _database = Builder(name = "Database", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(12.0f, 10.0f)
                curveTo(16.4183f, 10.0f, 20.0f, 8.2091f, 20.0f, 6.0f)
                curveTo(20.0f, 3.7909f, 16.4183f, 2.0f, 12.0f, 2.0f)
                curveTo(7.5817f, 2.0f, 4.0f, 3.7909f, 4.0f, 6.0f)
                curveTo(4.0f, 8.2091f, 7.5817f, 10.0f, 12.0f, 10.0f)
                close()
                moveTo(18.3277f, 10.1701f)
                curveTo(18.9156f, 9.8761f, 19.4979f, 9.504f, 20.0f, 9.0534f)
                verticalLineTo(18.0f)
                curveTo(20.0f, 20.2091f, 16.4183f, 22.0f, 12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 20.2091f, 4.0f, 18.0f)
                verticalLineTo(9.0534f)
                curveTo(4.5021f, 9.504f, 5.0844f, 9.8761f, 5.6723f, 10.1701f)
                curveTo(7.3692f, 11.0185f, 9.6085f, 11.5f, 12.0f, 11.5f)
                curveTo(14.3915f, 11.5f, 16.6308f, 11.0185f, 18.3277f, 10.1701f)
                close()
            }
        }
        .build()
        return _database!!
    }

private var _database: ImageVector? = null
