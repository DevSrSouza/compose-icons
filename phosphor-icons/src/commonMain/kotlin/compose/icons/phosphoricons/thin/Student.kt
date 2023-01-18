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

public val ThinGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.3f, 60.2f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, false, -2.6f, 0.0f)
                lineToRelative(-96.0f, 32.0f)
                horizontalLineToRelative(-0.4f)
                lineToRelative(-0.4f, 0.2f)
                horizontalLineToRelative(-0.2f)
                lineToRelative(-0.5f, 0.4f)
                horizontalLineToRelative(0.0f)
                curveToRelative(-0.2f, 0.1f, -0.3f, 0.3f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.1f, 0.1f, -0.1f, 0.2f)
                lineToRelative(-0.2f, 0.4f)
                arcToRelative(0.4f, 0.4f, 0.0f, false, false, -0.1f, 0.3f)
                curveToRelative(-0.1f, 0.1f, -0.1f, 0.3f, -0.2f, 0.4f)
                verticalLineToRelative(0.3f)
                arcToRelative(1.7f, 1.7f, 0.0f, false, false, -0.1f, 0.7f)
                verticalLineToRelative(80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(69.6f)
                lineTo(79.9f, 84.2f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, 24.4f, 90.9f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, false, -53.4f, 38.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.7f, 4.4f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 140.8f, 0.0f)
                arcToRelative(4.1f, 4.1f, 0.0f, false, false, 3.4f, 1.8f)
                arcToRelative(3.8f, 3.8f, 0.0f, false, false, 2.2f, -0.7f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.1f, -5.5f)
                arcToRelative(91.7f, 91.7f, 0.0f, false, false, -53.4f, -38.7f)
                arcToRelative(59.9f, 59.9f, 0.0f, false, false, 24.4f, -90.9f)
                lineToRelative(49.2f, -16.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.6f)
                close()
                moveTo(180.0f, 120.0f)
                arcTo(52.0f, 52.0f, 0.0f, true, true, 87.9f, 86.9f)
                lineToRelative(38.8f, 12.9f)
                lineToRelative(1.3f, 0.2f)
                lineToRelative(1.3f, -0.2f)
                lineToRelative(38.8f, -12.9f)
                arcTo(51.7f, 51.7f, 0.0f, false, true, 180.0f, 120.0f)
                close()
                moveTo(168.0f, 78.4f)
                horizontalLineToRelative(0.0f)
                lineTo(128.0f, 91.8f)
                lineTo(44.6f, 64.0f)
                lineTo(128.0f, 36.2f)
                lineTo(211.4f, 64.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null
