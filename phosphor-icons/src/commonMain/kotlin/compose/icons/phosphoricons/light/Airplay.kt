package compose.icons.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.LightGroup

public val LightGroup.Airplay: ImageVector
    get() {
        if (_airplay != null) {
            return _airplay!!
        }
        _airplay = Builder(name = "Airplay", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(132.6f, 156.1f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -9.2f, 0.0f)
                lineToRelative(-48.0f, 56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 80.0f, 222.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, 4.6f, -9.9f)
                close()
                moveTo(93.0f, 210.0f)
                lineToRelative(35.0f, -40.8f)
                lineTo(163.0f, 210.0f)
                close()
                moveTo(230.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, 22.0f)
                horizontalLineTo(192.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, -10.0f)
                verticalLineTo(64.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, -10.0f, -10.0f)
                horizontalLineTo(48.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, false, 38.0f, 64.0f)
                verticalLineTo(176.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, false, false, 10.0f, 10.0f)
                horizontalLineTo(64.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 12.0f)
                horizontalLineTo(48.0f)
                arcToRelative(22.1f, 22.1f, 0.0f, false, true, -22.0f, -22.0f)
                verticalLineTo(64.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 48.0f, 42.0f)
                horizontalLineTo(208.0f)
                arcTo(22.1f, 22.1f, 0.0f, false, true, 230.0f, 64.0f)
                close()
            }
        }
        .build()
        return _airplay!!
    }

private var _airplay: ImageVector? = null
