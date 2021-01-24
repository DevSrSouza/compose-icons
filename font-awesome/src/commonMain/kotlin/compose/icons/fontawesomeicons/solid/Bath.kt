package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Bath: ImageVector
    get() {
        if (_bath != null) {
            return _bath!!
        }
        _bath = Builder(name = "Bath", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 384.0f)
                arcToRelative(95.4f, 95.4f, 0.0f, false, false, 32.0f, 71.09f)
                verticalLineTo(496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(480.0f)
                horizontalLineTo(384.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(455.09f)
                arcTo(95.4f, 95.4f, 0.0f, false, false, 480.0f, 384.0f)
                verticalLineTo(336.0f)
                horizontalLineTo(32.0f)
                close()
                moveTo(496.0f, 256.0f)
                horizontalLineTo(80.0f)
                verticalLineTo(69.25f)
                arcToRelative(21.26f, 21.26f, 0.0f, false, true, 36.28f, -15.0f)
                lineToRelative(19.27f, 19.26f)
                curveToRelative(-13.13f, 29.88f, -7.61f, 59.11f, 8.62f, 79.73f)
                lineToRelative(-0.17f, 0.17f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 144.0f, 176.0f)
                lineToRelative(11.31f, 11.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.63f, 0.0f)
                lineTo(283.31f, 81.94f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -22.63f)
                lineTo(272.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 0.0f)
                lineToRelative(-0.17f, 0.17f)
                curveToRelative(-20.62f, -16.23f, -49.83f, -21.75f, -79.73f, -8.62f)
                lineTo(150.22f, 20.28f)
                arcTo(69.25f, 69.25f, 0.0f, false, false, 32.0f, 69.25f)
                verticalLineTo(256.0f)
                horizontalLineTo(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 0.0f, 272.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(496.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(272.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 496.0f, 256.0f)
                close()
            }
        }
        .build()
        return _bath!!
    }

private var _bath: ImageVector? = null
