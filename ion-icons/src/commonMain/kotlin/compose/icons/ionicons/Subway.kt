package compose.icons.ionicons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.IonIcons

public val IonIcons.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 512.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 512.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(352.0f, 16.0f)
                lineTo(160.0f, 16.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 96.0f, 80.0f)
                lineTo(96.0f, 336.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, 64.0f)
                lineTo(352.0f, 400.0f)
                arcToRelative(64.07f, 64.07f, 0.0f, false, false, 64.0f, -64.0f)
                lineTo(416.0f, 80.0f)
                arcTo(64.07f, 64.07f, 0.0f, false, false, 352.0f, 16.0f)
                close()
                moveTo(208.0f, 64.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, 32.0f)
                lineTo(208.0f, 96.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 0.0f, -32.0f)
                close()
                moveTo(176.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 176.0f, 352.0f)
                close()
                moveTo(336.0f, 352.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 32.0f, -32.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 336.0f, 352.0f)
                close()
                moveTo(384.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(144.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(128.0f, 160.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                lineTo(368.0f, 144.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(347.31f, 420.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, 22.62f)
                lineToRelative(4.68f, 4.69f)
                horizontalLineTo(182.63f)
                lineToRelative(4.68f, -4.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -22.62f, -22.62f)
                lineToRelative(-48.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, 22.62f, 22.62f)
                lineTo(150.63f, 480.0f)
                horizontalLineTo(361.37f)
                lineToRelative(11.32f, 11.31f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 22.62f, -22.62f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null
