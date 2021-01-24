package compose.icons.fontawesomeicons.solid

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Butt
import androidx.compose.ui.graphics.StrokeJoin.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import compose.icons.fontawesomeicons.SolidGroup

public val SolidGroup.Robot: ImageVector
    get() {
        if (_robot != null) {
            return _robot!!
        }
        _robot = Builder(name = "Robot", defaultWidth = 640.0.dp, defaultHeight = 512.0.dp,
                viewportWidth = 640.0f, viewportHeight = 512.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(32.0f, 224.0f)
                lineTo(64.0f, 224.0f)
                lineTo(64.0f, 416.0f)
                lineTo(32.0f, 416.0f)
                arcTo(31.962f, 31.962f, 0.0f, false, true, 0.0f, 384.0f)
                lineTo(0.0f, 256.0f)
                arcTo(31.962f, 31.962f, 0.0f, false, true, 32.0f, 224.0f)
                close()
                moveTo(544.0f, 176.0f)
                lineTo(544.0f, 448.0f)
                arcToRelative(64.063f, 64.063f, 0.0f, false, true, -64.0f, 64.0f)
                lineTo(160.0f, 512.0f)
                arcToRelative(64.063f, 64.063f, 0.0f, false, true, -64.0f, -64.0f)
                lineTo(96.0f, 176.0f)
                arcToRelative(79.974f, 79.974f, 0.0f, false, true, 80.0f, -80.0f)
                lineTo(288.0f, 96.0f)
                lineTo(288.0f, 32.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 64.0f, 0.0f)
                lineTo(352.0f, 96.0f)
                lineTo(464.0f, 96.0f)
                arcTo(79.974f, 79.974f, 0.0f, false, true, 544.0f, 176.0f)
                close()
                moveTo(264.0f, 256.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 40.0f)
                arcTo(39.997f, 39.997f, 0.0f, false, false, 264.0f, 256.0f)
                close()
                moveTo(256.0f, 384.0f)
                lineTo(192.0f, 384.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(352.0f, 384.0f)
                lineTo(288.0f, 384.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(456.0f, 256.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, false, -40.0f, 40.0f)
                arcTo(39.997f, 39.997f, 0.0f, false, false, 456.0f, 256.0f)
                close()
                moveTo(448.0f, 384.0f)
                lineTo(384.0f, 384.0f)
                verticalLineToRelative(32.0f)
                horizontalLineToRelative(64.0f)
                close()
                moveTo(640.0f, 256.0f)
                lineTo(640.0f, 384.0f)
                arcToRelative(31.962f, 31.962f, 0.0f, false, true, -32.0f, 32.0f)
                lineTo(576.0f, 416.0f)
                lineTo(576.0f, 224.0f)
                horizontalLineToRelative(32.0f)
                arcTo(31.962f, 31.962f, 0.0f, false, true, 640.0f, 256.0f)
                close()
            }
        }
        .build()
        return _robot!!
    }

private var _robot: ImageVector? = null
