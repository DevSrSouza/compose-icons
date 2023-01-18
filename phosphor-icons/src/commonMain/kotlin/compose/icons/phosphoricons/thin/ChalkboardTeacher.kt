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

public val ThinGroup.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) {
            return _chalkboardTeacher!!
        }
        _chalkboardTeacher = Builder(name = "ChalkboardTeacher", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(53.4f, 212.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.6f, -2.3f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, true, 94.0f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.6f, 2.3f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(157.1f, 204.0f)
                arcToRelative(60.4f, 60.4f, 0.0f, false, false, -34.7f, -29.1f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -36.8f, 0.0f)
                arcTo(60.4f, 60.4f, 0.0f, false, false, 50.9f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(216.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(104.0f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 28.0f, -28.0f)
                arcTo(28.1f, 28.1f, 0.0f, false, true, 104.0f, 172.0f)
                close()
                moveTo(196.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(176.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(12.0f)
                lineTo(188.0f, 84.0f)
                lineTo(68.0f, 84.0f)
                lineTo(68.0f, 96.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(60.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(192.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 196.0f, 80.0f)
                close()
            }
        }
        .build()
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
