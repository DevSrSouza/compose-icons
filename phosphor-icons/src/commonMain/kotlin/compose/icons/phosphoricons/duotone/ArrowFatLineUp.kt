package compose.icons.phosphoricons.duotone

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
import compose.icons.phosphoricons.DuotoneGroup

public val DuotoneGroup.ArrowFatLineUp: ImageVector
    get() {
        if (_arrowFatLineUp != null) {
            return _arrowFatLineUp!!
        }
        _arrowFatLineUp = Builder(name = "ArrowFatLineUp", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(32.0f, 120.0f)
                lineToRelative(96.0f, -96.0f)
                lineToRelative(96.0f, 96.0f)
                lineToRelative(-48.0f, 0.0f)
                lineToRelative(0.0f, 64.0f)
                lineToRelative(-96.0f, 0.0f)
                lineToRelative(0.0f, -64.0f)
                lineToRelative(-48.0f, 0.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.7f, 114.3f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -11.4f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(8.4f, 8.4f, 0.0f, false, false, -1.7f, 8.8f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 32.0f, 128.0f)
                lineTo(72.0f, 128.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(184.0f, 128.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.4f, -4.9f)
                arcTo(8.4f, 8.4f, 0.0f, false, false, 229.7f, 114.3f)
                close()
                moveTo(176.0f, 112.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(56.0f)
                lineTo(88.0f, 176.0f)
                lineTo(88.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                lineTo(51.3f, 112.0f)
                lineTo(128.0f, 35.3f)
                lineTo(204.7f, 112.0f)
                close()
                moveTo(184.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(80.0f, 224.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(96.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 216.0f)
                close()
            }
        }
        .build()
        return _arrowFatLineUp!!
    }

private var _arrowFatLineUp: ImageVector? = null
