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

public val FilledGroup.PortHdmi: ImageVector
    get() {
        if (_portHdmi != null) {
            return _portHdmi!!
        }
        _portHdmi = Builder(name = "PortHdmi", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.41f, 11.41f)
                lineTo(18.59f, 8.59f)
                curveTo(18.4037f, 8.4031f, 18.1824f, 8.2548f, 17.9388f, 8.1536f)
                curveTo(17.6951f, 8.0523f, 17.4339f, 8.0001f, 17.17f, 8.0f)
                horizontalLineTo(6.83f)
                curveTo(6.5661f, 8.0001f, 6.3049f, 8.0523f, 6.0612f, 8.1536f)
                curveTo(5.8176f, 8.2548f, 5.5963f, 8.4031f, 5.41f, 8.59f)
                lineTo(2.59f, 11.41f)
                curveTo(2.4031f, 11.5963f, 2.2548f, 11.8176f, 2.1535f, 12.0612f)
                curveTo(2.0523f, 12.3049f, 2.0001f, 12.5661f, 2.0f, 12.83f)
                verticalLineTo(14.0f)
                curveTo(2.0016f, 14.53f, 2.2128f, 15.0378f, 2.5875f, 15.4125f)
                curveTo(2.9622f, 15.7872f, 3.4701f, 15.9984f, 4.0f, 16.0f)
                horizontalLineTo(20.0f)
                curveTo(20.53f, 15.9984f, 21.0378f, 15.7872f, 21.4125f, 15.4125f)
                curveTo(21.7872f, 15.0378f, 21.9984f, 14.53f, 22.0f, 14.0f)
                verticalLineTo(12.83f)
                curveTo(21.9999f, 12.5661f, 21.9477f, 12.3049f, 21.8465f, 12.0612f)
                curveTo(21.7452f, 11.8176f, 21.5969f, 11.5963f, 21.41f, 11.41f)
                close()
                moveTo(17.0f, 12.0f)
                curveTo(16.9986f, 12.1985f, 16.9191f, 12.3884f, 16.7787f, 12.5287f)
                curveTo(16.6384f, 12.6691f, 16.4485f, 12.7486f, 16.25f, 12.75f)
                horizontalLineTo(7.75f)
                curveTo(7.5511f, 12.75f, 7.3603f, 12.671f, 7.2197f, 12.5303f)
                curveTo(7.079f, 12.3897f, 7.0f, 12.1989f, 7.0f, 12.0f)
                curveTo(7.0f, 11.8011f, 7.079f, 11.6103f, 7.2197f, 11.4697f)
                curveTo(7.3603f, 11.329f, 7.5511f, 11.25f, 7.75f, 11.25f)
                horizontalLineTo(16.25f)
                curveTo(16.4485f, 11.2514f, 16.6384f, 11.3309f, 16.7788f, 11.4712f)
                curveTo(16.9191f, 11.6116f, 16.9986f, 11.8015f, 17.0f, 12.0f)
                close()
            }
        }
        .build()
        return _portHdmi!!
    }

private var _portHdmi: ImageVector? = null
