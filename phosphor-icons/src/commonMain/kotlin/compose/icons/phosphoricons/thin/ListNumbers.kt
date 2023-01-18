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

public val ThinGroup.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) {
            return _listNumbers!!
        }
        _listNumbers = Builder(name = "ListNumbers", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 128.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineTo(216.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 128.0f)
                close()
                moveTo(104.0f, 68.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                close()
                moveTo(216.0f, 188.0f)
                horizontalLineTo(104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineTo(216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(41.8f, 63.6f)
                lineTo(52.0f, 58.5f)
                verticalLineTo(108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(52.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -1.9f, -3.4f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, -3.9f, -0.2f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 3.6f, 7.2f)
                close()
                moveTo(68.9f, 168.1f)
                arcTo(18.0f, 18.0f, 0.0f, false, false, 54.0f, 140.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -16.6f, 11.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 7.4f, 3.1f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 64.0f, 158.0f)
                arcToRelative(9.7f, 9.7f, 0.0f, false, true, -1.7f, 5.5f)
                lineTo(36.8f, 197.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -0.4f, 4.2f)
                arcTo(4.2f, 4.2f, 0.0f, false, false, 40.0f, 204.0f)
                horizontalLineTo(68.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(48.0f)
                lineToRelative(20.8f, -27.8f)
                close()
            }
        }
        .build()
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
