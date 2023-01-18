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

public val RegularGroup.Games: ImageVector
    get() {
        if (_games != null) {
            return _games!!
        }
        _games = Builder(name = "Games", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.9979f, 5.0f)
                curveTo(18.8639f, 5.0f, 21.9979f, 8.134f, 21.9979f, 12.0f)
                curveTo(21.9979f, 15.7855f, 18.9931f, 18.8691f, 15.2385f, 18.9959f)
                lineTo(14.9979f, 19.0f)
                horizontalLineTo(9.0021f)
                curveTo(5.1361f, 19.0f, 2.0021f, 15.866f, 2.0021f, 12.0f)
                curveTo(2.0021f, 8.2146f, 5.0069f, 5.1309f, 8.7615f, 5.0041f)
                lineTo(9.0021f, 5.0f)
                horizontalLineTo(14.9979f)
                close()
                moveTo(14.9979f, 6.5f)
                horizontalLineTo(9.0021f)
                curveTo(5.9645f, 6.5f, 3.5021f, 8.9624f, 3.5021f, 12.0f)
                curveTo(3.5021f, 14.9635f, 5.8459f, 17.3795f, 8.7809f, 17.4956f)
                lineTo(9.0021f, 17.5f)
                horizontalLineTo(14.9979f)
                curveTo(18.0354f, 17.5f, 20.4979f, 15.0376f, 20.4979f, 12.0f)
                curveTo(20.4979f, 9.0365f, 18.1541f, 6.6205f, 15.2191f, 6.5044f)
                lineTo(14.9979f, 6.5f)
                close()
                moveTo(8.0f, 9.0f)
                curveTo(8.4142f, 9.0f, 8.75f, 9.3358f, 8.75f, 9.75f)
                lineTo(8.7491f, 11.248f)
                lineTo(10.25f, 11.2487f)
                curveTo(10.6642f, 11.2487f, 11.0f, 11.5845f, 11.0f, 11.9987f)
                curveTo(11.0f, 12.413f, 10.6642f, 12.7487f, 10.25f, 12.7487f)
                lineTo(8.7491f, 12.748f)
                lineTo(8.75f, 14.25f)
                curveTo(8.75f, 14.6642f, 8.4142f, 15.0f, 8.0f, 15.0f)
                curveTo(7.5858f, 15.0f, 7.25f, 14.6642f, 7.25f, 14.25f)
                lineTo(7.2491f, 12.748f)
                lineTo(5.75f, 12.7487f)
                curveTo(5.3358f, 12.7487f, 5.0f, 12.413f, 5.0f, 11.9987f)
                curveTo(5.0f, 11.5845f, 5.3358f, 11.2487f, 5.75f, 11.2487f)
                lineTo(7.2491f, 11.248f)
                lineTo(7.25f, 9.75f)
                curveTo(7.25f, 9.3358f, 7.5858f, 9.0f, 8.0f, 9.0f)
                close()
                moveTo(14.75f, 12.5f)
                curveTo(15.4403f, 12.5f, 16.0f, 13.0596f, 16.0f, 13.75f)
                curveTo(16.0f, 14.4404f, 15.4403f, 15.0f, 14.75f, 15.0f)
                curveTo(14.0596f, 15.0f, 13.5f, 14.4404f, 13.5f, 13.75f)
                curveTo(13.5f, 13.0596f, 14.0596f, 12.5f, 14.75f, 12.5f)
                close()
                moveTo(16.75f, 9.0f)
                curveTo(17.4403f, 9.0f, 18.0f, 9.5596f, 18.0f, 10.25f)
                curveTo(18.0f, 10.9404f, 17.4403f, 11.5f, 16.75f, 11.5f)
                curveTo(16.0596f, 11.5f, 15.5f, 10.9404f, 15.5f, 10.25f)
                curveTo(15.5f, 9.5596f, 16.0596f, 9.0f, 16.75f, 9.0f)
                close()
            }
        }
        .build()
        return _games!!
    }

private var _games: ImageVector? = null
