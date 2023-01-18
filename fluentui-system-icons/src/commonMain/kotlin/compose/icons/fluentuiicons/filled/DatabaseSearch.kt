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

public val FilledGroup.DatabaseSearch: ImageVector
    get() {
        if (_databaseSearch != null) {
            return _databaseSearch!!
        }
        _databaseSearch = Builder(name = "DatabaseSearch", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
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
                verticalLineTo(12.2572f)
                curveTo(19.0491f, 11.4718f, 17.8296f, 11.0f, 16.5f, 11.0f)
                curveTo(16.3246f, 11.0f, 16.151f, 11.0082f, 15.9798f, 11.0243f)
                curveTo(16.8364f, 10.8073f, 17.6281f, 10.5198f, 18.3277f, 10.1701f)
                close()
                moveTo(11.0f, 16.5f)
                curveTo(11.0f, 18.9558f, 12.6095f, 21.0357f, 14.8312f, 21.7423f)
                curveTo(13.9511f, 21.9088f, 12.9968f, 22.0f, 12.0f, 22.0f)
                curveTo(7.5817f, 22.0f, 4.0f, 20.2091f, 4.0f, 18.0f)
                verticalLineTo(9.0534f)
                curveTo(4.5021f, 9.504f, 5.0844f, 9.8761f, 5.6723f, 10.1701f)
                curveTo(7.3692f, 11.0185f, 9.6085f, 11.5f, 12.0f, 11.5f)
                curveTo(12.9584f, 11.5f, 13.8923f, 11.4227f, 14.7766f, 11.2754f)
                curveTo(12.5832f, 11.9985f, 11.0f, 14.0644f, 11.0f, 16.5f)
                close()
                moveTo(16.5f, 21.0f)
                curveTo(17.4719f, 21.0f, 18.3718f, 20.6919f, 19.1074f, 20.1681f)
                lineTo(21.7197f, 22.7803f)
                curveTo(22.0126f, 23.0732f, 22.4874f, 23.0732f, 22.7803f, 22.7803f)
                curveTo(23.0732f, 22.4874f, 23.0732f, 22.0126f, 22.7803f, 21.7197f)
                lineTo(20.1681f, 19.1074f)
                curveTo(20.6919f, 18.3718f, 21.0f, 17.4719f, 21.0f, 16.5f)
                curveTo(21.0f, 14.0147f, 18.9853f, 12.0f, 16.5f, 12.0f)
                curveTo(14.0147f, 12.0f, 12.0f, 14.0147f, 12.0f, 16.5f)
                curveTo(12.0f, 18.9853f, 14.0147f, 21.0f, 16.5f, 21.0f)
                close()
                moveTo(16.5f, 19.5f)
                curveTo(14.8431f, 19.5f, 13.5f, 18.1569f, 13.5f, 16.5f)
                curveTo(13.5f, 14.8431f, 14.8431f, 13.5f, 16.5f, 13.5f)
                curveTo(18.1569f, 13.5f, 19.5f, 14.8431f, 19.5f, 16.5f)
                curveTo(19.5f, 18.1569f, 18.1569f, 19.5f, 16.5f, 19.5f)
                close()
            }
        }
        .build()
        return _databaseSearch!!
    }

private var _databaseSearch: ImageVector? = null
