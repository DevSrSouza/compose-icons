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

public val DuotoneGroup.PaperPlane: ImageVector
    get() {
        if (_paperPlane != null) {
            return _paperPlane!!
        }
        _paperPlane = Builder(name = "PaperPlane", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(121.0f, 36.5f)
                lineTo(26.4f, 205.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.7f, 11.4f)
                lineTo(125.3f, 185.0f)
                arcToRelative(7.2f, 7.2f, 0.0f, false, true, 5.4f, 0.0f)
                lineToRelative(89.2f, 31.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 9.7f, -11.4f)
                lineTo(135.0f, 36.5f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 121.0f, 36.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(236.6f, 201.5f)
                lineTo(142.0f, 32.6f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, -28.0f, 0.0f)
                lineTo(19.4f, 201.5f)
                arcToRelative(16.1f, 16.1f, 0.0f, false, false, 19.4f, 22.9f)
                lineTo(128.0f, 192.5f)
                lineToRelative(89.2f, 31.9f)
                arcToRelative(17.1f, 17.1f, 0.0f, false, false, 5.5f, 0.9f)
                arcToRelative(15.7f, 15.7f, 0.0f, false, false, 12.1f, -5.7f)
                arcTo(15.9f, 15.9f, 0.0f, false, false, 236.6f, 201.5f)
                close()
                moveTo(136.0f, 178.4f)
                verticalLineTo(120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(58.4f)
                lineTo(33.4f, 209.3f)
                lineTo(128.0f, 40.4f)
                lineToRelative(94.6f, 168.9f)
                close()
            }
        }
        .build()
        return _paperPlane!!
    }

private var _paperPlane: ImageVector? = null
