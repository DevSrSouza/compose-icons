package compose.icons.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.phosphoricons.FillGroup

public val FillGroup.Exam: ImageVector
    get() {
        if (_exam != null) {
            return _exam!!
        }
        _exam = Builder(name = "Exam", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(100.0f, 113.9f)
                lineTo(111.1f, 136.0f)
                horizontalLineTo(88.9f)
                close()
                moveTo(232.0f, 56.0f)
                verticalLineTo(216.0f)
                arcToRelative(7.9f, 7.9f, 0.0f, false, true, -3.8f, 6.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, 0.4f)
                lineTo(192.0f, 208.9f)
                lineToRelative(-28.4f, 14.3f)
                arcToRelative(8.5f, 8.5f, 0.0f, false, true, -7.2f, 0.0f)
                lineTo(128.0f, 208.9f)
                lineTo(99.6f, 223.2f)
                arcToRelative(8.3f, 8.3f, 0.0f, false, true, -7.2f, 0.0f)
                lineTo(64.0f, 208.9f)
                lineTo(35.6f, 223.2f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.8f, -0.4f)
                arcTo(7.9f, 7.9f, 0.0f, false, true, 24.0f, 216.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 40.0f, 40.0f)
                horizontalLineTo(216.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 232.0f, 56.0f)
                close()
                moveTo(139.2f, 156.4f)
                lineToRelative(-32.0f, -64.0f)
                arcToRelative(8.1f, 8.1f, 0.0f, false, false, -14.4f, 0.0f)
                lineToRelative(-32.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 14.4f, 7.2f)
                lineTo(80.9f, 152.0f)
                horizontalLineToRelative(38.2f)
                lineToRelative(5.7f, 11.6f)
                arcTo(8.1f, 8.1f, 0.0f, false, false, 132.0f, 168.0f)
                arcToRelative(9.4f, 9.4f, 0.0f, false, false, 3.6f, -0.8f)
                arcTo(8.2f, 8.2f, 0.0f, false, false, 139.2f, 156.4f)
                close()
                moveTo(204.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, -8.0f)
                horizontalLineTo(184.0f)
                verticalLineTo(108.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(12.0f)
                horizontalLineTo(156.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(12.0f)
                verticalLineToRelative(12.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineTo(136.0f)
                horizontalLineToRelative(12.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 204.0f, 128.0f)
                close()
            }
        }
        .build()
        return _exam!!
    }

private var _exam: ImageVector? = null
