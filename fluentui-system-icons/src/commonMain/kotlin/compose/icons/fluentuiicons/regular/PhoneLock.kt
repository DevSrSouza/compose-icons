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

public val RegularGroup.PhoneLock: ImageVector
    get() {
        if (_phoneLock != null) {
            return _phoneLock!!
        }
        _phoneLock = Builder(name = "PhoneLock", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(13.75f, 2.0f)
                curveTo(14.9926f, 2.0f, 16.0f, 3.0074f, 16.0f, 4.25f)
                verticalLineTo(10.8368f)
                curveTo(15.3764f, 11.1331f, 14.8542f, 11.6083f, 14.5f, 12.1962f)
                verticalLineTo(4.25f)
                curveTo(14.5f, 3.8358f, 14.1642f, 3.5f, 13.75f, 3.5f)
                horizontalLineTo(6.25f)
                curveTo(5.8358f, 3.5f, 5.5f, 3.8358f, 5.5f, 4.25f)
                verticalLineTo(19.75f)
                curveTo(5.5f, 20.1642f, 5.8358f, 20.5f, 6.25f, 20.5f)
                horizontalLineTo(12.0f)
                verticalLineTo(21.5f)
                curveTo(12.0f, 21.6712f, 12.0172f, 21.8384f, 12.05f, 22.0f)
                horizontalLineTo(6.25f)
                curveTo(5.0074f, 22.0f, 4.0f, 20.9926f, 4.0f, 19.75f)
                verticalLineTo(4.25f)
                curveTo(4.0f, 3.0074f, 5.0074f, 2.0f, 6.25f, 2.0f)
                horizontalLineTo(13.75f)
                close()
                moveTo(15.0f, 14.0f)
                curveTo(15.0f, 13.1821f, 15.3928f, 12.4559f, 16.0f, 11.9998f)
                curveTo(16.4178f, 11.686f, 16.9372f, 11.5f, 17.5f, 11.5f)
                curveTo(18.8807f, 11.5f, 20.0f, 12.6193f, 20.0f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(20.5f)
                curveTo(21.3284f, 15.0f, 22.0f, 15.6716f, 22.0f, 16.5f)
                verticalLineTo(21.5f)
                curveTo(22.0f, 22.3284f, 21.3284f, 23.0f, 20.5f, 23.0f)
                horizontalLineTo(14.5f)
                curveTo(13.8469f, 23.0f, 13.2913f, 22.5826f, 13.0854f, 22.0f)
                curveTo(13.0301f, 21.8436f, 13.0f, 21.6753f, 13.0f, 21.5f)
                verticalLineTo(16.5f)
                curveTo(13.0f, 15.6716f, 13.6716f, 15.0f, 14.5f, 15.0f)
                horizontalLineTo(15.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(16.5f, 14.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(18.5f)
                verticalLineTo(14.0f)
                curveTo(18.5f, 13.4477f, 18.0523f, 13.0f, 17.5f, 13.0f)
                curveTo(16.9477f, 13.0f, 16.5f, 13.4477f, 16.5f, 14.0f)
                close()
                moveTo(18.5f, 19.0f)
                curveTo(18.5f, 18.4477f, 18.0523f, 18.0f, 17.5f, 18.0f)
                curveTo(16.9477f, 18.0f, 16.5f, 18.4477f, 16.5f, 19.0f)
                curveTo(16.5f, 19.5523f, 16.9477f, 20.0f, 17.5f, 20.0f)
                curveTo(18.0523f, 20.0f, 18.5f, 19.5523f, 18.5f, 19.0f)
                close()
                moveTo(12.0f, 18.2489f)
                lineTo(12.0f, 18.25f)
                curveTo(12.0f, 18.6637f, 11.665f, 18.9994f, 11.2511f, 19.0f)
                lineTo(8.7511f, 19.0038f)
                curveTo(8.3369f, 19.0044f, 8.0006f, 18.6691f, 8.0f, 18.2549f)
                curveTo(7.9994f, 17.8407f, 8.3347f, 17.5044f, 8.7489f, 17.5038f)
                lineTo(11.2489f, 17.5f)
                curveTo(11.6631f, 17.4994f, 11.9994f, 17.8347f, 12.0f, 18.2489f)
                close()
            }
        }
        .build()
        return _phoneLock!!
    }

private var _phoneLock: ImageVector? = null
