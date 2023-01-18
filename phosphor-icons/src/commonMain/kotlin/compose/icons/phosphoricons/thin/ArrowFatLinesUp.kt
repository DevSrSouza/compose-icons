package compose.icons.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.ThinGroup

public val ThinGroup.ArrowFatLinesUp: ImageVector
    get() {
        if (_arrowFatLinesUp != null) {
            return _arrowFatLinesUp!!
        }
        _arrowFatLinesUp = Builder(name = "ArrowFatLinesUp", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(226.8f, 117.2f)
                lineToRelative(-96.0f, -96.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -5.6f, 0.0f)
                lineToRelative(-96.0f, 96.0f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, -0.9f, 4.3f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 32.0f, 124.0f)
                lineTo(76.0f, 124.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(180.0f, 124.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.7f, -2.5f)
                arcTo(3.8f, 3.8f, 0.0f, false, false, 226.8f, 117.2f)
                close()
                moveTo(176.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(28.0f)
                lineTo(84.0f, 148.0f)
                lineTo(84.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(41.7f, 116.0f)
                lineTo(128.0f, 29.7f)
                lineTo(214.3f, 116.0f)
                close()
                moveTo(180.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 216.0f)
                close()
                moveTo(180.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 180.0f, 184.0f)
                close()
            }
        }
        .build()
        return _arrowFatLinesUp!!
    }

private var _arrowFatLinesUp: ImageVector? = null
