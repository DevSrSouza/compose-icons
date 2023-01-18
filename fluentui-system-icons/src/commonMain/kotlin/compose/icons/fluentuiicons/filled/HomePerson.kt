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

public val FilledGroup.HomePerson: ImageVector
    get() {
        if (_homePerson != null) {
            return _homePerson!!
        }
        _homePerson = Builder(name = "HomePerson", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.4508f, 2.5327f)
                curveTo(12.6128f, 1.8257f, 11.3872f, 1.8257f, 10.5492f, 2.5327f)
                lineTo(3.7992f, 8.2272f)
                curveTo(3.2924f, 8.6547f, 3.0f, 9.284f, 3.0f, 9.947f)
                verticalLineTo(19.7499f)
                curveTo(3.0f, 20.7164f, 3.7835f, 21.4999f, 4.75f, 21.4999f)
                horizontalLineTo(7.75f)
                curveTo(8.7165f, 21.4999f, 9.5f, 20.7164f, 9.5f, 19.7499f)
                verticalLineTo(14.7499f)
                curveTo(9.5f, 14.3357f, 9.8358f, 13.9999f, 10.25f, 13.9999f)
                horizontalLineTo(13.75f)
                lineTo(13.7594f, 14.0f)
                horizontalLineTo(15.0354f)
                curveTo(15.2781f, 12.3039f, 16.7368f, 11.0f, 18.5f, 11.0f)
                curveTo(19.4793f, 11.0f, 20.3647f, 11.4022f, 21.0f, 12.0505f)
                verticalLineTo(9.947f)
                curveTo(21.0f, 9.284f, 20.7076f, 8.6547f, 20.2008f, 8.2272f)
                lineTo(13.4508f, 2.5327f)
                close()
                moveTo(21.0f, 14.5f)
                curveTo(21.0f, 15.8807f, 19.8807f, 17.0f, 18.5f, 17.0f)
                curveTo(17.1193f, 17.0f, 16.0f, 15.8807f, 16.0f, 14.5f)
                curveTo(16.0f, 13.1193f, 17.1193f, 12.0f, 18.5f, 12.0f)
                curveTo(19.8807f, 12.0f, 21.0f, 13.1193f, 21.0f, 14.5f)
                close()
                moveTo(23.0f, 19.875f)
                curveTo(23.0f, 21.4315f, 21.7143f, 23.0f, 18.5f, 23.0f)
                curveTo(15.2857f, 23.0f, 14.0f, 21.4374f, 14.0f, 19.875f)
                verticalLineTo(19.772f)
                curveTo(14.0f, 18.7929f, 14.7937f, 18.0f, 15.7727f, 18.0f)
                horizontalLineTo(21.2273f)
                curveTo(22.2063f, 18.0f, 23.0f, 18.793f, 23.0f, 19.772f)
                verticalLineTo(19.875f)
                close()
            }
        }
        .build()
        return _homePerson!!
    }

private var _homePerson: ImageVector? = null
