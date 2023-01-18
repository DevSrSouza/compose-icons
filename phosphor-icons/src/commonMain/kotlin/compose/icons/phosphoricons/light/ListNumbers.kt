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

public val LightGroup.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) {
            return _listNumbers!!
        }
        _listNumbers = Builder(name = "ListNumbers", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.0f, 128.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 128.0f)
                close()
                moveTo(104.0f, 70.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(216.0f, 186.0f)
                horizontalLineTo(104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                close()
                moveTo(42.7f, 65.4f)
                lineTo(50.0f, 61.7f)
                verticalLineTo(108.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(52.0f)
                arcToRelative(6.1f, 6.1f, 0.0f, false, false, -2.8f, -5.1f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -5.9f, -0.3f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 5.4f, 10.8f)
                close()
                moveTo(70.6f, 169.2f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 54.0f, 138.0f)
                arcToRelative(19.9f, 19.9f, 0.0f, false, false, -18.4f, 12.2f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, 11.0f, 4.7f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 62.0f, 158.0f)
                arcToRelative(7.6f, 7.6f, 0.0f, false, true, -1.3f, 4.4f)
                lineToRelative(-25.5f, 34.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.6f, 6.3f)
                arcTo(6.2f, 6.2f, 0.0f, false, false, 40.0f, 206.0f)
                horizontalLineTo(68.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                horizontalLineTo(52.0f)
                lineToRelative(18.4f, -24.6f)
                close()
            }
        }
        .build()
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
