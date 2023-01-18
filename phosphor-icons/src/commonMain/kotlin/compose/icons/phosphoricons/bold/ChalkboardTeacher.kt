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

public val BoldGroup.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) {
            return _chalkboardTeacher!!
        }
        _chalkboardTeacher = Builder(name = "ChalkboardTeacher", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 68.0f, 72.0f)
                horizontalLineTo(188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, 12.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(96.0f)
                horizontalLineTo(68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 56.0f, 84.0f)
                close()
                moveTo(236.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineTo(149.3f)
                arcToRelative(11.9f, 11.9f, 0.0f, false, true, -11.4f, -8.3f)
                arcToRelative(36.1f, 36.1f, 0.0f, false, false, -67.8f, 0.1f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 58.7f, 220.0f)
                horizontalLineTo(40.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineTo(56.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 40.0f, 36.0f)
                horizontalLineTo(216.0f)
                arcTo(20.1f, 20.1f, 0.0f, false, true, 236.0f, 56.0f)
                close()
                moveTo(104.0f, 164.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 104.0f, 164.0f)
                close()
                moveTo(212.0f, 60.0f)
                horizontalLineTo(44.0f)
                verticalLineTo(196.0f)
                horizontalLineToRelative(6.9f)
                arcToRelative(60.8f, 60.8f, 0.0f, false, true, 21.8f, -23.2f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 62.6f, 0.0f)
                arcTo(60.8f, 60.8f, 0.0f, false, true, 157.1f, 196.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
