package compose.icons.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.BoldGroup

public val BoldGroup.ListNumbers: ImageVector
    get() {
        if (_listNumbers != null) {
            return _listNumbers!!
        }
        _listNumbers = Builder(name = "ListNumbers", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 128.0f)
                close()
                moveTo(108.0f, 76.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(216.0f, 180.0f)
                horizontalLineTo(108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(44.0f, 71.3f)
                verticalLineTo(108.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -5.7f, -10.2f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, false, -11.7f, -0.5f)
                lineToRelative(-16.0f, 8.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.4f, 22.0f)
                close()
                moveTo(75.6f, 172.5f)
                arcTo(25.8f, 25.8f, 0.0f, false, false, 80.0f, 158.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, false, -50.0f, -10.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.2f, 9.3f)
                arcTo(1.9f, 1.9f, 0.0f, false, true, 54.0f, 156.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 2.0f, 2.0f)
                arcToRelative(3.0f, 3.0f, 0.0f, false, true, -0.2f, 1.0f)
                lineTo(30.4f, 192.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 212.0f)
                horizontalLineTo(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                horizontalLineTo(64.0f)
                lineToRelative(11.2f, -15.0f)
                close()
            }
        }
        .build()
        return _listNumbers!!
    }

private var _listNumbers: ImageVector? = null
