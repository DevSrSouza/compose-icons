package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Hashtag: ImageVector
    get() {
        if (_hashtag != null) {
            return _hashtag!!
        }
        _hashtag = Builder(name = "Hashtag", defaultWidth = 448.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 448.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(440.67f, 182.11f)
                lineToRelative(7.14f, -40.0f)
                curveToRelative(1.31f, -7.36f, -4.34f, -14.11f, -11.81f, -14.11f)
                horizontalLineToRelative(-74.81f)
                lineToRelative(14.62f, -81.89f)
                curveTo(377.12f, 38.75f, 371.47f, 32.0f, 364.0f, 32.0f)
                horizontalLineToRelative(-40.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.81f, 9.89f)
                lineTo(296.17f, 128.0f)
                horizontalLineTo(197.54f)
                lineToRelative(14.62f, -81.89f)
                curveTo(213.48f, 38.75f, 207.82f, 32.0f, 200.35f, 32.0f)
                horizontalLineToRelative(-40.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.81f, 9.89f)
                lineTo(132.53f, 128.0f)
                horizontalLineTo(53.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.81f, 9.89f)
                lineToRelative(-7.14f, 40.0f)
                curveTo(33.16f, 185.25f, 38.82f, 192.0f, 46.29f, 192.0f)
                horizontalLineToRelative(74.81f)
                lineTo(98.24f, 320.0f)
                horizontalLineTo(19.15f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.81f, 9.89f)
                lineToRelative(-7.14f, 40.0f)
                curveTo(-1.12f, 377.25f, 4.53f, 384.0f, 12.0f, 384.0f)
                horizontalLineToRelative(74.81f)
                lineTo(72.19f, 465.89f)
                curveTo(70.88f, 473.25f, 76.53f, 480.0f, 84.0f, 480.0f)
                horizontalLineToRelative(40.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.81f, -9.89f)
                lineTo(151.83f, 384.0f)
                horizontalLineToRelative(98.63f)
                lineToRelative(-14.62f, 81.89f)
                curveTo(234.52f, 473.25f, 240.18f, 480.0f, 247.65f, 480.0f)
                horizontalLineToRelative(40.63f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.81f, -9.89f)
                lineTo(315.47f, 384.0f)
                horizontalLineToRelative(79.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.81f, -9.89f)
                lineToRelative(7.14f, -40.0f)
                curveToRelative(1.31f, -7.36f, -4.34f, -14.11f, -11.81f, -14.11f)
                horizontalLineToRelative(-74.81f)
                lineToRelative(22.86f, -128.0f)
                horizontalLineToRelative(79.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.81f, -9.89f)
                close()
                moveTo(261.89f, 320.0f)
                horizontalLineToRelative(-98.63f)
                lineToRelative(22.86f, -128.0f)
                horizontalLineToRelative(98.63f)
                lineToRelative(-22.86f, 128.0f)
                close()
            }
        }
        .build()
        return _hashtag!!
    }

private var _hashtag: ImageVector? = null
