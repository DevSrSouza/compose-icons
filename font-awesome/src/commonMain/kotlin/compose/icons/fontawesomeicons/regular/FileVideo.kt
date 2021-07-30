package compose.icons.fontawesomeicons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.RegularGroup

public val RegularGroup.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) {
            return _fileVideo!!
        }
        _fileVideo = Builder(name = "FileVideo", defaultWidth = 384.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 384.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(369.941f, 97.941f)
                lineToRelative(-83.882f, -83.882f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 252.118f, 0.0f)
                lineTo(48.0f, 0.0f)
                curveTo(21.49f, 0.0f, 0.0f, 21.49f, 0.0f, 48.0f)
                verticalLineToRelative(416.0f)
                curveToRelative(0.0f, 26.51f, 21.49f, 48.0f, 48.0f, 48.0f)
                horizontalLineToRelative(288.0f)
                curveToRelative(26.51f, 0.0f, 48.0f, -21.49f, 48.0f, -48.0f)
                lineTo(384.0f, 131.882f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -14.059f, -33.941f)
                close()
                moveTo(332.118f, 128.0f)
                lineTo(256.0f, 128.0f)
                lineTo(256.0f, 51.882f)
                lineTo(332.118f, 128.0f)
                close()
                moveTo(48.0f, 464.0f)
                lineTo(48.0f, 48.0f)
                horizontalLineToRelative(160.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 13.255f, 10.745f, 24.0f, 24.0f, 24.0f)
                horizontalLineToRelative(104.0f)
                verticalLineToRelative(288.0f)
                lineTo(48.0f, 464.0f)
                close()
                moveTo(276.687f, 252.697f)
                lineTo(224.0f, 305.374f)
                lineTo(224.0f, 268.0f)
                curveToRelative(0.0f, -11.046f, -8.954f, -20.0f, -20.0f, -20.0f)
                lineTo(100.0f, 248.0f)
                curveToRelative(-11.046f, 0.0f, -20.0f, 8.954f, -20.0f, 20.0f)
                verticalLineToRelative(104.0f)
                curveToRelative(0.0f, 11.046f, 8.954f, 20.0f, 20.0f, 20.0f)
                horizontalLineToRelative(104.0f)
                curveToRelative(11.046f, 0.0f, 20.0f, -8.954f, 20.0f, -20.0f)
                verticalLineToRelative(-37.374f)
                lineToRelative(52.687f, 52.674f)
                curveTo(286.704f, 397.318f, 304.0f, 390.28f, 304.0f, 375.986f)
                lineTo(304.0f, 264.011f)
                curveToRelative(0.0f, -14.311f, -17.309f, -21.319f, -27.313f, -11.314f)
                close()
            }
        }
        .build()
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
