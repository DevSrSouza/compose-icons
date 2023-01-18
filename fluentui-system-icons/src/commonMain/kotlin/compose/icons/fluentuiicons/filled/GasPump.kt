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

public val FilledGroup.GasPump: ImageVector
    get() {
        if (_gasPump != null) {
            return _gasPump!!
        }
        _gasPump = Builder(name = "GasPump", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(6.7501f, 3.0f)
                curveTo(5.2312f, 3.0f, 4.0f, 4.2312f, 4.0f, 5.75f)
                verticalLineTo(20.5f)
                horizontalLineTo(3.75f)
                curveTo(3.3358f, 20.5f, 3.0f, 20.8358f, 3.0f, 21.25f)
                curveTo(3.0f, 21.6642f, 3.3358f, 22.0f, 3.75f, 22.0f)
                horizontalLineTo(17.2502f)
                curveTo(17.6644f, 22.0f, 18.0002f, 21.6642f, 18.0002f, 21.25f)
                curveTo(18.0002f, 20.8358f, 17.6644f, 20.5f, 17.2502f, 20.5f)
                horizontalLineTo(17.0002f)
                verticalLineTo(18.6971f)
                curveTo(17.3763f, 18.8907f, 17.8029f, 19.0f, 18.255f, 19.0f)
                curveTo(19.771f, 19.0f, 21.0f, 17.771f, 21.0f, 16.255f)
                verticalLineTo(10.4167f)
                curveTo(21.0f, 9.8217f, 20.807f, 9.2427f, 20.45f, 8.7667f)
                lineTo(19.35f, 7.3f)
                curveTo(19.1014f, 6.9686f, 18.6313f, 6.9015f, 18.3f, 7.15f)
                curveTo(17.9686f, 7.3985f, 17.9014f, 7.8686f, 18.15f, 8.2f)
                lineTo(19.25f, 9.6667f)
                curveTo(19.4123f, 9.883f, 19.5f, 10.1462f, 19.5f, 10.4167f)
                verticalLineTo(16.255f)
                curveTo(19.5f, 16.9426f, 18.9426f, 17.5f, 18.255f, 17.5f)
                curveTo(17.5674f, 17.5f, 17.01f, 16.9426f, 17.01f, 16.255f)
                verticalLineTo(14.5f)
                curveTo(17.01f, 14.4587f, 17.0066f, 14.4182f, 17.0002f, 14.3787f)
                verticalLineTo(5.75f)
                curveTo(17.0002f, 4.2312f, 15.769f, 3.0f, 14.2502f, 3.0f)
                horizontalLineTo(6.7501f)
                close()
                moveTo(7.0001f, 6.75f)
                curveTo(7.0001f, 6.3358f, 7.3358f, 6.0f, 7.7501f, 6.0f)
                horizontalLineTo(13.2501f)
                curveTo(13.6644f, 6.0f, 14.0001f, 6.3358f, 14.0001f, 6.75f)
                verticalLineTo(10.25f)
                curveTo(14.0001f, 10.6642f, 13.6644f, 11.0f, 13.2501f, 11.0f)
                horizontalLineTo(7.7501f)
                curveTo(7.3358f, 11.0f, 7.0001f, 10.6642f, 7.0001f, 10.25f)
                verticalLineTo(6.75f)
                close()
            }
        }
        .build()
        return _gasPump!!
    }

private var _gasPump: ImageVector? = null
